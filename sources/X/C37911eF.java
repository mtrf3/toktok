package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1eF, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37911eF extends AbstractC030309z {
    public final float LJLIL;
    public final float LJLILLLLZI;
    public final float LJLJI;

    public C37911eF(float f, float f2, float f3) {
        this.LJLIL = f;
        this.LJLILLLLZI = f2;
        this.LJLJI = f3;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        boolean z;
        T28.LJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state");
        if (C16310kV.LIZLLL(recyclerView) == 1) {
            z = true;
        } else {
            z = false;
        }
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        if (LJJJJIZL == 0) {
            if (z) {
                rect.right = C15380j0.LIZ(this.LJLIL);
            } else {
                rect.left = C15380j0.LIZ(this.LJLIL);
            }
        } else if (z) {
            rect.right = C15380j0.LIZ(this.LJLJI);
        } else {
            rect.left = C15380j0.LIZ(this.LJLJI);
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null && LJJJJIZL == layoutManager.LJJJJZ() - 1) {
            if (z) {
                rect.left = C15380j0.LIZ(this.LJLILLLLZI);
            } else {
                rect.right = C15380j0.LIZ(this.LJLILLLLZI);
            }
        }
    }
}
