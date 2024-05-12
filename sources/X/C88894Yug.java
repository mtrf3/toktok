package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Yug, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88894Yug implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88897Yuj();
        YK1 yk1 = new YK1();
        yk1.LJFF = new C88898Yuk();
        yk1.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yk1);
        YEL yel = new YEL();
        yel.LJFF = new C88901Yun();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        YEI yei = new YEI(0);
        yei.LJFF = new C88896Yui();
        yei.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yei);
        YEK yek = new YEK();
        yek.LJFF = new C88899Yul();
        yek.LIZ = yei;
        YEL LIZ = C05L.LIZ(yei.LIZIZ, yek);
        LIZ.LJFF = new C88902Yuo();
        LIZ.LIZ = yei;
        yei.LIZIZ.add(LIZ);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88895Yuh();
        ye2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(ye2);
        YEK yek2 = new YEK();
        yek2.LJFF = new C88900Yum();
        yek2.LIZ = ye2;
        ye2.LIZIZ.add(yek2);
        return new FEY(R.layout.by8, c58068Mqe, fe3);
    }
}
