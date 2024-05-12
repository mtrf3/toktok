package X;

import android.graphics.Rect;
import android.view.View;
import o3.h0;

/* renamed from: X.VfV, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80309VfV implements InterfaceC16710l9 {
    public final Rect LIZ = new Rect();
    public final /* synthetic */ C80796VnM LIZIZ;

    public C80309VfV(C80796VnM c80796VnM) {
        this.LIZIZ = c80796VnM;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View view, C16800lI c16800lI) {
        C16800lI LJIILIIL = h0.LJIILIIL(view, c16800lI);
        if (LJIILIIL.LJI()) {
            return LJIILIIL;
        }
        Rect rect = this.LIZ;
        rect.left = LJIILIIL.LIZJ();
        rect.top = LJIILIIL.LJ();
        rect.right = LJIILIIL.LIZLLL();
        rect.bottom = LJIILIIL.LIZIZ();
        int childCount = this.LIZIZ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C16800lI LIZIZ = h0.LIZIZ(this.LIZIZ.getChildAt(i), LJIILIIL);
            rect.left = Math.min(LIZIZ.LIZJ(), rect.left);
            rect.top = Math.min(LIZIZ.LJ(), rect.top);
            rect.right = Math.min(LIZIZ.LIZLLL(), rect.right);
            rect.bottom = Math.min(LIZIZ.LIZIZ(), rect.bottom);
        }
        return LJIILIIL.LJIIIIZZ(rect.left, rect.top, rect.right, rect.bottom);
    }
}
