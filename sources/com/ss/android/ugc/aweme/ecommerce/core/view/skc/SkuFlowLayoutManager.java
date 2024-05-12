package com.ss.android.ugc.aweme.ecommerce.core.view.skc;

import X.AbstractC029409q;
import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C90193gN;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class SkuFlowLayoutManager extends C0A2 {
    public int LJLZ;

    @Override // X.C0A2
    public final boolean LJJLIIIJ() {
        return true;
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
    public final void LJLJJI(C0A7 recycler, C0AC state) {
        ViewGroup.MarginLayoutParams layoutParams;
        int i;
        ViewGroup.MarginLayoutParams layoutParams2;
        int i2;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        if (state.LIZIZ() == 0) {
            LJLLILLLL(recycler);
            return;
        }
        LJJIJIIJIL(recycler);
        int paddingEnd = this.LJLLLL - getPaddingEnd();
        if (C90193gN.LIZ()) {
            int paddingStart = paddingEnd - getPaddingStart();
            int paddingTop = getPaddingTop();
            int i3 = 0;
            if (paddingEnd > 0) {
                while (i3 >= 0 && i3 < state.LIZIZ()) {
                    View LJFF = recycler.LJFF(i3);
                    o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(fillPos)");
                    ViewGroup.LayoutParams layoutParams3 = LJFF.getLayoutParams();
                    if (!(layoutParams3 instanceof RecyclerView.LayoutParams) || (layoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams3) == null) {
                        layoutParams2 = new RecyclerView.LayoutParams(0, 0);
                    }
                    LJIIZILJ(LJFF);
                    LJJLIIIJL(0, 0, LJFF);
                    int LJJJJL = (paddingStart - LJJJJL(LJFF)) - layoutParams2.getMarginStart();
                    int LJJJJJL = LJJJJJL(LJFF) + paddingTop + layoutParams2.topMargin + layoutParams2.bottomMargin;
                    if (LJJJJL < 0) {
                        LJJJJL = (paddingEnd - LJJJJL(LJFF)) - layoutParams2.getMarginStart();
                        int i4 = LJJJJJL + this.LJLZ;
                        i2 = LJJJJJL(LJFF) + i4 + layoutParams2.topMargin + layoutParams2.bottomMargin;
                        paddingTop = i4;
                        paddingStart = paddingEnd;
                    } else {
                        i2 = LJJJJJL;
                    }
                    int marginEnd = LJJJJL - layoutParams2.getMarginEnd();
                    LJJLIIIJJIZ(LJFF, marginEnd, paddingTop, paddingStart, i2);
                    i3++;
                    paddingStart = marginEnd;
                }
                return;
            }
            return;
        }
        int paddingStart2 = getPaddingStart();
        int paddingTop2 = getPaddingTop();
        int i5 = 0;
        if (paddingEnd > 0) {
            while (i5 >= 0 && i5 < state.LIZIZ()) {
                View LJFF2 = recycler.LJFF(i5);
                o.LJIIIIZZ(LJFF2, "recycler.getViewForPosition(fillPos)");
                ViewGroup.LayoutParams layoutParams4 = LJFF2.getLayoutParams();
                if (!(layoutParams4 instanceof RecyclerView.LayoutParams) || (layoutParams = (ViewGroup.MarginLayoutParams) layoutParams4) == null) {
                    layoutParams = new RecyclerView.LayoutParams(0, 0);
                }
                LJIIZILJ(LJFF2);
                LJJLIIIJL(0, 0, LJFF2);
                int marginStart = layoutParams.getMarginStart() + LJJJJL(LJFF2) + paddingStart2;
                int LJJJJJL2 = LJJJJJL(LJFF2) + paddingTop2 + layoutParams.topMargin + layoutParams.bottomMargin;
                if (marginStart > paddingEnd) {
                    paddingStart2 = getPaddingStart();
                    marginStart = layoutParams.getMarginStart() + LJJJJL(LJFF2) + paddingStart2;
                    int i6 = LJJJJJL2 + this.LJLZ;
                    i = LJJJJJL(LJFF2) + i6 + layoutParams.topMargin + layoutParams.bottomMargin;
                    paddingTop2 = i6;
                } else {
                    i = LJJJJJL2;
                }
                int marginEnd2 = layoutParams.getMarginEnd() + marginStart;
                LJJLIIIJJIZ(LJFF2, paddingStart2, paddingTop2, marginEnd2, i);
                i5++;
                paddingStart2 = marginEnd2;
            }
        }
    }
}
