package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.aan, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94053aan extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        int i;
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        super.LJ(outRect, view, parent, state);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            if (((C1BZ) layoutParams).LIZ() != 0) {
                i = C93410aQQ.LIZIZ(2);
            } else {
                i = 0;
            }
            outRect.set(i, 0, 0, C93410aQQ.LIZIZ(2));
            return;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.StaggeredGridLayoutManager.LayoutParams");
    }
}
