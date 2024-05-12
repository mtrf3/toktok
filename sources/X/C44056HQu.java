package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.HQu, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44056HQu extends AbstractC030309z {
    public final boolean LJLIL;

    public C44056HQu(C44055HQt c44055HQt) {
        this.LJLIL = C90193gN.LIZIZ(c44055HQt.LIZ.getContext());
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ != -1 && LIZJ == 0) {
            if (this.LJLIL) {
                rect.right = C44057HQv.LIZ;
            } else {
                rect.left = C44057HQv.LIZ;
            }
        }
    }
}
