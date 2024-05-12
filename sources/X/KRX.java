package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class KRX extends C0A6 {
    public KRY LJLILLLLZI;
    public int LJLJJI;
    public int LJLJJL;
    public final int LJLIL = 3;
    public final boolean LJLJI = true;
    public int LJLJJLL = -1;

    @Override // X.C0A6
    public final void LJIILJJIL(int i, RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        int i3;
        int i4;
        o.LJIIIZ(recyclerView, "recyclerView");
        if (!this.LJLJI || i2 < 0 || i < 0) {
            return;
        }
        if (this.LJLJJL == 0) {
            this.LJLJJL = (int) (recyclerView.getContext().getResources().getDisplayMetrics().density * 40);
        }
        int i5 = this.LJLJJI + i2;
        this.LJLJJI = i5;
        if (i5 <= this.LJLJJL) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            int LJJJJZ = layoutManager.LJJJJZ() - 1;
            if (layoutManager instanceof GridLayoutManager) {
                GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
                int i6 = this.LJLIL * gridLayoutManager.LLIIIL;
                i4 = LJJJJZ - 1;
                int i7 = 0;
                while (true) {
                    if (-1 < i4) {
                        i7 += gridLayoutManager.LLIILII.LJFF(i4);
                        if (i7 >= i6) {
                            break;
                        } else {
                            i4--;
                        }
                    } else {
                        i4 = Integer.MAX_VALUE;
                        break;
                    }
                }
                i3 = gridLayoutManager.LLILLJJLI();
            } else if (layoutManager instanceof LinearLayoutManager) {
                i4 = (LJJJJZ - 1) - this.LJLIL;
                i3 = ((LinearLayoutManager) layoutManager).LLILLJJLI();
            } else if (layoutManager instanceof StaggeredGridLayoutManager) {
                StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
                int i8 = staggeredGridLayoutManager.LJLZ;
                int[] iArr = new int[i8];
                staggeredGridLayoutManager.LLILII(iArr);
                i3 = iArr[0];
                for (int i9 = 0; i9 < i8; i9++) {
                    int i10 = iArr[i9];
                    if (i10 > i3) {
                        i3 = i10;
                    }
                }
                i4 = LJJJJZ - (staggeredGridLayoutManager.LJLZ * this.LJLIL);
            }
            if (layoutManager.LJJJI() > 0 && i3 >= i4 && this.LJLJJLL != i4) {
                this.LJLJJLL = i4;
                KRY kry = this.LJLILLLLZI;
                if (kry != null) {
                    kry.LIZ();
                }
            }
        }
        this.LJLJJI = 0;
    }
}
