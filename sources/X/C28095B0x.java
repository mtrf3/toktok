package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import kotlin.jvm.internal.o;

/* renamed from: X.B0x, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28095B0x extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final C28095B0x LJLIL = new C28095B0x();

    public C28095B0x() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, null, false, null, null, false, null, null, null, null, 3967, null);
    }
}