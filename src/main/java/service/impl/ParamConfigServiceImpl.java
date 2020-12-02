package service.impl;

import com.djk.dto.ParamConfDTO;
import com.djk.entity.ParamConfigDO;
import com.djk.mapper.ParamConfigMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.ParamConfigService;

@Service
public class ParamConfigServiceImpl implements ParamConfigService {
    @Autowired
    private ParamConfigMapper mapper;
    @Autowired
    private ParamConfigDO paramConfigDO;

    @Override
    public int insertParamConfig(ParamConfDTO paramConfDTO) {
        ParamConfigDO depositDO = ParamConfigDO.builder()
                .lowest(paramConfDTO.getDeposit_lowest())
                .highest(paramConfDTO.getDeposit_highest())
                .increase(paramConfDTO.getDeposit_increase())
                .total_price_pool(paramConfDTO.getDeposit_total_price_pool())
                .build();
        mapper.insertParamConfig(paramConfigDO);
        ParamConfigDO insuranceDO = ParamConfigDO.builder()
                .lowest(paramConfDTO.getInsurance_lowest())
                .highest(paramConfDTO.getInsurance_highestt())
                .increase(paramConfDTO.getInsurance_increase())
                .total_price_pool(paramConfDTO.getInsurance_total_price_pool())
                .build();
        mapper.insertParamConfig(insuranceDO);
        ParamConfigDO fundDO = ParamConfigDO.builder()
                .lowest(paramConfDTO.getFund_lowest())
                .highest(paramConfDTO.getFund_highest())
                .increase(paramConfDTO.getFund_increase())
                .total_price_pool(paramConfDTO.getFund_total_price_pool())
                .build();
        mapper.insertParamConfig(insuranceDO);

        return 0;
    }
}
