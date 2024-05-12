package X;

import android.graphics.Rect;
import android.view.View;
import kotlin.jvm.internal.o;
import o3.h0;

/* renamed from: X.VfW, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80310VfW implements InterfaceC16710l9 {
    public final Rect LIZ = new Rect();
    public final /* synthetic */ C80794VnK LIZIZ;

    public C80310VfW(C80794VnK c80794VnK) {
        this.LIZIZ = c80794VnK;
    }

    @Override // X.InterfaceC16710l9
    public final C16800lI LIZ(View v, C16800lI c16800lI) {
        o.LJIIIZ(v, "v");
        C16800lI LJIILIIL = h0.LJIILIIL(v, c16800lI);
        o.LJIIIIZZ(LJIILIIL, "onApplyWindowInsets(v, originalInsets)");
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
            o.LJIIIIZZ(LIZIZ, "dispatchApplyWindowInsets(getChildAt(i), applied)");
            rect.left = Math.min(LIZIZ.LIZJ(), rect.left);
            rect.top = Math.min(LIZIZ.LJ(), rect.top);
            rect.right = Math.min(LIZIZ.LIZLLL(), rect.right);
            rect.bottom = Math.min(LIZIZ.LIZIZ(), rect.bottom);
        }
        C16800lI LJIIIIZZ = LJIILIIL.LJIIIIZZ(rect.left, rect.top, rect.right, rect.bottom);
        o.LJIIIIZZ(LJIIIIZZ, "applied.replaceSystemWin…p, res.right, res.bottom)");
        return LJIIIIZZ;
    }
}
