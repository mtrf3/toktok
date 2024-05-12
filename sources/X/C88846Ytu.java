package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ytu, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88846Ytu implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new C88847Ytv();
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new C88848Ytw();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        C38631FEd c38631FEd = new C38631FEd(R.layout.byj, "nows_share_module_user_row_layout", fe3);
        c38631FEd.LJFF = new C88851Ytz();
        c38631FEd.LJIIZILJ(c58068Mqe2);
        C38631FEd c38631FEd2 = new C38631FEd(R.layout.by8, "nows_newyear_share_module_layout", fe3);
        c38631FEd2.LJFF = new C88850Yty();
        c38631FEd2.LJIIZILJ(c58068Mqe);
        YEL yel = new YEL();
        yel.LJFF = new C88849Ytx();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        return new FEY(R.layout.byi, c58068Mqe, fe3);
    }
}
