package X;

import android.graphics.Rect;
import android.view.ViewTreeObserver;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes15.dex */
public final class VVB implements ViewTreeObserver.OnScrollChangedListener {
    public final RecyclerView LJLIL;
    public final VVH LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        RecyclerView recyclerView = this.LJLIL;
        if (recyclerView == null || recyclerView.getVisibility() != 0 || !recyclerView.getGlobalVisibleRect(new Rect())) {
            return;
        }
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (!(layoutManager instanceof LinearLayoutManager)) {
            layoutManager = null;
        }
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
        if (linearLayoutManager != null) {
            int LLILL = linearLayoutManager.LLILL();
            int LLILLJJLI = linearLayoutManager.LLILLJJLI();
            if (LLILL != -1 && LLILLJJLI - LLILL >= 0) {
                this.LJLILLLLZI.LIZ(LLILL, LLILLJJLI);
            }
        }
    }

    public VVB(RecyclerView recyclerView, VVH vvh) {
        this.LJLIL = recyclerView;
        this.LJLILLLLZI = vvh;
    }
}
