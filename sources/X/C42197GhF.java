package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.GhF, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C42197GhF extends AbstractC029409q<RecyclerView.ViewHolder> {
    public AbstractC029409q LJLIL;
    public C42198GhG LJLILLLLZI;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            return abstractC029409q.getItemCount();
        }
        return 0;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        return this.LJLIL.getItemViewType(i);
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            abstractC029409q.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            abstractC029409q.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            return abstractC029409q.onFailedToRecycleView(viewHolder);
        }
        return super.onFailedToRecycleView(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewAttachedToWindow(viewHolder);
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            abstractC029409q.onViewAttachedToWindow(viewHolder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        super.onViewDetachedFromWindow(viewHolder);
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            abstractC029409q.onViewDetachedFromWindow(viewHolder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        super.onViewRecycled(viewHolder);
        AbstractC029409q abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            abstractC029409q.onViewRecycled(viewHolder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        this.LJLIL.onBindViewHolder(viewHolder, i);
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder onCreateViewHolder = this.LJLIL.onCreateViewHolder(viewGroup, i);
        C0AX.LIZ(viewGroup, onCreateViewHolder.itemView, R.id.lj7);
        View view = onCreateViewHolder.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(viewGroup));
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
                    stringBuffer.append(viewGroup.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup2 = (ViewGroup) onCreateViewHolder.itemView.getParent();
                    if (viewGroup2 != null) {
                        C16880lQ.LJLLL(onCreateViewHolder.itemView, viewGroup2);
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
}
