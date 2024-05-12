package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.payment.GooglePayProcess;
import kotlin.jvm.internal.o;

/* renamed from: X.Ayz, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C28009Ayz extends AbstractC65781Prl implements InterfaceC88472Yns<PaymentMethod, Boolean> {
    public static final C28009Ayz LJLIL = new C28009Ayz();

    public C28009Ayz() {
        super(1);
    }

    @Override // X.InterfaceC88472Yns
    public final Boolean invoke(PaymentMethod paymentMethod) {
        PaymentMethod it = paymentMethod;
        o.LJIIIZ(it, "it");
        return Boolean.valueOf(!GooglePayProcess.LJ(it));
    }
}
