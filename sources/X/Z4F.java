package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z4F implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEG yeg = new YEG(0);
        yeg.LJFF = new Z4M();
        YEG yeg2 = new YEG(0);
        yeg2.LJFF = new Z4N();
        yeg2.LIZ = yeg;
        yeg.LIZIZ.add(yeg2);
        C81137Vsr c81137Vsr = new C81137Vsr();
        c81137Vsr.LJFF = new Z4T();
        c81137Vsr.LIZ = yeg2;
        yeg2.LIZIZ.add(c81137Vsr);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new Z4J();
        ye2.LIZ = yeg2;
        yeg2.LIZIZ.add(ye2);
        C38631FEd c38631FEd = new C38631FEd(R.layout.aa7, "common_feed_biz_top_area_feed", fe3);
        c38631FEd.LJIIJ = R.id.alo;
        c38631FEd.LJFF = new Z4W();
        c38631FEd.LJIIZILJ(yeg2);
        C38631FEd c38631FEd2 = new C38631FEd(R.layout.ab9, "common_feed_info_area_feed", fe3);
        c38631FEd2.LJIIJ = R.id.adr;
        c38631FEd2.LJFF = new C89324Z3w();
        c38631FEd2.LJIIZILJ(yeg2);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new Z4K();
        ye22.LIZ = yeg2;
        yeg2.LIZIZ.add(ye22);
        C81137Vsr c81137Vsr2 = new C81137Vsr();
        c81137Vsr2.LJFF = new Z4U();
        c81137Vsr2.LIZ = yeg2;
        yeg2.LIZIZ.add(c81137Vsr2);
        C38631FEd c38631FEd3 = new C38631FEd(R.layout.acm, "common_feed_layout_landscape_entrances", fe3);
        c38631FEd3.LJIIJ = R.id.k5_;
        c38631FEd3.LJFF = new Z3A();
        c38631FEd3.LJIIZILJ(c81137Vsr2);
        C88462Yni c88462Yni = new C88462Yni(1);
        c88462Yni.LJFF = new Z4V();
        c88462Yni.LIZ = yeg2;
        yeg2.LIZIZ.add(c88462Yni);
        C88430YnC c88430YnC = new C88430YnC(0);
        c88430YnC.LJFF = new Z4O();
        c88430YnC.LIZ = c88462Yni;
        c88462Yni.LIZIZ.add(c88430YnC);
        YE2 ye23 = new YE2(0);
        ye23.LJFF = new Z4G();
        ye23.LIZ = yeg2;
        yeg2.LIZIZ.add(ye23);
        YEI yei = new YEI(0);
        yei.LJFF = new Z4L();
        yei.LIZ = yeg;
        yeg.LIZIZ.add(yei);
        YE2 ye24 = new YE2(0);
        ye24.LJFF = new Z4H();
        ye24.LIZ = yeg;
        yeg.LIZIZ.add(ye24);
        YEE yee = new YEE(0);
        yee.LJFF = new Z4P();
        yee.LIZ = yeg;
        yeg.LIZIZ.add(yee);
        YEE yee2 = new YEE(0);
        yee2.LJFF = new Z4Q();
        yee2.LIZ = yeg;
        yeg.LIZIZ.add(yee2);
        YEE yee3 = new YEE(0);
        yee3.LJFF = new Z4R();
        yee3.LIZ = yeg;
        yeg.LIZIZ.add(yee3);
        YEE yee4 = new YEE(0);
        yee4.LJFF = new Z4S();
        yee4.LIZ = yeg;
        yeg.LIZIZ.add(yee4);
        YE2 ye25 = new YE2(0);
        ye25.LJFF = new Z4I();
        ye25.LIZ = yeg;
        yeg.LIZIZ.add(ye25);
        return new FEY(R.layout.abh, yeg, fe3);
    }
}
