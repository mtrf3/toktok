package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import o3.h0;

/* renamed from: X.VfY, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80312VfY implements InterfaceC16710l9 {
    public final Rect LIZ = new Rect();
    public final /* synthetic */ Context LIZIZ;
    public final /* synthetic */ C80797VnN LIZJ;

    public C80312VfY(C80797VnN c80797VnN, Context context) {
        this.LIZJ = c80797VnN;
        this.LIZIZ = context;
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
        int childCount = this.LIZJ.getChildCount();
        for (int i = 0; i < childCount; i++) {
            try {
                C16800lI LIZIZ = h0.LIZIZ(this.LIZJ.getChildAt(i), LJIILIIL);
                rect.left = Math.min(LIZIZ.LIZJ(), rect.left);
                rect.top = Math.min(LIZIZ.LJ(), rect.top);
                rect.right = Math.min(LIZIZ.LIZLLL(), rect.right);
                rect.bottom = Math.min(LIZIZ.LIZIZ(), rect.bottom);
            } catch (Exception e) {
                Context context = this.LIZIZ;
                if (context instanceof ActivityC45651qj) {
                    String LIZLLL = C48697J9h.LIZLLL((ActivityC45651qj) context);
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("LiveVerticalViewPager onApplyWindowInsets:");
                    LIZ.append(LIZLLL);
                    C0NB.LIZLLL(X1D.LIZIZ(LIZ));
                }
                throw e;
            }
        }
        return LJIILIIL.LJIIIIZZ(rect.left, rect.top, rect.right, rect.bottom);
    }
}
