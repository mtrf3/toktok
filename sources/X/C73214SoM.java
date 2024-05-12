package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;

/* renamed from: X.SoM, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73214SoM extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final AbstractC029409q LJLJI;
    public final C0MB<View> LJLIL = new C0MB<>();
    public final C0MB<View> LJLILLLLZI = new C0MB<>();
    public final C73216SoO LJLJJI = new C73216SoO(this);

    public final int LJLLLLLL() {
        return this.LJLIL.LJIIIIZZ();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.LJIIIIZZ() + this.LJLJI.getItemCount() + LJLLLLLL();
    }

    public C73214SoM(C45658Hvy c45658Hvy) {
        this.LJLJI = c45658Hvy;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < LJLLLLLL()) {
            return this.LJLIL.LJFF(i);
        }
        if (this.LJLJI.getItemCount() + LJLLLLLL() < i) {
            return this.LJLILLLLZI.LJFF((i - LJLLLLLL()) - this.LJLJI.getItemCount());
        }
        return this.LJLJI.getItemViewType(i - LJLLLLLL());
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        this.LJLJI.onAttachedToRecyclerView(recyclerView);
        C73217SoP c73217SoP = new C73217SoP(this);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LLJLILLLLZIIL(new C73215SoN(c73217SoP, gridLayoutManager, gridLayoutManager.LLIILII));
            gridLayoutManager.LLJLIL(gridLayoutManager.LLIIIL);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.LJLJI.onViewAttachedToWindow(viewHolder);
        int layoutPosition = viewHolder.getLayoutPosition();
        if (layoutPosition >= LJLLLLLL()) {
            if (this.LJLJI.getItemCount() + LJLLLLLL() >= layoutPosition) {
                return;
            }
        }
        ViewGroup.LayoutParams layoutParams = viewHolder.itemView.getLayoutParams();
        if (layoutParams != null && (layoutParams instanceof C1BZ)) {
            ((C1BZ) layoutParams).LJLILLLLZI = true;
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s abstractC029609s) {
        super.registerAdapterDataObserver(abstractC029609s);
        this.LJLJI.registerAdapterDataObserver(this.LJLJJI);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s abstractC029609s) {
        super.unregisterAdapterDataObserver(abstractC029609s);
        this.LJLJI.unregisterAdapterDataObserver(this.LJLJJI);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        if (i < LJLLLLLL()) {
            return;
        }
        if (this.LJLJI.getItemCount() + LJLLLLLL() < i) {
            return;
        }
        this.LJLJI.onBindViewHolder(viewHolder, i - LJLLLLLL());
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        RecyclerView.ViewHolder onCreateViewHolder;
        if (this.LJLIL.LJ(i, null) != null) {
            viewGroup.getContext();
            onCreateViewHolder = new C73218SoQ(this.LJLIL.LJ(i, null));
            onCreateViewHolder.setIsRecyclable(false);
        } else if (this.LJLILLLLZI.LJ(i, null) != null) {
            viewGroup.getContext();
            onCreateViewHolder = new C73218SoQ(this.LJLILLLLZI.LJ(i, null));
            onCreateViewHolder.setIsRecyclable(false);
        } else {
            onCreateViewHolder = this.LJLJI.onCreateViewHolder(viewGroup, i);
        }
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
