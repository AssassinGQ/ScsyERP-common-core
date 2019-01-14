package cn.AssassinG.ScsyERP.common.core.biz;

import cn.AssassinG.ScsyERP.common.entity.UnLoginableEntity;

public interface UnLoginableBiz<T extends UnLoginableEntity> extends BaseBiz<T> {
    /**
     * 屏蔽create方法
     * @param entity
     * @return
     */
    Long create(T entity);
    Long createWithNameCheck(T entity);
}
