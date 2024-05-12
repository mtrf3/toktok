package X;

import java.util.List;

/* renamed from: X.Gra, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42838Gra<T> extends AbstractC42840Grc {
    public List<T> LJLJLJ;
    public int LJLJLLL;

    static {
        C16880lQ.LJLLJ(AbstractC42838Gra.class);
    }

    @Override // X.AbstractC42841Grd
    public final int getBasicItemCount() {
        List<T> list = this.LJLJLJ;
        if (list == null) {
            return 0;
        }
        return list.size();
    }

    public AbstractC42838Gra() {
        registerAdapterDataObserver(new C42839Grb(this));
    }

    public final void onShowFooterChanged(boolean z) {
        if (z) {
            notifyItemInserted(getItemCount() - 1);
        } else {
            notifyItemRemoved(getItemCount());
        }
        this.LJLJLLL = getItemCount();
    }

    public final void setDataAfterLoadMore(List<T> list) {
        this.LJLJLJ = list;
        if (this.LJLIL) {
            notifyItemRangeInserted(this.LJLJLLL - 1, getItemCount() - this.LJLJLLL);
            notifyItemChanged(getItemCount() - 1);
        } else {
            notifyItemRangeInserted(this.LJLJLLL, getItemCount() - this.LJLJLLL);
        }
    }
}
