package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4mq, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C119684mq extends AbstractC030309z {
    public final /* synthetic */ int LJLIL;

    public /* synthetic */ C119684mq(int i) {
        this.LJLIL = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        switch (this.LJLIL) {
            case 0:
                T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                super.LJ(rect, view, recyclerView, c0ac);
                if (RecyclerView.LJJJJIZL(view) == 0) {
                    rect.set(C15380j0.LIZ(16.0f), 0, 0, 0);
                    return;
                } else {
                    rect.set(C15380j0.LIZ(8.0f), 0, 0, 0);
                    return;
                }
            default:
                T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
                super.LJ(rect, view, recyclerView, c0ac);
                int LJJJJIZL = RecyclerView.LJJJJIZL(view);
                if (LJJJJIZL < 0) {
                    return;
                }
                if (LJJJJIZL == 0) {
                    rect.top = C17N.LJIILL(6.0d);
                }
                AbstractC029409q adapter = recyclerView.getAdapter();
                if (adapter == null || LJJJJIZL + 1 != adapter.getItemCount()) {
                    return;
                }
                rect.bottom = C17N.LJIILL(10.0d);
                return;
        }
    }
}
