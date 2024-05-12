package X;

import com.zhiliaoapp.musically.R;

/* renamed from: X.Ytq, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C88842Ytq implements FE0 {
    @Override // X.FE0
    public final FEY LIZ(FE3 fe3) {
        C58068Mqe c58068Mqe = new C58068Mqe(0);
        c58068Mqe.LJFF = new C88843Ytr();
        C81135Vsp c81135Vsp = new C81135Vsp();
        c81135Vsp.LJFF = new C88844Yts();
        c81135Vsp.LIZ = c58068Mqe;
        c58068Mqe.LIZIZ.add(c81135Vsp);
        C38631FEd c38631FEd = new C38631FEd(R.layout.abj, "common_feed_item_feed", fe3);
        c38631FEd.LJFF = new C88845Ytt();
        c38631FEd.LJIIZILJ(c81135Vsp);
        return new FEY(R.layout.cod, c58068Mqe, fe3);
    }
}
