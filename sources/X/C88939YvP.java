package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YvP, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88939YvP implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        YEG yeg = new YEG(0);
        yeg.LJFF = new C88941YvR();
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new C88942YvS();
        c87237YLp.LIZ = yeg;
        yeg.LIZIZ.add(c87237YLp);
        YE2 ye2 = new YE2(0);
        ye2.LJFF = new C88938YvO();
        ye2.LIZ = yeg;
        yeg.LIZIZ.add(ye2);
        C88470Ynq c88470Ynq = new C88470Ynq(1);
        c88470Ynq.LJFF = new C88943YvT();
        c88470Ynq.LIZ = yeg;
        yeg.LIZIZ.add(c88470Ynq);
        YE2 ye22 = new YE2(0);
        ye22.LJFF = new C88940YvQ();
        ye22.LIZ = yeg;
        yeg.LIZIZ.add(ye22);
        return new FEY(R.layout.cok, yeg, fe3);
    }
}
