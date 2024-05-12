package X;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* renamed from: X.8DP, reason: invalid class name */
/* loaded from: classes4.dex */
public final class C8DP {
    public static Rect LIZIZ(RecyclerView.ViewHolder viewHolder) {
        View view;
        if (viewHolder != null && (view = viewHolder.itemView) != null) {
            int[] iArr = new int[2];
            view.getLocationOnScreen(iArr);
            Rect rect = new Rect();
            int i = iArr[0];
            rect.set(i, iArr[1], view.getWidth() + i, view.getHeight() + iArr[1]);
            return rect;
        }
        return null;
    }

    public static C15070iV<Integer, Integer> LIZJ(RecyclerView recyclerView) {
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

    public static void LIZ(int i, RecyclerView recyclerView) {
        if (recyclerView == null) {
            return;
        }
        recyclerView.setPadding(0, (int) KL2.LIZJ(recyclerView.getContext(), i), 0, 0);
        recyclerView.setClipToPadding(false);
    }
}
