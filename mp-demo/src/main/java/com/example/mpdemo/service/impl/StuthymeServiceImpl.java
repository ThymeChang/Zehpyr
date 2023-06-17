package com.example.mpdemo.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.example.mpdemo.pojo.Stuthyme;
import com.example.mpdemo.mapper.StuthymeMapper;
import com.example.mpdemo.service.StuthymeService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * <p>
 * 服务实现类
 * </p>
 *
 * @author caochenlei
 * @since 2023-06-03
 */
@Service
public  class StuthymeServiceImpl extends ServiceImpl<StuthymeMapper, Stuthyme>  implements StuthymeService {

    @Autowired
    private StuthymeMapper stuthymeMapper;


    @Override
    public ArrayList<Stuthyme> queryAll(List<String> ids) {
        //List<Stuthyme> stuthymes2 = stuthymeMapper.queryBatch(ids);
        //查出这几个中是女生的人
        if (CollectionUtils.isEmpty(ids)) {
            return new ArrayList<>();
        }
        List<Stuthyme> stuthymes = stuthymeMapper.queryBatch(ids);
        List<Stuthyme> stuthymeList = stuthymes.stream()
                .filter(stuthyme -> "女".equals(stuthyme.getGenderStu()))
                .filter(stuthyme -> 2 == stuthyme.getClassNumberStu())
                .collect(Collectors.toList());
        System.out.println("筛选结果" + stuthymeList);
        ArrayList<Stuthyme> stuthymes1 = new ArrayList<>(stuthymeList);
        System.out.println("筛选结果" + stuthymes1);
        return stuthymes1;
    }


    @Transactional
    public boolean addMore(List<Stuthyme> stuThymeList) {
        if (CollectionUtils.isEmpty(stuThymeList))
            return false;
        //业务代码
        return this.saveBatch(stuThymeList);
    }

    @Override
    public ArrayList<Stuthyme> queryFilter() {
        QueryWrapper<Stuthyme> queryWrapper = new QueryWrapper<>();
        List<Stuthyme> stuthymeList = stuthymeMapper.selectList(null).stream()
                //.filter(stuthyme -> "男".equals(stuthyme.getGenderStu()))
                .map(p->{
                    p.setNameStu("");
                    return p;
                })
                .collect(Collectors.toList());
        if (CollectionUtils.isEmpty(stuthymeList)) {
            return null;
        }
        return new ArrayList<Stuthyme>(stuthymeList);
    }


}
