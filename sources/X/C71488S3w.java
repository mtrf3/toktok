package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.S3w, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C71488S3w extends AbstractC030309z {
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
        rect.right = C7MY.LIZIZ(4);
        rect.left = C7MY.LIZIZ(4);
        if (LIZJ == 0) {
            if (!C90193gN.LIZ()) {
                rect.left = C7MY.LIZIZ(16);
                return;
            } else {
                rect.right = C7MY.LIZIZ(16);
                return;
            }
        }
        if (LIZJ != i - 1) {
            return;
        }
        if (!C90193gN.LIZ()) {
            rect.right = C7MY.LIZIZ(16);
        } else {
            rect.left = C7MY.LIZIZ(16);
        }
    }
}
