package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YtC, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88802YtC implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        int i = 0;
        C58068Mqe c58068Mqe = new C58068Mqe(i);
        c58068Mqe.LJFF = new C88803YtD();
        C58068Mqe c58068Mqe2 = new C58068Mqe(i);
        c58068Mqe2.LJFF = new C88804YtE();
        c58068Mqe2.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c58068Mqe2);
        C88469Ynp c88469Ynp = new C88469Ynp();
        c88469Ynp.LJFF = new C88805YtF();
        c88469Ynp.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c88469Ynp);
        C81138Vss c81138Vss = new C81138Vss(1);
        c81138Vss.LJFF = new C88807YtH();
        c81138Vss.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c81138Vss);
        C81133Vsn c81133Vsn = new C81133Vsn(1);
        c81133Vsn.LJFF = new C88806YtG();
        c81133Vsn.LIZ = c58068Mqe2;
        c58068Mqe2.LIZIZ.add(c81133Vsn);
        return new FEY(R.layout.byc, c58068Mqe, fe3);
    }
}
