package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z61 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new Z62();
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new Z63();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        YEL yel = new YEL();
        yel.LJFF = new Z67();
        yel.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(yel);
        YEK yek = new YEK();
        yek.LJFF = new Z65();
        yek.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(yek);
        C58068Mqe c58068Mqe3 = new C58068Mqe(i);
        c58068Mqe3.LJFF = new Z64();
        c58068Mqe3.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe3);
        YEK yek2 = new YEK();
        yek2.LJFF = new Z66();
        yek2.LIZ = c58068Mqe3;
        YEL LIZ = C05L.LIZ(c58068Mqe3.LIZIZ, yek2);
        LIZ.LJFF = new Z68();
        LIZ.LIZ = c58068Mqe3;
        c58068Mqe3.LIZIZ.add(LIZ);
        return new FEY(R.layout.c25, c58068Mqe, fe3);
    }
}
