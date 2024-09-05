package fun.hyperzhu.middleware.dynamic.thread.pool.sdk.registry;

import fun.hyperzhu.middleware.dynamic.thread.pool.sdk.domain.model.entity.ThreadPoolConfigEntity;

import java.util.List;

public interface IRegistry {

    // 上线程池
    void reportThreadPool(List<ThreadPoolConfigEntity> threadPoolEntities);

    //上报线程池的参数
    void reportThreadPoolConfigParameter(ThreadPoolConfigEntity threadPoolConfigEntity);

}

