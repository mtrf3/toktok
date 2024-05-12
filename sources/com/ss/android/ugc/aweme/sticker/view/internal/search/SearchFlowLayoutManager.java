package com.ss.android.ugc.aweme.sticker.view.internal.search;

import X.AbstractC029409q;
import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C74275TDb;
import android.graphics.Rect;
import android.util.SparseArray;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SearchFlowLayoutManager extends C0A2 {
    public final SparseArray<View> LJLZ = new SparseArray<>();
    public final SparseArray<Rect> LJZ = new SparseArray<>();
    public int LJZI;
    public int LJZL;
    public int LL;
    public int LLD;

    @Override // X.C0A2
    public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
        return i;
    }

    @Override // X.C0A2
    public final RecyclerView.LayoutParams LJJIJL() {
        return new RecyclerView.LayoutParams(-2, -2);
    }

    @Override // X.C0A2
    public final void LJJLIIJ(AbstractC029409q abstractC029409q) {
        LJLLI();
    }

    @Override // X.C0A2
    public final void LJLJJI(C0A7 c0a7, C0AC c0ac) {
        int LJJJJZ = LJJJJZ();
        for (int i = 0; i < LJJJJZ; i++) {
            View view = this.LJLZ.get(i);
            o.LJIIIIZZ(view, "cachedViews.get(i)");
            Rect rect = this.LJZ.get(i);
            o.LJIIIIZZ(rect, "layoutPoints.get(i)");
            Rect rect2 = rect;
            C0A2.LJJLIIIJJI(view, rect2.left, rect2.top, rect2.right, rect2.bottom);
        }
    }

    @Override // X.C0A2
    public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
        int i2 = this.LL - this.LJZL;
        if (i2 <= 0) {
            return 0;
        }
        int i3 = this.LLD;
        int i4 = i + i3;
        if (i4 < 0) {
            i2 = 0;
        } else if (i4 <= i2) {
            i2 = i4;
        }
        int i5 = i2 - i3;
        LJJLIIIJLLLLLLLZ(-i5);
        this.LLD = i2;
        return i5;
    }

    @Override // X.C0A2
    public final void LJLJJLL(int i, int i2, C0A7 recycler, C0AC state) {
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        super.LJLJJLL(i, i2, recycler, state);
        int mode = View.MeasureSpec.getMode(i2);
        int size = View.MeasureSpec.getSize(i);
        int size2 = View.MeasureSpec.getSize(i2);
        int LIZ = (int) C74275TDb.LIZ(12.0f);
        LJLLILLLL(recycler);
        recycler.LIZJ();
        this.LJLZ.clear();
        this.LL = 0;
        this.LJZI = (size - getPaddingRight()) - getPaddingLeft();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int LJJJJZ = LJJJJZ();
        for (int i3 = 0; i3 < LJJJJZ; i3++) {
            View LJFF = recycler.LJFF(i3);
            o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(i)");
            LJIIZILJ(LJFF);
            LJJLIIIJL(0, 0, LJFF);
            this.LJLZ.put(i3, LJFF);
        }
        int LJJJJZ2 = LJJJJZ();
        int i4 = paddingTop;
        for (int i5 = 0; i5 < LJJJJZ2; i5++) {
            View view = this.LJLZ.get(i5);
            o.LJIIIIZZ(view, "cachedViews.get(i)");
            View view2 = view;
            int LJJJJL = LJJJJL(view2);
            int LJJJJJL = LJJJJJL(view2);
            if (LJJJJL > this.LJZI - paddingLeft) {
                paddingLeft = getPaddingLeft();
                i4 = paddingTop;
            }
            int i6 = LJJJJJL + i4;
            this.LJZ.put(i5, new Rect(paddingLeft, i4, paddingLeft + LJJJJL, i6));
            paddingLeft += LJJJJL + LIZ;
            if (i6 >= paddingTop) {
                paddingTop = i6 + LIZ;
            }
        }
        int paddingTop2 = paddingTop - getPaddingTop();
        this.LL = paddingTop2;
        int paddingBottom = getPaddingBottom() + getPaddingTop() + paddingTop2;
        if (mode == Integer.MIN_VALUE ? paddingBottom <= size2 : mode != 1073741824) {
            size2 = paddingBottom;
        }
        this.LJZL = (size2 - getPaddingTop()) - getPaddingBottom();
        this.LJLILLLLZI.setMeasuredDimension(size, size2);
    }
}
