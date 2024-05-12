package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import kotlin.jvm.internal.o;

/* renamed from: X.B1m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28110B1m extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final C28110B1m LJLIL = new C28110B1m();

    public C28110B1m() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, true, null, null, null, null, 3967, null);
    }
}
