package X;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.o;

/* renamed from: X.Vc8, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C80100Vc8 extends C80101Vc9 {
    public final boolean LJIIIIZZ;
    public final int LJIIIZ;

    public C80100Vc8(boolean z, int i) {
        this.LJIIIIZZ = z;
        this.LJIIIZ = i;
    }

    @Override // X.C80101Vc9, X.C40161hs, X.AbstractC28951Br
    public final int[] LIZJ(C0A2 layoutManager, View targetView) {
        o.LJIIIZ(layoutManager, "layoutManager");
        o.LJIIIZ(targetView, "targetView");
        int[] iArr = new int[2];
        int i = 0;
        do {
            iArr[i] = 0;
            i++;
        } while (i < 2);
        if (layoutManager.LJIJJLI()) {
            if (!this.LJIIIIZZ) {
                iArr[0] = LJIILIIL(targetView, LJIIJ(layoutManager));
            } else {
                iArr[0] = -LJIILIIL(targetView, LJIIJ(layoutManager));
            }
        } else {
            iArr[0] = 0;
        }
        if (layoutManager.LJIL()) {
            iArr[1] = LJIILIIL(targetView, LJIIJJI(layoutManager));
        } else {
            iArr[1] = 0;
        }
        return iArr;
    }

    @Override // X.C80101Vc9
    public final View LJIIL(C0A2 layoutManager, AbstractC03050Ab abstractC03050Ab) {
        int i;
        o.LJIIIZ(layoutManager, "layoutManager");
        int LJJJI = layoutManager.LJJJI();
        View view = null;
        if (LJJJI == 0) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            if (((LinearLayoutManager) layoutManager).LLILLIZIL() == r0.LJJJJZ() - 1) {
                return null;
            }
        }
        int i2 = 0;
        if (layoutManager.LJJJJ()) {
            i = abstractC03050Ab.LJIIJ();
        } else {
            i = 0;
        }
        int i3 = Integer.MAX_VALUE;
        if (!this.LJIIIIZZ) {
            int i4 = LJJJI - 1;
            if (i4 >= 0) {
                while (true) {
                    View LJJJ = layoutManager.LJJJ(i2);
                    int abs = Math.abs(abstractC03050Ab.LJ(LJJJ) - i);
                    if (abs < i3) {
                        view = LJJJ;
                        i3 = abs;
                    }
                    if (i2 == i4) {
                        break;
                    }
                    i2++;
                }
            }
        } else {
            int i5 = this.LJIIIZ;
            int i6 = LJJJI - 1;
            if (i6 >= 0) {
                while (true) {
                    View LJJJ2 = layoutManager.LJJJ(i2);
                    int abs2 = Math.abs((i5 - abstractC03050Ab.LIZIZ(LJJJ2)) - i);
                    if (abs2 < i3) {
                        view = LJJJ2;
                        i3 = abs2;
                    }
                    if (i2 == i6) {
                        break;
                    }
                    i2++;
                }
            }
        }
        return view;
    }

    public final int LJIILIIL(View targetView, AbstractC03050Ab abstractC03050Ab) {
        o.LJIIIZ(targetView, "targetView");
        if (!this.LJIIIIZZ) {
            return abstractC03050Ab.LJ(targetView) - abstractC03050Ab.LJIIJ();
        }
        return (this.LJIIIZ - abstractC03050Ab.LJIIJ()) - abstractC03050Ab.LIZIZ(targetView);
    }

    @Override // X.C40161hs, X.AbstractC28951Br
    public final int LJI(C0A2 c0a2, int i, int i2) {
        View LJIIL;
        int LJJJLL;
        if (!this.LJIIIIZZ) {
            return super.LJI(c0a2, i, i2);
        }
        if (c0a2.LJJJJZ() == 0) {
            return -1;
        }
        if (c0a2.LJIL()) {
            LJIIL = LJIIL(c0a2, LJIIJJI(c0a2));
        } else {
            if (c0a2.LJIJJLI()) {
                LJIIL = LJIIL(c0a2, LJIIJ(c0a2));
            }
            return -1;
        }
        if (LJIIL == null || (LJJJLL = C0A2.LJJJLL(LJIIL)) == -1) {
            return -1;
        }
        return LJJJLL;
    }
}
