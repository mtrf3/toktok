package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.SoI, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73210SoI extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLIL;
    public final ArrayList<C73213SoL> LJLILLLLZI;
    public final ArrayList<C73213SoL> LJLJI;
    public final C0MB<C73213SoL> LJLJJI;
    public final C0MB<C73213SoL> LJLJJL;
    public final C61945OSv LJLJJLL;
    public final C73212SoK LJLJL;

    public final List<View> LJZI() {
        ArrayList<C73213SoL> arrayList = this.LJLILLLLZI;
        ArrayList arrayList2 = new ArrayList(C32I.LJJL(arrayList, 10));
        Iterator<C73213SoL> it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(it.next().itemView);
        }
        return arrayList2;
    }

    public final int LJZL() {
        return this.LJLILLLLZI.size();
    }

    public final void reset() {
        int size = this.LJLILLLLZI.size();
        int i = 1;
        if (1 <= size) {
            int i2 = 1;
            while (true) {
                LLFF(i2);
                if (i2 == size) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        int size2 = this.LJLJI.size();
        if (1 <= size2) {
            while (true) {
                LLD(i);
                if (i == size2) {
                    break;
                } else {
                    i++;
                }
            }
        }
        this.LJLILLLLZI.clear();
        this.LJLJI.clear();
        this.LJLJJI.LIZIZ();
        this.LJLJJL.LIZIZ();
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLIL.getItemCount() + this.LJLJI.size() + LJZL();
    }

    public C73210SoI(C8HS innerAdapter) {
        o.LJIIIZ(innerAdapter, "innerAdapter");
        this.LJLIL = innerAdapter;
        this.LJLILLLLZI = new ArrayList<>();
        this.LJLJI = new ArrayList<>();
        this.LJLJJI = new C0MB<>();
        this.LJLJJL = new C0MB<>();
        this.LJLJJLL = new C61945OSv();
        this.LJLJL = new C73212SoK(this);
        setHasStableIds(innerAdapter.mHasStableIds);
    }

    public final void LJLLLLLL(View view) {
        int size = this.LJLJI.size();
        if (size < 0 || size > this.LJLJI.size() || view == null) {
            return;
        }
        int LIZ = this.LJLJJLL.LIZ();
        C73213SoL c73213SoL = new C73213SoL(LIZ, view);
        this.LJLJI.add(c73213SoL);
        this.LJLJJL.LJI(LIZ, c73213SoL);
        notifyItemInserted((getItemCount() - this.LJLJI.size()) + size);
    }

    public final void LJZ(View view) {
        LJLZ(this.LJLILLLLZI.size(), view);
    }

    public final boolean LL(int i) {
        this.LJLJJLL.getClass();
        if (100000 <= i && i < 110001) {
            return true;
        }
        return false;
    }

    public final boolean LLD(int i) {
        if (i < 0 || i >= this.LJLJI.size()) {
            return false;
        }
        Object remove = ListProtector.remove(this.LJLJI, i);
        o.LJIIIIZZ(remove, "mFooterViewHolderList.removeAt(pos)");
        C73213SoL c73213SoL = (C73213SoL) remove;
        this.LJLJJL.LJII(c73213SoL.LJLIL);
        c73213SoL.setIsRecyclable(false);
        this.LJLJJLL.LIZIZ.addLast(Integer.valueOf(c73213SoL.LJLIL));
        notifyDataSetChanged();
        return true;
    }

    public final boolean LLF(View view) {
        int i = 0;
        if (view == null) {
            return false;
        }
        Iterator<C73213SoL> it = this.LJLJI.iterator();
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().itemView, view)) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        return LLD(i);
    }

    public final boolean LLFF(int i) {
        if (i < 0 || i >= this.LJLILLLLZI.size()) {
            return false;
        }
        Object remove = ListProtector.remove(this.LJLILLLLZI, i);
        o.LJIIIIZZ(remove, "mHeaderViewHolderList.removeAt(pos)");
        C73213SoL c73213SoL = (C73213SoL) remove;
        this.LJLJJI.LJII(c73213SoL.LJLIL);
        c73213SoL.setIsRecyclable(false);
        this.LJLJJLL.LIZIZ.addLast(Integer.valueOf(c73213SoL.LJLIL));
        notifyItemRemoved(i);
        return true;
    }

    public final void LLFFF(View view) {
        if (view == null) {
            return;
        }
        Iterator<C73213SoL> it = this.LJLILLLLZI.iterator();
        int i = 0;
        while (true) {
            if (it.hasNext()) {
                if (o.LJ(it.next().itemView, view)) {
                    break;
                } else {
                    i++;
                }
            } else {
                i = -1;
                break;
            }
        }
        LLFF(i);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (i < LJZL()) {
            return ((C73213SoL) ListProtector.get(this.LJLILLLLZI, i)).LJLIL;
        }
        if (i >= this.LJLIL.getItemCount() + LJZL()) {
            return ((C73213SoL) ListProtector.get(this.LJLJI, (i - LJZL()) - this.LJLIL.getItemCount())).LJLIL;
        }
        int itemViewType = this.LJLIL.getItemViewType(i - LJZL());
        if (!LL(itemViewType)) {
            return itemViewType;
        }
        throw new IllegalArgumentException("HeaderAndFooterWrapper use the viewType between 100000 and 110000");
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.onAttachedToRecyclerView(recyclerView);
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            GridLayoutManager gridLayoutManager = (GridLayoutManager) layoutManager;
            gridLayoutManager.LLJLILLLLZIIL(new C73211SoJ(this, gridLayoutManager, gridLayoutManager.LLIILII));
        }
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        this.LJLIL.onDetachedFromRecyclerView(recyclerView);
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LL(holder.getItemViewType())) {
            return super.onFailedToRecycleView(holder);
        }
        return this.LJLIL.onFailedToRecycleView(holder);
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LL(holder.getItemViewType())) {
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
        if (LL(holder.getItemViewType())) {
            super.onViewDetachedFromWindow(holder);
        } else {
            this.LJLIL.onViewDetachedFromWindow(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder holder) {
        o.LJIIIZ(holder, "holder");
        if (LL(holder.getItemViewType())) {
            super.onViewRecycled(holder);
        } else {
            this.LJLIL.onViewRecycled(holder);
        }
    }

    @Override // X.AbstractC029409q
    public final void registerAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.registerAdapterDataObserver(observer);
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = this.LJLIL;
        if (abstractC029409q != null) {
            try {
                abstractC029409q.unregisterAdapterDataObserver(this.LJLJL);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        this.LJLIL.registerAdapterDataObserver(this.LJLJL);
    }

    @Override // X.AbstractC029409q
    public final void unregisterAdapterDataObserver(AbstractC029609s observer) {
        o.LJIIIZ(observer, "observer");
        super.unregisterAdapterDataObserver(observer);
        this.LJLIL.unregisterAdapterDataObserver(this.LJLJL);
    }

    public final void LJLZ(int i, View view) {
        if (i < 0 || i > this.LJLILLLLZI.size() || view == null) {
            return;
        }
        int LIZ = this.LJLJJLL.LIZ();
        C73213SoL c73213SoL = new C73213SoL(LIZ, view);
        this.LJLILLLLZI.add(c73213SoL);
        this.LJLJJI.LJI(LIZ, c73213SoL);
        notifyItemInserted(i);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (i < LJZL()) {
            return;
        }
        if (i >= this.LJLIL.getItemCount() + LJZL()) {
            return;
        }
        this.LJLIL.onBindViewHolder(holder, i - LJZL());
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C73213SoL LJ = this.LJLJJI.LJ(i, null);
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
        if (i < LJZL()) {
            return;
        }
        if (i >= this.LJLIL.getItemCount() + LJZL()) {
            return;
        }
        this.LJLIL.onBindViewHolder(holder, i - LJZL(), payloads);
    }
}
