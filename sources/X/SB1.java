package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class SB1 extends F9E implements SBC, SBP {
    public final PaymentMethod LJLIL;
    public final B21 LJLILLLLZI;
    public boolean LJLJI;
    public C117114ih LJLJJI;

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

    @Override // X.SBP
    public final void LJLLLLLL(C117114ih c117114ih) {
        this.LJLJJI = c117114ih;
    }

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
        String str;
        B21 b21 = this.LJLILLLLZI;
        if (obj instanceof String) {
            str = (String) obj;
        } else {
            str = null;
        }
        b21.LIZJ = str;
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

    public SB1(PaymentMethod paymentMethod, B21 ccdcNormalElementVO) {
        o.LJIIIZ(ccdcNormalElementVO, "ccdcNormalElementVO");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = ccdcNormalElementVO;
        this.LJLJJI = new C117114ih(C79081V1x.LJII(16), 0, 0, 0, false, 0, true, 254);
    }
}
