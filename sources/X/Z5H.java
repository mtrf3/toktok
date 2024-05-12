package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z5H implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new Z5I();
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new Z5M();
        c58068Mqe.LIZ = ye2;
        ye2.LIZIZ.add(c58068Mqe);
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new Z5N();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        YEK yek = new YEK();
        yek.LJFF = new Z5O();
        yek.LIZ = c58068Mqe2;
        YEL LIZ = C05L.LIZ(c58068Mqe2.LIZIZ, yek);
        LIZ.LJFF = new Z5P();
        LIZ.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(LIZ);
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new Z5L();
        c87237YLp.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c87237YLp);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new Z5J();
        ye22.LIZ = c58068Mqe;
        YE2 LIZ2 = YE1.LIZ(c58068Mqe.LIZIZ, ye22, 0);
        LIZ2.LJFF = new Z5K();
        LIZ2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(LIZ2);
        YEL yel = new YEL();
        yel.LJFF = new Z5Q();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        return new FEY(R.layout.bxx, ye2, fe3);
    }
}
