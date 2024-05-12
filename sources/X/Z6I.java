package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z6I implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new Z6Q();
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new Z6O();
        c87237YLp.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c87237YLp);
        C87237YLp c87237YLp2 = new C87237YLp(0);
        c87237YLp2.LJFF = new Z6P();
        c87237YLp2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c87237YLp2);
        C88445YnR c88445YnR = new C88445YnR();
        c88445YnR.LJFF = new Z6X();
        c88445YnR.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c88445YnR);
        YEI yei = new YEI(0);
        yei.LJFF = new Z6L();
        yei.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yei);
        YEI yei2 = new YEI(0);
        yei2.LJFF = new Z6M();
        yei2.LIZ = yei;
        yei.LIZIZ.add(yei2);
        YE3 ye3 = new YE3(1);
        ye3.LJFF = new Z6Z();
        ye3.LIZ = yei2;
        yei2.LIZIZ.add(ye3);
        YEL yel = new YEL();
        yel.LJFF = new Z6W();
        yel.LIZ = yei2;
        yei2.LIZIZ.add(yel);
        YEI yei3 = new YEI(0);
        yei3.LJFF = new Z6N();
        yei3.LIZ = yei;
        yei.LIZIZ.add(yei3);
        YEK yek = new YEK();
        yek.LJFF = new Z6S();
        yek.LIZ = yei3;
        YEL LIZ = C05L.LIZ(yei3.LIZIZ, yek);
        LIZ.LJFF = new Z6T();
        LIZ.LIZ = yei3;
        yei3.LIZIZ.add(LIZ);
        YEI yei4 = new YEI(0);
        yei4.LJFF = new Z6J();
        yei4.LIZ = yei;
        yei.LIZIZ.add(yei4);
        YEC yec = new YEC(1);
        yec.LJFF = new Z6Y();
        yec.LIZ = yei4;
        yei4.LIZIZ.add(yec);
        YEL yel2 = new YEL();
        yel2.LJFF = new Z6U();
        yel2.LIZ = yei4;
        yei4.LIZIZ.add(yel2);
        YEI yei5 = new YEI(0);
        yei5.LJFF = new Z6K();
        yei5.LIZ = yei;
        yei.LIZIZ.add(yei5);
        YEK yek2 = new YEK();
        yek2.LJFF = new Z6R();
        yek2.LIZ = yei5;
        YEL LIZ2 = C05L.LIZ(yei5.LIZIZ, yek2);
        LIZ2.LJFF = new Z6V();
        LIZ2.LIZ = yei5;
        yei5.LIZIZ.add(LIZ2);
        return new FEY(R.layout.c1u, c58068Mqe, fe3);
    }
}
