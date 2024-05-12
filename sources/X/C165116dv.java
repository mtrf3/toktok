package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.6dv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C165116dv extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C165116dv(int i, int i2) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect outRect, View view, RecyclerView parent, C0AC state) {
        o.LJIIIZ(outRect, "outRect");
        o.LJIIIZ(view, "view");
        o.LJIIIZ(parent, "parent");
        o.LJIIIZ(state, "state");
        if (parent.getAdapter() != null) {
            if (RecyclerView.LJJJJJ(view) == 0) {
                outRect.left = this.LJLILLLLZI;
                outRect.right = this.LJLIL / 2;
            } else if (RecyclerView.LJJJJJ(view) == r2.getItemCount() - 1) {
                outRect.left = this.LJLIL / 2;
                outRect.right = this.LJLILLLLZI;
            } else {
                int i = this.LJLIL / 2;
                outRect.left = i;
                outRect.right = i;
            }
        }
    }
}
