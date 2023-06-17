package com.example.mpdemo.service;

import com.example.mpdemo.pojo.Stuthyme;
import com.baomidou.mybatisplus.extension.service.IService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author caochenlei
 * @since 2023-06-03
 */

public interface StuthymeService  extends IService<Stuthyme>{
    ArrayList<Stuthyme> queryAll(List<String> ids);
    boolean addMore(List<Stuthyme> stuThymeList);
    ArrayList<Stuthyme> queryFilter();
}
