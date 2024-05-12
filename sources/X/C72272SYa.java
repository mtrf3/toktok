package X;

import Y.IDLListenerS9S0300000_8;
import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import com.bytedance.tiktok.sdk.powerviewpager.FragmentPageSelectedManager;
import com.bytedance.tiktok.sdk.powerviewpager.item.PowerViewPagerFragmentItem;
import java.lang.ref.WeakReference;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.AqS158S0100000_8;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* renamed from: X.SYa, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72272SYa extends FragmentStateAdapter implements C0AK, Observer<MZ9> {
    public final RecyclerView LJLL;
    public final LifecycleOwner LJLLI;
    public final FragmentManager LJLLILLLL;
    public final FragmentPageSelectedManager LJLLJ;
    public int LJLLL;
    public C57939MoZ LJLLLL;
    public C8ZV LJLLLLLL;
    public SYU LJLZ;
    public int LJZ;
    public final List<PowerViewPagerFragmentItem<?>> LJZI;
    public final List<Integer> LJZL;
    public final List<PowerViewPagerFragmentItem<?>> LL;
    public boolean LLD;
    public final C72808Sho<InterfaceC57784Mm4> LLF;
    public final C62822Ol8 LLFF;
    public final C62822Ol8 LLFFF;
    public final C73849Syb<C57939MoZ> LLFII;
    public final SZJ LLFZ;

    @Override // X.AbstractC029409q
    public final int getItemCount() {
        return this.LJZI.size();
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final boolean LJLZ(long j) {
        List<PowerViewPagerFragmentItem<?>> list = this.LJZI;
        if ((list instanceof Collection) && list.isEmpty()) {
            return false;
        }
        Iterator<PowerViewPagerFragmentItem<?>> it = list.iterator();
        while (it.hasNext()) {
            if (it.next().hashCode() == j) {
                return true;
            }
        }
        return false;
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter
    public final Fragment LJZ(int i) {
        Type type;
        PowerViewPagerFragmentItem<?> item = LLF(i);
        if (item == null || (type = item.getClass().getGenericSuperclass()) == null || !(type instanceof ParameterizedType)) {
            type = null;
        }
        o.LJII(type, "null cannot be cast to non-null type java.lang.reflect.ParameterizedType");
        Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
        o.LJII(type2, "null cannot be cast to non-null type java.lang.Class<out androidx.fragment.app.Fragment>");
        Fragment fragment = (Fragment) ((Class) type2).newInstance();
        Bundle bundle = new Bundle();
        bundle.putParcelable("power_viewpager_default_key", item);
        fragment.setArguments(bundle);
        FragmentPageSelectedManager fragmentPageSelectedManager = this.LJLLJ;
        fragmentPageSelectedManager.getClass();
        o.LJIIIZ(item, "item");
        fragment.getLifecycle().addObserver(fragmentPageSelectedManager);
        fragmentPageSelectedManager.LJLILLLLZI.put(item, new WeakReference<>(fragment));
        return fragment;
    }

    public final PowerViewPagerFragmentItem<?> LLF(int i) {
        if (i < 0 || i >= getItemCount()) {
            return null;
        }
        return (PowerViewPagerFragmentItem) ListProtector.get(this.LJZI, i);
    }

    public final synchronized void LLFF(boolean z) {
        boolean z2;
        int i = this.LJLLL;
        if (i >= 0 && i < ((ArrayList) this.LL).size() && this.LJLLL < ((ArrayList) this.LJZI).size()) {
            List<PowerViewPagerFragmentItem<?>> list = this.LL;
            boolean z3 = true;
            if (!(list instanceof Collection) || !list.isEmpty()) {
                Iterator<PowerViewPagerFragmentItem<?>> it = list.iterator();
                while (it.hasNext()) {
                    if (it.next().hashCode() == ((PowerViewPagerFragmentItem) ListProtector.get(this.LJZI, this.LJLLL)).hashCode()) {
                        z2 = true;
                        break;
                    }
                }
            }
            z2 = false;
            List<PowerViewPagerFragmentItem<?>> list2 = this.LJZI;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator<PowerViewPagerFragmentItem<?>> it2 = list2.iterator();
                while (it2.hasNext()) {
                    if (it2.next().hashCode() == ((PowerViewPagerFragmentItem) ListProtector.get(this.LL, this.LJLLL)).hashCode()) {
                        break;
                    }
                }
            }
            z3 = false;
            if (((PowerViewPagerFragmentItem) ListProtector.get(this.LL, this.LJLLL)).hashCode() != ((PowerViewPagerFragmentItem) ListProtector.get(this.LJZI, this.LJLLL)).hashCode() && !z3 && !z2) {
                List<PowerViewPagerFragmentItem<?>> list3 = this.LL;
                int i2 = this.LJLLL;
                ListProtector.set(list3, i2, ListProtector.get(this.LJZI, i2));
                notifyItemChanged(this.LJLLL);
            }
        }
        LLFFF(z);
    }

    public final void LLFFF(boolean z) {
        C8ZW c8zw;
        List<PowerViewPagerFragmentItem<?>> list = this.LJZI;
        this.LLFZ.LIZJ(z, this.LJZL, this.LL, list);
        ((ArrayList) this.LL).clear();
        ((ArrayList) this.LL).addAll(list);
        ((ArrayList) this.LJZL).clear();
        int size = ((ArrayList) this.LL).size();
        for (int i = 0; i < size; i++) {
            ((ArrayList) this.LJZL).add(Integer.valueOf(ListProtector.get(this.LL, i).hashCode()));
        }
        C8ZV c8zv = this.LJLLLLLL;
        if (c8zv != null) {
            c8zw = c8zv.LJFF;
        } else {
            c8zw = null;
        }
        if (c8zw == C8ZW.FRAGMENTS_NO_DESTROY) {
            int i2 = this.LJZ;
            int size2 = ((ArrayList) this.LJZI).size();
            if (i2 < size2) {
                i2 = size2;
            }
            this.LJZ = i2;
            this.LJLL.setItemViewCacheSize(i2);
        }
    }

    @Override // androidx.viewpager2.adapter.FragmentStateAdapter, X.AbstractC029409q
    public final long getItemId(int i) {
        return ListProtector.get(this.LJZI, i).hashCode();
    }

    @Override // androidx.lifecycle.Observer
    public final void onChanged(MZ9 mz9) {
        int i;
        MZ9 content = mz9;
        o.LJIIIZ(content, "content");
        ((ArrayList) this.LJZI).clear();
        for (Object obj : content.LJLIL) {
            if (obj instanceof PowerViewPagerFragmentItem) {
                ((ArrayList) this.LJZI).add(obj);
            }
        }
        if (!this.LLD) {
            C8ZV c8zv = this.LJLLLLLL;
            int i2 = 0;
            if (c8zv != null && (i = c8zv.LJ) > 0 && i < ((ArrayList) this.LJZI).size()) {
                List LLJILJILJ = ORZ.LLJILJILJ(this.LJZI);
                ((ArrayList) this.LJZI).clear();
                Iterator it = ((ArrayList) LLJILJILJ).iterator();
                while (it.hasNext()) {
                    Object next = it.next();
                    int i3 = i2 + 1;
                    if (i2 >= 0) {
                        if (i2 >= i) {
                            ((ArrayList) this.LJZI).add(next);
                        }
                        i2 = i3;
                    } else {
                        C47261Igj.LJJJJJ();
                        throw null;
                    }
                }
                LLFF(content.LJLJI);
                RecyclerView recyclerView = this.LJLL;
                recyclerView.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS9S0300000_8(recyclerView, this, LLJILJILJ, 0));
            } else {
                LLFF(content.LJLJI);
            }
            this.LLD = true;
            return;
        }
        LLFF(content.LJLJI);
    }

    @Override // X.C0AK
    public final void LJJIJLIJ(int i, int i2) {
        notifyItemRangeRemoved(i, i2);
    }

    @Override // X.C0AK
    public final void LJLIIIL(int i, int i2) {
        notifyItemRangeInserted(i, i2);
    }

    @Override // X.C0AK
    public final void LJLJLLL(int i, int i2) {
        notifyItemMoved(i, i2);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C72272SYa(RecyclerView recyclerView, LifecycleOwner lifecycleOwner, FragmentManager fm) {
        super(fm, lifecycleOwner.getLifecycle());
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(fm, "fm");
        this.LJLL = recyclerView;
        this.LJLLI = lifecycleOwner;
        this.LJLLILLLL = fm;
        this.LJLLJ = new FragmentPageSelectedManager(this);
        this.LJLLL = -1;
        this.LJLZ = SYU.Default;
        this.LJZI = new ArrayList();
        this.LJZL = new ArrayList();
        this.LL = new ArrayList();
        this.LLF = new C72808Sho<>();
        C221108m2.LIZIZ(C48968JJs.LJLIL);
        this.LLFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 461));
        this.LLFFF = C221108m2.LIZIZ(new AqS158S0100000_8(this, 460));
        C62822Ol8 LIZIZ = C221108m2.LIZIZ(new AqS162S0100000_12(this, 997));
        C73849Syb<C57939MoZ> LJJZZI = C73849Syb.LJJZZI(new C57939MoZ());
        this.LLFII = LJJZZI;
        this.LLFZ = new SZJ(recyclerView, this, (SZ0) LIZIZ.getValue(), LJJZZI, new AqS162S0100000_12(this, 996));
    }

    @Override // X.C0AK
    public final void LJJLIIIJILLIZJL(int i, int i2, Object obj) {
        notifyItemRangeChanged(i, i2, obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.AbstractC029409q
    public final void onBindViewHolder(C29091Cf holder, int i, List payloads) {
        o.LJIIIZ(holder, "holder");
        o.LJIIIZ(payloads, "payloads");
        if (!payloads.isEmpty()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append('f');
            LIZ.append(holder.getItemId());
            Fragment LJJJIL = this.LJLLILLLL.LJJJIL(X1D.LIZIZ(LIZ));
            if (LJJJIL != 0) {
                FragmentPageSelectedManager fragmentPageSelectedManager = this.LJLLJ;
                Object item = ListProtector.get(this.LJZI, i);
                fragmentPageSelectedManager.getClass();
                o.LJIIIZ(item, "item");
                LJJJIL.getLifecycle().addObserver(fragmentPageSelectedManager);
                fragmentPageSelectedManager.LJLILLLLZI.put(item, new WeakReference(LJJJIL));
                Lifecycle.State currentState = LJJJIL.getLifecycle().getCurrentState();
                Lifecycle.State state = Lifecycle.State.RESUMED;
                if (currentState.isAtLeast(state)) {
                    ((C8ZK) LJJJIL).u7((InterfaceC57784Mm4) ListProtector.get(this.LJZI, i), state, payloads);
                    return;
                }
                Lifecycle.State currentState2 = LJJJIL.getLifecycle().getCurrentState();
                Lifecycle.State state2 = Lifecycle.State.STARTED;
                if (currentState2.isAtLeast(state2)) {
                    ((C8ZK) LJJJIL).u7((InterfaceC57784Mm4) ListProtector.get(this.LJZI, i), state2, payloads);
                    return;
                } else if (LJJJIL.getLifecycle().getCurrentState().isAtLeast(Lifecycle.State.INITIALIZED)) {
                    Bundle bundle = new Bundle();
                    bundle.putParcelable("power_viewpager_default_key", LLF(i));
                    LJJJIL.setArguments(bundle);
                    return;
                }
            }
            super.onBindViewHolder(holder, i, payloads);
            return;
        }
        super.onBindViewHolder(holder, i, payloads);
    }
}
