package X;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;

/* renamed from: X.0AG, reason: invalid class name */
/* loaded from: classes.dex */
public class C0AG {
    public final ArrayList<View> LIZ = new ArrayList<>();
    public int LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    public int LIZLLL = 0;
    public final int LJ;
    public final /* synthetic */ StaggeredGridLayoutManager LJFF;

    public final int LJ() {
        if (this.LJFF.LLFF) {
            return LJI(false, false, this.LIZ.size() - 1, -1, true);
        }
        return LJI(false, false, 0, this.LIZ.size(), true);
    }

    public final int LJFF() {
        if (this.LJFF.LLFF) {
            return LJI(false, false, 0, this.LIZ.size(), true);
        }
        return LJI(false, false, this.LIZ.size() - 1, -1, true);
    }

    public final void LIZIZ() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem LJFF;
        int i;
        ArrayList<View> arrayList = this.LIZ;
        View view = (View) AnonymousClass028.LIZIZ(arrayList, 1, arrayList);
        C1BZ LJIIJ = LJIIJ(view);
        this.LIZJ = this.LJFF.LJZI.LIZIZ(view);
        if (LJIIJ.LJLILLLLZI && (LJFF = this.LJFF.LLIFFJFJJ.LJFF(LJIIJ.getViewLayoutPosition())) != null && LJFF.LJLILLLLZI == 1) {
            int i2 = this.LIZJ;
            int i3 = this.LJ;
            int[] iArr = LJFF.LJLJI;
            if (iArr == null) {
                i = 0;
            } else {
                i = iArr[i3];
            }
            this.LIZJ = i2 + i;
        }
    }

    public final void LIZJ() {
        StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem LJFF;
        int i = 0;
        View view = (View) ListProtector.get(this.LIZ, 0);
        C1BZ LJIIJ = LJIIJ(view);
        this.LIZIZ = this.LJFF.LJZI.LJ(view);
        if (LJIIJ.LJLILLLLZI && (LJFF = this.LJFF.LLIFFJFJJ.LJFF(LJIIJ.getViewLayoutPosition())) != null && LJFF.LJLILLLLZI == -1) {
            int i2 = this.LIZIZ;
            int i3 = this.LJ;
            int[] iArr = LJFF.LJLJI;
            if (iArr != null) {
                i = iArr[i3];
            }
            this.LIZIZ = i2 - i;
        }
    }

    public final void LIZLLL() {
        this.LIZ.clear();
        this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        this.LIZLLL = 0;
    }

    public final void LJIIL() {
        int size = this.LIZ.size();
        View view = (View) ListProtector.remove(this.LIZ, size - 1);
        C1BZ LJIIJ = LJIIJ(view);
        LJIIJ.LJLIL = null;
        if (LJIIJ.isItemRemoved() || LJIIJ.isItemChanged()) {
            this.LIZLLL -= this.LJFF.LJZI.LIZJ(view);
        }
        if (size == 1) {
            this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    public final void LJIILIIL() {
        View view = (View) ListProtector.remove(this.LIZ, 0);
        C1BZ LJIIJ = LJIIJ(view);
        LJIIJ.LJLIL = null;
        if (this.LIZ.size() == 0) {
            this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (LJIIJ.isItemRemoved() || LJIIJ.isItemChanged()) {
            this.LIZLLL -= this.LJFF.LJZI.LIZJ(view);
        }
        this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
    }

    public static C1BZ LJIIJ(View view) {
        return (C1BZ) view.getLayoutParams();
    }

    public final void LIZ(View view) {
        C1BZ c1bz = (C1BZ) view.getLayoutParams();
        c1bz.LJLIL = this;
        this.LIZ.add(view);
        this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (this.LIZ.size() == 1) {
            this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (c1bz.isItemRemoved() || c1bz.isItemChanged()) {
            this.LIZLLL = this.LJFF.LJZI.LIZJ(view) + this.LIZLLL;
        }
    }

    public final int LJIIIIZZ(int i) {
        int i2 = this.LIZJ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.LIZ.size() == 0) {
            return i;
        }
        LIZIZ();
        return this.LIZJ;
    }

    public final int LJIIJJI(int i) {
        int i2 = this.LIZIZ;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (this.LIZ.size() == 0) {
            return i;
        }
        LIZJ();
        return this.LIZIZ;
    }

    public final void LJIILJJIL(View view) {
        C1BZ c1bz = (C1BZ) view.getLayoutParams();
        c1bz.LJLIL = this;
        ListProtector.add(this.LIZ, 0, view);
        this.LIZIZ = LiveLayoutPreloadThreadPriority.DEFAULT;
        if (this.LIZ.size() == 1) {
            this.LIZJ = LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        if (c1bz.isItemRemoved() || c1bz.isItemChanged()) {
            this.LIZLLL = this.LJFF.LJZI.LIZJ(view) + this.LIZLLL;
        }
    }

    public C0AG(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.LJFF = staggeredGridLayoutManager;
        this.LJ = i;
    }

    public final View LJIIIZ(int i, int i2) {
        View view = null;
        if (i2 == -1) {
            int size = this.LIZ.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) ListProtector.get(this.LIZ, i3);
                if ((this.LJFF.LLFF && C0A2.LJJJLL(view2) <= i) || ((!this.LJFF.LLFF && C0A2.LJJJLL(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = this.LIZ.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) ListProtector.get(this.LIZ, size2);
                if ((this.LJFF.LLFF && C0A2.LJJJLL(view3) >= i) || ((!this.LJFF.LLFF && C0A2.LJJJLL(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public final int LJII(int i, int i2, boolean z) {
        return LJI(z, true, i, i2, false);
    }

    public final int LJI(boolean z, boolean z2, int i, int i2, boolean z3) {
        int i3;
        boolean z4;
        int LJIIJ = this.LJFF.LJZI.LJIIJ();
        int LJI = this.LJFF.LJZI.LJI();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ListProtector.get(this.LIZ, i);
            int LJ = this.LJFF.LJZI.LJ(view);
            int LIZIZ = this.LJFF.LJZI.LIZIZ(view);
            boolean z5 = false;
            if (!z3 ? LJ < LJI : LJ <= LJI) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (!z3 ? LIZIZ > LJIIJ : LIZIZ >= LJIIJ) {
                z5 = true;
            }
            if (z4 && z5) {
                if (z) {
                    if (z2) {
                        if (LJ >= LJIIJ && LIZIZ <= LJI) {
                            this.LJFF.getClass();
                            return C0A2.LJJJLL(view);
                        }
                    }
                } else if (z2) {
                    this.LJFF.getClass();
                    return C0A2.LJJJLL(view);
                }
                if (LJ < LJIIJ || LIZIZ > LJI) {
                    this.LJFF.getClass();
                    return C0A2.LJJJLL(view);
                }
            }
            i += i3;
        }
        return -1;
    }
}
