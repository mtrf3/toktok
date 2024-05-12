package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggk, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42166Ggk extends AbstractC42170Ggo {
    public boolean LJLIL;
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLILLLLZI;
    public final boolean LJLJI;

    public abstract void LJZ(RecyclerView.ViewHolder viewHolder);

    public abstract RecyclerView.ViewHolder LJZI(ViewGroup viewGroup);

    public final int LJLZ() {
        int itemCount = this.LJLILLLLZI.getItemCount();
        if ((this.LJLJI && itemCount == 0) || !this.LJLIL) {
            return 0;
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJLZ() + this.LJLILLLLZI.getItemCount();
    }

    public AbstractC42166Ggk(AbstractC029409q delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLILLLLZI = delegate;
        this.LJLJI = true;
        delegate.registerAdapterDataObserver(new C42167Ggl(this));
        this.LJLIL = true;
    }

    public final void LJZL(boolean z) {
        if (this.LJLIL == z) {
            return;
        }
        if (this.LJLJI && this.LJLILLLLZI.getItemCount() == 0) {
            return;
        }
        this.LJLIL = z;
        if (z) {
            notifyItemInserted(0);
        } else {
            notifyItemRemoved(0);
        }
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (this.LJLIL && i == 0) {
            return -2147483646;
        }
        return this.LJLILLLLZI.getItemViewType(i - LJLZ());
    }

    @Override // X.AbstractC42170Ggo
    public final int LJLLLLLL(int i, GridLayoutManager gridLayoutManager) {
        o.LJIIIZ(gridLayoutManager, "gridLayoutManager");
        if (getItemViewType(i) == -2147483646) {
            return gridLayoutManager.LLIIIL;
        }
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = this.LJLILLLLZI;
        if (abstractC029409q instanceof AbstractC42170Ggo) {
            return ((AbstractC42170Ggo) abstractC029409q).LJLLLLLL(i - LJLZ(), gridLayoutManager);
        }
        return 1;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (getItemViewType(i) == -2147483646) {
            LJZ(holder);
        } else {
            this.LJLILLLLZI.onBindViewHolder(holder, i - LJLZ());
        }
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder onCreateViewHolder;
        o.LJIIIZ(parent, "parent");
        if (-2147483646 == i) {
            onCreateViewHolder = LJZI(parent);
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
        if (getItemViewType(i) == -2147483646) {
            onBindViewHolder(holder, i);
        } else {
            this.LJLILLLLZI.onBindViewHolder(holder, i - LJLZ(), payloads);
        }
    }
}
