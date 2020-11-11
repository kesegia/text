package com.misaka.text.common.model.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.sql.Timestamp;
@Data
@NoArgsConstructor
@AllArgsConstructor
/**NoArgsConstructor自动生成无参数构造函数。*/
public class Logger  implements Serializable {
    private  Integer id;
    private Timestamp created_at ;
}
