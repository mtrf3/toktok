package com.ss.android.ugc.aweme.ecommerce.base.osp.strategy;

import X.AbstractC26551AbT;
import X.AbstractC26779Af9;
import X.C26184APk;
import X.C26186APm;
import X.C26427AYt;
import X.C26496Aaa;
import X.C26597AcD;
import X.C73242Soo;
import X.EnumC26549AbR;
import X.InterfaceC26883Agp;
import X.InterfaceC27210Am6;
import androidx.lifecycle.LifecycleOwner;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentViewModel;
import kotlin.jvm.internal.AqS170S0100000_4;
import kotlin.jvm.internal.o;

@InterfaceC27210Am6(name = "payment_method")
/* loaded from: classes5.dex */
public class DefaultPaymentStrategyService extends AbstractC26551AbT<PaymentViewModel> {
    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    /* renamed from: LIZLLL, reason: merged with bridge method [inline-methods] */
    public PaymentViewModel LIZIZ() {
        Object newInstance = PaymentViewModel.class.newInstance();
        o.LJIIIIZZ(newInstance, "PaymentViewModel::class.java.newInstance()");
        return (PaymentViewModel) newInstance;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public EnumC26549AbR getType() {
        return EnumC26549AbR.DEFAULT;
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public final InterfaceC26883Agp<PaymentViewModel> LIZJ(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        return new C26496Aaa(owner);
    }

    @Override // com.ss.android.ugc.aweme.ecommerce.core.engine.IComponentStrategyService
    public void LIZ(AbstractC26779Af9 adapter, C73242Soo c73242Soo) {
        C26597AcD c26597AcD;
        o.LJIIIZ(adapter, "adapter");
        if ((adapter instanceof C26597AcD) && (c26597AcD = (C26597AcD) adapter) != null) {
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1016), new AqS170S0100000_4(c26597AcD, 1027), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1029), C26186APm.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1031), new AqS170S0100000_4(c26597AcD, 995), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 996), new AqS170S0100000_4(c26597AcD, 998), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1000), new AqS170S0100000_4(c26597AcD, 1001), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1003), new AqS170S0100000_4(c26597AcD, 1004), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1006), new AqS170S0100000_4(c26597AcD, 1007), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1009), C26184APk.LJLIL, null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1011), new AqS170S0100000_4(c26597AcD, 1013), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1014), new AqS170S0100000_4(c26597AcD, 1017), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1019), new AqS170S0100000_4(c26597AcD, 1021), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1023), new AqS170S0100000_4(c26597AcD, 1024), null);
            c73242Soo.LJFF(new AqS170S0100000_4(c26597AcD, 1026), C26427AYt.LJLIL, null);
        }
    }
}
