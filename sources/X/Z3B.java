package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z3B implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new Z3C();
        YEI yei = new YEI(0);
        yei.LJFF = new Z3D();
        yei.LIZ = ye2;
        ye2.LIZIZ.add(yei);
        YEI yei2 = new YEI(0);
        yei2.LJFF = new Z3E();
        yei2.LIZ = yei;
        yei.LIZIZ.add(yei2);
        C88430YnC c88430YnC = new C88430YnC(0);
        c88430YnC.LJFF = new Z3F();
        c88430YnC.LIZ = yei2;
        yei2.LIZIZ.add(c88430YnC);
        C88430YnC c88430YnC2 = new C88430YnC(0);
        c88430YnC2.LJFF = new Z3G();
        c88430YnC2.LIZ = yei2;
        yei2.LIZIZ.add(c88430YnC2);
        C88430YnC c88430YnC3 = new C88430YnC(0);
        c88430YnC3.LJFF = new Z3H();
        c88430YnC3.LIZ = yei2;
        yei2.LIZIZ.add(c88430YnC3);
        C88430YnC c88430YnC4 = new C88430YnC(0);
        c88430YnC4.LJFF = new Z3I();
        c88430YnC4.LIZ = yei2;
        yei2.LIZIZ.add(c88430YnC4);
        C38631FEd c38631FEd = new C38631FEd(R.layout.aa6, "common_feed_biz_bottom_area_feed", fe3);
        c38631FEd.LJIIJ = R.id.aln;
        c38631FEd.LJFF = new Z3J();
        c38631FEd.LJIIZILJ(ye2);
        return new FEY(R.layout.ab9, ye2, fe3);
    }
}
