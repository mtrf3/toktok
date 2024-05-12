package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YuY, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88886YuY implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEI yei = new YEI(0);
        yei.LJFF = new C88889Yub();
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88887YuZ();
        ye2.LIZ = yei;
        yei.LIZIZ.add(ye2);
        YEI yei2 = new YEI(0);
        yei2.LJFF = new C88890Yuc();
        yei2.LIZ = yei;
        yei.LIZIZ.add(yei2);
        C81127Vsh c81127Vsh = new C81127Vsh();
        c81127Vsh.LJFF = new C88888Yua();
        c81127Vsh.LIZ = yei2;
        yei2.LIZIZ.add(c81127Vsh);
        YEL yel = new YEL();
        yel.LJFF = new C88892Yue();
        yel.LIZ = yei2;
        yei2.LIZIZ.add(yel);
        YEL yel2 = new YEL();
        yel2.LJFF = new C88893Yuf();
        yel2.LIZ = yei;
        yei.LIZIZ.add(yel2);
        YEK yek = new YEK();
        yek.LJFF = new C88891Yud();
        yek.LIZ = yei;
        yei.LIZIZ.add(yek);
        return new FEY(R.layout.alw, yei, fe3);
    }
}
