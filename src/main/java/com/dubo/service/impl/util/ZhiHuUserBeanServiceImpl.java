package com.dubo.service.impl.util;

import com.dubo.dao.ZhiHuUserBeanDao;
import com.dubo.entity.ZhiHuUserBean;
import com.dubo.service.ZhiHuUserBeanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2017/12/2 0002.
 */
@Service
public class ZhiHuUserBeanServiceImpl implements ZhiHuUserBeanService{
    @Autowired
    ZhiHuUserBeanDao zhiHuUserBeanDao;

    public void setZhiHuUserBeanDao(ZhiHuUserBeanDao zhiHuUserBeanDao) {
        this.zhiHuUserBeanDao = zhiHuUserBeanDao;
    }

    @Override
    public void insertData(ZhiHuUserBean zhiHuUserBean) {
        zhiHuUserBeanDao.insertUser(zhiHuUserBean);
    }
}
