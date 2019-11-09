package com.wondersgroup.mybatisplus01.javabeans;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.context.annotation.Bean;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer id ;
    private String lastName;
    private String email ;
    private Integer gender ;
    private Integer age ;
}
