package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B01 extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final B01 LJLIL = new B01();

    public B01() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, false, null, null, null, null, 3967, null);
    }
}