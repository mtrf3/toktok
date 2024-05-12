package X;

import Y.AObjectS11S1101000_14;
import android.text.TextUtils;

/* renamed from: X.Wqm, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83556Wqm extends C83546Wqc {
    @Override // X.C83546Wqc
    public final void LIZIZ() {
        InterfaceC83561Wqr interfaceC83561Wqr;
        C83562Wqs c83562Wqs;
        if (!TextUtils.isEmpty(this.LJIIIIZZ) && (interfaceC83561Wqr = this.LIZJ) != null && (c83562Wqs = this.LIZLLL) != null) {
            interfaceC83561Wqr.J3(c83562Wqs.LIZIZ, c83562Wqs.LIZJ, this.LJIIIIZZ, c83562Wqs.LIZLLL);
            this.LIZJ.LLIIIILZ();
        }
    }

    @Override // X.C83546Wqc
    public final void LIZJ(C83551Wqh c83551Wqh) {
        c83551Wqh.setEffectTextChangeListener(new C83558Wqo(this));
        super.LIZJ(c83551Wqh);
    }

    public C83556Wqm(ActivityC45651qj activityC45651qj, C83589WrJ c83589WrJ) {
        super(activityC45651qj, c83589WrJ);
    }

    @Override // X.C83546Wqc
    public final void LIZLLL(int i, String str) {
        this.LIZJ.LIZ(new AObjectS11S1101000_14(this, i, str, 1));
    }
}
