package com.example.mpdemo.pojo;

import java.io.Serializable;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * <p>
 * 
 * </p>
 *
 * @author caochenlei
 * @since 2023-06-03
 */
@Data
@TableName("stuthyme")
@EqualsAndHashCode(callSuper = false)
public class Stuthyme implements Serializable {

    private static final long serialVersionUID = 1L;

    @TableId(type = IdType.ASSIGN_UUID)
    private String idStu;

    @TableField("name_stu")
    private String nameStu;

    @TableField(value = "gender_stu")
    private String genderStu;

    @TableField("class_number_stu")
    private Integer classNumberStu;

/*    public Stuthyme(String nameStu, String genderStu, Integer classNumberStu) {
        this.nameStu = nameStu;
        this.genderStu = genderStu;
        this.classNumberStu = classNumberStu;
    }*/

}
