package com.czg.xunlei.gen;

import java.util.Map;

import org.greenrobot.greendao.AbstractDao;
import org.greenrobot.greendao.AbstractDaoSession;
import org.greenrobot.greendao.database.Database;
import org.greenrobot.greendao.identityscope.IdentityScopeType;
import org.greenrobot.greendao.internal.DaoConfig;

import com.czg.xunlei.model.CarToonBean;
import com.czg.xunlei.model.ThumbModel;

import com.czg.xunlei.gen.CarToonBeanDao;
import com.czg.xunlei.gen.ThumbModelDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see org.greenrobot.greendao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig carToonBeanDaoConfig;
    private final DaoConfig thumbModelDaoConfig;

    private final CarToonBeanDao carToonBeanDao;
    private final ThumbModelDao thumbModelDao;

    public DaoSession(Database db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        carToonBeanDaoConfig = daoConfigMap.get(CarToonBeanDao.class).clone();
        carToonBeanDaoConfig.initIdentityScope(type);

        thumbModelDaoConfig = daoConfigMap.get(ThumbModelDao.class).clone();
        thumbModelDaoConfig.initIdentityScope(type);

        carToonBeanDao = new CarToonBeanDao(carToonBeanDaoConfig, this);
        thumbModelDao = new ThumbModelDao(thumbModelDaoConfig, this);

        registerDao(CarToonBean.class, carToonBeanDao);
        registerDao(ThumbModel.class, thumbModelDao);
    }
    
    public void clear() {
        carToonBeanDaoConfig.clearIdentityScope();
        thumbModelDaoConfig.clearIdentityScope();
    }

    public CarToonBeanDao getCarToonBeanDao() {
        return carToonBeanDao;
    }

    public ThumbModelDao getThumbModelDao() {
        return thumbModelDao;
    }

}
