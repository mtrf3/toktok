package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SBh, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71681SBh extends F9E implements InterfaceC71675SBb, InterfaceC71676SBc, SBC, SBP {
    public final PaymentMethod LJLIL;
    public final B20 LJLILLLLZI;
    public final Object LJLJI;
    public int LJLJJI;
    public C117114ih LJLJJL;

    @Override // X.SBC
    public final void LLIIIJ(Object obj) {
    }

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.SBC
    public final List<String> getIds() {
        return C47261Igj.LJJIJ(this.LJLILLLLZI.LIZ.id);
    }

    @Override // X.InterfaceC71675SBb
    public final B2I LLJILJIL() {
        return this.LJLILLLLZI;
    }

    @Override // X.SBP
    public final void LJLLLLLL(C117114ih c117114ih) {
        this.LJLJJL = c117114ih;
    }

    @Override // X.InterfaceC71676SBc
    public final void LLZIL(int i) {
        this.LJLJJI = i;
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areContentsTheSame(InterfaceC57784Mm4 other) {
        o.LJIIIZ(other, "other");
        return o.LJ(other, this);
    }

    @Override // X.InterfaceC57784Mm4
    public final boolean areItemTheSame(InterfaceC57784Mm4 interfaceC57784Mm4) {
        if (interfaceC57784Mm4 instanceof C71681SBh) {
            return o.LJ(this.LJLILLLLZI.LIZ.id, ((C71681SBh) interfaceC57784Mm4).LJLILLLLZI.LIZ.id);
        }
        return o.LJ(this, interfaceC57784Mm4);
    }

    public static C71681SBh L(C71681SBh c71681SBh, Object obj) {
        PaymentMethod ccdcPaymentMethod = c71681SBh.LJLIL;
        B20 ccdcDateElementVO = c71681SBh.LJLILLLLZI;
        c71681SBh.getClass();
        o.LJIIIZ(ccdcPaymentMethod, "ccdcPaymentMethod");
        o.LJIIIZ(ccdcDateElementVO, "ccdcDateElementVO");
        return new C71681SBh(ccdcPaymentMethod, ccdcDateElementVO, obj);
    }

    public C71681SBh(PaymentMethod paymentMethod, B20 ccdcDateElementVO, Object update) {
        o.LJIIIZ(ccdcDateElementVO, "ccdcDateElementVO");
        o.LJIIIZ(update, "update");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = ccdcDateElementVO;
        this.LJLJI = update;
        this.LJLJJI = 6;
        this.LJLJJL = new C117114ih(C79081V1x.LJII(25), 0, 0, 0, false, 0, true, 254);
    }
}
