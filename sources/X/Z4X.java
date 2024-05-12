package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z4X implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new Z4Y();
        FJ8 fj8 = new FJ8();
        fj8.LJFF = new C89333Z4f();
        fj8.LIZ = ye2;
        ye2.LIZIZ.add(fj8);
        C81134Vso c81134Vso = new C81134Vso(0);
        c81134Vso.LJFF = new C89331Z4d();
        c81134Vso.LIZ = fj8;
        fj8.LIZIZ.add(c81134Vso);
        YEI yei = new YEI(0);
        yei.LJFF = new C89328Z4a();
        yei.LIZ = fj8;
        fj8.LIZIZ.add(yei);
        YEL yel = new YEL();
        yel.LJFF = new C89332Z4e();
        yel.LIZ = yei;
        yei.LIZIZ.add(yel);
        C81127Vsh c81127Vsh = new C81127Vsh();
        c81127Vsh.LJFF = new Z4Z();
        c81127Vsh.LIZ = yei;
        yei.LIZIZ.add(c81127Vsh);
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new C89330Z4c();
        c87237YLp.LIZ = yei;
        yei.LIZIZ.add(c87237YLp);
        C88430YnC c88430YnC = new C88430YnC(0);
        c88430YnC.LJFF = new C89329Z4b();
        c88430YnC.LIZ = ye2;
        ye2.LIZIZ.add(c88430YnC);
        return new FEY(R.layout.chs, ye2, fe3);
    }
}
