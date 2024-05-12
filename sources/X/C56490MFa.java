package X;

import android.content.Context;
import android.view.View;
import android.view.ViewConfiguration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.MFa, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public class C56490MFa extends C0A6 {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int[] LJLJI = new int[2];
    public final int LJLJJI = ViewConfiguration.get(EF7.LIZIZ()).getScaledTouchSlop();
    public C56491MFb LJLJJL;

    public static boolean LJIILLIIL(RecyclerView recyclerView) {
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager == null) {
            return false;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).LJLZ != 1) {
                return false;
            }
            return true;
        }
        if (!(layoutManager instanceof StaggeredGridLayoutManager) || ((StaggeredGridLayoutManager) layoutManager).LL != 1) {
            return false;
        }
        return true;
    }

    public boolean LJIIZILJ(RecyclerView.ViewHolder viewHolder) {
        if (viewHolder.getItemViewType() == 0) {
            return true;
        }
        return false;
    }

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        if (i == 0) {
            LJIJ(recyclerView, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIJ(RecyclerView recyclerView, boolean z) {
        boolean z2;
        int i;
        int i2;
        if (LJIILLIIL(recyclerView)) {
            Context context = recyclerView.getContext();
            if (this.LJLIL == 0) {
                this.LJLIL = KL2.LJIIIZ(context);
            }
            recyclerView.getLocationOnScreen(this.LJLJI);
            C0A2 layoutManager = recyclerView.getLayoutManager();
            int childCount = recyclerView.getChildCount();
            int i3 = this.LJLJI[1];
            int min = Math.min(this.LJLIL, recyclerView.getHeight() + i3);
            for (int i4 = 0; i4 < childCount; i4++) {
                View childAt = recyclerView.getChildAt(i4);
                RecyclerView.ViewHolder LJJJJJL = recyclerView.LJJJJJL(childAt);
                if (LJIIZILJ(LJJJJJL)) {
                    MFR mfr = (MFR) LJJJJJL;
                    if (!mfr.LLZZZZ()) {
                        if (z) {
                            mfr.LLZLLLL();
                        }
                    }
                    int LJJJJLL = layoutManager.LJJJJLL(childAt);
                    int LJJJJIZL = layoutManager.LJJJJIZL(childAt);
                    int height = childAt.getHeight();
                    if (LJJJJLL < 0) {
                        if (LJJJJIZL <= min) {
                            i2 = LJJJJLL + height;
                        }
                    } else {
                        int i5 = LJJJJIZL + i3;
                        if (i5 > min) {
                            i2 = height - (i5 - min);
                        } else {
                            i2 = height;
                        }
                    }
                    if (i2 * 4 > height * 3) {
                        mfr.setUserVisibleHint(true);
                        mfr.LLLLIILL();
                    } else {
                        mfr.setUserVisibleHint(false);
                        mfr.d();
                    }
                }
            }
            return;
        }
        Context context2 = recyclerView.getContext();
        if (this.LJLILLLLZI == 0) {
            this.LJLILLLLZI = KL2.LJIIJJI(context2);
        }
        Context context3 = recyclerView.getContext();
        if (this.LJLIL == 0) {
            this.LJLIL = KL2.LJIIIZ(context3);
        }
        recyclerView.getLocationOnScreen(this.LJLJI);
        C0A2 layoutManager2 = recyclerView.getLayoutManager();
        int childCount2 = recyclerView.getChildCount();
        int i6 = this.LJLJI[0];
        int min2 = Math.min(this.LJLILLLLZI, recyclerView.getWidth() + i6);
        int height2 = recyclerView.getHeight();
        int i7 = this.LJLJI[1];
        if ((height2 >> 2) + i7 <= 0 || this.LJLIL - i7 <= (height2 >> 1)) {
            z2 = true;
        } else {
            z2 = false;
        }
        for (int i8 = 0; i8 < childCount2; i8++) {
            View childAt2 = recyclerView.getChildAt(i8);
            RecyclerView.ViewHolder LJJJJJL2 = recyclerView.LJJJJJL(childAt2);
            if (LJIIZILJ(LJJJJJL2)) {
                MFR mfr2 = (MFR) LJJJJJL2;
                if (!mfr2.LLZZZZ()) {
                    if (z) {
                        mfr2.LLZLLLL();
                    }
                }
                if (z2) {
                    mfr2.setUserVisibleHint(false);
                    mfr2.d();
                } else {
                    int LJJJJJ = layoutManager2.LJJJJJ(childAt2);
                    int LJJJJLI = layoutManager2.LJJJJLI(childAt2);
                    int width = childAt2.getWidth();
                    if (LJJJJJ < 0) {
                        if (LJJJJLI <= min2) {
                            i = LJJJJJ + width;
                        }
                    } else {
                        int i9 = LJJJJLI + i6;
                        if (i9 > min2) {
                            i = width - (i9 - min2);
                        } else {
                            i = width;
                        }
                    }
                    if (i * 4 > width * 3) {
                        mfr2.setUserVisibleHint(true);
                        mfr2.LLLLIILL();
                    } else {
                        mfr2.setUserVisibleHint(false);
                        mfr2.d();
                    }
                }
            }
        }
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int scrollState = recyclerView.getScrollState();
        if (this.LJLJJL == null) {
            this.LJLJJL = new C56491MFb();
        }
        if (scrollState == 0) {
            C56491MFb c56491MFb = this.LJLJJL;
            if (c56491MFb.LIZ != scrollState || c56491MFb.LIZIZ != i || c56491MFb.LIZJ != i2) {
                c56491MFb.LIZ = scrollState;
                c56491MFb.LIZIZ = i;
                c56491MFb.LIZJ = i2;
                EF7.LIZIZ();
                if (C208568Gm.LIZ()) {
                    if (LJIILLIIL(recyclerView)) {
                        i = i2;
                    }
                    if (Math.abs(i) > this.LJLJJI) {
                        return;
                    }
                    LJIJ(recyclerView, false);
                }
            }
        }
    }
}
