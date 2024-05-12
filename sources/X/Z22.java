package X;

import com.zhiliaoapp.musically.R;

/* loaded from: classes17.dex */
public final class Z22 implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new Z24();
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new Z25();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        C88470Ynq c88470Ynq = new C88470Ynq(0);
        c88470Ynq.LJFF = new Z26();
        c88470Ynq.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c88470Ynq);
        YEJ yej = new YEJ(0);
        yej.LJFF = new Z28();
        yej.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(yej);
        C87237YLp c87237YLp = new C87237YLp(0);
        c87237YLp.LJFF = new Z23();
        c87237YLp.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c87237YLp);
        YE3 ye3 = new YE3(0);
        ye3.LJFF = new Z27();
        ye3.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(ye3);
        return new FEY(R.layout.ddb, c58068Mqe, fe3);
    }
}
