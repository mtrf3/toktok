package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Lhb, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54959Lhb extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        if (RecyclerView.LJJJJIZL(view) % 2 == 0) {
            rect.left = 0;
            rect.right = 1;
        } else {
            rect.left = 1;
            rect.right = 0;
        }
        rect.top = 1;
        rect.bottom = 1;
    }
}
