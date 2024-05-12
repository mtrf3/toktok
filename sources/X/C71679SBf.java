package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import defpackage.b0;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SBf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71679SBf implements InterfaceC71675SBb, InterfaceC71676SBc, SBC, SBP {
    public final PaymentMethod LJLIL;
    public final B21 LJLILLLLZI;
    public final String LJLJI;
    public final Object LJLJJI;
    public int LJLJJL;
    public C117114ih LJLJJLL;

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.SBC
    public final List<String> getIds() {
        return C47261Igj.LJJIJ(this.LJLILLLLZI.LIZ.id);
    }

    public final int hashCode() {
        return ((this.LJLJJI.hashCode() + C79062V1e.LJ(this.LJLJI, (this.LJLILLLLZI.hashCode() + (this.LJLIL.hashCode() * 31)) * 31, 31)) * 31) + this.LJLJJL;
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("CCDCNormalElementItem(ccdcPaymentMethod=");
        LIZ.append(this.LJLIL);
        LIZ.append(", ccdcNormalElementVO=");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(", initialInputMethod=");
        LIZ.append(this.LJLJI);
        LIZ.append(", update=");
        LIZ.append(this.LJLJJI);
        LIZ.append(", imeOptions=");
        return b0.LIZJ(LIZ, this.LJLJJL, ')', LIZ);
    }

    @Override // X.InterfaceC71675SBb
    public final B2I LLJILJIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.SBP
    public final void LJLLLLLL(C117114ih c117114ih) {
        this.LJLJJLL = c117114ih;
    }

    @Override // X.InterfaceC71676SBc
    public final void LLZIL(int i) {
        this.LJLJJL = i;
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

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C71679SBf)) {
            return false;
        }
        C71679SBf c71679SBf = (C71679SBf) obj;
        if (o.LJ(this.LJLIL, c71679SBf.LJLIL) && o.LJ(this.LJLILLLLZI, c71679SBf.LJLILLLLZI) && o.LJ(this.LJLJI, c71679SBf.LJLJI) && o.LJ(this.LJLJJI, c71679SBf.LJLJJI) && this.LJLJJL == c71679SBf.LJLJJL) {
            return true;
        }
        return false;
    }

    public static C71679SBf LIZ(C71679SBf c71679SBf, Object obj) {
        PaymentMethod ccdcPaymentMethod = c71679SBf.LJLIL;
        B21 ccdcNormalElementVO = c71679SBf.LJLILLLLZI;
        String initialInputMethod = c71679SBf.LJLJI;
        int i = c71679SBf.LJLJJL;
        c71679SBf.getClass();
        o.LJIIIZ(ccdcPaymentMethod, "ccdcPaymentMethod");
        o.LJIIIZ(ccdcNormalElementVO, "ccdcNormalElementVO");
        o.LJIIIZ(initialInputMethod, "initialInputMethod");
        return new C71679SBf(ccdcPaymentMethod, ccdcNormalElementVO, initialInputMethod, obj, i);
    }

    public C71679SBf(PaymentMethod paymentMethod, B21 ccdcNormalElementVO, String initialInputMethod, Object update, int i) {
        o.LJIIIZ(ccdcNormalElementVO, "ccdcNormalElementVO");
        o.LJIIIZ(initialInputMethod, "initialInputMethod");
        o.LJIIIZ(update, "update");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = ccdcNormalElementVO;
        this.LJLJI = initialInputMethod;
        this.LJLJJI = update;
        this.LJLJJL = i;
        this.LJLJJLL = new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254);
    }
}
