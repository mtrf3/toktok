package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.JbC, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49466JbC extends AbstractC030309z {
    public final int LJLIL = C7MY.LIZIZ(4);
    public final /* synthetic */ C49465JbB LJLILLLLZI;

    public C49466JbC(C49465JbB c49465JbB) {
        this.LJLILLLLZI = c49465JbB;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        int LIZIZ = c0ac.LIZIZ() - 1;
        if (LIZJ == 0) {
            if (C26338AVi.LIZLLL(this.LJLILLLLZI)) {
                rect.left = this.LJLIL;
                rect.right = 0;
                return;
            } else {
                rect.right = this.LJLIL;
                rect.left = 0;
                return;
            }
        }
        if (LIZJ == LIZIZ) {
            if (LIZIZ < 0) {
                return;
            }
            if (C26338AVi.LIZLLL(this.LJLILLLLZI)) {
                rect.left = 0;
                rect.right = this.LJLIL;
                return;
            } else {
                rect.right = 0;
                rect.left = this.LJLIL;
                return;
            }
        }
        int i = this.LJLIL;
        rect.left = i;
        rect.right = i;
    }
}
