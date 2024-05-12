package X;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.lynx.react.bridge.Callback;

/* renamed from: X.JfA, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C49712JfA {
    public static int LIZJ = 80;
    public final RecyclerView LIZ;
    public final RunnableC79830VUs LIZIZ;

    public C49712JfA(Context context, C79688VPg c79688VPg) {
        LIZJ = context.getResources().getDisplayMetrics().densityDpi / 4;
        this.LIZ = c79688VPg;
        this.LIZIZ = new RunnableC79830VUs(c79688VPg);
    }

    public final void LIZ(int i, int i2, Callback callback) {
        RunnableC79830VUs runnableC79830VUs = this.LIZIZ;
        if (runnableC79830VUs != null && runnableC79830VUs.LJLJLLL) {
            if (callback != null) {
                callback.invoke(1, "dumplicated, scrollToPositionSmoothly is working");
                return;
            }
            return;
        }
        RecyclerView recyclerView = this.LIZ;
        if (recyclerView != null) {
            recyclerView.LJLJJI();
            this.LIZ.stopNestedScroll();
        }
        C0A2 layoutManager = this.LIZ.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            ((LinearLayoutManager) layoutManager).LJFF(i, i2);
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            StaggeredGridLayoutManager.SavedState savedState = staggeredGridLayoutManager.LLIIIJ;
            if (savedState != null) {
                savedState.LJLJJI = null;
                savedState.LJLJI = 0;
                savedState.LJLIL = -1;
                savedState.LJLILLLLZI = -1;
            }
            staggeredGridLayoutManager.LLFZ = i;
            staggeredGridLayoutManager.LLI = i2;
            staggeredGridLayoutManager.LJZ();
        }
        if (callback != null) {
            callback.invoke(0);
        }
    }
}
