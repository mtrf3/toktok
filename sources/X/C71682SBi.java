package X;

import com.ss.android.ugc.aweme.ecommerce.base.osp.payment.dto.PaymentMethod;
import kotlin.jvm.internal.o;

/* renamed from: X.SBi, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71682SBi extends F9E implements InterfaceC71675SBb, InterfaceC71676SBc {
    public final PaymentMethod LJLIL;
    public final C28123B1z LJLILLLLZI;
    public final Object LJLJI;
    public int LJLJJI;

    @Override // X.InterfaceC57784Mm4
    public final Object getChangePayload(InterfaceC57784Mm4 interfaceC57784Mm4) {
        return null;
    }

    @Override // X.F9E
    public final Object[] getObjects() {
        return new Object[]{this.LJLIL, this.LJLILLLLZI, this.LJLJI};
    }

    @Override // X.InterfaceC71675SBb
    public final B2I LLJILJIL() {
        return this.LJLILLLLZI;
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
        if (interfaceC57784Mm4 instanceof C71682SBi) {
            return o.LJ(this.LJLILLLLZI.LIZ.id, ((C71682SBi) interfaceC57784Mm4).LJLILLLLZI.LIZ.id);
        }
        return o.LJ(this, interfaceC57784Mm4);
    }

    public static C71682SBi L(C71682SBi c71682SBi, Object obj) {
        PaymentMethod ccdcPaymentMethod = c71682SBi.LJLIL;
        C28123B1z ccdcCardNumberElementVO = c71682SBi.LJLILLLLZI;
        c71682SBi.getClass();
        o.LJIIIZ(ccdcPaymentMethod, "ccdcPaymentMethod");
        o.LJIIIZ(ccdcCardNumberElementVO, "ccdcCardNumberElementVO");
        return new C71682SBi(ccdcPaymentMethod, ccdcCardNumberElementVO, obj);
    }

    public C71682SBi(PaymentMethod paymentMethod, C28123B1z ccdcCardNumberElementVO, Object update) {
        o.LJIIIZ(ccdcCardNumberElementVO, "ccdcCardNumberElementVO");
        o.LJIIIZ(update, "update");
        this.LJLIL = paymentMethod;
        this.LJLILLLLZI = ccdcCardNumberElementVO;
        this.LJLJI = update;
        this.LJLJJI = 6;
    }
}
