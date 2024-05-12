package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4lQ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C118804lQ extends AbstractC030309z {
    public final int LJLIL;

    public C118804lQ(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        GridLayoutManager gridLayoutManager;
        C1BU c1bu;
        AbstractC028509h abstractC028509h;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        C0A2 layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1BU) || (c1bu = (C1BU) layoutParams) == null || (abstractC028509h = gridLayoutManager.LLIILII) == null) {
            return;
        }
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        int i = gridLayoutManager.LLIIIL;
        if (1 == c1bu.LJLILLLLZI) {
            int i2 = c1bu.LJLIL;
            int i3 = this.LJLIL;
            outRect.left = (i2 * i3) / i;
            outRect.right = i3 - (((i2 + 1) * i3) / i);
            if (abstractC028509h.LIZLLL(LJJJJIZL, i) > 0) {
                outRect.top = this.LJLIL;
            }
        }
    }
}
