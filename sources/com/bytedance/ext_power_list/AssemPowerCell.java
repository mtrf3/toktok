package com.bytedance.ext_power_list;

import X.ActivityC45651qj;
import X.C16880lQ;
import X.C214368bA;
import X.C221108m2;
import X.C3C8;
import X.C55230Lly;
import X.C62822Ol8;
import X.C8RL;
import X.C8VZ;
import X.C8X3;
import X.C8XE;
import X.C8XN;
import X.C8XO;
import X.C8XV;
import X.C8XX;
import X.C8XY;
import X.C8XZ;
import X.InterfaceC212978Xl;
import X.InterfaceC214448bI;
import X.InterfaceC55235Lm3;
import X.InterfaceC57784Mm4;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import androidx.recyclerview.widget.RecyclerView;
import com.bytedance.assem.arch.reused.ReusedAssem;
import com.bytedance.assem.arch.reused.ReusedUIAssem;
import com.bytedance.assem.arch.reused.ReusedUISlotAssem;
import com.bytedance.ies.powerlist.PowerAdapter;
import com.bytedance.ies.powerlist.PowerCell;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AssemPowerCell<ASSEM extends ReusedUISlotAssem<? extends C3C8>, T extends InterfaceC57784Mm4> extends PowerCell<T> implements C8XZ<PowerCell<T>, T> {
    public View LJLIL;
    public final C62822Ol8 LJLILLLLZI = C221108m2.LIZIZ(C8XX.LJLIL);
    public final C62822Ol8 LJLJI;
    public final C62822Ol8 LJLJJI;
    public ReusedUISlotAssem LJLJJL;
    public final ViewModelStore LJLJJLL;

    public abstract ASSEM L();

    @Override // X.C8VZ
    public final InterfaceC214448bI cq0() {
        return null;
    }

    @Override // X.C8XZ
    public final AssemReusedDispatcher<PowerCell<T>, T> LP() {
        return (AssemReusedDispatcher) this.LJLILLLLZI.getValue();
    }

    @Override // X.C8VZ
    public final View getContainerView() {
        View view = this.LJLIL;
        if (view != null) {
            return view;
        }
        o.LJIJI("containerView");
        throw null;
    }

    @Override // X.InterfaceC55100Ljs
    public ViewModelStoreOwner getViewModelStoreOwner() {
        return (ViewModelStoreOwner) this.LJLJJI.getValue();
    }

    public AssemPowerCell() {
        AssemReusedDispatcher<PowerCell<T>, T> LP = LP();
        Lifecycle lifecycle = getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        LP.getClass();
        lifecycle.addObserver(LP.LIZIZ);
        this.LJLJI = C221108m2.LIZIZ(C8XY.LJLIL);
        this.LJLJJI = C221108m2.LIZIZ(new AqS153S0100000_3((AssemPowerCell) this, 59));
        this.LJLJJLL = new ViewModelStore();
    }

    @Override // X.C8VZ
    public final LifecycleOwner GW() {
        return getParent();
    }

    @Override // X.C8VZ
    public final ActivityC45651qj getActivity() {
        Context context = getContainerView().getContext();
        o.LJII(context, "null cannot be cast to non-null type androidx.fragment.app.FragmentActivity");
        return (ActivityC45651qj) context;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC212998Xn
    public final InterfaceC212978Xl<PowerCell<T>, T> getChild() {
        LP().getClass();
        return new C8XN();
    }

    @Override // X.InterfaceC55100Ljs
    public InterfaceC55235Lm3 getParentScope() {
        ActivityC45651qj LLIFFJFJJ;
        Fragment LLIIII;
        InterfaceC55235Lm3 interfaceC55235Lm3;
        RecyclerView attachView$powerlist_release = getAttachView$powerlist_release();
        if (attachView$powerlist_release != null) {
            Object tag = attachView$powerlist_release.getTag(R.id.i0b);
            if ((tag instanceof InterfaceC55235Lm3) && (interfaceC55235Lm3 = (InterfaceC55235Lm3) tag) != null) {
                return interfaceC55235Lm3;
            }
        }
        PowerAdapter adapter$powerlist_release = getAdapter$powerlist_release();
        if (adapter$powerlist_release != null && (LLIIII = adapter$powerlist_release.LLIIII()) != null) {
            return C55230Lly.LIZJ(LLIIII, null);
        }
        PowerAdapter adapter$powerlist_release2 = getAdapter$powerlist_release();
        if (adapter$powerlist_release2 == null || (LLIFFJFJJ = adapter$powerlist_release2.LLIFFJFJJ()) == null) {
            return null;
        }
        return C55230Lly.LIZLLL(LLIFFJFJJ, null);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell, X.InterfaceC227608wW
    public final void onDestroy() {
        super.onDestroy();
        this.LJLJJLL.clear();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bytedance.ies.powerlist.PowerCell
    public final void unBind() {
        C8XO c8xo;
        super.unBind();
        ReusedUIAssem<?> reusedUIAssem = LP().LIZ;
        if (reusedUIAssem != 0) {
            C8XE c8xe = reusedUIAssem.LJLJLJ;
            if (c8xe != null) {
                c8xe.LJIIL();
            }
            if (C214368bA.LJIJJ) {
                ReusedAssem.I3(reusedUIAssem, C8X3.HOSTDETACH, false, false, 6);
                if ((reusedUIAssem instanceof C8XO) && (c8xo = (C8XO) reusedUIAssem) != null) {
                    c8xo.unBind();
                }
                reusedUIAssem.C3(C8XV.LJLIL);
            }
        }
    }

    @Override // X.C8XZ
    public final ViewModelStore Yb() {
        return this.LJLJJLL;
    }

    @Override // X.C8XZ
    public final ReusedUIAssem<?> Yz() {
        return this.LJLJJL;
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        N(getAdapterPosition(), t);
    }

    @Override // com.bytedance.ies.powerlist.PowerCell
    public View onCreateItemView(ViewGroup parent) {
        o.LJIIIZ(parent, "parent");
        ASSEM L = L();
        View LLLLIILL = C16880lQ.LLLLIILL(C16880lQ.LLZIL(parent.getContext()), L.W3(), parent, false);
        o.LJIIIIZZ(LLLLIILL, "from(parent.context).inf…          false\n        )");
        this.LJLIL = LLLLIILL;
        this.LJLJJL = L;
        M(L, getContainerView(), this);
        return getContainerView();
    }

    public void N(int i, T t) {
        if (getItem() != null) {
            tryObserveLifecycle();
            ReusedUIAssem<?> reusedUIAssem = LP().LIZ;
            if (reusedUIAssem != null) {
                C8XE c8xe = reusedUIAssem.LJLJLJ;
                if (c8xe != null) {
                    c8xe.LJIIJJI();
                }
                if (C214368bA.LJIJJ) {
                    ReusedAssem.I3(reusedUIAssem, C8X3.HOSTATTACH, false, true, 2);
                    reusedUIAssem.C3(new AqS169S0100000_3((C8RL) t, (C8RL) 705));
                }
            }
        }
    }

    public final void M(ReusedUIAssem<?> reusedUIAssem, View view, C8VZ component) {
        o.LJIIIZ(component, "component");
        LP().LIZ(this, reusedUIAssem, view, this, component);
    }
}
