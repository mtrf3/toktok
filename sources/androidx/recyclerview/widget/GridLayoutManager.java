package androidx.recyclerview.widget;

import X.AbstractC028509h;
import X.C028609i;
import X.C028809k;
import X.C0A0;
import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C16300kU;
import X.C17740mo;
import X.C17760mq;
import X.C1BU;
import X.C1C0;
import X.KMP;
import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public class GridLayoutManager extends LinearLayoutManager {
    public boolean LLIIIJ;
    public int LLIIIL;
    public int[] LLIIIZ;
    public View[] LLIIJI;
    public final SparseIntArray LLIIJLIL;
    public final SparseIntArray LLIIL;
    public AbstractC028509h LLIILII;
    public final Rect LLIILZL;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        if (this.LJLZ == 0) {
            return new C1BU(-2, -1);
        }
        return new C1BU(-1, -2);
    }

    @Override // X.C0A2
    public final void LJLIIIL() {
        this.LLIILII.LJI();
        this.LLIILII.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public boolean LLIIIJ() {
        if (this.LLI == null && !this.LLIIIJ) {
            return true;
        }
        return false;
    }

    public final void LLJLL() {
        int paddingBottom;
        int paddingTop;
        if (this.LJLZ == 1) {
            paddingBottom = this.LJLLLL - getPaddingRight();
            paddingTop = getPaddingLeft();
        } else {
            paddingBottom = this.LJLLLLLL - getPaddingBottom();
            paddingTop = getPaddingTop();
        }
        LLJJJJ(paddingBottom - paddingTop);
    }

    public GridLayoutManager(int i) {
        this.LLIIIL = -1;
        this.LLIIJLIL = new SparseIntArray();
        this.LLIIL = new SparseIntArray();
        this.LLIILII = new AbstractC028509h() { // from class: X.1BT
            @Override // X.AbstractC028509h
            public final int LJFF(int i2) {
                return 1;
            }

            @Override // X.AbstractC028509h
            public final int LJ(int i2, int i3) {
                return i2 % i3;
            }
        };
        this.LLIILZL = new Rect();
        LLJLIL(i);
    }

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams instanceof C1BU;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJJIIJZLJL(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJJIIZ(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public int LJJIJ(C0AC c0ac) {
        return LLIIJLIL(c0ac);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJJIJIIJI(C0AC c0ac) {
        return LLIIL(c0ac);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            return new C1BU((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return new C1BU(layoutParams);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public void LJLJJL(C0AC c0ac) {
        super.LJLJJL(c0ac);
        this.LLIIIJ = false;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void LLJJIJIIJIL(boolean z) {
        if (!z) {
            super.LLJJIJIIJIL(false);
            return;
        }
        throw new UnsupportedOperationException("GridLayoutManager does not support stack from end. Consider using reverse layout");
    }

    public final void LLJJJJ(int i) {
        int i2;
        int[] iArr = this.LLIIIZ;
        int i3 = this.LLIIIL;
        if (iArr == null || iArr.length != i3 + 1 || iArr[iArr.length - 1] != i) {
            iArr = new int[i3 + 1];
        }
        int i4 = 0;
        iArr[0] = 0;
        int i5 = i / i3;
        int i6 = i % i3;
        int i7 = 0;
        for (int i8 = 1; i8 <= i3; i8++) {
            i4 += i6;
            if (i4 > 0 && i3 - i4 < i6) {
                i2 = i5 + 1;
                i4 -= i3;
            } else {
                i2 = i5;
            }
            i7 += i2;
            iArr[i8] = i7;
        }
        this.LLIIIZ = iArr;
    }

    public final void LLJLIL(int i) {
        if (i == this.LLIIIL) {
            return;
        }
        this.LLIIIJ = true;
        if (i >= 1) {
            this.LLIIIL = i;
            this.LLIILII.LJI();
            LJZ();
            return;
        }
        throw new IllegalArgumentException(KMP.LJ("Span count should be at least 1. Provided ", i));
    }

    public void LLJLILLLLZIIL(AbstractC028509h abstractC028509h) {
        this.LLIILII = abstractC028509h;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new C1BU(context, attributeSet);
    }

    @Override // X.C0A2
    public final int LJJJJI(C0A7 c0a7, C0AC c0ac) {
        if (this.LJLZ == 1) {
            return this.LLIIIL;
        }
        if (c0ac.LIZIZ() < 1) {
            return 0;
        }
        return LLJJJJLIIL(c0ac.LIZIZ() - 1, c0a7, c0ac) + 1;
    }

    @Override // X.C0A2
    public final int LJJL(C0A7 c0a7, C0AC c0ac) {
        if (this.LJLZ == 0) {
            return this.LLIIIL;
        }
        if (c0ac.LIZIZ() < 1) {
            return 0;
        }
        return LLJJJJLIIL(c0ac.LIZIZ() - 1, c0a7, c0ac) + 1;
    }

    @Override // X.C0A2
    public final void LJLI(int i, int i2) {
        this.LLIILII.LJI();
        this.LLIILII.LIZIZ.clear();
    }

    @Override // X.C0A2
    public final void LJLIIL(int i, int i2) {
        this.LLIILII.LJI();
        this.LLIILII.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        if (c0ac.LJI) {
            int LJJJI = LJJJI();
            for (int i = 0; i < LJJJI; i++) {
                C1BU c1bu = (C1BU) LJJJ(i).getLayoutParams();
                int viewLayoutPosition = c1bu.getViewLayoutPosition();
                this.LLIIJLIL.put(viewLayoutPosition, c1bu.LJLILLLLZI);
                this.LLIIL.put(viewLayoutPosition, c1bu.LJLIL);
            }
        }
        super.LJLJJI(c0a7, c0ac);
        this.LLIIJLIL.clear();
        this.LLIIL.clear();
    }

    public final int LLJJJJJIL(int i, int i2) {
        if (this.LJLZ == 1 && LLJI()) {
            int[] iArr = this.LLIIIZ;
            int i3 = this.LLIIIL;
            return iArr[i3 - i] - iArr[(i3 - i) - i2];
        }
        int[] iArr2 = this.LLIIIZ;
        return iArr2[i2 + i] - iArr2[i];
    }

    public GridLayoutManager(int i, int i2, boolean z) {
        super(i2, z);
        this.LLIIIL = -1;
        this.LLIIJLIL = new SparseIntArray();
        this.LLIIL = new SparseIntArray();
        this.LLIILII = new AbstractC028509h() { // from class: X.1BT
            @Override // X.AbstractC028509h
            public final int LJFF(int i22) {
                return 1;
            }

            @Override // X.AbstractC028509h
            public final int LJ(int i22, int i3) {
                return i22 % i3;
            }
        };
        this.LLIILZL = new Rect();
        LLJLIL(i);
    }

    @Override // X.C0A2
    public final void LJLIL(RecyclerView recyclerView, int i, int i2) {
        this.LLIILII.LJI();
        this.LLIILII.LIZIZ.clear();
    }

    @Override // X.C0A2
    public final void LJLJI(RecyclerView recyclerView, int i, int i2) {
        this.LLIILII.LJI();
        this.LLIILII.LIZIZ.clear();
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        LLJLL();
        View[] viewArr = this.LLIIJI;
        if (viewArr == null || viewArr.length != this.LLIIIL) {
            this.LLIIJI = new View[this.LLIIIL];
        }
        return super.LJZI(i, c0a7, c0ac);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public int LL(int i, C0A7 c0a7, C0AC c0ac) {
        LLJLL();
        View[] viewArr = this.LLIIJI;
        if (viewArr == null || viewArr.length != this.LLIIIL) {
            this.LLIIJI = new View[this.LLIIIL];
        }
        return super.LL(i, c0a7, c0ac);
    }

    @Override // X.C0A2
    public final void LLFFF(int i, int i2, Rect rect) {
        int LJJI;
        int LJJI2;
        if (this.LLIIIZ == null) {
            super.LLFFF(i, i2, rect);
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        if (this.LJLZ == 1) {
            LJJI2 = C0A2.LJJI(i2, rect.height() + paddingBottom, C16300kU.LIZLLL(this.LJLILLLLZI));
            int[] iArr = this.LLIIIZ;
            LJJI = C0A2.LJJI(i, iArr[iArr.length - 1] + paddingRight, C16300kU.LJ(this.LJLILLLLZI));
        } else {
            LJJI = C0A2.LJJI(i, rect.width() + paddingRight, C16300kU.LJ(this.LJLILLLLZI));
            int[] iArr2 = this.LLIIIZ;
            LJJI2 = C0A2.LJJI(i2, iArr2[iArr2.length - 1] + paddingBottom, C16300kU.LIZLLL(this.LJLILLLLZI));
        }
        RecyclerView.LJFF(this.LJLILLLLZI, LJJI, LJJI2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void LLIIIZ(C0AC c0ac, C028809k c028809k, C0A0 c0a0) {
        int i;
        int i2 = this.LLIIIL;
        for (int i3 = 0; i3 < this.LLIIIL && (i = c028809k.LIZLLL) >= 0 && i < c0ac.LIZIZ() && i2 > 0; i3++) {
            int i4 = c028809k.LIZLLL;
            ((C1C0) c0a0).LIZ(i4, Math.max(0, c028809k.LJI));
            i2 -= this.LLIILII.LJFF(i4);
            c028809k.LIZLLL += c028809k.LJ;
        }
    }

    public final int LLJJJJLIIL(int i, C0A7 c0a7, C0AC c0ac) {
        if (!c0ac.LJI) {
            return this.LLIILII.LIZIZ(i, this.LLIIIL);
        }
        int LIZLLL = c0a7.LIZLLL(i);
        if (LIZLLL == -1) {
            return 0;
        }
        return this.LLIILII.LIZIZ(LIZLLL, this.LLIIIL);
    }

    public final int LLJJL(int i, C0A7 c0a7, C0AC c0ac) {
        if (!c0ac.LJI) {
            return this.LLIILII.LIZJ(i, this.LLIIIL);
        }
        int i2 = this.LLIIL.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int LIZLLL = c0a7.LIZLLL(i);
        if (LIZLLL == -1) {
            return 0;
        }
        return this.LLIILII.LIZJ(LIZLLL, this.LLIIIL);
    }

    public final int LLJJLIIIJLLLLLLLZ(int i, C0A7 c0a7, C0AC c0ac) {
        if (!c0ac.LJI) {
            return this.LLIILII.LJFF(i);
        }
        int i2 = this.LLIIJLIL.get(i, -1);
        if (i2 != -1) {
            return i2;
        }
        int LIZLLL = c0a7.LIZLLL(i);
        if (LIZLLL == -1) {
            return 1;
        }
        return this.LLIILII.LJFF(LIZLLL);
    }

    public final void LLJL(int i, View view, boolean z) {
        int LJJJIL;
        int LJJJIL2;
        boolean LLI;
        C1BU c1bu = (C1BU) view.getLayoutParams();
        Rect rect = c1bu.mDecorInsets;
        int i2 = rect.top + rect.bottom + ((ViewGroup.MarginLayoutParams) c1bu).topMargin + ((ViewGroup.MarginLayoutParams) c1bu).bottomMargin;
        int i3 = rect.left + rect.right + ((ViewGroup.MarginLayoutParams) c1bu).leftMargin + ((ViewGroup.MarginLayoutParams) c1bu).rightMargin;
        int LLJJJJJIL = LLJJJJJIL(c1bu.LJLIL, c1bu.LJLILLLLZI);
        if (this.LJLZ == 1) {
            LJJJIL2 = C0A2.LJJJIL(LLJJJJJIL, i, i3, ((ViewGroup.MarginLayoutParams) c1bu).width, false);
            LJJJIL = C0A2.LJJJIL(this.LJZI.LJIIJJI(), this.LJLLL, i2, ((ViewGroup.MarginLayoutParams) c1bu).height, true);
        } else {
            LJJJIL = C0A2.LJJJIL(LLJJJJJIL, i, i2, ((ViewGroup.MarginLayoutParams) c1bu).height, false);
            LJJJIL2 = C0A2.LJJJIL(this.LJZI.LJIIJJI(), this.LJLLJ, i3, ((ViewGroup.MarginLayoutParams) c1bu).width, true);
        }
        RecyclerView.LayoutParams layoutParams = (RecyclerView.LayoutParams) view.getLayoutParams();
        if (z) {
            LLI = LLII(view, LJJJIL2, LJJJIL, layoutParams);
        } else {
            LLI = LLI(view, LJJJIL2, LJJJIL, layoutParams);
        }
        if (LLI) {
            view.measure(LJJJIL2, LJJJIL);
        }
    }

    public GridLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
        this.LLIIIL = -1;
        this.LLIIJLIL = new SparseIntArray();
        this.LLIIL = new SparseIntArray();
        this.LLIILII = new AbstractC028509h() { // from class: X.1BT
            @Override // X.AbstractC028509h
            public final int LJFF(int i22) {
                return 1;
            }

            @Override // X.AbstractC028509h
            public final int LJ(int i22, int i3) {
                return i22 % i3;
            }
        };
        this.LLIILZL = new Rect();
        LLJLIL(C0A2.LJJJLZIJ(context, attributeSet, i, i2).LIZIZ);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final View LJJLJLI(View view, int i, C0A7 c0a7, C0AC c0ac) {
        View LJJIJIIJIL;
        boolean z;
        int LJJJI;
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        boolean z4;
        RecyclerView recyclerView = this.LJLILLLLZI;
        View view2 = null;
        if (recyclerView == null || (LJJIJIIJIL = recyclerView.LJJIJIIJIL(view)) == null || this.LJLIL.LJIIJ(LJJIJIIJIL)) {
            return null;
        }
        C1BU c1bu = (C1BU) LJJIJIIJIL.getLayoutParams();
        int i4 = c1bu.LJLIL;
        int i5 = c1bu.LJLILLLLZI + i4;
        if (super.LJJLJLI(view, i, c0a7, c0ac) == null) {
            return null;
        }
        if (LLIILII(i) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z != this.LLD) {
            i2 = LJJJI() - 1;
            LJJJI = -1;
            i3 = -1;
        } else {
            LJJJI = LJJJI();
            i2 = 0;
            i3 = 1;
        }
        if (this.LJLZ == 1 && LLJI()) {
            z2 = true;
        } else {
            z2 = false;
        }
        int LLJJJJLIIL = LLJJJJLIIL(i2, c0a7, c0ac);
        int i6 = -1;
        int i7 = 0;
        int i8 = 0;
        int i9 = -1;
        View view3 = null;
        while (i2 != LJJJI) {
            int LLJJJJLIIL2 = LLJJJJLIIL(i2, c0a7, c0ac);
            View LJJJ = LJJJ(i2);
            if (LJJJ == LJJIJIIJIL) {
                break;
            }
            if (LJJJ.hasFocusable() && LLJJJJLIIL2 != LLJJJJLIIL) {
                if (view2 != null) {
                    return view2;
                }
            } else {
                C1BU c1bu2 = (C1BU) LJJJ.getLayoutParams();
                int i10 = c1bu2.LJLIL;
                int i11 = c1bu2.LJLILLLLZI + i10;
                if (LJJJ.hasFocusable() && i10 == i4 && i11 == i5) {
                    return LJJJ;
                }
                if ((!LJJJ.hasFocusable() || view2 != null) && (LJJJ.hasFocusable() || view3 != null)) {
                    int min = Math.min(i11, i5) - Math.max(i10, i4);
                    if (LJJJ.hasFocusable()) {
                        if (min <= i7) {
                            if (min == i7) {
                                if (i10 > i6) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                                if (z2 != z4) {
                                }
                            }
                        }
                    } else if (view2 == null && (!this.LJLJI.LIZIZ(LJJJ) || !this.LJLJJI.LIZIZ(LJJJ))) {
                        if (min <= i8) {
                            if (min == i8) {
                                if (i10 > i9) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                if (z2 != z3) {
                                }
                            }
                        }
                    }
                }
                if (LJJJ.hasFocusable()) {
                    i6 = c1bu2.LJLIL;
                    i7 = Math.min(i11, i5) - Math.max(i10, i4);
                    view2 = LJJJ;
                } else {
                    i9 = c1bu2.LJLIL;
                    i8 = Math.min(i11, i5) - Math.max(i10, i4);
                    view3 = LJJJ;
                }
            }
            i2 += i3;
        }
        if (view2 != null) {
            return view2;
        }
        return view3;
    }

    @Override // X.C0A2
    public final void LJJZZIII(C0A7 c0a7, C0AC c0ac, View view, C17760mq c17760mq) {
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (!(layoutParams instanceof C1BU)) {
            LJJZZI(view, c17760mq);
            return;
        }
        C1BU c1bu = (C1BU) layoutParams;
        int LLJJJJLIIL = LLJJJJLIIL(c1bu.getViewLayoutPosition(), c0a7, c0ac);
        if (this.LJLZ == 0) {
            c17760mq.LJIIZILJ(C17740mo.LIZ(c1bu.LJLIL, c1bu.LJLILLLLZI, LLJJJJLIIL, 1, false));
        } else {
            c17760mq.LJIIZILJ(C17740mo.LIZ(LLJJJJLIIL, 1, c1bu.LJLIL, c1bu.LJLILLLLZI, false));
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final View LLILZIL(C0A7 c0a7, C0AC c0ac, boolean z, boolean z2) {
        int i;
        int LJJJI = LJJJI();
        int i2 = 1;
        if (z2) {
            i = LJJJI() - 1;
            LJJJI = -1;
            i2 = -1;
        } else {
            i = 0;
        }
        int LIZIZ = c0ac.LIZIZ();
        LLIILZL();
        int LJIIJ = this.LJZI.LJIIJ();
        int LJI = this.LJZI.LJI();
        View view = null;
        View view2 = null;
        while (i != LJJJI) {
            View LJJJ = LJJJ(i);
            int LJJJLL = C0A2.LJJJLL(LJJJ);
            if (LJJJLL >= 0 && LJJJLL < LIZIZ && LLJJL(LJJJLL, c0a7, c0ac) == 0) {
                if (((RecyclerView.LayoutParams) LJJJ.getLayoutParams()).isItemRemoved()) {
                    if (view2 == null) {
                        view2 = LJJJ;
                    }
                } else if (this.LJZI.LJ(LJJJ) >= LJI || this.LJZI.LIZIZ(LJJJ) < LJIIJ) {
                    if (view == null) {
                        view = LJJJ;
                    }
                } else {
                    return LJJJ;
                }
            }
            i += i2;
        }
        if (view != null) {
            return view;
        }
        return view2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:123:0x007a, code lost:
    
        if (r9 != (-1)) goto L122;
     */
    @Override // androidx.recyclerview.widget.LinearLayoutManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void LLJIJIL(X.C0A7 r22, X.C0AC r23, X.C028809k r24, X.C028709j r25) {
        /*
            Method dump skipped, instructions count: 585
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.recyclerview.widget.GridLayoutManager.LLJIJIL(X.0A7, X.0AC, X.09k, X.09j):void");
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager
    public final void LLJILJIL(C0A7 c0a7, C0AC c0ac, C028609i c028609i, int i) {
        boolean z;
        LLJLL();
        if (c0ac.LIZIZ() > 0 && !c0ac.LJI) {
            if (i == 1) {
                z = true;
            } else {
                z = false;
            }
            int LLJJL = LLJJL(c028609i.LIZIZ, c0a7, c0ac);
            if (z) {
                while (LLJJL > 0) {
                    int i2 = c028609i.LIZIZ;
                    if (i2 <= 0) {
                        break;
                    }
                    int i3 = i2 - 1;
                    c028609i.LIZIZ = i3;
                    LLJJL = LLJJL(i3, c0a7, c0ac);
                }
            } else {
                int LIZIZ = c0ac.LIZIZ() - 1;
                int i4 = c028609i.LIZIZ;
                while (i4 < LIZIZ) {
                    int i5 = i4 + 1;
                    int LLJJL2 = LLJJL(i5, c0a7, c0ac);
                    if (LLJJL2 <= LLJJL) {
                        break;
                    }
                    i4 = i5;
                    LLJJL = LLJJL2;
                }
                c028609i.LIZIZ = i4;
            }
        }
        View[] viewArr = this.LLIIJI;
        if (viewArr == null || viewArr.length != this.LLIIIL) {
            this.LLIIJI = new View[this.LLIIIL];
        }
    }
}
