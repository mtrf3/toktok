package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Sl2, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73008Sl2 extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        if (RecyclerView.LJJJJIZL(view) != 0) {
            if (C15380j0.LJIIZILJ()) {
                rect.right = C15380j0.LIZ(-4.0f);
            } else {
                rect.left = C15380j0.LIZ(-4.0f);
            }
        }
    }
}
