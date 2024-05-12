package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YtU, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88820YtU implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88823YtX();
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new C88822YtW();
        c87237YLp.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c87237YLp);
        YEL yel = new YEL();
        yel.LJFF = new C88825YtZ();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        YEI yei = new YEI(0);
        yei.LJFF = new C88821YtV();
        yei.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yei);
        YEL yel2 = new YEL();
        yel2.LJFF = new C88826Yta();
        yel2.LIZ = yei;
        yei.LIZIZ.add(yel2);
        YEK yek = new YEK();
        yek.LJFF = new C88824YtY();
        yek.LIZ = yei;
        yei.LIZIZ.add(yek);
        return new FEY(R.layout.ci4, c58068Mqe, fe3);
    }
}
