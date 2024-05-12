package com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.engine;

import X.AbstractC26779Af9;
import X.C26533AbB;
import X.C26534AbC;
import X.C26535AbD;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.ttf.delivery.uk.vm.TtfUkDeliveryPanelViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics")
/* loaded from: classes5.dex */
public final class TtfUkLogisticStrategyService extends DefaultLogisticStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new TtfUkDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService
    /* renamed from: LIZLLL */
    public final DeliveryPanelViewModel LIZIZ() {
        return new TtfUkDeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.TTF_UK_LOGISTICS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1365), C26534AbC.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1366), C26535AbD.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1367), C26533AbB.LJLIL, null);
    }
}
