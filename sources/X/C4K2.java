package X;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4K2, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C4K2 extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;

    public C4K2(float f, Context context) {
        this.LJLIL = (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
        this.LJLILLLLZI = (int) ((16.0f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if (adapter != null) {
            int itemCount = adapter.getItemCount();
            if (LJJJJIZL == 0) {
                rect.left = this.LJLILLLLZI;
                rect.right = this.LJLIL / 2;
            } else if (LJJJJIZL == itemCount - 1) {
                int i = this.LJLIL;
                rect.left = i / 2;
                rect.right = i;
            } else {
                int i2 = this.LJLIL / 2;
                rect.left = i2;
                rect.right = i2;
            }
        }
    }
}
