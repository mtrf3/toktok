package X;

import Y.IDComparatorS35S0000000_7;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.ies.abmock.SettingsManager;
import com.zhiliaoapp.musically.R;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.o;

/* renamed from: X.Ggi, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC42164Ggi<DATA> extends AbstractC42170Ggo {
    public final List<OSZ<Integer, DATA>> LJLIL;
    public final java.util.Map<Integer, DATA> LJLILLLLZI;
    public final AbstractC029409q<RecyclerView.ViewHolder> LJLJI;

    public abstract void LJLZ(RecyclerView.ViewHolder viewHolder, DATA data);

    public abstract RecyclerView.ViewHolder LJZ(ViewGroup viewGroup);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return LJZI(this.LJLJI.getItemCount() - 1) + 1;
    }

    public AbstractC42164Ggi(AbstractC029409q<RecyclerView.ViewHolder> delegate) {
        o.LJIIIZ(delegate, "delegate");
        this.LJLJI = delegate;
        this.LJLIL = new ArrayList();
        this.LJLILLLLZI = new LinkedHashMap();
        delegate.registerAdapterDataObserver(new C42165Ggj(this));
    }

    public final int LJZI(int i) {
        List<OSZ<Integer, DATA>> list = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        for (OSZ<Integer, DATA> osz : list) {
            if (osz.getFirst().intValue() < i) {
                arrayList.add(osz);
            }
        }
        return arrayList.size() + i;
    }

    public final int LJZL(int i) {
        java.util.Map<Integer, DATA> map = this.LJLILLLLZI;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : ((LinkedHashMap) map).entrySet()) {
            if (((Number) entry.getKey()).intValue() < i) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        return i - linkedHashMap.size();
    }

    public final void LL(List<? extends OSZ<Integer, ? extends DATA>> list) {
        ((ArrayList) this.LJLIL).clear();
        List<OSZ<Integer, DATA>> list2 = this.LJLIL;
        ArrayList arrayList = new ArrayList();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((Number) ((OSZ) next).getFirst()).intValue() >= 0) {
                arrayList.add(next);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Object next2 = it2.next();
            if (hashSet.add(Integer.valueOf(((Number) ((OSZ) next2).getFirst()).intValue()))) {
                arrayList2.add(next2);
            }
        }
        ((ArrayList) list2).addAll(arrayList2);
        ArrayList arrayList3 = (ArrayList) this.LJLIL;
        if (arrayList3.size() > 1) {
            C40675Fxn.LJJLIIIJ(arrayList3, new IDComparatorS35S0000000_7(4));
        }
        ((LinkedHashMap) this.LJLILLLLZI).clear();
        Iterator it3 = ((ArrayList) this.LJLIL).iterator();
        while (it3.hasNext()) {
            OSZ osz = (OSZ) it3.next();
            this.LJLILLLLZI.put(Integer.valueOf(this.LJLILLLLZI.size() + ((Number) osz.getFirst()).intValue() + 1), osz.getSecond());
        }
        notifyDataSetChanged();
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        if (((LinkedHashMap) this.LJLILLLLZI).keySet().contains(Integer.valueOf(i))) {
            return -2147483647;
        }
        return this.LJLJI.getItemViewType(LJZL(i));
    }

    @Override // X.AbstractC42170Ggo
    public final int LJLLLLLL(int i, GridLayoutManager gridLayoutManager) {
        o.LJIIIZ(gridLayoutManager, "gridLayoutManager");
        if (getItemViewType(i) == -2147483647) {
            return gridLayoutManager.LLIIIL;
        }
        AbstractC029409q<RecyclerView.ViewHolder> abstractC029409q = this.LJLJI;
        if (abstractC029409q instanceof AbstractC42170Ggo) {
            return ((AbstractC42170Ggo) abstractC029409q).LJLLLLLL(LJZL(i), gridLayoutManager);
        }
        return 1;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(RecyclerView.ViewHolder holder, int i) {
        o.LJIIIZ(holder, "holder");
        if (getItemViewType(i) == -2147483647) {
            Object obj = ((LinkedHashMap) this.LJLILLLLZI).get(Integer.valueOf(i));
            o.LJI(obj);
            LJLZ(holder, obj);
            return;
        }
        this.LJLJI.onBindViewHolder(holder, LJZL(i));
    }

    @Override // X.AbstractC029409q
    public final RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int i) {
        RecyclerView.ViewHolder onCreateViewHolder;
        o.LJIIIZ(parent, "parent");
        if (-2147483647 == i) {
            onCreateViewHolder = LJZ(parent);
        } else {
            onCreateViewHolder = this.LJLJI.onCreateViewHolder(parent, i);
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
        if (getItemViewType(i) == -2147483647) {
            onBindViewHolder(holder, i);
        } else {
            this.LJLJI.onBindViewHolder(holder, LJZL(i), payloads);
        }
    }
}
