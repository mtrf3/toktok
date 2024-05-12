package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SB8 extends F9E implements SBC {
    public final PaymentMethod LJLIL;
    public final B2C LJLILLLLZI;

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI};
    }

    @Override // X.SBC
    public final List<String> getIds() {
        return C47261Igj.LJJIJ(this.LJLILLLLZI.LIZ.id);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return o.LJ(interfaceC57784Mm4, this);
    }

    public SB8(PaymentMethod paymentMethod, B2C disableElementVO) {
        o.LJIIIZ(disableElementVO, "disableElementVO");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = disableElementVO;
    }
}
