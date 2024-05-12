package com.ss.android.ugc.aweme.story.feed.ui.gallery;

import X.C0A2;
import X.C0A6;
import X.C0A7;
import X.C0AC;
import X.C195567lw;
import X.C221108m2;
import X.C62822Ol8;
import X.C72808Sho;
import X.C80085Vbt;
import X.C80115VcN;
import X.C80116VcO;
import X.C80120VcS;
import X.InterfaceC57784Mm4;
import X.SYL;
import X.X1D;
import android.content.Context;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class StoryGalleryLayoutManager extends C0A2 {
    public int LLD;
    public View LLFII;
    public SYL LLFZ;
    public boolean LLI;
    public final C62822Ol8 LJLZ = C221108m2.LIZIZ(new AqS164S0100000_14(this, 184));
    public final C62822Ol8 LJZ = C221108m2.LIZIZ(C80120VcS.LJLIL);
    public final C62822Ol8 LJZI = C221108m2.LIZIZ(C195567lw.LJLIL);
    public final C62822Ol8 LJZL = C221108m2.LIZIZ(C80115VcN.LJLIL);
    public final C62822Ol8 LL = C221108m2.LIZIZ(C80116VcO.LJLIL);
    public int LLF = -1;
    public int LLFF = -1;
    public int LLFFF = -1;

    @Override // X.C0A2
    public final boolean LJIJJLI() {
        if (this.LLFZ != null) {
            return true;
        }
        return false;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -1);
    }

    public final int LLIIJI() {
        return (((this.LJLLLL - getPaddingEnd()) - getPaddingStart()) / 2) + getPaddingStart();
    }

    public final void LLIIJLIL(int i) {
        int LJJJI = LJJJI();
        for (int i2 = 0; i2 < LJJJI; i2++) {
            View LJJJ = LJJJ(i2);
            if (LJJJ != null) {
                Object value = this.LJZ.getValue();
                float max = Math.max(-1.0f, Math.min(1.0f, ((((LJJJ.getWidth() / 2) - i) + LJJJ.getLeft()) - LLIIJI()) / LJJJ.getWidth()));
                value.getClass();
                if (max <= -1.0f || max >= 1.0f) {
                    LJJJ.setScaleX(0.85f);
                    LJJJ.setScaleY(0.85f);
                } else {
                    float abs = ((1 - Math.abs(max)) * 0.14999998f) + 0.85f;
                    LJJJ.setScaleX(abs);
                    LJJJ.setScaleY(abs);
                }
            }
        }
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        Integer num;
        C72808Sho<InterfaceC57784Mm4> state2;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("onLayoutChildren: childCount: ");
        LIZ.append(LJJJI());
        LIZ.append(", state itemCount: ");
        LIZ.append(state.LIZIZ());
        LIZ.append(", powerlist state count: ");
        SYL syl = this.LLFZ;
        if (syl != null && (state2 = syl.getState()) != null) {
            num = Integer.valueOf(state2.LJIIIIZZ());
        } else {
            num = null;
        }
        LIZ.append(num);
        X1D.LIZIZ(LIZ);
        if (LJJJJZ() == 0) {
            return;
        }
        ((SparseArray) this.LJZL.getValue()).clear();
        int i = this.LLF;
        if (i != -1) {
            this.LLD = i;
        }
        int i2 = this.LLD;
        if (i2 <= 0) {
            i2 = 0;
        }
        int LJJJJZ = LJJJJZ() - 1;
        if (i2 > LJJJJZ) {
            i2 = LJJJJZ;
        }
        this.LLD = i2;
        this.LLFF = i2;
        this.LLFFF = i2;
        this.LLF = -1;
        View view = this.LLFII;
        if (view != null) {
            view.setSelected(false);
        }
        this.LLFII = null;
        LJJIJIIJIL(recycler);
        View LJFF = recycler.LJFF(this.LLD);
        o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(initSelectedPosition)");
        LJJLIIIJL(0, 0, LJFF);
        int paddingEnd = ((int) (((((this.LJLLLL - getPaddingEnd()) - getPaddingStart()) - r5) / 2.0f) + getPaddingStart())) + LJJJJL(LJFF);
        int i3 = this.LLD;
        this.LLFF = i3;
        this.LLFFF = i3;
        LLIIIL(recycler, i3, getPaddingStart(), paddingEnd);
        LLIIIZ(recycler, this.LLD + 1, paddingEnd, this.LJLLLL - getPaddingEnd());
        LLIIJLIL(0);
        SYL syl2 = this.LLFZ;
        if (syl2 == null) {
            return;
        }
        ((C0A6) this.LJLZ.getValue()).LJIILL(syl2, 0, 0);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x00ec, code lost:
    
        if (r5 < 0) goto L43;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00b7  */
    @Override // X.C0A2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int LJZI(int r10, X.C0A7 r11, X.C0AC r12) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.aweme.story.feed.ui.gallery.StoryGalleryLayoutManager.LJZI(int, X.0A7, X.0AC):int");
    }

    @Override // X.C0A2
    public final void LLIIII(RecyclerView recyclerView, C0AC state, int i) {
        o.LJIIIZ(recyclerView, "recyclerView");
        o.LJIIIZ(state, "state");
        if (i < 0) {
            return;
        }
        Context context = recyclerView.getContext();
        o.LJIIIIZZ(context, "recyclerView.context");
        C80085Vbt c80085Vbt = new C80085Vbt(context);
        c80085Vbt.LIZ = i;
        LLIIIILZ(c80085Vbt);
    }

    public final void LLIIIL(C0A7 c0a7, int i, int i2, int i3) {
        while (-1 < i && i3 >= i2) {
            View LJFF = c0a7.LJFF(i);
            o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(i)");
            LJIJ(0, LJFF, false);
            LJJLIIIJL(0, 0, LJFF);
            int LJJJJL = LJJJJL(LJFF);
            int LJJJJJL = LJJJJJL(LJFF);
            int paddingTop = (int) (((this.LJLLLLLL - LJJJJJL) / 2.0f) + getPaddingTop());
            int i4 = i3 - LJJJJL;
            Rect rect = new Rect();
            rect.set(i4, paddingTop, i3, LJJJJJL + paddingTop);
            LJJLIIIJJIZ(LJFF, rect.left, rect.top, rect.right, rect.bottom);
            ((SparseArray) this.LJZL.getValue()).put(this.LLD, rect);
            this.LLFF = i;
            i--;
            i3 = i4;
        }
    }

    public final void LLIIIZ(C0A7 c0a7, int i, int i2, int i3) {
        int LJJJJZ = LJJJJZ();
        int i4 = i2;
        for (int i5 = i; i5 < LJJJJZ && i2 <= i3; i5++) {
            View LJFF = c0a7.LJFF(i5);
            o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(i)");
            LJIIZILJ(LJFF);
            LJJLIIIJL(0, 0, LJFF);
            int LJJJJL = LJJJJL(LJFF);
            int LJJJJJL = LJJJJJL(LJFF);
            int paddingTop = (int) (((this.LJLLLLLL - LJJJJJL) / 2.0f) + getPaddingTop());
            Rect rect = new Rect();
            rect.set(i4, paddingTop, LJJJJL + i4, LJJJJJL + paddingTop);
            LJJLIIIJJIZ(LJFF, rect.left, rect.top, rect.right, rect.bottom);
            ((SparseArray) this.LJZL.getValue()).put(this.LLD, rect);
            this.LLFFF = i5;
            i4 = rect.right;
        }
    }
}
