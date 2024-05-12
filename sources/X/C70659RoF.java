package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.RoF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C70659RoF extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            i = adapter.getItemCount();
        } else {
            i = 0;
        }
        if (LIZJ == i - 1) {
            rect.right = 0;
        } else {
            rect.right = C7MY.LIZIZ(2);
        }
    }
}
