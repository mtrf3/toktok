package X;

import Y.AObjectS11S1101000_14;

/* renamed from: X.Wqq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C83560Wqq extends C83546Wqc {
    @Override // X.C83546Wqc
    public final void LIZJ(C83551Wqh c83551Wqh) {
        this.LIZ = c83551Wqh;
        c83551Wqh.setEffectTextChangeListener(new C83563Wqt(this));
    }

    public C83560Wqq(ActivityC45651qj activityC45651qj, C83589WrJ c83589WrJ) {
        super(activityC45651qj, c83589WrJ);
    }

    @Override // X.C83546Wqc
    public final void LIZLLL(int i, String str) {
        this.LIZJ.LIZ(new AObjectS11S1101000_14(this, i, str, 0));
    }
}
