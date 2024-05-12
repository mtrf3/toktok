package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.49O, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C49O extends AbstractC030309z {
    public final int LJLIL;

    public C49O(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        rect.left = this.LJLIL;
    }
}
