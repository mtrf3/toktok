package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.SEp, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71767SEp extends F9E implements InterfaceC57784Mm4 {
    public final PaymentMethod LJLIL;
    public final PaymentMethod LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, Boolean.valueOf(this.LJLJI)};
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public C71767SEp(PaymentMethod parentPaymentMethod, PaymentMethod subPaymentMethod, boolean z) {
        o.LJIIIZ(parentPaymentMethod, "parentPaymentMethod");
        o.LJIIIZ(subPaymentMethod, "subPaymentMethod");
        this.LJLIL = parentPaymentMethod;
        this.LJLILLLLZI = subPaymentMethod;
        this.LJLJI = z;
    }
}
