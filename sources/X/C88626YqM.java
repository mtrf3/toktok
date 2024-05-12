package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YqM, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88626YqM implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88628YqO();
        C53848LBk c53848LBk = new C53848LBk(0);
        c53848LBk.LJFF = new C88631YqR();
        c53848LBk.LIZ = ye2;
        ye2.LIZIZ.add(c53848LBk);
        YEI yei = new YEI(0);
        yei.LJFF = new C88629YqP();
        yei.LIZ = ye2;
        ye2.LIZIZ.add(yei);
        YEM yem = new YEM(0);
        yem.LJFF = new C88630YqQ();
        yem.LIZ = yei;
        yei.LIZIZ.add(yem);
        C88458Yne c88458Yne = new C88458Yne();
        c88458Yne.LJFF = new C88632YqS();
        c88458Yne.LIZ = yei;
        yei.LIZIZ.add(c88458Yne);
        return new FEY(R.layout.dhl, ye2, fe3);
    }
}
