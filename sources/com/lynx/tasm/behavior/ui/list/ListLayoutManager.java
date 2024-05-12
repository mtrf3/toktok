package com.lynx.tasm.behavior.ui.list;

import X.C0A2;
import X.C0A7;
import X.C0AC;
import X.C1BU;
import X.C79829VUr;
import X.VV2;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.lynx.tasm.base.LLog;

/* loaded from: classes15.dex */
public final class ListLayoutManager {

    /* loaded from: classes15.dex */
    public static class ListGridLayoutManager extends GridLayoutManager implements VV2 {
        public final UIList LLIIZ;
        public int LLIL;
        public float LLILII;
        public float LLILIL;

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LLIIIJ() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIJJLI() {
            if (!this.LLIIZ.LJLLL) {
                return false;
            }
            return super.LJIJJLI();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIL() {
            if (!this.LLIIZ.LJLLL) {
                return false;
            }
            return super.LJIL();
        }

        @Override // X.VV2
        public final float LIZIZ() {
            return this.LLILIL;
        }

        @Override // X.VV2
        public final float LIZLLL() {
            return this.LLILII;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LJLJJL(C0AC c0ac) {
            super.LJLJJL(c0ac);
            this.LLIIZ.LJJIFFI();
        }

        public ListGridLayoutManager(int i, int i2, UIList uIList) {
            super(i);
            this.LLIL = i2;
            this.LLIIZ = uIList;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
            float LJZI = super.LJZI(i, c0a7, c0ac);
            this.LLILIL = LJZI;
            this.LLIIZ.LJLJLLL.LJIJI(i, (int) LJZI);
            return (int) this.LLILIL;
        }

        @Override // androidx.recyclerview.widget.GridLayoutManager, androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
            float LL = super.LL(i, c0a7, c0ac);
            this.LLILII = LL;
            this.LLIIZ.LJLJLLL.LJIJI(i, (int) LL);
            return (int) this.LLILII;
        }

        @Override // X.C0A2
        public final void LJJLIIIJJIZ(View view, int i, int i2, int i3, int i4) {
            if (1 == this.LJLZ) {
                int i5 = ((C1BU) view.getLayoutParams()).LJLILLLLZI;
                int i6 = this.LLIIIL;
                if (i5 != i6) {
                    int LIZ = ListLayoutManager.LIZ(this.LLIIZ, i6, this.LLIL, i, i3);
                    super.LJJLIIIJJIZ(view, LIZ, i2, view.getMeasuredWidth() + LIZ, i4);
                    return;
                } else {
                    ListLayoutManager.LIZIZ(this, view, i2, i4);
                    return;
                }
            }
            super.LJJLIIIJJIZ(view, i, i2, i3, i4);
        }
    }

    /* loaded from: classes15.dex */
    public static class ListLinearLayoutManager extends LinearLayoutManager implements VV2 {
        public final UIList LLIIIJ;
        public float LLIIIL;
        public float LLIIIZ;

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LLIIIJ() {
            return false;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIJJLI() {
            if (!this.LLIIIJ.LJLLL) {
                return false;
            }
            return super.LJIJJLI();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final boolean LJIL() {
            if (!this.LLIIIJ.LJLLL) {
                return false;
            }
            return super.LJIL();
        }

        @Override // X.VV2
        public final float LIZIZ() {
            return this.LLIIIZ;
        }

        @Override // X.VV2
        public final float LIZLLL() {
            return this.LLIIIL;
        }

        public ListLinearLayoutManager(UIList uIList) {
            this.LLIIIJ = uIList;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final void LJLJJL(C0AC c0ac) {
            super.LJLJJL(c0ac);
            this.LLIIIJ.LJJIFFI();
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final int LJZI(int i, C0A7 c0a7, C0AC c0ac) {
            float LJZI = super.LJZI(i, c0a7, c0ac);
            this.LLIIIZ = LJZI;
            this.LLIIIJ.LJLJLLL.LJIJI(i, (int) LJZI);
            return (int) this.LLIIIZ;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager, X.C0A2
        public final int LL(int i, C0A7 c0a7, C0AC c0ac) {
            float LL = super.LL(i, c0a7, c0ac);
            this.LLIIIL = LL;
            this.LLIIIJ.LJLJLLL.LJIJI(i, (int) LL);
            return (int) this.LLIIIL;
        }

        @Override // X.C0A2
        public final void LJJLIIIJJIZ(View view, int i, int i2, int i3, int i4) {
            if (1 == this.LJLZ) {
                int viewAdapterPosition = ((RecyclerView.LayoutParams) view.getLayoutParams()).getViewAdapterPosition();
                C79829VUr c79829VUr = this.LLIIIJ.LJLJI;
                if (c79829VUr != null && !c79829VUr.LLF(viewAdapterPosition)) {
                    super.LJJLIIIJJIZ(view, i, i2, i3, i4);
                    return;
                } else {
                    ListLayoutManager.LIZIZ(this, view, i2, i4);
                    return;
                }
            }
            super.LJJLIIIJJIZ(view, i, i2, i3, i4);
        }
    }

    public static void LIZIZ(C0A2 c0a2, View view, int i, int i2) {
        int i3 = c0a2.LJLLLL;
        int measuredWidth = view.getMeasuredWidth();
        int paddingLeft = c0a2.getPaddingLeft();
        int paddingRight = c0a2.getPaddingRight();
        int i4 = i3 - measuredWidth;
        if (i4 <= 0) {
            paddingLeft = 0;
        } else {
            int i5 = paddingRight + paddingLeft;
            int i6 = i4 - i5;
            if (i6 < 0) {
                paddingLeft += (int) (i6 * (paddingLeft / i5));
            }
        }
        view.layout(paddingLeft, i, view.getMeasuredWidth() + paddingLeft, i2);
    }

    public static int LIZ(UIList uIList, int i, int i2, int i3, int i4) {
        if (i2 > 0) {
            int width = uIList.getWidth();
            int i5 = uIList.mPaddingLeft;
            int i6 = ((width - i5) - uIList.mPaddingRight) / i;
            if (i6 == 0) {
                LLog.LIZLLL(2, "ListLayoutManager", "the width of list maybe 0 ");
                return i3;
            }
            return (((i4 - i3) + i2) * ((i3 - i5) / i6)) + i5;
        }
        return i3;
    }
}
