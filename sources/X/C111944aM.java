package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.4aM, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C111944aM extends AbstractC030309z {
    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        super.LJ(rect, view, recyclerView, c0ac);
        if (RecyclerView.LJJJJIZL(view) == 0) {
            rect.set(0, (int) KL2.LIZJ(view.getContext(), 8.0f), 0, 0);
        }
    }
}
