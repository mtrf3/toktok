package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentGuarantee;
import kotlin.jvm.internal.o;

/* renamed from: X.Ak4, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C27084Ak4 extends F9E implements InterfaceC57784Mm4 {
    public final PaymentGuarantee LJLIL;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL};
    }

    public C27084Ak4(PaymentGuarantee paymentGuarantee) {
        this.LJLIL = paymentGuarantee;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }
}
