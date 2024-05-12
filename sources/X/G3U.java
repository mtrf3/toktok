package X;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes7.dex */
public final class G3U extends RecyclerView.RecycledViewPool {
    @Override // androidx.recyclerview.widget.RecyclerView.RecycledViewPool
    public final RecyclerView.ViewHolder getRecycledView(int i) {
        View view;
        ViewGroup viewGroup;
        RecyclerView.ViewHolder recycledView = super.getRecycledView(i);
        if (recycledView != null && (view = recycledView.itemView) != null) {
            ViewParent parent = view.getParent();
            if ((parent instanceof ViewGroup) && (viewGroup = (ViewGroup) parent) != null) {
                C16880lQ.LJLLL(view, viewGroup);
            }
        }
        return recycledView;
    }
}
