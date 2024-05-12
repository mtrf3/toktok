package com.ss.android.ugc.aweme.ecommerce.global.osp.strategy;

import X.AN1;
import X.AN4;
import X.AN5;
import X.AbstractC26779Af9;
import X.C26101AMf;
import X.C26457AZx;
import X.C26543AbL;
import X.C26546AbO;
import X.C26585Ac1;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import com.ss.android.ugc.aweme.ecommerce.global.osp.vm.GlobalOrderSubmitViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "order_submit")
/* loaded from: classes5.dex */
public final class GlobalOspStrategyService extends DefaultOspStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService
    /* renamed from: LIZLLL */
    public final OrderSubmitViewModel LIZIZ() {
        Object newInstance = GlobalOrderSubmitViewModel.class.newInstance();
        o.LJIIIIZZ(newInstance, "GlobalOrderSubmitViewMod…:class.java.newInstance()");
        return (OrderSubmitViewModel) newInstance;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.GLOBAL_OSP_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultOspStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26585Ac1 c26585Ac1;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26585Ac1) && (c26585Ac1 = (C26585Ac1) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1293), AN4.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1294), C26101AMf.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1295), new AqS170S0100000_4(c26585Ac1, 1296), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1297), new AqS170S0100000_4(c26585Ac1, 1298), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1299), C26543AbL.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1287), C26546AbO.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1288), AN1.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1289), new AqS170S0100000_4(c26585Ac1, 1290), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1291), AN5.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1292), C26457AZx.LJLIL, null);
        }
    }
}
