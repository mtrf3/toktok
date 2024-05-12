package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.adG, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94206adG extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        super.LJ(outRect, view, parent, state);
        outRect.right = C93742aVm.LIZIZ(4);
        if (RecyclerView.LJJJJIZL(view) == 0) {
            outRect.left = C93742aVm.LIZIZ(8);
        } else {
            outRect.left = C93742aVm.LIZIZ(4);
        }
    }
}
