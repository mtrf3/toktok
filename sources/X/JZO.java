package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JZO extends AbstractC030309z {
    public final int LJLILLLLZI;
    public final int LJLIL = 2;
    public final boolean LJLJI = true;

    public JZO(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // X.AbstractC030309z
    public final void LJ(Rect rect, View view, RecyclerView recyclerView, C0AC c0ac) {
        int i;
        int LIZ;
        int LIZ2;
        int i2;
        int LIZJ = C1JX.LIZJ(rect, "outRect", view, "view", recyclerView, "parent", c0ac, "state", view);
        AbstractC029409q adapter = recyclerView.getAdapter();
        if ((adapter instanceof AbstractC51777KTt) && ((AbstractC51777KTt) adapter).LJLIL != null) {
            if (LIZJ == 0) {
                return;
            } else {
                LIZJ++;
            }
        }
        if (!(recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            return;
        }
        GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
        o.LJI(gridLayoutManager);
        AbstractC028509h abstractC028509h = gridLayoutManager.LLIILII;
        int LJ = abstractC028509h.LJ(LIZJ, this.LJLIL);
        int LJFF = abstractC028509h.LJFF(LIZJ);
        boolean LIZ3 = C90193gN.LIZ();
        if (this.LJLJI) {
            int i3 = this.LJLIL;
            if (LJFF != i3) {
                if (!LIZ3) {
                    int i4 = this.LJLILLLLZI;
                    rect.left = i4 - ((LJ * i4) / i3);
                    rect.right = ((LJ + 1) * i4) / i3;
                    return;
                } else {
                    int i5 = this.LJLILLLLZI;
                    rect.right = i5 - ((LJ * i5) / i3);
                    rect.left = ((LJ + 1) * i5) / i3;
                    return;
                }
            }
            return;
        }
        if (LJ == 0) {
            if (!LIZ3) {
                LIZ2 = this.LJLILLLLZI * 2;
            } else {
                LIZ2 = (int) (C278817o.LIZ(7.0f) / 2.0f);
            }
            rect.left = LIZ2;
            if (!LIZ3) {
                i2 = (int) (C278817o.LIZ(7.0f) / 2.0f);
            } else {
                i2 = this.LJLILLLLZI * 2;
            }
            rect.right = i2;
            return;
        }
        if (!LIZ3) {
            i = (int) (C278817o.LIZ(7.0f) / 2.0f);
        } else {
            i = this.LJLILLLLZI * 2;
        }
        rect.left = i;
        if (!LIZ3) {
            LIZ = this.LJLILLLLZI * 2;
        } else {
            LIZ = (int) (C278817o.LIZ(7.0f) / 2.0f);
        }
        rect.right = LIZ;
    }
}
