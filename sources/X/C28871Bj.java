package X;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.zhiliaoapp.musically.R;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* renamed from: X.1Bj, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C28871Bj extends AbstractC029409q<RecyclerView.ViewHolder> {
    public final C28881Bk LJLIL;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    public final List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> LJLZ() {
        ?? arrayList;
        C28881Bk c28881Bk = this.LJLIL;
        if (((ArrayList) c28881Bk.LJ).isEmpty()) {
            arrayList = Collections.emptyList();
        } else {
            arrayList = new ArrayList(((ArrayList) c28881Bk.LJ).size());
            Iterator it = ((ArrayList) c28881Bk.LJ).iterator();
            while (it.hasNext()) {
                arrayList.add(((C0AQ) it.next()).LIZJ);
            }
        }
        return Collections.unmodifiableList(arrayList);
    }

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        Iterator it = ((ArrayList) this.LJLIL.LJ).iterator();
        int i = 0;
        while (it.hasNext()) {
            i += ((C0AQ) it.next()).LJ;
        }
        return i;
    }

    public C28871Bj(List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> list) {
        this(C03040Aa.LIZJ, list);
    }

    public final boolean LJLLLLLL(AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q) {
        C28881Bk c28881Bk = this.LJLIL;
        return c28881Bk.LIZ(((ArrayList) c28881Bk.LJ).size(), abstractC029409q);
    }

    public final void LJZ(EnumC029309p enumC029309p) {
        super.setStateRestorationPolicy(enumC029309p);
    }

    public final void LJZI(AbstractC029409q abstractC029409q) {
        C28881Bk c28881Bk = this.LJLIL;
        int LJFF = c28881Bk.LJFF(abstractC029409q);
        if (LJFF == -1) {
            return;
        }
        C0AQ c0aq = (C0AQ) ListProtector.get(c28881Bk.LJ, LJFF);
        int LIZJ = c28881Bk.LIZJ(c0aq);
        ListProtector.remove(c28881Bk.LJ, LJFF);
        c28881Bk.LIZ.notifyItemRangeRemoved(LIZJ, c0aq.LJ);
        Iterator it = ((ArrayList) c28881Bk.LIZJ).iterator();
        while (it.hasNext()) {
            RecyclerView recyclerView = (RecyclerView) ((Reference) it.next()).get();
            if (recyclerView != null) {
                abstractC029409q.onDetachedFromRecyclerView(recyclerView);
            }
        }
        c0aq.LIZJ.unregisterAdapterDataObserver(c0aq.LJFF);
        c0aq.LIZ.dispose();
        c28881Bk.LIZIZ();
    }

    @Override // X.AbstractC029409q
    public final long getItemId(int i) {
        C28881Bk c28881Bk = this.LJLIL;
        C03060Ac LIZLLL = c28881Bk.LIZLLL(i);
        C0AQ c0aq = LIZLLL.LIZ;
        long LIZ = c0aq.LIZIZ.LIZ(c0aq.LIZJ.getItemId(LIZLLL.LIZIZ));
        LIZLLL.LIZJ = false;
        LIZLLL.LIZ = null;
        LIZLLL.LIZIZ = -1;
        c28881Bk.LJFF = LIZLLL;
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C28881Bk c28881Bk = this.LJLIL;
        C03060Ac LIZLLL = c28881Bk.LIZLLL(i);
        C0AQ c0aq = LIZLLL.LIZ;
        int LIZ = c0aq.LIZ.LIZ(c0aq.LIZJ.getItemViewType(LIZLLL.LIZIZ));
        LIZLLL.LIZJ = false;
        LIZLLL.LIZ = null;
        LIZLLL.LIZIZ = -1;
        c28881Bk.LJFF = LIZLLL;
        return LIZ;
    }

    @Override // X.AbstractC029409q
    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C28881Bk c28881Bk = this.LJLIL;
        Iterator it = ((ArrayList) c28881Bk.LIZJ).iterator();
        while (it.hasNext()) {
            if (((Reference) it.next()).get() == recyclerView) {
                return;
            }
        }
        ((ArrayList) c28881Bk.LIZJ).add(new WeakReference(recyclerView));
        Iterator it2 = ((ArrayList) c28881Bk.LJ).iterator();
        while (it2.hasNext()) {
            ((C0AQ) it2.next()).LIZJ.onAttachedToRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC029409q
    public final void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C28881Bk c28881Bk = this.LJLIL;
        int size = ((ArrayList) c28881Bk.LIZJ).size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            Reference reference = (Reference) ListProtector.get(c28881Bk.LIZJ, size);
            if (reference.get() == null) {
                ListProtector.remove(c28881Bk.LIZJ, size);
            } else if (reference.get() == recyclerView) {
                ListProtector.remove(c28881Bk.LIZJ, size);
                break;
            }
        }
        Iterator it = ((ArrayList) c28881Bk.LJ).iterator();
        while (it.hasNext()) {
            ((C0AQ) it.next()).LIZJ.onDetachedFromRecyclerView(recyclerView);
        }
    }

    @Override // X.AbstractC029409q
    public final boolean onFailedToRecycleView(RecyclerView.ViewHolder viewHolder) {
        C28881Bk c28881Bk = this.LJLIL;
        C0AQ c0aq = c28881Bk.LIZLLL.get(viewHolder);
        if (c0aq != null) {
            boolean onFailedToRecycleView = c0aq.LIZJ.onFailedToRecycleView(viewHolder);
            c28881Bk.LIZLLL.remove(viewHolder);
            return onFailedToRecycleView;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot find wrapper for ");
        LIZ.append(viewHolder);
        LIZ.append(", seems like it is not bound by this adapter: ");
        LIZ.append(c28881Bk);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC029409q
    public final void onViewAttachedToWindow(RecyclerView.ViewHolder viewHolder) {
        this.LJLIL.LJ(viewHolder).LIZJ.onViewAttachedToWindow(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewDetachedFromWindow(RecyclerView.ViewHolder viewHolder) {
        this.LJLIL.LJ(viewHolder).LIZJ.onViewDetachedFromWindow(viewHolder);
    }

    @Override // X.AbstractC029409q
    public final void onViewRecycled(RecyclerView.ViewHolder viewHolder) {
        C28881Bk c28881Bk = this.LJLIL;
        C0AQ c0aq = c28881Bk.LIZLLL.get(viewHolder);
        if (c0aq != null) {
            c0aq.LIZJ.onViewRecycled(viewHolder);
            c28881Bk.LIZLLL.remove(viewHolder);
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Cannot find wrapper for ");
        LIZ.append(viewHolder);
        LIZ.append(", seems like it is not bound by this adapter: ");
        LIZ.append(c28881Bk);
        throw new IllegalStateException(X1D.LIZIZ(LIZ));
    }

    @Override // X.AbstractC029409q
    public final void setHasStableIds(boolean z) {
        throw new UnsupportedOperationException("Calling setHasStableIds is not allowed on the ConcatAdapter. Use the Config object passed in the constructor to control this behavior");
    }

    @Override // X.AbstractC029409q
    public final void setStateRestorationPolicy(EnumC029309p enumC029309p) {
        throw new UnsupportedOperationException("Calling setStateRestorationPolicy is not allowed on the ConcatAdapter. This value is inferred from added adapters");
    }

    public C28871Bj(AbstractC029409q<? extends RecyclerView.ViewHolder>... abstractC029409qArr) {
        this(C03040Aa.LIZJ, abstractC029409qArr);
    }

    public C28871Bj(C03040Aa c03040Aa, List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> list) {
        boolean z;
        this.LJLIL = new C28881Bk(this, c03040Aa);
        Iterator<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>> it = list.iterator();
        while (it.hasNext()) {
            LJLLLLLL(it.next());
        }
        if (this.LJLIL.LJI != C0AZ.NO_STABLE_IDS) {
            z = true;
        } else {
            z = false;
        }
        super.setHasStableIds(z);
    }

    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder viewHolder, int i) {
        C28881Bk c28881Bk = this.LJLIL;
        C03060Ac LIZLLL = c28881Bk.LIZLLL(i);
        c28881Bk.LIZLLL.put(viewHolder, LIZLLL.LIZ);
        C0AQ c0aq = LIZLLL.LIZ;
        c0aq.LIZJ.bindViewHolder(viewHolder, LIZLLL.LIZIZ);
        LIZLLL.LIZJ = false;
        LIZLLL.LIZ = null;
        LIZLLL.LIZIZ = -1;
        c28881Bk.LJFF = LIZLLL;
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        C0AQ LIZ = this.LJLIL.LIZIZ.LIZ(i);
        RecyclerView.ViewHolder onCreateViewHolder = LIZ.LIZJ.onCreateViewHolder(viewGroup, LIZ.LIZ.LIZIZ(i));
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

    public C28871Bj(C03040Aa c03040Aa, AbstractC029409q<? extends RecyclerView.ViewHolder>... abstractC029409qArr) {
        this(c03040Aa, (List<? extends AbstractC029409q<? extends RecyclerView.ViewHolder>>) Arrays.asList(abstractC029409qArr));
    }

    @Override // X.AbstractC029409q
    public final int findRelativeAdapterPositionIn(AbstractC029409q<? extends RecyclerView.ViewHolder> abstractC029409q, RecyclerView.ViewHolder viewHolder, int i) {
        C28881Bk c28881Bk = this.LJLIL;
        C0AQ c0aq = c28881Bk.LIZLLL.get(viewHolder);
        if (c0aq == null) {
            return -1;
        }
        int LIZJ = i - c28881Bk.LIZJ(c0aq);
        int itemCount = c0aq.LIZJ.getItemCount();
        if (LIZJ >= 0 && LIZJ < itemCount) {
            return c0aq.LIZJ.findRelativeAdapterPositionIn(abstractC029409q, viewHolder, LIZJ);
        }
        StringBuilder LIZJ2 = C06460Ne.LIZJ("Detected inconsistent adapter updates. The local position of the view holder maps to ", LIZJ, " which is out of bounds for the adapter with size ", itemCount, ".Make sure to immediately call notify methods in your adapter when you change the backing dataviewHolder:");
        LIZJ2.append(viewHolder);
        LIZJ2.append("adapter:");
        LIZJ2.append(abstractC029409q);
        throw new IllegalStateException(X1D.LIZIZ(LIZJ2));
    }
}
