package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.ss.android.ugc.aweme.search.performance.asyncprefetch.config.AsyncLoadConfig;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYJ implements InterfaceC49349JYj {
    public int LIZ;
    public int LIZIZ;
    public int LIZJ;
    public final int LIZLLL;
    public final int LJ;
    public final int LJFF;

    @Override // X.InterfaceC49349JYj
    public final int LJZ() {
        return this.LJ;
    }

    public JYJ(RecyclerView recyclerView) {
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            r2 = layoutManager instanceof GridLayoutManager ? ((GridLayoutManager) layoutManager).LLIIIL : 1;
            if (layoutManager instanceof StaggeredGridLayoutManager) {
                r2 = ((StaggeredGridLayoutManager) layoutManager).LJLZ;
            }
        }
        this.LIZLLL = r2;
        AsyncLoadConfig asyncLoadConfig = JWC.LIZ;
        this.LJ = asyncLoadConfig.preloadCount * r2;
        this.LJFF = asyncLoadConfig.scrollDistanceToPreLoad;
    }

    @Override // X.InterfaceC49349JYj
    public final C40517FvF LJLZ(int i, RecyclerView recyclerView) {
        Integer LIZ;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (i == 0) {
            int i2 = this.LIZ;
            if (i2 >= 1) {
                Integer LIZIZ = JYT.LIZIZ(recyclerView);
                if (LIZIZ != null) {
                    return new C40517FvF(LIZIZ.intValue() + 1, LIZIZ.intValue() + this.LJ);
                }
                return null;
            }
            if (i2 <= -1 && (LIZ = JYT.LIZ(recyclerView)) != null) {
                return C78842Uww.LJJ(LIZ.intValue() - Math.min(this.LIZLLL * 2, this.LJ), LIZ.intValue());
            }
            return null;
        }
        return null;
    }

    @Override // X.InterfaceC49349JYj
    public final C40517FvF LJZI(RecyclerView recyclerView, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LIZ = i;
        int i2 = this.LJFF;
        if (i >= i2) {
            Integer LIZIZ = JYT.LIZIZ(recyclerView);
            int i3 = this.LIZJ;
            if (LIZIZ == null || LIZIZ.intValue() == i3) {
                return null;
            }
            this.LIZJ = LIZIZ.intValue();
            return new C40517FvF(LIZIZ.intValue() + 1, Math.min(this.LIZLLL * 2, this.LJ) + LIZIZ.intValue());
        }
        if (i <= (-i2)) {
            Integer LIZ = JYT.LIZ(recyclerView);
            int i4 = this.LIZIZ;
            if (LIZ == null || LIZ.intValue() == i4) {
                return null;
            }
            this.LIZIZ = LIZ.intValue();
            return C78842Uww.LJJ(LIZ.intValue() - Math.min(this.LIZLLL * 2, this.LJ), LIZ.intValue());
        }
        return null;
    }
}
