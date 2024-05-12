package X;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.4Ie, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C107084Ie extends AbstractC030309z {
    public final /* synthetic */ int LJLIL;
    public final int LJLILLLLZI;

    public /* synthetic */ C107084Ie(int i, int i2) {
        this.LJLIL = i2;
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        GridLayoutManager gridLayoutManager;
        C1BU c1bu;
        switch (this.LJLIL) {
            case 0:
                if (C1JX.LIZJ(outRect, "outRect", view, "view", parent, "parent", state, "state", view) != 0) {
                    outRect.top = this.LJLILLLLZI;
                    return;
                }
                return;
            default:
                o.LJIIIZ(outRect, "outRect");
                o.LJIIIZ(view, "view");
                o.LJIIIZ(parent, "parent");
                o.LJIIIZ(state, "state");
                C0A2 layoutManager = parent.getLayoutManager();
                if (!(layoutManager instanceof GridLayoutManager) || (gridLayoutManager = (GridLayoutManager) layoutManager) == null) {
                    return;
                }
                ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
                if (!(layoutParams instanceof C1BU) || (c1bu = (C1BU) layoutParams) == null) {
                    return;
                }
                int i = gridLayoutManager.LLIIIL;
                if (1 != c1bu.LJLILLLLZI) {
                    return;
                }
                int i2 = c1bu.LJLIL;
                int i3 = this.LJLILLLLZI;
                outRect.left = (i2 * i3) / i;
                outRect.right = i3 - (((i2 + 1) * i3) / i);
                outRect.bottom = i3;
                return;
        }
    }
}
