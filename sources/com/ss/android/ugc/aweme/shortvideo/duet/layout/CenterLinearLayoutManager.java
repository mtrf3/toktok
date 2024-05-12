package com.ss.android.ugc.aweme.shortvideo.duet.layout;

import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C28851Bh;
import X.C40141hq;
import X.C80080Vbo;
import X.C80106VcE;
import X.C80114VcM;
import X.C81398Vx4;
import X.C90193gN;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class CenterLinearLayoutManager extends LinearLayoutManager {
    public int LLIIIJ;
    public int LLIIIL;
    public int LLIIIZ;
    public final C40141hq LLIIJI;
    public final C80106VcE LLIIJLIL;
    public View LLIIL;
    public RecyclerView LLIILII;
    public C81398Vx4 LLIILZL;
    public boolean LLIIZ;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final boolean LJIJJLI() {
        return true;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final int LLJJJJ() {
        return (this.LJLLLLLL - getPaddingBottom()) - getPaddingTop();
    }

    public final void LLJJJJJIL() {
        int i = this.LLIIIZ;
        if (i != -1) {
            this.LLIIIL = i;
        }
        int min = Math.min(Math.max(0, this.LLIIIL), LJJJJZ() - 1);
        this.LLIIIL = min;
        this.LLIIIJ = min;
        this.LLIIIZ = -1;
        View view = this.LLIIL;
        if (view != null) {
            view.setSelected(false);
            this.LLIIL = null;
        }
    }

    public CenterLinearLayoutManager(Context context) {
        super(0, false);
        this.LLIIIZ = -1;
        this.LLIIJI = new C40141hq();
        this.LLIIJLIL = new C80106VcE(this);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0AA
    public final PointF LJII(int i) {
        int i2 = -1;
        if (!C90193gN.LIZ() ? LJJJI() != 0 && i >= this.LLIIIJ : LJJJI() == 0 || i < this.LLIIIJ) {
            i2 = 1;
        }
        return new PointF(i2, 0.0f);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        int i = state.LIZ;
        if (LJJJJZ() == 0) {
            LLJJJJJIL();
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
            LLJJJJJIL();
        }
        this.LLIIIL = Math.min(Math.max(i, this.LLIIIL), LJJJJZ() - 1);
        LJJIJIIJIL(recycler);
        LJJIJIIJIL(recycler);
        C28851Bh c28851Bh = new C28851Bh(this);
        c28851Bh.LJIIJ();
        c28851Bh.LJI();
        int i2 = this.LLIIIL;
        int LLJJJJ = LLJJJJ();
        View LJFF = recycler.LJFF(this.LLIIIL);
        o.LJIIIIZZ(LJFF, "recycler.getViewForPosit…(initialSelectedPosition)");
        LJIJ(0, LJFF, false);
        LJJLIIIJL(0, 0, LJFF);
        int paddingTop = (int) (((LLJJJJ - r7) / 2.0f) + getPaddingTop());
        int paddingRight = (int) (((((this.LJLLLL - getPaddingRight()) - getPaddingLeft()) - r8) / 2.0f) + getPaddingLeft());
        Rect rect = new Rect(paddingRight, paddingTop, LJJJJL(LJFF) + paddingRight, LJJJJJL(LJFF) + paddingTop);
        C0A2.LJJLIIIJJI(LJFF, rect.left, rect.top, rect.right, rect.bottom);
        if (new C80114VcM().LIZ.get(i2) == null) {
            new C80114VcM().LIZ.put(i2, rect);
        } else {
            new C80114VcM().LIZ.get(i2).set(rect);
        }
        this.LLIIIJ = i2;
        int left = LJFF.getLeft() - C0A2.LJJJLIIL(LJFF);
        int LJJJZ = C0A2.LJJJZ(LJFF) + LJFF.getRight();
        if (C90193gN.LIZ()) {
            int LLJJJJ2 = LLJJJJ();
            for (int i3 = this.LLIIIL + 1; i3 < LJJJJZ(); i3++) {
                View LJFF2 = recycler.LJFF(i3);
                o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(i)");
                LJIJ(0, LJFF2, false);
                LJJLIIIJL(0, 0, LJFF2);
                int paddingTop2 = (int) (((LLJJJJ2 - r8) / 2.0f) + getPaddingTop());
                Rect rect2 = new Rect(left - LJJJJL(LJFF2), paddingTop2, left, LJJJJJL(LJFF2) + paddingTop2);
                C0A2.LJJLIIIJJI(LJFF2, rect2.left, rect2.top, rect2.right, rect2.bottom);
                left = rect2.left;
                C80114VcM c80114VcM = new C80114VcM();
                if (c80114VcM.LIZ.get(i3) == null) {
                    c80114VcM.LIZ.put(i3, rect2);
                } else {
                    c80114VcM.LIZ.get(i3).set(rect2);
                }
            }
            int LLJJJJ3 = LLJJJJ();
            for (int i4 = this.LLIIIL - 1; i4 >= 0; i4--) {
                View LJFF3 = recycler.LJFF(i4);
                o.LJIIIIZZ(LJFF3, "recycler.getViewForPosition(i)");
                LJIIZILJ(LJFF3);
                LJJLIIIJL(0, 0, LJFF3);
                int paddingTop3 = (int) (((LLJJJJ3 - r6) / 2.0f) + getPaddingTop());
                Rect rect3 = new Rect(LJJJZ, paddingTop3, LJJJJL(LJFF3) + LJJJZ, LJJJJJL(LJFF3) + paddingTop3);
                C0A2.LJJLIIIJJI(LJFF3, rect3.left, rect3.top, rect3.right, rect3.bottom);
                LJJJZ = rect3.right;
                LJFF3.getLeft();
                this.LLIIIJ = i4;
                if (new C80114VcM().LIZ.get(i4) == null) {
                    new C80114VcM().LIZ.put(i4, rect3);
                } else {
                    new C80114VcM().LIZ.get(i4).set(rect3);
                }
            }
        } else {
            int LLJJJJ4 = LLJJJJ();
            for (int i5 = this.LLIIIL - 1; i5 >= 0; i5--) {
                View LJFF4 = recycler.LJFF(i5);
                o.LJIIIIZZ(LJFF4, "recycler.getViewForPosition(i)");
                LJIJ(0, LJFF4, false);
                LJJLIIIJL(0, 0, LJFF4);
                int paddingTop4 = (int) (((LLJJJJ4 - r8) / 2.0f) + getPaddingTop());
                Rect rect4 = new Rect(left - LJJJJL(LJFF4), paddingTop4, left, LJJJJJL(LJFF4) + paddingTop4);
                C0A2.LJJLIIIJJI(LJFF4, rect4.left, rect4.top, rect4.right, rect4.bottom);
                left = rect4.left;
                this.LLIIIJ = i5;
                C80114VcM c80114VcM2 = new C80114VcM();
                if (c80114VcM2.LIZ.get(i5) == null) {
                    c80114VcM2.LIZ.put(i5, rect4);
                } else {
                    c80114VcM2.LIZ.get(i5).set(rect4);
                }
            }
            int LLJJJJ5 = LLJJJJ();
            for (int i6 = this.LLIIIL + 1; i6 < LJJJJZ(); i6++) {
                View LJFF5 = recycler.LJFF(i6);
                o.LJIIIIZZ(LJFF5, "recycler.getViewForPosition(i)");
                LJIIZILJ(LJFF5);
                LJJLIIIJL(0, 0, LJFF5);
                int paddingTop5 = (int) (((LLJJJJ5 - r6) / 2.0f) + getPaddingTop());
                Rect rect5 = new Rect(LJJJZ, paddingTop5, LJJJJL(LJFF5) + LJJJZ, LJJJJJL(LJFF5) + paddingTop5);
                C0A2.LJJLIIIJJI(LJFF5, rect5.left, rect5.top, rect5.right, rect5.bottom);
                LJJJZ = rect5.right;
                if (new C80114VcM().LIZ.get(i6) == null) {
                    new C80114VcM().LIZ.put(i6, rect5);
                } else {
                    new C80114VcM().LIZ.get(i6).set(rect5);
                }
            }
        }
        RecyclerView recyclerView = this.LLIILII;
        if (recyclerView != null) {
            this.LLIIJLIL.LJIILL(recyclerView, 0, 0);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        View LJJJ;
        int min;
        if (LJJJI() == 0 || i == 0) {
            return 0;
        }
        C28851Bh c28851Bh = new C28851Bh(this);
        int i2 = -i;
        int LJIIJ = c28851Bh.LJIIJ() + ((c28851Bh.LJI() - c28851Bh.LJIIJ()) / 2);
        if (i > 0) {
            View LJJJ2 = LJJJ(LJJJI() - 1);
            if (LJJJ2 != null && C0A2.LJJJLL(LJJJ2) == LJJJJZ() - 1) {
                min = Math.max(0, Math.min(i, (LJJJ2.getLeft() + ((LJJJ2.getRight() - LJJJ2.getLeft()) / 2)) - LJIIJ));
                i2 = -min;
            }
            new C80114VcM();
            int i3 = -i2;
            LJJLIIIJLJLI(i2);
            return i3;
        }
        if (this.LLIIIJ == 0 && (LJJJ = LJJJ(0)) != null) {
            min = Math.min(0, Math.max(i, (LJJJ.getLeft() + ((LJJJ.getRight() - LJJJ.getLeft()) / 2)) - LJIIJ));
            i2 = -min;
        }
        new C80114VcM();
        int i32 = -i2;
        LJJLIIIJLJLI(i2);
        return i32;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC c0ac, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        C80080Vbo c80080Vbo = new C80080Vbo(recyclerView.getContext());
        c80080Vbo.LIZ = i;
        LLIIIILZ(c80080Vbo);
    }
}
