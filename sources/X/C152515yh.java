package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5yh, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C152515yh extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C152515yh(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        C0A2 layoutManager;
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ == 0) {
            rect.top = this.LJLIL;
        }
        C0A2 layoutManager2 = recyclerView.getLayoutManager();
        if (layoutManager2 != null && Integer.valueOf(layoutManager2.LJJJJZ() - 1) != null && (layoutManager = recyclerView.getLayoutManager()) != null && LIZJ == layoutManager.LJJJJZ() - 1) {
            rect.bottom = this.LJLILLLLZI;
        }
    }
}
