package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JYK extends C0A6 {
    public final RecyclerView LJLIL;
    public final InterfaceC88472Yns<Integer, C76800UCe> LJLILLLLZI;

    /* JADX WARN: Multi-variable type inference failed */
    public JYK(RecyclerView powerList, InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns) {
        o.LJIIIZ(powerList, "powerList");
        this.LJLIL = powerList;
        this.LJLILLLLZI = interfaceC88472Yns;
    }

    @Override // X.C0A6
    public final void LJIILL(RecyclerView recyclerView, int i, int i2) {
        Integer valueOf;
        o.LJIIIZ(recyclerView, "recyclerView");
        C0A2 layoutManager = this.LJLIL.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).LLILLJJLI());
        } else if (layoutManager instanceof LinearLayoutManager) {
            valueOf = Integer.valueOf(((LinearLayoutManager) layoutManager).LLILLJJLI());
        } else {
            if (!(layoutManager instanceof StaggeredGridLayoutManager)) {
                return;
            }
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i3 = staggeredGridLayoutManager.LJLZ;
            int[] iArr = new int[i3];
            staggeredGridLayoutManager.LLILII(iArr);
            int i4 = iArr[0];
            for (int i5 = 0; i5 < i3; i5++) {
                int i6 = iArr[i5];
                if (i6 > i4) {
                    i4 = i6;
                }
            }
            valueOf = Integer.valueOf(i4);
        }
        if (valueOf != null && valueOf.intValue() >= 0) {
            int intValue = valueOf.intValue();
            o.LJI(layoutManager);
            if ((layoutManager.LJIL() && !this.LJLIL.canScrollVertically(1)) || (layoutManager.LJIJJLI() && !this.LJLIL.canScrollHorizontally(1))) {
                this.LJLILLLLZI.invoke(Integer.valueOf(intValue));
            }
        }
    }
}
