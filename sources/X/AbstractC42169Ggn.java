package X;

import Y.ARunnableS43S0100000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggn, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42169Ggn extends AbstractC42170Ggo {
    public final boolean LJLIL;
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLILLLLZI;
    public final boolean LJLJI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        int itemCount = this.LJLILLLLZI.getItemCount();
        if ((this.LJLJI && itemCount == 0) || !this.LJLIL) {
            return itemCount;
        }
        return itemCount + 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i == this.LJLILLLLZI.getItemCount() && this.LJLIL) {
            return LiveLayoutPreloadThreadPriority.DEFAULT;
        }
        return this.LJLILLLLZI.getItemViewType(i);
    }

    @Override // X.AbstractC42170Ggo, X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        boolean z;
        o.LJIIIZ(holder, "holder");
        super.onViewAttachedToWindow(holder);
        View view = holder.itemView;
        o.LJIIIIZZ(view, "holder.itemView");
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C1BZ)) {
            C1BZ c1bz = (C1BZ) layoutParams;
            if (getItemViewType(holder.getLayoutPosition()) == Integer.MIN_VALUE) {
                z = true;
            } else {
                z = false;
            }
            c1bz.LJLILLLLZI = z;
        }
    }

    public AbstractC42169Ggn(AbstractC45801HyH delegate, boolean z) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLILLLLZI = delegate;
        this.LJLJI = z;
        delegate.registerAdapterDataObserver(new C42168Ggm(this));
        this.LJLIL = true;
    }

    @Override // X.AbstractC42170Ggo
    public final int LJLLLLLL(int i, GridLayoutManager gridLayoutManager) {
        o.LJIIIZ(gridLayoutManager, "gridLayoutManager");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            return gridLayoutManager.LLIIIL;
        }
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = this.LJLILLLLZI;
        if (abstractC029409q instanceof AbstractC42170Ggo) {
            return ((AbstractC42170Ggo) abstractC029409q).LJLLLLLL(i, gridLayoutManager);
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            AbstractC42171Ggp abstractC42171Ggp = (AbstractC42171Ggp) this;
            abstractC42171Ggp.LJLZ(holder, abstractC42171Ggp.LJLJJI);
            holder.itemView.post(new ARunnableS43S0100000_7(abstractC42171Ggp, 93));
            return;
        }
        this.LJLILLLLZI.onBindViewHolder(holder, i);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder onCreateViewHolder;
        o.LJIIIZ(parent, "parent");
        if (Integer.MIN_VALUE == i) {
            onCreateViewHolder = ((AbstractC42171Ggp) this).LJZ(parent);
        } else {
            onCreateViewHolder = this.LJLILLLLZI.onCreateViewHolder(parent, i);
            o.LJIIIIZZ(onCreateViewHolder, "delegate.onCreateViewHolder(parent, viewType)");
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

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            onBindViewHolder(holder, i);
        } else {
            this.LJLILLLLZI.onBindViewHolder(holder, i, payloads);
        }
    }
}
