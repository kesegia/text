package com.misaka.text.dao.mapper;
import com.misaka.text.common.model.dao.Logger;

import org.apache.ibatis.annotations.Insert;

public interface  LoggerMapper {
    @Insert("insert into log() values ()")
    void insertLogger();
}
