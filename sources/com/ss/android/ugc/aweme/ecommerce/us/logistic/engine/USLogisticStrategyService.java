package com.ss.android.ugc.aweme.ecommerce.us.logistic.engine;

import X.AMX;
import X.AbstractC26779Af9;
import X.C26463Aa3;
import X.C26466Aa6;
import X.C26522Ab0;
import X.C26523Ab1;
import X.C26524Ab2;
import X.C26526Ab4;
import X.C26528Ab6;
import X.C26529Ab7;
import X.C26530Ab8;
import X.C26744Aea;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.page.logistic.LogisticAdapter;
import com.ss.android.ugc.aweme.ecommerce.base.delivery.vm.DeliveryPanelViewModel;
import com.ss.android.ugc.aweme.ecommerce.us.logistic.vm.USDeliveryPanelViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "logistics")
/* loaded from: classes5.dex */
public final class USLogisticStrategyService extends DefaultLogisticStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService
    /* renamed from: LIZLLL */
    public final DeliveryPanelViewModel LIZIZ() {
        if (C26744Aea.LIZ().template != null) {
            return new USDeliveryPanelViewModel();
        }
        return new DeliveryPanelViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.US_LOGISTICS;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.delivery.engine.DefaultLogisticStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        o.LJIIIZ(adapter, "adapter");
        if (!(adapter instanceof LogisticAdapter)) {
            return;
        }
        if (C26744Aea.LIZ().template == null) {
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1591), C26524Ab2.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1595), C26463Aa3.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1579), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1580), null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1582), C26528Ab6.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1584), C26523Ab1.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1586), C26522Ab0.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1587), C26526Ab4.LJLIL, null);
            return;
        }
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1588), C26466Aa6.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1589), AMX.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1590), C26529Ab7.LJLIL, null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1592), new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1593), null);
        c73242Soo.LJFF(new AqS170S0100000_4(adapter, (AbstractC26779Af9<Object>) 1594), C26530Ab8.LJLIL, null);
    }
}
