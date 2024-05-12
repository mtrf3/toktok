package X;

import Y.IDcS10S0200000_12;
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
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.Spf, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public abstract class AbstractC73295Spf<T> extends AbstractC029409q<C73365Sqn<T>> {
    public final C73275SpL<T, C73365Sqn<T>> LJLIL;
    public List<T> LJLILLLLZI;
    public int LJLJI;
    public T LJLJJI;
    public final T4I<T> LJLJJL;
    public final TE0 LJLJJLL;

    public abstract void LJLLLLLL(C73365Sqn<T> c73365Sqn);

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJLILLLLZI.size() + 2;
    }

    public final int LJLZ(T t) {
        return this.LJLJJL.L4(t);
    }

    public C73365Sqn<T> LJZL(ViewGroup parent) {
        InterfaceC88472Yns<? super ViewGroup, ? extends View> interfaceC88472Yns;
        o.LJIIIZ(parent, "parent");
        TE0 te0 = this.LJLJJLL;
        if (te0 != null && (interfaceC88472Yns = te0.LJLLJ) != null) {
            return new C73365Sqn<>(interfaceC88472Yns.invoke(parent));
        }
        return new C238669Yg(parent, 10);
    }

    public void LL(C73275SpL c73275SpL) {
        c73275SpL.LIZ(C57362My.LJLIL, new AqS178S0100000_12((AbstractC73295Spf) this, 642));
        c73275SpL.LIZ(new AqS178S0100000_12((AbstractC73295Spf) this, 643), new AqS178S0100000_12((AbstractC73295Spf) this, 644));
    }

    public T getItem(int i) {
        if (i >= getItemCount()) {
            return null;
        }
        List<T> list = this.LJLILLLLZI;
        int i2 = 0;
        if (list == null || list.isEmpty()) {
            return null;
        }
        int min = Math.min(i - 1, this.LJLILLLLZI.size() - 1);
        List<T> list2 = this.LJLILLLLZI;
        if (min >= 0) {
            i2 = min;
        }
        return (T) ListProtector.get(list2, i2);
    }

    @Override // X.AbstractC029409q
    public final int getItemViewType(int i) {
        C72813Sht<C73365Sqn<T>> c72813Sht;
        C73275SpL<T, C73365Sqn<T>> c73275SpL = this.LJLIL;
        Iterator<C72813Sht<C73365Sqn<T>>> it = c73275SpL.LIZJ.iterator();
        while (true) {
            if (it.hasNext()) {
                c72813Sht = it.next();
                if (c72813Sht.LIZIZ.invoke(Integer.valueOf(i)).booleanValue()) {
                    break;
                }
            } else {
                c72813Sht = null;
                break;
            }
        }
        C72813Sht<C73365Sqn<T>> c72813Sht2 = c72813Sht;
        if (c72813Sht2 != null) {
            InterfaceC88472Yns<ViewGroup, C73365Sqn<T>> interfaceC88472Yns = c72813Sht2.LIZ;
            int i2 = c72813Sht2.LIZJ;
            if (c73275SpL.LIZIZ.get(i2) == null) {
                c73275SpL.LIZIZ.put(i2, interfaceC88472Yns);
            }
            return i2;
        }
        "no factory is registered for this item type".toString();
        throw new IllegalArgumentException("no factory is registered for this item type");
    }

    @Override // X.AbstractC029409q
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        o.LJIIIZ(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        TE0 te0 = this.LJLJJLL;
        if (te0 != null && te0.LJLLL) {
            return;
        }
        C0A2 layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            ((GridLayoutManager) layoutManager).LLJLILLLLZIIL(new IDcS10S0200000_12(this, layoutManager, 3));
        }
    }

    public AbstractC73295Spf(T4I<T> listViewModel, TE0 te0) {
        o.LJIIIZ(listViewModel, "listViewModel");
        this.LJLJJL = listViewModel;
        this.LJLJJLL = te0;
        C73275SpL<T, C73365Sqn<T>> c73275SpL = new C73275SpL<>();
        LL(c73275SpL);
        this.LJLIL = c73275SpL;
        this.LJLILLLLZI = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    /* renamed from: LJZ, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C73365Sqn<T> holder, int i) {
        o.LJIIIZ(holder, "holder");
        T item = getItem(i);
        if (item != 0) {
            OSZ<TEA, Integer> oQ = this.LJLJJL.oQ(item, C82894Wg6.LIZIZ.LJIIJ());
            TEA state = oQ.getFirst();
            Integer second = oQ.getSecond();
            int i2 = this.LJLJI;
            o.LJIIIZ(state, "state");
            holder.LJLIL = item;
            holder.LJLILLLLZI = i2;
            holder.L(i, item);
            holder.M(item, state, second);
        }
    }

    @Override // X.AbstractC029409q
    /* renamed from: onCreateViewHolder */
    public final RecyclerView.ViewHolder com_ss_android_ugc_aweme_ecommerce_core_view_speclayoutv2_SpecItemAdapterV2__onCreateViewHolder$___twin___(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        C73275SpL<T, C73365Sqn<T>> c73275SpL = this.LJLIL;
        c73275SpL.getClass();
        boolean z = true;
        if (c73275SpL.LIZIZ.indexOfKey(i) >= 0) {
            InterfaceC88472Yns<ViewGroup, C73365Sqn<T>> interfaceC88472Yns = c73275SpL.LIZIZ.get(i);
            o.LJIIIIZZ(interfaceC88472Yns, "factories[viewType]");
            C73365Sqn<T> invoke = interfaceC88472Yns.invoke(parent);
            LJLLLLLL(invoke);
            C0AX.LIZ(parent, invoke.itemView, R.id.lj7);
            View view = invoke.itemView;
            if (view != null) {
                view.setTag(R.id.bq7, C79234V7u.LJIIIZ(parent));
            }
            try {
                if (invoke.itemView.getParent() != null) {
                    try {
                        SettingsManager.LIZLLL().getClass();
                        z = SettingsManager.LIZ("catch_onCreateViewHolder_crash", true);
                    } catch (Exception unused) {
                    }
                    if (z) {
                        StringBuffer stringBuffer = new StringBuffer("onCreateViewHolder getParent() != null crash hook, holder ");
                        stringBuffer.append(invoke.getClass().getName());
                        stringBuffer.append(" parent ");
                        stringBuffer.append(parent.getClass().getName());
                        stringBuffer.append(" viewType ");
                        stringBuffer.append(i);
                        C78983UzD.LJIILL(stringBuffer.toString());
                        ViewGroup viewGroup = (ViewGroup) invoke.itemView.getParent();
                        if (viewGroup != null) {
                            C16880lQ.LJLLL(invoke.itemView, viewGroup);
                        }
                    }
                }
            } catch (Exception e) {
                C78946Uyc.LIZIZ(e);
                C36922EeM.LIZ(e);
            }
            C29127Bbv.LIZ = invoke.getClass().getName();
            return invoke;
        }
        String LIZIZ = C0NY.LIZIZ("no factory for viewType ", i, " is registered");
        LIZIZ.toString();
        throw new IllegalArgumentException(LIZIZ);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [DATA, java.lang.Object] */
    @Override // X.AbstractC029409q
    /* renamed from: LJZI, reason: merged with bridge method [inline-methods] */
    public void onBindViewHolder(C73365Sqn<T> holder, int i, List<Object> payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (!payloads.isEmpty()) {
            ?? LJLLLL = ORZ.LJLLLL(payloads);
            OSZ<TEA, Integer> oQ = this.LJLJJL.oQ(LJLLLL, C82894Wg6.LIZIZ.LJIIJ());
            TEA state = oQ.getFirst();
            Integer second = oQ.getSecond();
            o.LJIIIZ(state, "state");
            holder.LJLIL = LJLLLL;
            holder.M(LJLLLL, state, second);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
