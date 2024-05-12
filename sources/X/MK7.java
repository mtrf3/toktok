package X;

import Y.ARunnableS28S0200000_9;
import Y.ARunnableS45S0100000_9;
import Y.IDrS48S0100000_9;
import android.text.TextUtils;
import android.text.method.MovementMethod;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* loaded from: classes10.dex */
public abstract class MK7 extends C4II {
    public static final MKB Companion = new MKB();
    public static final String TAG = C16880lQ.LJLLJ(MK7.class);
    public boolean isFooterShowing;
    public String mmLabel;
    public InterfaceC191547fS mmLoadMoreListener;
    public RecyclerView mmRecyclerView;
    public AbstractC028509h spanSizeLookup;
    public MFH spanSizeLookup2;
    public long mmLoadStartTime = -1;
    public final MK8 mmLoadMoreState = new MK8();
    public final C0A6 mmOnScrollListener = new IDrS48S0100000_9(this, 8);
    public final C0A4 mmOnFlingListener = new MKA(this);

    public boolean isNestedFlingStopCompat() {
        return false;
    }

    private final void notifyLoadMoreItemChanged() {
        if (!this.mShowFooter || this.mmRecyclerView == null) {
            return;
        }
        RuntimeException runtimeException = new RuntimeException("Notify when recyclerview scroll or layout");
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView == null) {
            return;
        }
        recyclerView.post(new ARunnableS28S0200000_9(runtimeException, this, 53));
    }

    public final boolean isNestedFlingHandled() {
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView == null || !isNestedFlingStopCompat() || !this.isFooterShowing || recyclerView.canScrollVertically(1)) {
            return false;
        }
        return true;
    }

    public final void resetLoadMoreState() {
        this.mmLoadMoreState.LIZ = -1;
        notifyLoadMoreItemChanged();
        this.mmLoadStartTime = -1L;
    }

    public final void showFooter() {
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView != null) {
            if (recyclerView.LJJJLL()) {
                recyclerView.post(new ARunnableS45S0100000_9(this, 132));
                return;
            } else {
                setShowFooter(true);
                return;
            }
        }
        setShowFooter(true);
    }

    public void showLoadMoreEmpty() {
        this.mmLoadMoreState.LIZ = 1;
        notifyLoadMoreItemChanged();
    }

    public final void showLoadMoreError() {
        this.mmLoadMoreState.LIZ = 2;
        notifyLoadMoreItemChanged();
    }

    public final void showLoadMoreLoading() {
        this.mmLoadMoreState.LIZ = 0;
        notifyLoadMoreItemChanged();
        if (this.mmLoadStartTime == -1) {
            this.mmLoadStartTime = System.currentTimeMillis();
        }
    }

    public final void showPullUpLoadMore() {
        RecyclerView recyclerView = this.mmRecyclerView;
        if (recyclerView != null) {
            showPullUpLoadMore(recyclerView, true);
        }
    }

    @Override // X.C4II, X.AbstractC029409q
    public int getItemCount() {
        if (getBasicItemCount() == 0) {
            return 0;
        }
        return super.getItemCount();
    }

    public final RecyclerView.ViewHolder createFooterViewHolder(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return new MSE(this, parent);
    }

    public void notifyLoadMoreItemChangedReal(Exception exc) {
        RecyclerView recyclerView;
        if (this.mShowFooter && getItemCount() > 0 && (recyclerView = this.mmRecyclerView) != null && !recyclerView.LJJJLL()) {
            notifyItemChanged(getItemCount() - 1);
        }
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        this.mmRecyclerView = recyclerView;
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new MFI(this, layoutManager));
        }
        recyclerView.LJIIJJI(this.mmOnScrollListener);
        if (recyclerView.getOnFlingListener() == null) {
            recyclerView.setOnFlingListener(this.mmOnFlingListener);
        }
    }

    @Override // X.C4II
    public void onBindFooterViewHolder(RecyclerView.ViewHolder holder) {
        MSE mse;
        o.LJIIIZ(holder, "holder");
        if ((holder instanceof MSE) && (mse = (MSE) holder) != null) {
            mse.L();
        }
    }

    @Override // X.C4II
    public RecyclerView.ViewHolder onCreateFooterViewHolder(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        return createFooterViewHolder(parent);
    }

    @Override // X.AbstractC029409q
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        recyclerView.LJJLL(this.mmOnScrollListener);
        if (recyclerView.getOnFlingListener() == this.mmOnFlingListener) {
            recyclerView.setOnFlingListener(null);
        }
    }

    @Override // X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C1BZ)) {
            C1BZ c1bz = (C1BZ) layoutParams;
            if (getItemViewType(holder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c1bz.LJLILLLLZI = z;
        }
        if (holder instanceof MSE) {
            this.isFooterShowing = true;
        }
    }

    @Override // X.AbstractC029409q
    public void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        super.onViewDetachedFromWindow(holder);
        if (this.mmLoadStartTime != -1 && !TextUtils.isEmpty(this.mmLabel)) {
            FUA.LJFF("aweme_feed_load_more_duration", this.mmLabel, (float) (System.currentTimeMillis() - this.mmLoadStartTime));
            this.mmLoadStartTime = -1L;
        }
        if (holder instanceof MSE) {
            this.isFooterShowing = false;
        }
    }

    public final void setLoadEmptyText(int i) {
        setLoadEmptyText(EF7.LIZIZ().getString(i));
    }

    public final void setLoadEmptyTextColor(Integer num) {
        this.mmLoadMoreState.LIZJ = num;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadEmptyTextViewMovementMethod(MovementMethod movementMethod) {
        this.mmLoadMoreState.LIZLLL = movementMethod;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadErrorText(int i) {
        setLoadErrorText(EF7.LIZIZ().getString(i));
    }

    public final void setLoadErrorTextColor(Integer num) {
        this.mmLoadMoreState.LJFF = num;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadMoreListener(InterfaceC65784Pro<C76800UCe> loadMoreListener) {
        o.LJIIIZ(loadMoreListener, "loadMoreListener");
        this.mmLoadMoreListener = new MK9(loadMoreListener);
    }

    public final void setLoadEmptyText(CharSequence charSequence) {
        this.mmLoadMoreState.LIZIZ = charSequence;
        notifyLoadMoreItemChanged();
    }

    public final void setLoadErrorText(CharSequence charSequence) {
        this.mmLoadMoreState.LJ = charSequence;
        notifyLoadMoreItemChanged();
    }

    public void setLoadMoreListener(InterfaceC191547fS interfaceC191547fS) {
        this.mmLoadMoreListener = interfaceC191547fS;
    }

    public void showPullUpLoadMore(RecyclerView recyclerView, boolean z) {
        this.mmLoadMoreState.LIZ = 2;
        notifyLoadMoreItemChanged();
        if (z && recyclerView != null) {
            C26045AKb c26045AKb = new C26045AKb(recyclerView);
            c26045AKb.LJIIIIZZ(R.string.hvd);
            c26045AKb.LJIIJ();
        }
    }
}
