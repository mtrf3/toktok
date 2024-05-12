package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import kotlin.jvm.internal.o;

/* renamed from: X.B1k, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28108B1k extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final C28108B1k LJLIL = new C28108B1k();

    public C28108B1k() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, false, null, new Object(), null, null, 3583, null);
    }
}
