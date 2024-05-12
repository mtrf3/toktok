package com.ss.android.ugc.aweme.ecommerce.us.osp.strategy;

import X.AMT;
import X.AN6;
import X.AN7;
import X.AbstractC26779Af9;
import X.C26126ANe;
import X.C26456AZw;
import X.C26547AbP;
import X.C26552AbU;
import X.C26585Ac1;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.vm.USOrderSubmitViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "order_submit")
/* loaded from: classes5.dex */
public final class USOspStrategyService extends DefaultOspStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final ViewModel LIZIZ() {
        return new USOrderSubmitViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService
    /* renamed from: LIZLLL */
    public final OrderSubmitViewModel LIZIZ() {
        return new USOrderSubmitViewModel();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.US_OSP_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26585Ac1 c26585Ac1;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26585Ac1) && (c26585Ac1 = (C26585Ac1) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1087), AN6.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1090), new AqS170S0100000_4(c26585Ac1, 1091), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1093), C26126ANe.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1096), new AqS170S0100000_4(c26585Ac1, 1098), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1100), new AqS170S0100000_4(c26585Ac1, 1071), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1073), C26552AbU.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1076), C26547AbP.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1079), AMT.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1082), AN7.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1085), C26456AZw.LJLIL, null);
        }
    }
}
