package com.ss.android.ugc.aweme.ecommerce.us.osp.strategy;

import X.AbstractC26779Af9;
import X.C26183APj;
import X.C26185APl;
import X.C26187APn;
import X.C26428AYu;
import X.C26597AcD;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC27210Am6;
import androidx.lifecycle.ViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "payment_method")
/* loaded from: classes5.dex */
public final class USPaymentStrategyService extends DefaultPaymentStrategyService {
    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService
    /* renamed from: LIZLLL */
    public final PaymentViewModel LIZIZ() {
        Object newInstance = PaymentViewModel.class.newInstance();
        o.LJIIIIZZ(newInstance, "PaymentViewModel::class.java.newInstance()");
        return (PaymentViewModel) newInstance;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final /* bridge */ /* synthetic */ ViewModel LIZIZ() {
        return LIZIZ();
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final EnumC26549AbR getType() {
        return EnumC26549AbR.US_PAYMENT_V1;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.base.osp.strategy.DefaultPaymentStrategyService, com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26597AcD c26597AcD;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26597AcD) && (c26597AcD = (C26597AcD) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1077), new AqS170S0100000_4(c26597AcD, 1088), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1089), C26187APn.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1092), new AqS170S0100000_4(c26597AcD, 1094), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1095), new AqS170S0100000_4(c26597AcD, 1097), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1099), new AqS170S0100000_4(c26597AcD, 1101), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1102), new AqS170S0100000_4(c26597AcD, 1103), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1104), C26183APj.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1105), C26185APl.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1072), new AqS170S0100000_4(c26597AcD, 1074), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1075), new AqS170S0100000_4(c26597AcD, 1078), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1080), new AqS170S0100000_4(c26597AcD, 1081), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1083), new AqS170S0100000_4(c26597AcD, 1084), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1086), C26428AYu.LJLIL, null);
        }
    }
}
