package com.ss.android.ugc.aweme.ecommerce.tts.sku.us.strategy;

import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.sku.vm.SkuPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.tts.sku.us.vm.UsSkuVM;

@InterfaceC27210Am6(name = "sku")
/* loaded from: classes5.dex */
public final class UsSkuStrategyService extends DefaultSkuStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new UsSkuVM();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService
    /* renamed from: LIZLLL */
    public final SkuPanelViewModel LIZIZ() {
        return new UsSkuVM();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.sku.engine.DefaultSkuStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTS_US_SKU;
    }
}
