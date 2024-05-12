package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.BiZ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29539BiZ extends AbstractC030309z {
    public final /* synthetic */ C29527BiN LJLIL;

    public C29539BiZ(C29527BiN c29527BiN) {
        this.LJLIL = c29527BiN;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        if (C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) == 0) {
            rect.set(0, 0, 0, 0);
        } else if (CCJ.LIZ(this.LJLIL.LJLIL.LIZ)) {
            rect.set(0, 0, C15380j0.LIZ(8.0f), 0);
        } else {
            rect.set(C15380j0.LIZ(8.0f), 0, 0, 0);
        }
    }
}
