package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.1eB, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C37871eB extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public C37871eB(int i, int i2, int i3) {
        this.LJLIL = i;
        this.LJLILLLLZI = i2;
        this.LJLJI = i3;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view) % this.LJLIL;
        if (C16310kV.LIZLLL(recyclerView) == 1) {
            rect.right = (LIZJ * this.LJLJI) / this.LJLIL;
        } else {
            rect.left = (LIZJ * this.LJLJI) / this.LJLIL;
        }
        rect.top = this.LJLILLLLZI;
    }
}
