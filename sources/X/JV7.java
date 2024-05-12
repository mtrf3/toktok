package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class JV7 extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI = 0;

    public JV7(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (C90193gN.LIZ()) {
            if (LIZJ == 0) {
                rect.right = this.LJLILLLLZI;
            }
            rect.left = this.LJLIL;
        } else {
            if (LIZJ == 0) {
                rect.left = this.LJLILLLLZI;
            }
            rect.right = this.LJLIL;
        }
    }
}
