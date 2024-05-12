package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.PaymentState;
import java.util.UUID;
import kotlin.jvm.internal.o;

/* renamed from: X.B1b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28099B1b extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentState, PaymentState> {
    public static final C28099B1b LJLIL = new C28099B1b();

    public C28099B1b() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final PaymentState invoke(PaymentState paymentState) {
        PaymentState setState = paymentState;
        o.LJIIIZ(setState, "$this$setState");
        return PaymentState.copy$default(setState, null, null, null, UUID.randomUUID().toString(), false, null, null, false, null, null, null, null, 4087, null);
    }
}
