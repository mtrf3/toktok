package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.8DQ, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DQ {
    public static C15070iV<Integer, Integer> LIZ(RecyclerView recyclerView) {
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof LinearLayoutManager) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            return new C15070iV<>(Integer.valueOf(linearLayoutManager.LLILL()), Integer.valueOf(linearLayoutManager.LLILLJJLI()));
        }
        if (layoutManager instanceof GridLayoutManager) {
            LinearLayoutManager linearLayoutManager2 = (LinearLayoutManager) layoutManager;
            return new C15070iV<>(Integer.valueOf(linearLayoutManager2.LLILL()), Integer.valueOf(linearLayoutManager2.LLILLJJLI()));
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) layoutManager;
            int i = staggeredGridLayoutManager.LJLZ;
            int[] iArr = new int[i];
            staggeredGridLayoutManager.LLILII(iArr);
            int i2 = iArr[0];
            for (int i3 = 0; i3 < i; i3++) {
                int i4 = iArr[i3];
                if (i4 > i2) {
                    i2 = i4;
                }
            }
            staggeredGridLayoutManager.LLIL(iArr);
            int i5 = iArr[0];
            for (int i6 = 0; i6 < i; i6++) {
                int i7 = iArr[i6];
                if (i7 < i5) {
                    i5 = i7;
                }
            }
            return new C15070iV<>(Integer.valueOf(i5), Integer.valueOf(i2));
        }
        throw new RuntimeException("Unsupported LayoutManager used. Valid ones are LinearLayoutManager, GridLayoutManager, StaggeredGridLayoutManager");
    }
}
