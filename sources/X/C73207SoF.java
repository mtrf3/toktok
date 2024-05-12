package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SoF, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C73207SoF extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLIL;
    public RecyclerView LJLJL;
    public final ArrayList<C61942OSs> LJLILLLLZI = new ArrayList<>();
    public final ArrayList<C61942OSs> LJLJI = new ArrayList<>();
    public final C0MB<C61942OSs> LJLJJI = new C0MB<>();
    public final C0MB<C61942OSs> LJLJJL = new C0MB<>();
    public final C61940OSq LJLJJLL = new C61940OSq();
    public final C73208SoG LJLJLJ = new C73208SoG((C61938OSo) this);

    public final int LJLLLLLL() {
        return this.LJLILLLLZI.size();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.getItemCount() + this.LJLJI.size() + LJLLLLLL();
    }

    public C73207SoF(C56619MJz c56619MJz) {
        this.LJLIL = c56619MJz;
        setHasStableIds(c56619MJz.mHasStableIds);
    }

    public final boolean LJLZ(int i) {
        this.LJLJJLL.getClass();
        if (100000 <= i && i < 110001) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < LJLLLLLL()) {
            return ((C61942OSs) ListProtector.get(this.LJLILLLLZI, i)).LJLIL;
        }
        if (i >= this.LJLIL.getItemCount() + LJLLLLLL()) {
            return ((C61942OSs) ListProtector.get(this.LJLJI, (i - LJLLLLLL()) - this.LJLIL.getItemCount())).LJLIL;
        }
        int itemViewType = this.LJLIL.getItemViewType(i - LJLLLLLL());
        if (!LJLZ(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJL = recyclerView;
        this.LJLIL.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LLJLILLLLZIIL(new C73209SoH(this, gridLayoutManager, gridLayoutManager.LLIILII));
        }
    }

    @Override // X.AbstractC029409q
    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLJL = null;
        this.LJLIL.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LJLZ(holder.getItemViewType())) {
            return super.onFailedToRecycleView(holder);
        }
        return this.LJLIL.onFailedToRecycleView(holder);
    }

    @Override // X.AbstractC029409q
    public void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LJLZ(holder.getItemViewType())) {
            ViewGroup.LayoutParams layoutParams = holder.itemView.getLayoutParams();
            if (layoutParams instanceof C1BZ) {
                ((C1BZ) layoutParams).LJLILLLLZI = true;
                return;
            }
            return;
        }
        this.LJLIL.onViewAttachedToWindow(holder);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LJLZ(holder.getItemViewType())) {
            super.onViewDetachedFromWindow(holder);
        } else {
            this.LJLIL.onViewDetachedFromWindow(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LJLZ(holder.getItemViewType())) {
            super.onViewRecycled(holder);
        } else {
            this.LJLIL.onViewRecycled(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.registerAdapterDataObserver(observer);
        this.LJLIL.registerAdapterDataObserver(this.LJLJLJ);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
        this.LJLIL.unregisterAdapterDataObserver(this.LJLJLJ);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (i < LJLLLLLL()) {
            return;
        }
        if (i >= this.LJLIL.getItemCount() + LJLLLLLL()) {
            return;
        }
        this.LJLIL.onBindViewHolder(holder, i - LJLLLLLL());
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C61942OSs LJ = this.LJLJJI.LJ(i, null);
        if (LJ == null) {
            LJ = this.LJLJJL.LJ(i, null);
        }
        if (LJ == null) {
            LJ = this.LJLIL.onCreateViewHolder(parent, i);
            o.LJIIIIZZ(LJ, "innerAdapter.onCreateViewHolder(parent, viewType)");
        }
        C0AX.LIZ(parent, LJ.itemView, R.id.lj7);
        View view = LJ.itemView;
        if (view != null) {
            view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
        }
        try {
            if (LJ.itemView.getParent() != null) {
                boolean z = true;
                try {
                    SettingsManager.LIZLLL().getClass();
                    z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                } catch (Exception unused) {
                }
                if (z) {
                    StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                    stringBuffer.append(LJ.getClass().getName());
                    stringBuffer.append(" parent ");
                    stringBuffer.append(parent.getClass().getName());
                    stringBuffer.append(" viewType ");
                    stringBuffer.append(i);
                    C78983UzD.LJIILL(stringBuffer.toString());
                    ViewGroup viewGroup = (ViewGroup) LJ.itemView.getParent();
                    if (viewGroup != null) {
                        C16880lQ.LJLLL(LJ.itemView, viewGroup);
                    }
                }
            }
        } catch (Exception e) {
            C78946Uyc.LIZIZ(e);
            C36922EeM.LIZ(e);
        }
        C29127Bbv.LIZ = LJ.getClass().getName();
        return LJ;
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (i < LJLLLLLL()) {
            return;
        }
        if (i >= this.LJLIL.getItemCount() + LJLLLLLL()) {
            return;
        }
        this.LJLIL.onBindViewHolder(holder, i - LJLLLLLL(), payloads);
    }
}
