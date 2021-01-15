package com.nbcb.springcloud.entities;

import com.oracle.webservices.internal.api.databinding.DatabindingMode;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/*

 */
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Payment implements Serializable {
    private Long id;
    private String serial;
}
