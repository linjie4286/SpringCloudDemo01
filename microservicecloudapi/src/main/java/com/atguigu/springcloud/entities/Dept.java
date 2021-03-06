package com.atguigu.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * description
 *
 * @author 赵林杰 2019/03/27 10:19
 */

@NoArgsConstructor
@Data
@Accessors(chain = true)
public class Dept implements Serializable {

    private Long deptno;


    private String dname;

    // 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库

    private String db_source;

}
