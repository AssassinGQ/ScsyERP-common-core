package cn.AssassinG.ScsyERP.common.core.biz;

import cn.AssassinG.ScsyERP.common.entity.FormEntity;

public interface FormBiz<T extends FormEntity> extends BaseBiz<T> {
    //todo create的时候需要检查仓库是否已经存在一个活跃的出库单
    void update(T formEntity);
    void complete(Long entityId);
}
