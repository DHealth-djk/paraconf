package com.djk.entity;

import lombok.*;

import java.sql.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)//要使用插件
public class ParamConfigDO {
    private int id;
    private int biding_time;
    private int lowest;
    private int highest;
    private int increase;
    private int total_price_pool;
    private int type;
    private Date create_time;
    private Date update_time;
}
