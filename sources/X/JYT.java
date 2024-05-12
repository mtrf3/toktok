package X;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

/* loaded from: classes9.dex */
public final class JYT {
    public static Integer LIZ(RecyclerView recyclerView) {
        C0A2 layoutManager;
        Integer num;
        Integer num2;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            num = Integer.valueOf(((LinearLayoutManager) layoutManager).LLILL());
        } else {
            num = null;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            num2 = ORY.LJJLI(((StaggeredGridLayoutManager) layoutManager).LLIL(null));
        } else {
            num2 = num;
        }
        if (layoutManager instanceof GridLayoutManager) {
            return Integer.valueOf(((LinearLayoutManager) layoutManager).LLILL());
        }
        return num2;
    }

    public static Integer LIZIZ(RecyclerView recyclerView) {
        C0A2 layoutManager;
        Integer num;
        Integer num2;
        if (recyclerView == null || (layoutManager = recyclerView.getLayoutManager()) == null) {
            return null;
        }
        if (layoutManager instanceof LinearLayoutManager) {
            num = Integer.valueOf(((LinearLayoutManager) layoutManager).LLILLJJLI());
        } else {
            num = null;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            num2 = ORY.LJJJZ(((StaggeredGridLayoutManager) layoutManager).LLILII(null));
        } else {
            num2 = num;
        }
        if (layoutManager instanceof GridLayoutManager) {
            return Integer.valueOf(((LinearLayoutManager) layoutManager).LLILLJJLI());
        }
        return num2;
    }
}
