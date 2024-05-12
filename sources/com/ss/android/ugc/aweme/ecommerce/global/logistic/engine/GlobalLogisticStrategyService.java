package com.ss.android.ugc.aweme.ecommerce.global.logistic.engine;

import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;

@InterfaceC27210Am6(name = "logistics")
/* loaded from: classes5.dex */
public final class GlobalLogisticStrategyService extends DefaultLogisticStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.GLOBAL_LOGISTICS;
    }
}
