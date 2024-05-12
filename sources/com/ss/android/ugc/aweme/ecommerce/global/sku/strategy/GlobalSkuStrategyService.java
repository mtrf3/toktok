package com.ss.android.ugc.aweme.ecommerce.global.sku.strategy;

import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.sku.vm.GlobalSkuVm;

@InterfaceC27210Am6(name = "sku")
/* loaded from: classes5.dex */
public final class GlobalSkuStrategyService extends DefaultSkuStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new GlobalSkuVm();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService
    /* renamed from: LIZLLL */
    public final SkuPanelViewModel LIZIZ() {
        return new GlobalSkuVm();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.GLOBAL_SKU_V1;
    }
}
