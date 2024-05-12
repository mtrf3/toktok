package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ysh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88771Ysh implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88774Ysk();
        YEI yei = new YEI(0);
        yei.LJFF = new C88773Ysj();
        yei.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yei);
        YEL yel = new YEL();
        yel.LJFF = new C88776Ysm();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88772Ysi();
        ye2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(ye2);
        YEK yek = new YEK();
        yek.LJFF = new C88775Ysl();
        yek.LIZ = ye2;
        ye2.LIZIZ.add(yek);
        return new FEY(R.layout.cip, c58068Mqe, fe3);
    }
}
