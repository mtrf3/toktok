package com.bytedance.assem.arch.core;

import X.AbstractC72932td;
import X.C16880lQ;
import X.C213178Yf;
import X.C213198Yh;
import X.C214368bA;
import X.C33Q;
import X.C3C8;
import X.C56412MCa;
import X.C76800UCe;
import X.C7TL;
import X.C8V1;
import X.C8V8;
import X.C8VV;
import X.C8W0;
import X.C8W1;
import X.C8YM;
import X.C8YN;
import X.C8YZ;
import X.InterfaceC212408Vg;
import X.InterfaceC212848Wy;
import X.InterfaceC222288nw;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.OSK;
import X.OSL;
import X.OSM;
import X.TBW;
import android.view.View;
import androidx.lifecycle.LifecycleOwner;
import com.bytedance.assem.arch.viewModel.AssemViewModel;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS150S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class UIAssem extends C8W0 implements C8YM<UIAssem>, InterfaceC212848Wy<UIAssem>, C3C8, C8YZ {
    public boolean _isViewValid;
    public View containerView;
    public boolean isAssemViewCreated;
    public boolean isOnCreateViewCalled;
    public final CopyOnWriteArrayList<InterfaceC212408Vg> onAssemContainerViewSetListener = new CopyOnWriteArrayList<>();

    @Override // X.C8YZ
    public LifecycleOwner getActualLifecycleOwner() {
        return this;
    }

    @Override // X.C8YM
    public C8YZ getActualLifecycleOwnerHolder() {
        return this;
    }

    @Override // X.InterfaceC212848Wy
    /* renamed from: getActualReceiver, reason: avoid collision after fix types in other method */
    public UIAssem getActualReceiver2() {
        return this;
    }

    @Override // X.C8YM
    public InterfaceC212848Wy<UIAssem> getActualReceiverHolder() {
        return this;
    }

    @Override // X.C8YM
    public LifecycleOwner getHostLifecycleOwner() {
        return null;
    }

    @Override // X.C8YM
    public UIAssem getReceiverForHostVM() {
        return null;
    }

    @Override // X.C8YM
    public boolean getUniqueOnlyDefault() {
        return true;
    }

    public abstract void onCreateView();

    private final void handleOnCreateView() {
        if (this.isOnCreateViewCalled) {
            return;
        }
        this.isOnCreateViewCalled = true;
        track$assem_release(C8W1.ON_CREATE_VIEW, new AqS153S0100000_3(this, 16));
    }

    public void assembleChildren() {
        C8VV.LIZJ(this, new AqS169S0100000_3(this, 54));
    }

    public View getContainerView() {
        View view = this.containerView;
        if (view != null) {
            return view;
        }
        o.LJIJI("containerView");
        throw null;
    }

    public final boolean isContainerViewAssigned() {
        if (this.containerView != null) {
            return true;
        }
        return false;
    }

    @Override // X.C8W0
    public C7TL<? extends UIAssem> getConfig() {
        C8V1<? extends C8W0> config = super.getConfig();
        o.LJII(config, "null cannot be cast to non-null type com.bytedance.assem.arch.core.UIAssemConfig<out com.bytedance.assem.arch.core.UIAssem>");
        return (C7TL) config;
    }

    @Override // X.C8W0
    public final void handleOnParentViewCreated$assem_release() {
        onParentViewCreated();
        handleOnCreateView();
    }

    @Override // X.C8W0
    public void onCreate() {
        super.onCreate();
        if (getSupervisor().LJLLL != null) {
            handleOnCreateView();
        }
        this._isViewValid = true;
    }

    @Override // X.C8W0
    public void onDestroy() {
        super.onDestroy();
        this._isViewValid = false;
    }

    @Override // X.InterfaceC212848Wy
    public /* bridge */ /* synthetic */ UIAssem getActualReceiver() {
        getActualReceiver2();
        return this;
    }

    @Override // X.C8YM
    public LifecycleOwner getOwnLifecycleOwner() {
        getActualLifecycleOwner();
        return this;
    }

    @Override // X.C8W0
    public boolean isAssemViewCreated$assem_release() {
        return this.isAssemViewCreated;
    }

    public final void addOnAssemContainerViewSetListener$assem_release(InterfaceC212408Vg listener) {
        o.LJIIIZ(listener, "listener");
        this.onAssemContainerViewSetListener.addIfAbsent(listener);
    }

    @Override // X.C8W0
    public void didUpdateConfig(C8V1<? extends C8W0> oldConfig) {
        o.LJIIIZ(oldConfig, "oldConfig");
        C8VV.LIZJ(this, new AqS134S0200000_3(this, (UIAssem) oldConfig, (C8V1<? extends C8W0>) 27));
    }

    public final void handleOnViewCreated(View view) {
        o.LJIIIZ(view, "view");
        C8V8 c8v8 = C214368bA.LJII;
        if (c8v8 != null) {
            C16880lQ.LJLLJ(getClass());
            c8v8.LIZIZ("assem_onviewcreated_");
        }
        track$assem_release(C8W1.ON_VIEW_CREATED, new AqS150S0200000_3(this, view, 11));
        C8V8 c8v82 = C214368bA.LJII;
        if (c8v82 != null) {
            c8v82.end(C16880lQ.LJLLJ(getClass()), "assem_onviewcreated_");
        }
    }

    public final void onContainerViewSet(View view) {
        Iterator<InterfaceC212408Vg> it = this.onAssemContainerViewSetListener.iterator();
        while (it.hasNext()) {
            it.next().LIZ(view);
        }
    }

    public void onViewCreated(View view) {
        o.LJIIIZ(view, "view");
        assembleChildren();
    }

    public final void removeOnAssemContainerViewSetListener$assem_release(InterfaceC212408Vg listener) {
        o.LJIIIZ(listener, "listener");
        this.onAssemContainerViewSetListener.remove(listener);
    }

    @Override // X.C8W0
    public void setAssemViewCreated$assem_release(boolean z) {
        this.isAssemViewCreated = z;
    }

    @Override // X.C8W0
    public void setConfig(C8V1<? extends C8W0> v) {
        o.LJIIIZ(v, "v");
        super.setConfig(v);
    }

    public void setContainerView(View view) {
        o.LJIIIZ(view, "<set-?>");
        this.containerView = view;
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, R> R withState(VM1 vm1, InterfaceC88472Yns<? super S1, ? extends R> interfaceC88472Yns) {
        return (R) C8YN.LJIJI(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q> void withStateSafe(VM1 vm1, InterfaceC88472Yns<? super S1, C76800UCe> interfaceC88472Yns) {
        C8YN.LJIJJ(vm1, interfaceC88472Yns);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> interfaceC88471Ynr) {
        return (R) C8YN.LJIJ(vm1, vm2, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q> InterfaceC222288nw subscribe(AssemViewModel<S> assemViewModel, C56412MCa<S> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super UIAssem, ? super S, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LJIILL(this, assemViewModel, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <VM1 extends AssemViewModel<S1>, S1 extends C33Q, VM2 extends AssemViewModel<S2>, S2 extends C33Q, VM3 extends AssemViewModel<S3>, S3 extends C33Q, R> R withState(VM1 vm1, VM2 vm2, VM3 vm3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> interfaceC88473Ynt) {
        return (R) C8YN.LJIIZILJ(vm1, vm2, vm3, interfaceC88473Ynt);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super UIAssem, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LIZLLL(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    @Override // X.C8YM
    public <S extends C33Q, A> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, C56412MCa<C213178Yf<A>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super UIAssem, ? super A, C76800UCe> interfaceC88471Ynr) {
        return C8YN.LJIILIIL(this, assemViewModel, tbw, c56412MCa, interfaceC88472Yns, interfaceC88471Ynr);
    }

    public <S extends C33Q, T> InterfaceC222288nw asyncSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends AbstractC72932td<? extends T>> tbw, C56412MCa<C213178Yf<AbstractC72932td<T>>> c56412MCa, InterfaceC88471Ynr<? super UIAssem, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super UIAssem, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super UIAssem, ? super T, C76800UCe> interfaceC88471Ynr2) {
        return C8YN.LIZ(this, assemViewModel, tbw, c56412MCa, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88473Ynt<? super UIAssem, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C8YN.LIZJ(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    public <S extends C33Q, A, B> InterfaceC222288nw selectSubscribeOnAsync(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, C56412MCa<C213198Yh<A, B>> c56412MCa, InterfaceC88473Ynt<? super UIAssem, ? super A, ? super B, C76800UCe> interfaceC88473Ynt) {
        return C8YN.LJIIL(assemViewModel, this, c56412MCa, interfaceC88472Yns, interfaceC88473Ynt, tbw, tbw2);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, C56412MCa<OSK<A, B, C>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88474Ynu<? super UIAssem, ? super A, ? super B, ? super C, C76800UCe> interfaceC88474Ynu) {
        return C8YN.LJ(this, assemViewModel, tbw, tbw2, tbw3, c56412MCa, interfaceC88472Yns, interfaceC88474Ynu);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, C56412MCa<OSL<A, B, C, D>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88475Ynv<? super UIAssem, ? super A, ? super B, ? super C, ? super D, C76800UCe> interfaceC88475Ynv) {
        return C8YN.LJFF(this, assemViewModel, tbw, tbw2, tbw3, tbw4, c56412MCa, interfaceC88472Yns, interfaceC88475Ynv);
    }

    @Override // X.C8YM
    public <S extends C33Q, A, B, C, D, E> InterfaceC222288nw selectSubscribe(AssemViewModel<S> assemViewModel, TBW<S, ? extends A> tbw, TBW<S, ? extends B> tbw2, TBW<S, ? extends C> tbw3, TBW<S, ? extends D> tbw4, TBW<S, ? extends E> tbw5, C56412MCa<OSM<A, B, C, D, E>> c56412MCa, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88476Ynw<? super UIAssem, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> interfaceC88476Ynw) {
        return C8YN.LJI(this, assemViewModel, tbw, tbw2, tbw3, tbw4, tbw5, c56412MCa, interfaceC88472Yns, interfaceC88476Ynw);
    }
}
