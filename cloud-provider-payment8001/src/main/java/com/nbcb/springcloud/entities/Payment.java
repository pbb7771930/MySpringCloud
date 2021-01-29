package com.nbcb.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*

 */
@Data
@AllArgsConstructor    //提供全参的构造方法
@NoArgsConstructor    //提供无参的构造方法

public class Payment implements Serializable {
    private Long id;
    private String serial;
}
