package com.example.mpdemo.mapper;

import com.example.mpdemo.pojo.Stuthyme;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * <p>
 *  Mapper 接口
 * </p>
 *
 * @author caochenlei
 * @since 2023-06-03
 */
@Repository
public interface StuthymeMapper  extends BaseMapper<Stuthyme> {
        List<Stuthyme> queryBatch(@Param("ids") List<String> ids);
}
