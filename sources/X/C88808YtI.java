package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.YtI, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88808YtI implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88809YtJ();
        YE9 ye9 = new YE9();
        ye9.LJFF = new C88811YtL();
        ye9.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(ye9);
        YEL yel = new YEL();
        yel.LJFF = new C88810YtK();
        yel.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(yel);
        C81138Vss c81138Vss = new C81138Vss(1);
        c81138Vss.LJFF = new C88812YtM();
        c81138Vss.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c81138Vss);
        return new FEY(R.layout.c1y, c58068Mqe, fe3);
    }
}
