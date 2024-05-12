package X;

import Y.IDcS9S0200000_7;
import android.text.TextUtils;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* renamed from: X.Grc, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42840Grc extends AbstractC42841Grd {
    public TextView LJLJI;
    public RecyclerView LJLJJL;
    public C42842Gre LJLJJLL;
    public C42846Gri LJLJL;
    public int LJLILLLLZI = -1;
    public long LJLJJI = -1;

    static {
        C16880lQ.LJLLJ(AbstractC42840Grc.class);
    }

    @Override // X.AbstractC42841Grd, X.AbstractC029409q
    public final int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.LJLJJL = recyclerView;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LLJLILLLLZIIL(new IDcS9S0200000_7(this, gridLayoutManager, 5));
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        boolean z;
        super.onViewAttachedToWindow(viewHolder);
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C1BZ)) {
            C1BZ c1bz = (C1BZ) layoutParams;
            if (getItemViewType(viewHolder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c1bz.LJLILLLLZI = z;
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        if (this.LJLJJI != -1 && !TextUtils.isEmpty(null)) {
            C60903NvH.LJIIJJI().LJJIIZI().LJIILL("aweme_feed_load_more_duration", null, (float) (System.currentTimeMillis() - this.LJLJJI));
            this.LJLJJI = -1L;
        }
    }
}
