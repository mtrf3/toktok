package X;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.Som, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73240Som {
    public int LIZ = -241;
    public final ViewOnAttachStateChangeListenerC73199So7 LIZIZ = new ViewOnAttachStateChangeListenerC73199So7(0);
    public C73245Sor LIZJ;

    public final void LIZ() {
        RecyclerView recyclerView = this.LIZIZ.LJLIL;
        if (recyclerView != null) {
            C0A2 layoutManager = recyclerView.getLayoutManager();
            if (layoutManager instanceof LinearLayoutManager) {
                this.LIZ = ((LinearLayoutManager) layoutManager).LLILL();
            } else {
                if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                    return;
                }
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                this.LIZ = staggeredGridLayoutManager.LLIL(new int[staggeredGridLayoutManager.LJLZ])[0];
            }
        }
    }

    public final void LIZIZ(int i) {
        int i2;
        RecyclerView recyclerView = this.LIZIZ.LJLIL;
        if (recyclerView == null || (i2 = this.LIZ) == -241 || i2 < i) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            layoutManager.LJZL(this.LIZ);
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            layoutManager.LJZL(this.LIZ);
        }
    }
}
