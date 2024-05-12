package com.ss.android.ugc.aweme.newtoolbar.widget;

import X.AbstractC65781Prl;
import X.C0A7;
import X.C0AC;
import X.C15890jp;
import X.C17N;
import X.C57185McP;
import X.H78;
import X.InterfaceC65784Pro;
import X.X1D;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class FixedSizeVerticalLinearLayoutManager extends LinearLayoutManager {
    public final InterfaceC65784Pro<Integer> LLIIIJ;
    public final int LLIIIL;
    public final int LLIIIZ;
    public AbstractC65781Prl LLIIJI;

    public FixedSizeVerticalLinearLayoutManager() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FixedSizeVerticalLinearLayoutManager(C57185McP c57185McP, InterfaceC65784Pro interfaceC65784Pro, int i, int i2) {
        super(1, false);
        int i3;
        i = (i2 & 4) != 0 ? Integer.MAX_VALUE : i;
        if ((i2 & 8) != 0) {
            i3 = C17N.LJIILL(25.0d);
        } else {
            i3 = 0;
        }
        c57185McP.getContext();
        this.LLIIIJ = interfaceC65784Pro;
        this.LLIIIL = i;
        this.LLIIIZ = i3;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [X.Yns, X.Prl] */
    @Override // X.C0A2
    public final void LJLJJLL(int i, int i2, C0A7 recycler, C0AC state) {
        int i3;
        o.LJIIIZ(recycler, "recycler");
        o.LJIIIZ(state, "state");
        int intValue = this.LLIIIJ.invoke().intValue();
        int min = Math.min(LJJJJZ(), this.LLIIIL);
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
        for (int i7 = 0; i7 < min; i7++) {
            if (i4 < intValue) {
                try {
                    if (i7 < state.LIZIZ()) {
                        View LJFF = recycler.LJFF(i7);
                        o.LJIIIIZZ(LJFF, "recycler.getViewForPosition(i)");
                        LJJLIIIJL(0, 0, LJFF);
                        ViewGroup.LayoutParams layoutParams = LJFF.getLayoutParams();
                        o.LJII(layoutParams, "null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView.LayoutParams");
                        RecyclerView.LayoutParams layoutParams2 = (RecyclerView.LayoutParams) layoutParams;
                        int LJJJJJL = LJJJJJL(LJFF) + ((ViewGroup.MarginLayoutParams) layoutParams2).topMargin + ((ViewGroup.MarginLayoutParams) layoutParams2).bottomMargin + LJFF.getPaddingTop() + LJFF.getPaddingBottom();
                        if (i5 == 0) {
                            i5 = LJJJJJL;
                        }
                        i3 = i5;
                        i5 = LJJJJJL;
                    } else {
                        i3 = i5;
                    }
                    int i8 = i5 + i4;
                    if (i8 >= intValue) {
                        break;
                    }
                    i6++;
                    i4 = i8;
                    i5 = i3;
                } catch (Exception e) {
                    H78.LJ(e);
                }
            }
        }
        if (i4 > 0 && (i6 < min || this.LLIIIL < LJJJJZ())) {
            i4 += this.LLIIIZ;
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i4, 1073741824);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("FixedSizeLinearLayoutManager,onMeasure,itemCount:");
        LIZ.append(LJJJJZ());
        LIZ.append(",stateCount:");
        LIZ.append(state.LIZIZ());
        LIZ.append(",maxCount:");
        C15890jp.LIZIZ(LIZ, this.LLIIIL, ",targetHeight:", i4, ",targetCount:");
        C15890jp.LIZIZ(LIZ, i6, ",maxLayoutHeight:", intValue, ".detailState:");
        LIZ.append(state);
        H78.LIZ(X1D.LIZIZ(LIZ));
        super.LJLJJLL(i, makeMeasureSpec, recycler, state);
        ?? r1 = this.LLIIJI;
        if (r1 != 0) {
            r1.invoke(Integer.valueOf(i4));
        }
    }
}
