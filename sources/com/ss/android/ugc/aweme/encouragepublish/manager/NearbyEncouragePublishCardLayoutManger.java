package com.ss.android.ugc.aweme.encouragepublish.manager;

import X.AbstractC03050Ab;
import X.C0A2;
import X.C0A7;
import X.C0AA;
import X.C0AC;
import X.C221108m2;
import X.C40161hs;
import X.C54849Lfp;
import X.C62822Ol8;
import X.C80081Vbp;
import X.C80111VcJ;
import X.C80112VcK;
import X.InterfaceC42512GmK;
import X.InterfaceC54855Lfv;
import X.InterfaceC80119VcR;
import X.M2Q;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.AqS138S0200000_7;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.AqS196S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class NearbyEncouragePublishCardLayoutManger extends C0A2 implements C0AA, InterfaceC80119VcR {
    public final C54849Lfp LJLZ;
    public int LJZ;
    public final C40161hs LJZI;
    public int LJZL;
    public boolean LL;
    public RecyclerView LLD;
    public final C80111VcJ LLF;
    public InterfaceC42512GmK LLFF;
    public final C62822Ol8 LLFFF;
    public final ArrayList<InterfaceC54855Lfv> LLFII;
    public C80112VcK LLFZ;
    public int LLI;
    public int LLIFFJFJJ;
    public View LLII;

    @Override // X.C0A2
    public final boolean LJJ(RecyclerView.LayoutParams layoutParams) {
        return layoutParams != null;
    }

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        if (this.LLD == null) {
            return false;
        }
        return !r0.LJJJLIIL();
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final AbstractC03050Ab LLIIJI() {
        AbstractC03050Ab horizontalHelper = (AbstractC03050Ab) this.LLFFF.getValue();
        o.LJIIIIZZ(horizontalHelper, "horizontalHelper");
        return horizontalHelper;
    }

    public final C80112VcK LLIIJLIL() {
        if (this.LLFZ == null) {
            this.LLFZ = new C80112VcK();
        }
        return this.LLFZ;
    }

    public final int LLIIL() {
        return (this.LJLLLLLL - getPaddingBottom()) - getPaddingTop();
    }

    public final void LLIIZ() {
        SparseArray<Rect> sparseArray;
        C80112VcK c80112VcK = this.LLFZ;
        if (c80112VcK != null && (sparseArray = c80112VcK.LIZ) != null) {
            sparseArray.clear();
        }
        int i = this.LLI;
        if (i != -1) {
            this.LLIFFJFJJ = i;
        }
        int i2 = this.LLIFFJFJJ;
        if (i2 <= 0) {
            i2 = 0;
        }
        int LJJJJZ = LJJJJZ() - 1;
        if (i2 > LJJJJZ) {
            i2 = LJJJJZ;
        }
        this.LLIFFJFJJ = i2;
        this.LJZ = i2;
        this.LLI = -1;
        View view = this.LLII;
        if (view != null) {
            view.setSelected(false);
        }
        this.LLII = null;
    }

    public NearbyEncouragePublishCardLayoutManger(C54849Lfp cardView) {
        o.LJIIIZ(cardView, "cardView");
        this.LJLZ = cardView;
        this.LJZI = new C40161hs();
        this.LLF = new C80111VcJ(this);
        this.LLFFF = C221108m2.LIZIZ(new AqS164S0100000_14(this, 58));
        this.LLFII = new ArrayList<>();
        this.LLI = -1;
    }

    @Override // X.C0AA
    public final PointF LJII(int i) {
        int i2 = -1;
        if (LJJJI() != 0 && i >= this.LJZ) {
            i2 = 1;
        }
        PointF pointF = new PointF();
        pointF.x = i2;
        pointF.y = 0.0f;
        return pointF;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIL(ViewGroup.LayoutParams layoutParams) {
        return new RecyclerView.LayoutParams(layoutParams);
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJLIJ(Context context, AttributeSet attributeSet) {
        return new RecyclerView.LayoutParams(context, attributeSet);
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        SparseArray<Rect> sparseArray;
        SparseArray<Rect> sparseArray2;
        SparseArray<Rect> sparseArray3;
        SparseArray<Rect> sparseArray4;
        Rect rect;
        SparseArray<Rect> sparseArray5;
        SparseArray<Rect> sparseArray6;
        SparseArray<Rect> sparseArray7;
        Rect rect2;
        SparseArray<Rect> sparseArray8;
        SparseArray<Rect> sparseArray9;
        Rect rect3;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        if (LJJJJZ() == 0) {
            LLIIZ();
            LJJIJIIJIL(recycler);
            return;
        }
        if (state.LJI) {
            return;
        }
        if (state.LIZIZ() != 0 && !state.LJFF) {
            return;
        }
        if (LJJJI() == 0 || state.LJFF) {
            LLIIZ();
        }
        int i = this.LLIFFJFJJ;
        if (i <= 0) {
            i = 0;
        }
        int LJJJJZ = LJJJJZ() - 1;
        if (i > LJJJJZ) {
            i = LJJJJZ;
        }
        this.LLIFFJFJJ = i;
        LJJIJIIJIL(recycler);
        LJJIJIIJIL(recycler);
        int LJIIJ = LLIIJI().LJIIJ();
        int LJI = LLIIJI().LJI();
        int i2 = this.LLIFFJFJJ;
        Rect rect4 = new Rect();
        int LLIIL = LLIIL();
        View LJFF = recycler.LJFF(this.LLIFFJFJJ);
        o.LJIIIIZZ(LJFF, "recycler.getViewForPosit…(initialSelectedPosition)");
        LJIJ(0, LJFF, false);
        LJJLIIIJL(0, 0, LJFF);
        int paddingTop = (int) (((LLIIL - r10) / 2.0f) + getPaddingTop());
        int paddingRight = (int) (((((this.LJLLLL - getPaddingRight()) - getPaddingLeft()) - r11) / 2.0f) + getPaddingLeft());
        rect4.set(paddingRight, paddingTop, LJJJJL(LJFF) + paddingRight, LJJJJJL(LJFF) + paddingTop);
        C0A2.LJJLIIIJJI(LJFF, rect4.left, rect4.top, rect4.right, rect4.bottom);
        C80112VcK LLIIJLIL = LLIIJLIL();
        if (LLIIJLIL == null || (sparseArray8 = LLIIJLIL.LIZ) == null || sparseArray8.get(i2) == null) {
            C80112VcK LLIIJLIL2 = LLIIJLIL();
            if (LLIIJLIL2 != null && (sparseArray = LLIIJLIL2.LIZ) != null) {
                sparseArray.put(i2, rect4);
            }
        } else {
            C80112VcK LLIIJLIL3 = LLIIJLIL();
            if (LLIIJLIL3 != null && (sparseArray9 = LLIIJLIL3.LIZ) != null && (rect3 = sparseArray9.get(i2)) != null) {
                rect3.set(rect4);
            }
        }
        this.LJZ = i2;
        int left = LJFF.getLeft() - C0A2.LJJJLIIL(LJFF);
        int LJJJZ = C0A2.LJJJZ(LJFF) + LJFF.getRight();
        Rect rect5 = new Rect();
        int LLIIL2 = LLIIL();
        for (int i3 = this.LLIFFJFJJ - 1; i3 >= 0 && left > LJIIJ; i3--) {
            View LJFF2 = recycler.LJFF(i3);
            o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(i)");
            LJIJ(0, LJFF2, false);
            LJJLIIIJL(0, 0, LJFF2);
            int paddingTop2 = (int) (((LLIIL2 - r10) / 2.0f) + getPaddingTop());
            rect5.set(left - LJJJJL(LJFF2), paddingTop2, left, LJJJJJL(LJFF2) + paddingTop2);
            C0A2.LJJLIIIJJI(LJFF2, rect5.left, rect5.top, rect5.right, rect5.bottom);
            left = rect5.left;
            this.LJZ = i3;
            C80112VcK LLIIJLIL4 = LLIIJLIL();
            if (LLIIJLIL4 == null || (sparseArray6 = LLIIJLIL4.LIZ) == null || sparseArray6.get(i3) == null) {
                C80112VcK LLIIJLIL5 = LLIIJLIL();
                if (LLIIJLIL5 != null && (sparseArray5 = LLIIJLIL5.LIZ) != null) {
                    sparseArray5.put(i3, rect5);
                }
            } else {
                C80112VcK LLIIJLIL6 = LLIIJLIL();
                if (LLIIJLIL6 != null && (sparseArray7 = LLIIJLIL6.LIZ) != null && (rect2 = sparseArray7.get(i3)) != null) {
                    rect2.set(rect5);
                }
            }
        }
        Rect rect6 = new Rect();
        int LLIIL3 = LLIIL();
        for (int i4 = this.LLIFFJFJJ + 1; i4 < LJJJJZ() && LJJJZ < LJI; i4++) {
            View LJFF3 = recycler.LJFF(i4);
            o.LJIIIIZZ(LJFF3, "recycler.getViewForPosition(i)");
            LJIIZILJ(LJFF3);
            LJJLIIIJL(0, 0, LJFF3);
            int paddingTop3 = (int) (((LLIIL3 - r9) / 2.0f) + getPaddingTop());
            rect6.set(LJJJZ, paddingTop3, LJJJJL(LJFF3) + LJJJZ, LJJJJJL(LJFF3) + paddingTop3);
            C0A2.LJJLIIIJJI(LJFF3, rect6.left, rect6.top, rect6.right, rect6.bottom);
            LJJJZ = rect6.right;
            C80112VcK LLIIJLIL7 = LLIIJLIL();
            if (LLIIJLIL7 == null || (sparseArray3 = LLIIJLIL7.LIZ) == null || sparseArray3.get(i4) == null) {
                C80112VcK LLIIJLIL8 = LLIIJLIL();
                if (LLIIJLIL8 != null && (sparseArray2 = LLIIJLIL8.LIZ) != null) {
                    sparseArray2.put(i4, rect6);
                }
            } else {
                C80112VcK LLIIJLIL9 = LLIIJLIL();
                if (LLIIJLIL9 != null && (sparseArray4 = LLIIJLIL9.LIZ) != null && (rect = sparseArray4.get(i4)) != null) {
                    rect.set(rect6);
                }
            }
        }
        if (this.LLFF != null) {
            int LJJJI = LJJJI();
            for (int i5 = 0; i5 < LJJJI; i5++) {
                View LJJJ = LJJJ(i5);
                if (LJJJ != null) {
                    float LLIIIL = LLIIIL(LJJJ, 0);
                    InterfaceC42512GmK interfaceC42512GmK = this.LLFF;
                    if (interfaceC42512GmK != null) {
                        interfaceC42512GmK.LIZ(this, LJJJ, LLIIIL, new AqS196S0100000_14(this, 40), new AqS138S0200000_7(this, LJJJ, 91));
                    }
                }
            }
        }
        RecyclerView recyclerView = this.LLD;
        if (recyclerView != null) {
            this.LLF.LJIILL(recyclerView, 0, 0);
        }
    }

    @Override // X.InterfaceC80119VcR
    public final void LJLZ(int i, RecyclerView recyclerView) {
        View LJFF;
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJZL = i;
        if (i == 0 && (LJFF = this.LJZI.LJFF(recyclerView.getLayoutManager())) != null && recyclerView.getLayoutManager() != null) {
            int LJJJLL = C0A2.LJJJLL(LJFF);
            int i2 = this.LLI;
            if (LJJJLL != i2) {
                View view = this.LLII;
                if (view != null) {
                    view.setSelected(false);
                }
                this.LLII = LJFF;
                LJFF.setSelected(true);
                this.LLI = LJJJLL;
                LLIILII(LJJJLL, LJFF, recyclerView);
                return;
            }
            if (!this.LL) {
                return;
            }
            this.LL = false;
            LLIILII(i2, LJFF, recyclerView);
        }
    }

    public final float LLIIIL(View view, float f) {
        AbstractC03050Ab LLIIJI = LLIIJI();
        float width = (((int) ((((view.getWidth() / 2) - f) + view.getLeft()) - (LLIIJI.LJIIJ() + ((LLIIJI.LJI() - LLIIJI.LJIIJ()) / 2)))) * 1.0f) / view.getWidth();
        if (1.0f <= width) {
            return 1.0f;
        }
        if (-1.0f < width) {
            return width;
        }
        return -1.0f;
    }

    public final void LLIIIZ(View view, float f) {
        M2Q m2q;
        ViewGroup viewGroup;
        Iterator<InterfaceC54855Lfv> it = this.LLFII.iterator();
        while (it.hasNext()) {
            InterfaceC54855Lfv next = it.next();
            if ((next instanceof M2Q) && (m2q = (M2Q) next) != null && o.LJ(m2q.itemView, view)) {
                View view2 = m2q.itemView;
                if ((view2 instanceof ViewGroup) && (viewGroup = (ViewGroup) view2) != null) {
                    int childCount = viewGroup.getChildCount();
                    for (int i = 0; i < childCount; i++) {
                        View childAt = viewGroup.getChildAt(i);
                        o.LJIIIIZZ(childAt, "getChildAt(i)");
                        if ((!o.LJ(childAt, m2q.LJLLI)) && childAt != null) {
                            childAt.setAlpha(f);
                        }
                    }
                }
            }
        }
    }

    public final void LLIILZL(View view, float f) {
        M2Q m2q;
        Iterator<InterfaceC54855Lfv> it = this.LLFII.iterator();
        while (it.hasNext()) {
            InterfaceC54855Lfv next = it.next();
            if ((next instanceof M2Q) && (m2q = (M2Q) next) != null && o.LJ(m2q.itemView, view)) {
                m2q.LJLJLJ.setAlpha(f);
                m2q.LJLJLLL.setAlpha(f);
            }
        }
    }

    @Override // X.InterfaceC80119VcR
    public final void LJIIL(RecyclerView recyclerView, int i, int i2) {
        int LJJJLL;
        o.LJIIIZ(recyclerView, "recyclerView");
        View LJFF = this.LJZI.LJFF(recyclerView.getLayoutManager());
        if (LJFF != null && recyclerView.getLayoutManager() != null && (LJJJLL = C0A2.LJJJLL(LJFF)) != this.LLI) {
            View view = this.LLII;
            if (view != null) {
                view.setSelected(false);
            }
            this.LLII = LJFF;
            LJFF.setSelected(true);
            this.LLI = LJJJLL;
            if (this.LJZL != 0) {
                this.LL = true;
            } else {
                LLIILII(LJJJLL, LJFF, recyclerView);
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0075  */
    /* JADX WARN: Type inference failed for: r1v10, types: [T, android.view.View] */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJZI(int r19, X.C0A7 r20, X.C0AC r21) {
        /*
            Method dump skipped, instructions count: 634
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.encouragepublish.manager.NearbyEncouragePublishCardLayoutManger.LJZI(int, X.0A7, X.0AC):int");
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C80081Vbp c80081Vbp = new C80081Vbp(recyclerView.getContext());
        c80081Vbp.LIZ = i;
        LLIIIILZ(c80081Vbp);
    }

    public final void LLIILII(int i, View view, RecyclerView recyclerView) {
        Iterator<InterfaceC54855Lfv> it = this.LLFII.iterator();
        while (it.hasNext()) {
            it.next().LJIIIZ(i, view, recyclerView);
        }
    }
}
