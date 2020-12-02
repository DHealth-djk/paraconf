package com.djk.mapper;

import com.djk.dto.ParamConfDTO;
import com.djk.entity.ParamConfigDO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface ParamConfigMapper {
    @Insert("")
    int insertParamConfig(ParamConfigDO paramConfigDO);
}
