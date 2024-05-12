package X;

import android.os.Trace;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import java.util.List;

/* renamed from: X.09q, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC029409q<VH extends RecyclerView.ViewHolder> {
    public final C029509r mObservable = new C029509r();
    public boolean mHasStableIds = false;
    public EnumC029309p mStateRestorationPolicy = EnumC029309p.ALLOW;

    public int findRelativeAdapterPositionIn(AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q, RecyclerView.ViewHolder viewHolder, int i) {
        if (abstractC029409q == this) {
            return i;
        }
        return -1;
    }

    public abstract int getItemCount();

    public long getItemId(int i) {
        return -1L;
    }

    public int getItemViewType(int i) {
        return 0;
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
    }

    public abstract void onBindViewHolder(VH vh, int i);

    public abstract VH onCreateViewHolder(ViewGroup viewGroup, int i);

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
    }

    public boolean onFailedToRecycleView(VH vh) {
        return false;
    }

    public void onViewAttachedToWindow(VH vh) {
    }

    public void onViewDetachedFromWindow(VH vh) {
    }

    public void onViewRecycled(VH vh) {
    }

    public boolean canRestoreState() {
        int i = C029209o.LIZ[this.mStateRestorationPolicy.ordinal()];
        if (i == 1) {
            return false;
        }
        if (i == 2 && getItemCount() <= 0) {
            return false;
        }
        return true;
    }

    public final boolean hasObservers() {
        return this.mObservable.LIZ();
    }

    public final void notifyDataSetChanged() {
        this.mObservable.LIZIZ();
    }

    public final void notifyItemChanged(int i) {
        this.mObservable.LIZLLL(i, 1, null);
    }

    public final void notifyItemInserted(int i) {
        this.mObservable.LJ(i, 1);
    }

    public final void notifyItemRemoved(int i) {
        this.mObservable.LJFF(i, 1);
    }

    public void registerAdapterDataObserver(AbstractC029609s abstractC029609s) {
        this.mObservable.registerObserver(abstractC029609s);
    }

    public void setHasStableIds(boolean z) {
        if (!hasObservers()) {
            this.mHasStableIds = z;
            return;
        }
        throw new IllegalStateException("Cannot change whether this adapter has stable IDs while the adapter has registered observers.");
    }

    public void setStateRestorationPolicy(EnumC029309p enumC029309p) {
        this.mStateRestorationPolicy = enumC029309p;
        this.mObservable.LJI();
    }

    public void unregisterAdapterDataObserver(AbstractC029609s abstractC029609s) {
        this.mObservable.unregisterObserver(abstractC029609s);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void bindViewHolder(VH vh, int i) {
        boolean z;
        if (vh.mBindingAdapter == null) {
            z = true;
            vh.mPosition = i;
            if (this.mHasStableIds) {
                vh.mItemId = getItemId(i);
            }
            vh.setFlags(1, 519);
            Trace.beginSection("RV OnBindView");
        } else {
            z = false;
        }
        vh.mBindingAdapter = this;
        onBindViewHolder(vh, i, vh.getUnmodifiedPayloads());
        if (z) {
            vh.clearPayload();
            ViewGroup.LayoutParams layoutParams = vh.itemView.getLayoutParams();
            if (layoutParams instanceof RecyclerView.LayoutParams) {
                ((RecyclerView.LayoutParams) layoutParams).mInsetsDirty = true;
            }
            Trace.endSection();
        }
    }

    public final VH createViewHolder(ViewGroup viewGroup, int i) {
        try {
            Trace.beginSection("RV CreateView");
            VH onCreateViewHolder = onCreateViewHolder(viewGroup, i);
            if (onCreateViewHolder.itemView.getParent() == null) {
                onCreateViewHolder.mItemViewType = i;
                return onCreateViewHolder;
            }
            throw new IllegalStateException("ViewHolder views must not be attached when created. Ensure that you are not passing 'true' to the attachToRoot parameter of LayoutInflater.inflate(..., boolean attachToRoot)");
        } finally {
            Trace.endSection();
        }
    }

    public final void notifyItemChanged(int i, Object obj) {
        this.mObservable.LIZLLL(i, 1, obj);
    }

    public final void notifyItemMoved(int i, int i2) {
        this.mObservable.LIZJ(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2) {
        this.mObservable.LIZLLL(i, i2, null);
    }

    public final void notifyItemRangeInserted(int i, int i2) {
        this.mObservable.LJ(i, i2);
    }

    public final void notifyItemRangeRemoved(int i, int i2) {
        this.mObservable.LJFF(i, i2);
    }

    public final void notifyItemRangeChanged(int i, int i2, Object obj) {
        this.mObservable.LIZLLL(i, i2, obj);
    }

    public void onBindViewHolder(VH vh, int i, List<Object> list) {
        onBindViewHolder(vh, i);
    }
}
