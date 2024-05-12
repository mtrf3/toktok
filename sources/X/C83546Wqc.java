package X;

import android.text.TextUtils;

/* renamed from: X.Wqc, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public class C83546Wqc {
    public C83551Wqh LIZ;
    public final C83547Wqd LIZIZ;
    public final InterfaceC83561Wqr LIZJ;
    public C83562Wqs LIZLLL;
    public InterfaceC83566Wqw LJ;
    public final ActivityC45651qj LJFF;
    public boolean LJI;
    public int LJII;
    public String LJIIIIZZ;
    public boolean LJIIIZ;

    public void LIZ() {
    }

    public void LIZIZ() {
    }

    public void LIZLLL(int i, String str) {
    }

    public void LIZJ(C83551Wqh c83551Wqh) {
        this.LIZ = c83551Wqh;
        c83551Wqh.setVisibility(8);
    }

    public final void LJ(String str) {
        C83562Wqs c83562Wqs;
        if (TextUtils.isEmpty(str)) {
            str = "";
        }
        InterfaceC83561Wqr interfaceC83561Wqr = this.LIZJ;
        if (interfaceC83561Wqr != null && (c83562Wqs = this.LIZLLL) != null) {
            this.LJIIIIZZ = str;
            interfaceC83561Wqr.J3(c83562Wqs.LIZIZ, c83562Wqs.LIZJ, str, c83562Wqs.LIZLLL);
        }
    }

    public C83546Wqc(ActivityC45651qj activityC45651qj, C83589WrJ c83589WrJ) {
        C5SL c5sl = C5SL.LIZ;
        if (activityC45651qj == null) {
            return;
        }
        this.LJFF = activityC45651qj;
        this.LIZJ = c83589WrJ;
        this.LIZIZ = new C83547Wqd(activityC45651qj, c5sl);
    }
}
