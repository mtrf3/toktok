package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ysd, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88767Ysd implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new C88769Ysf();
        C81133Vsn c81133Vsn = new C81133Vsn(i);
        c81133Vsn.LJFF = new C88768Yse();
        c81133Vsn.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c81133Vsn);
        YEL yel = new YEL();
        yel.LJFF = new C88770Ysg();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        return new FEY(R.layout.afm, c58068Mqe, fe3);
    }
}
