package com.ss.android.ugc.aweme.ecommerce.base.osp.strategy;

import X.AMY;
import X.AN0;
import X.ANG;
import X.ANH;
import X.ANJ;
import X.ANL;
import X.ANN;
import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26128ANg;
import X.C26455AZv;
import X.C26504Aai;
import X.C26536AbE;
import X.C26537AbF;
import X.C26541AbJ;
import X.C26544AbM;
import X.C26585Ac1;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.vm.OrderSubmitViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "order_submit")
/* loaded from: classes5.dex */
public class DefaultOspStrategyService extends AbstractC26551AbT<OrderSubmitViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public OrderSubmitViewModel LIZIZ() {
        Object newInstance = OrderSubmitViewModel.class.newInstance();
        o.LJIIIIZZ(newInstance, "OrderSubmitViewModel::class.java.newInstance()");
        return (OrderSubmitViewModel) newInstance;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<OrderSubmitViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26504Aai(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26585Ac1 c26585Ac1;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26585Ac1) && (c26585Ac1 = (C26585Ac1) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1012), C26536AbE.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1028), C26541AbJ.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1030), C26544AbM.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 994), AN0.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 997), ANJ.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 999), ANL.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1002), ANH.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1005), C26537AbF.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1008), ANN.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1010), C26128ANg.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1015), C26455AZv.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1018), new AqS170S0100000_4(c26585Ac1, 1020), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1022), AMY.INSTANCE, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26585Ac1, 1025), ANG.INSTANCE, null);
        }
    }
}
