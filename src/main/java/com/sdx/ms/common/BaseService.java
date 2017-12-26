package com.sdx.ms.common;


import com.sdx.ms.dao.PublicDao;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by xiaolong on 2017/12/18.
 */
public abstract class BaseService {
    @Autowired
    protected PublicDao publicDao;
}
