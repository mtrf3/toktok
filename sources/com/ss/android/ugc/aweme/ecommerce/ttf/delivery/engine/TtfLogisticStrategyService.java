package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.engine;

import X.AbstractC26779Af9;
import X.C26531Ab9;
import X.C26532AbA;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.vm.TtfDeliveryPanelViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics")
/* loaded from: classes5.dex */
public final class TtfLogisticStrategyService extends DefaultLogisticStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new TtfDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService
    /* renamed from: LIZLLL */
    public final DeliveryPanelViewModel LIZIZ() {
        return new TtfDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_SA_LOGISTICS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1265), C26531Ab9.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1266), C26532AbA.LJLIL, null);
    }
}
