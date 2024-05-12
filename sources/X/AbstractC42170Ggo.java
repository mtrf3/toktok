package X;

import Y.IDcS9S0200000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggo, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42170Ggo extends AbstractC029409q<RecyclerView.ViewHolder> {
    public int LJLLLLLL(int i, GridLayoutManager gridLayoutManager) {
        o.LJIIIZ(gridLayoutManager, "gridLayoutManager");
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new IDcS9S0200000_7(layoutManager, this, 0));
        }
    }

    @Override // X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C1BZ)) {
            C1BZ c1bz = (C1BZ) layoutParams;
            if (getItemViewType(holder.getLayoutPosition()) == -2147483646) {
                z = true;
            } else {
                z = false;
            }
            c1bz.LJLILLLLZI = z;
        }
    }
}
