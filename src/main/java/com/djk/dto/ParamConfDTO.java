package com.djk.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)//要使用插件
@AllArgsConstructor
@NoArgsConstructor
public class ParamConfDTO {
    private int deposit_lowest;
    private int insurance_lowest;
    private int fund_lowest;

    private int deposit_highest;
    private int insurance_highestt;
    private int fund_highest;

    private int deposit_increase;
    private int insurance_increase;
    private int fund_increase;

    private int deposit_total_price_pool;
    private int insurance_total_price_pool;
    private int fund_total_price_pool;

}
