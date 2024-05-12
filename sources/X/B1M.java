package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* loaded from: classes5.dex */
public final class B1M extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final B1M LJLIL = new B1M();

    public B1M() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, UUID.randomUUID().toString(), false, null, null, false, null, null, null, null, 4087, null);
    }
}
