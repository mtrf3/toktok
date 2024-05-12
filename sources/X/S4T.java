package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes13.dex */
public final class S4T extends AbstractC030309z {
    public final int LJLIL;

    public S4T(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) == 0) {
            rect.top = this.LJLIL;
        }
    }
}
