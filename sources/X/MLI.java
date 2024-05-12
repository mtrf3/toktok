package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class MLI extends C4DM {
    public final /* synthetic */ C56619MJz LJLJL;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MLI(int i, C56619MJz c56619MJz, int i2, int i3) {
        super(i, 1, 1, i2, i3);
        this.LJLJL = c56619MJz;
    }

    @Override // X.C4DM, X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        if (LIZJ >= 0 && LIZJ < this.LJLJL.getItemCount() - 1) {
            this.LJLJL.getClass();
            super.LJ(rect, view, recyclerView, c0ac);
        }
    }
}
