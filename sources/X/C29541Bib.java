package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Bib, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29541Bib extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final boolean LJLJI;

    public C29541Bib(RecyclerView recyclerView) {
        int LIZ = (int) B9K.LIZ(recyclerView.getContext(), 8.0f);
        this.LJLIL = LIZ;
        this.LJLILLLLZI = (LIZ / 2) * 3;
        this.LJLJI = CCJ.LIZ(recyclerView.getContext());
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (this.LJLJI) {
            if (LIZJ != 0) {
                rect.right = this.LJLIL;
                return;
            } else {
                rect.right = this.LJLILLLLZI;
                return;
            }
        }
        if (LIZJ != 0) {
            rect.left = this.LJLIL;
        } else {
            rect.left = this.LJLILLLLZI;
        }
    }
}
