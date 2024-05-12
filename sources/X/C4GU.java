package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.4GU, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4GU extends AbstractC030309z {
    public final int LJLIL;

    public C4GU(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        StaggeredGridLayoutManager staggeredGridLayoutManager;
        C1BZ c1bz;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        C0A2 layoutManager = parent.getLayoutManager();
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || (staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager) == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1BZ) || (c1bz = (C1BZ) layoutParams) == null) {
            return;
        }
        if (c1bz.LIZ() % staggeredGridLayoutManager.LJLZ == 0) {
            outRect.left = 0;
        } else {
            outRect.left = this.LJLIL;
        }
        outRect.bottom = this.LJLIL;
    }
}
