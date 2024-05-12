package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
public final class JZP extends AbstractC030309z {
    public final int LJLIL;
    public final int LJLILLLLZI;
    public final int LJLJI;

    public JZP(int i, int i2, int i3) {
        this.LJLILLLLZI = i;
        this.LJLIL = i2;
        this.LJLJI = i3;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int i2;
        recyclerView.getClass();
        int LJJJJIZL = RecyclerView.LJJJJIZL(view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC51777KTt) && ((AbstractC51777KTt) adapter).LJLIL != null) {
            if (LJJJJIZL == 0) {
                return;
            } else {
                LJJJJIZL++;
            }
        }
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        AbstractC028509h abstractC028509h = gridLayoutManager.LLIILII;
        int i3 = gridLayoutManager.LLIIIL;
        int LJ = abstractC028509h.LJ(LJJJJIZL, i3);
        int LJFF = abstractC028509h.LJFF(LJJJJIZL);
        boolean LIZ = C90193gN.LIZ();
        if (LJ == 0) {
            i = this.LJLIL;
        } else {
            int i4 = this.LJLILLLLZI;
            i = i4 - ((LJ * i4) / i3);
        }
        int i5 = LJ + 1;
        if (i5 / i3 == 1) {
            i2 = this.LJLIL;
        } else {
            i2 = (i5 * this.LJLILLLLZI) / i3;
        }
        if (LJFF != i3) {
            if (!LIZ) {
                rect.left = i;
                rect.right = i2;
            } else {
                rect.right = i;
                rect.left = i2;
            }
            rect.top = this.LJLJI;
        }
    }
}
