package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.5ur, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C150135ur extends AbstractC030309z {
    public int LJLIL;
    public int LJLILLLLZI;

    public C150135ur(int i) {
        this.LJLIL = C134855Qz.LIZ(i);
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (LJJJJIZL == 0) {
            int i = this.LJLIL;
            rect.left = i;
            rect.right = i / 2;
            return;
        }
        if (recyclerView.getAdapter() != null && LJJJJIZL == r0.getItemCount() - 1) {
            int i2 = this.LJLIL;
            rect.left = i2 / 2;
            rect.right = i2;
        } else {
            int i3 = this.LJLIL / 2;
            rect.left = i3;
            rect.right = i3;
        }
    }
}
