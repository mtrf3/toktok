package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.ViewHolder;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Gpq, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42730Gpq<VH extends RecyclerView.ViewHolder> extends AbstractC029409q<RecyclerView.ViewHolder> {
    public static final /* synthetic */ int LJLJJL = 0;
    public int LJLIL = 1;
    public final AbstractC029409q<VH> LJLILLLLZI;
    public final InterfaceC42736Gpw LJLJI;
    public C42731Gpr LJLJJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.getItemCount() + 1;
    }

    public final void LJLLLLLL(int i) {
        if (i == 0 || i == 1 || i == 3 || i == 2) {
            if (this.LJLIL != i) {
                this.LJLIL = i;
                notifyItemChanged(getItemCount() - 1);
                return;
            }
            return;
        }
        "state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.".toString();
        throw new IllegalArgumentException("state must be one of STATE_OK, STATE_LOADING, STATE_EMPTY and STATE_ERROR.");
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        if (i < this.LJLILLLLZI.getItemCount()) {
            return this.LJLILLLLZI.getItemId(i);
        }
        return super.getItemId(i);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < this.LJLILLLLZI.getItemCount()) {
            return this.LJLILLLLZI.getItemViewType(i);
        }
        return 65298;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        if (this.LJLJJI == null && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
            C42731Gpr c42731Gpr = new C42731Gpr();
            this.LJLJJI = c42731Gpr;
            c42731Gpr.LJ = recyclerView;
            GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
            c42731Gpr.LJFF = gridLayoutManager;
            o.LJI(gridLayoutManager);
            c42731Gpr.LJI = gridLayoutManager.LLIILII;
            GridLayoutManager gridLayoutManager2 = c42731Gpr.LJFF;
            o.LJI(gridLayoutManager2);
            gridLayoutManager2.LLJLILLLLZIIL(c42731Gpr);
        }
        this.LJLILLLLZI.onAttachedToRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLILLLLZI.onDetachedFromRecyclerView(recyclerView);
        C42731Gpr c42731Gpr = this.LJLJJI;
        if (c42731Gpr != null) {
            o.LJI(c42731Gpr);
            this.LJLJJI = null;
        }
        super.onDetachedFromRecyclerView(recyclerView);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof AbstractC42735Gpv) {
            return super.onFailedToRecycleView(holder);
        }
        return this.LJLILLLLZI.onFailedToRecycleView(holder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof AbstractC42735Gpv) {
            super.onViewAttachedToWindow(holder);
        } else {
            this.LJLILLLLZI.onViewAttachedToWindow(holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof AbstractC42735Gpv) {
            super.onViewDetachedFromWindow(holder);
        } else {
            this.LJLILLLLZI.onViewDetachedFromWindow(holder);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (holder instanceof AbstractC42735Gpv) {
            super.onViewRecycled(holder);
        } else {
            this.LJLILLLLZI.onViewRecycled(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.registerAdapterDataObserver(observer);
        this.LJLILLLLZI.registerAdapterDataObserver(observer);
    }

    @Override // X.AbstractC029409q
    public final void setHasStableIds(boolean z) {
        this.LJLILLLLZI.setHasStableIds(z);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
        this.LJLILLLLZI.unregisterAdapterDataObserver(observer);
    }

    public C42730Gpq(C31413CUn c31413CUn, InterfaceC42736Gpw interfaceC42736Gpw) {
        this.LJLILLLLZI = c31413CUn;
        this.LJLJI = interfaceC42736Gpw;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (i < this.LJLILLLLZI.getItemCount()) {
            this.LJLILLLLZI.onBindViewHolder(holder, i);
        } else {
            ((AbstractC42735Gpv) holder).L(this.LJLIL);
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        VH onCreateViewHolder;
        o.LJIIIZ(parent, "parent");
        if (i == 65298) {
            onCreateViewHolder = this.LJLJI.LIZ(parent);
            o.LJI(onCreateViewHolder);
        } else {
            onCreateViewHolder = this.LJLILLLLZI.onCreateViewHolder(parent, i);
            o.LJIIIIZZ(onCreateViewHolder, "childAdapter.onCreateViewHolder(parent, viewType)");
        }
        C0AX.LIZ(parent, onCreateViewHolder.itemView, R.id.lj7);
        View view = onCreateViewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (onCreateViewHolder.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(onCreateViewHolder.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(onCreateViewHolder.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = onCreateViewHolder.getClass().getName();
        return onCreateViewHolder;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<? extends Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (i < this.LJLILLLLZI.getItemCount()) {
            this.LJLILLLLZI.onBindViewHolder(holder, i, payloads);
        } else {
            super.onBindViewHolder(holder, i, payloads);
        }
    }
}
