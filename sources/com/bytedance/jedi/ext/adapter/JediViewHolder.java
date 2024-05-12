package com.bytedance.jedi.ext.adapter;

import X.AMF;
import X.AMK;
import X.AbstractC26082ALm;
import X.AbstractC73265SpB;
import X.C157166Eu;
import X.C221108m2;
import X.C31799Cdv;
import X.C37692Eqm;
import X.C5H3;
import X.C65352Pkq;
import X.C73139Sn9;
import X.C73140SnA;
import X.C73156SnQ;
import X.C73165SnZ;
import X.C73247Sot;
import X.C73254Sp0;
import X.C73264SpA;
import X.C76800UCe;
import X.InterfaceC115514g7;
import X.InterfaceC61312at;
import X.InterfaceC65350Pko;
import X.InterfaceC65784Pro;
import X.InterfaceC73141SnB;
import X.InterfaceC73149SnJ;
import X.InterfaceC73161SnV;
import X.InterfaceC74236TBo;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88473Ynt;
import X.InterfaceC88474Ynu;
import X.InterfaceC88475Ynv;
import X.InterfaceC88476Ynw;
import X.InterfaceC92693kP;
import X.InterfaceC98243tM;
import X.OSZ;
import X.TBT;
import X.TBW;
import X.TMF;
import X.TMG;
import X.W1T;
import android.view.View;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy;
import com.bytedance.mt.protector.impl.collections.ListProtector;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.AqS154S0100000_4;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class JediViewHolder<R extends InterfaceC98243tM, ITEM> extends AbstractC73265SpB<ITEM> implements GenericLifecycleObserver, LifecycleOwner, InterfaceC73161SnV<R> {
    public static final /* synthetic */ InterfaceC74236TBo[] $$delegatedProperties;
    public JediViewHolderProxy currentProxy;
    public boolean isResumed;
    public final C5H3 lifecycleRegistry$delegate;
    public LifecycleOwner parent;
    public C73254Sp0 provider;

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(JediViewHolder.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;");
        C65352Pkq.LIZ.getClass();
        $$delegatedProperties = new InterfaceC74236TBo[]{tbt};
    }

    private final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.lifecycleRegistry$delegate.getValue();
    }

    private final void moveToResumed() {
        this.isResumed = true;
        LifecycleOwner lifecycleOwner = this.parent;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().addObserver(this);
        } else {
            o.LJIJI("parent");
            throw null;
        }
    }

    private final void moveToResumedManually() {
        this.isResumed = true;
        int i = C31799Cdv.LIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 2) {
            if (i != 3) {
                return;
            }
            resume$ext_adapter_release();
        } else {
            start$ext_adapter_release();
            resume$ext_adapter_release();
        }
    }

    @Override // X.AbstractC73265SpB
    public final void bind(ITEM item, int i) {
    }

    @Override // X.InterfaceC73150SnK
    public boolean getUniqueOnlyGlobal() {
        return false;
    }

    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onItemUpdated$ext_adapter_release(List<Object> list) {
    }

    public void onPause() {
    }

    public void onResume() {
    }

    public void onStart() {
    }

    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            create$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            start$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_RESUME) {
            resume$ext_adapter_release();
            return;
        }
        if (event == Lifecycle.Event.ON_PAUSE) {
            pause$ext_adapter_release();
        } else if (event == Lifecycle.Event.ON_STOP) {
            stop$ext_adapter_release();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            destroy$ext_adapter_release();
        }
    }

    public void onStop() {
    }

    public void onViewHolderPrepared() {
    }

    private final C73247Sot getManager() {
        C73254Sp0 c73254Sp0 = this.provider;
        if (c73254Sp0 != null) {
            return c73254Sp0.LIZIZ;
        }
        o.LJIJI("provider");
        throw null;
    }

    private final void moveToStop() {
        LifecycleOwner lifecycleOwner = this.parent;
        if (lifecycleOwner != null) {
            lifecycleOwner.getLifecycle().removeObserver(this);
            moveToStopManually();
        } else {
            o.LJIJI("parent");
            throw null;
        }
    }

    public final LifecycleOwner getHost() {
        LifecycleOwner lifecycleOwner = this.parent;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        o.LJIJI("parent");
        throw null;
    }

    public final LifecycleOwner getParent$ext_adapter_release() {
        LifecycleOwner lifecycleOwner = this.parent;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        o.LJIJI("parent");
        throw null;
    }

    public final C73254Sp0 getProvider$ext_adapter_release() {
        C73254Sp0 c73254Sp0 = this.provider;
        if (c73254Sp0 != null) {
            return c73254Sp0;
        }
        o.LJIJI("provider");
        throw null;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    public final void pause$ext_adapter_release() {
        if (this.isResumed) {
            onPause();
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    public final void resume$ext_adapter_release() {
        if (this.isResumed) {
            onResume();
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void start$ext_adapter_release() {
        if (this.isResumed) {
            onStart();
            LifecycleRegistry lifecycleRegistry = getLifecycleRegistry();
            Lifecycle.Event event = Lifecycle.Event.ON_START;
            lifecycleRegistry.handleLifecycleEvent(event);
            JediViewHolderProxy jediViewHolderProxy = this.currentProxy;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.LJLILLLLZI) {
                jediViewHolderProxy.LJLIL = false;
                jediViewHolderProxy.LJLJJLL = true;
                jediViewHolderProxy.getLifecycleRegistry().handleLifecycleEvent(event);
            }
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void stop$ext_adapter_release() {
        if (this.isResumed) {
            onStop();
            LifecycleRegistry lifecycleRegistry = getLifecycleRegistry();
            Lifecycle.Event event = Lifecycle.Event.ON_STOP;
            lifecycleRegistry.handleLifecycleEvent(event);
            JediViewHolderProxy jediViewHolderProxy = this.currentProxy;
            if (jediViewHolderProxy != null && this == jediViewHolderProxy.LJLILLLLZI) {
                jediViewHolderProxy.LJLIL = false;
                jediViewHolderProxy.getLifecycleRegistry().handleLifecycleEvent(event);
            }
        }
    }

    private final boolean isItemOnCreateCalled() {
        C73247Sot manager = getManager();
        int i = this.latestItemPositionInternal;
        if (i >= 0) {
            if (i < ((ArrayList) manager.LIZ).size()) {
                return ((Boolean) ListProtector.get(manager.LIZ, i)).booleanValue();
            }
        } else {
            manager.getClass();
        }
        return false;
    }

    private final void moveToStopManually() {
        int i = C31799Cdv.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 1) {
            if (i == 2 || i == 3) {
                stop$ext_adapter_release();
            }
        } else {
            pause$ext_adapter_release();
            stop$ext_adapter_release();
        }
        this.isResumed = false;
    }

    @Override // X.AbstractC73265SpB
    public void attachToWindow() {
        super.attachToWindow();
        JediViewHolderProxy jediViewHolderProxy = this.currentProxy;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.LJLILLLLZI) {
            jediViewHolderProxy.LJLJI = false;
        }
        moveToResumedManually();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void create$ext_adapter_release() {
        if (!isItemOnCreateCalled()) {
            onCreate();
            getManager().LIZ(this.latestItemPositionInternal, true);
            getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void destroy$ext_adapter_release() {
        onDestroy();
        moveToStop();
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
    }

    @Override // X.AbstractC73265SpB
    public void detachFromWindow() {
        super.detachFromWindow();
        JediViewHolderProxy jediViewHolderProxy = this.currentProxy;
        if (jediViewHolderProxy != null && this == jediViewHolderProxy.LJLILLLLZI) {
            jediViewHolderProxy.LJLJI = true;
        }
        moveToStopManually();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73141SnB getLifecycleOwnerHolder() {
        AMK proxy = getProxy();
        if (proxy != null) {
            return proxy;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.arch.LifecycleOwnerHolder");
    }

    @Override // X.InterfaceC73150SnK
    public InterfaceC73149SnJ<R> getReceiverHolder() {
        AMK proxy = getProxy();
        if (proxy != null) {
            return proxy;
        }
        throw new C37692Eqm("null cannot be cast to non-null type com.bytedance.jedi.arch.ReceiverHolder<VH>");
    }

    @Override // X.InterfaceC73161SnV
    public AMK getProxy() {
        return this.currentProxy;
    }

    public final void prepare$ext_adapter_release() {
        onViewHolderPrepared();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public JediViewHolder(View view) {
        super(view);
        o.LJIIJ(view, "view");
        this.lifecycleRegistry$delegate = C221108m2.LIZIZ(new AqS154S0100000_4(this, 20));
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x001d, code lost:
    
        if (r2 != null) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    private final void bindProxy(int r7) {
        /*
            r6 = this;
            X.Sp0 r5 = r6.provider
            java.lang.String r4 = "provider"
            r3 = 0
            if (r5 == 0) goto L57
            X.Sop r1 = r5.LIZJ
            if (r7 < 0) goto L3c
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r0 = r1.LIZ
            java.util.ArrayList r0 = (java.util.ArrayList) r0
            int r0 = r0.size()
            if (r7 >= r0) goto L3f
            java.util.List<com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy> r0 = r1.LIZ
            java.lang.Object r2 = com.bytedance.mt.protector.impl.collections.ListProtector.get(r0, r7)
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = (com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy) r2
            if (r2 == 0) goto L3f
        L1f:
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r1 = r6.currentProxy
            if (r2 == r1) goto L32
            if (r1 == 0) goto L32
            com.bytedance.jedi.ext.adapter.JediViewHolder<? extends X.3tM, ?> r0 = r1.LJLILLLLZI
            if (r6 != r0) goto L32
            X.Sp0 r0 = r6.provider
            if (r0 == 0) goto L53
            X.Sow r0 = r0.LIZLLL
            r1.LIZ(r0, r3)
        L32:
            X.Sp0 r0 = r6.provider
            if (r0 == 0) goto L4f
            X.Sow r0 = r0.LIZLLL
            r2.LIZ(r0, r6)
            return
        L3c:
            r1.getClass()
        L3f:
            X.Sp5 r0 = r5.LIZ
            r0.getClass()
            com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy r2 = new com.bytedance.jedi.ext.adapter.internal.JediViewHolderProxy
            r2.<init>()
            X.Sop r0 = r5.LIZJ
            r0.LIZIZ(r7, r2)
            goto L1f
        L4f:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L53:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        L57:
            kotlin.jvm.internal.o.LJIJI(r4)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.jedi.ext.adapter.JediViewHolder.bindProxy(int):void");
    }

    private final void runResumed(InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (this.isResumed) {
            interfaceC65784Pro.invoke();
        }
    }

    public final void setParent$ext_adapter_release(LifecycleOwner lifecycleOwner) {
        o.LJIIJ(lifecycleOwner, "<set-?>");
        this.parent = lifecycleOwner;
    }

    public final void setProvider$ext_adapter_release(C73254Sp0 c73254Sp0) {
        o.LJIIJ(c73254Sp0, "<set-?>");
        this.provider = c73254Sp0;
    }

    @Override // X.InterfaceC73150SnK
    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, R> R withState(VM1 viewModel1, InterfaceC88472Yns<? super S1, ? extends R> block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(block, "block");
        return block.invoke(viewModel1.lv0());
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, InterfaceC88472Yns<? super PROP1, ? extends R> block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIJJ(middleware1, block);
    }

    @Override // X.AbstractC73265SpB
    public final void bind(ITEM item, int i, List<Object> list) {
        super.bind(item, i, list);
        if (list != null && !list.isEmpty()) {
            for (Object obj : list) {
                Object obj2 = null;
                if (!(obj instanceof OSZ)) {
                    obj = null;
                }
                OSZ osz = (OSZ) obj;
                if (osz != null) {
                    obj2 = osz.getSecond();
                }
                if (obj2 == C73264SpA.LIZ) {
                    break;
                }
            }
        }
        this.isResumed = true;
        moveToStop();
        bindProxy(i);
        moveToResumed();
        onItemUpdated$ext_adapter_release(list);
    }

    public final <VM extends JediViewModel<S>, S extends InterfaceC61312at> InterfaceC115514g7<Object, VM> provideViewModelDelegate(InterfaceC65350Pko<VM> viewModelClass, InterfaceC65784Pro<String> keyFactory, InterfaceC88472Yns<? super S, ? extends S> argumentsAcceptor) {
        o.LJIIJ(viewModelClass, "viewModelClass");
        o.LJIIJ(keyFactory, "keyFactory");
        o.LJIIJ(argumentsAcceptor, "argumentsAcceptor");
        return new AMF(this, keyFactory, viewModelClass, argumentsAcceptor);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at> InterfaceC92693kP subscribe(JediViewModel<S> subscribe, C73165SnZ<S> config, InterfaceC88471Ynr<? super R, ? super S, C76800UCe> subscriber) {
        o.LJIIJ(subscribe, "$this$subscribe");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LJIIJJI(this, subscribe, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, InterfaceC88471Ynr<? super S1, ? super S2, ? extends R> block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(block, "block");
        return block.invoke(viewModel1.lv0(), viewModel2.lv0());
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, InterfaceC88471Ynr<? super PROP1, ? super PROP2, ? extends R> block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIJI(middleware1, middleware2, block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void onItemUpdated$ext_adapter_release$default(JediViewHolder jediViewHolder, List list, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                list = null;
            }
            jediViewHolder.onItemUpdated$ext_adapter_release(list);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: onItemUpdated");
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super R, ? super A, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LIZJ(this, selectSubscribe, prop1, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, InterfaceC88473Ynt<? super S1, ? super S2, ? super S3, ? extends R> block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIILL(viewModel1, viewModel2, viewModel3, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, InterfaceC88473Ynt<? super PROP1, ? super PROP2, ? super PROP3, ? extends R> block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIJ(middleware1, middleware2, middleware3, block);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, C73165SnZ<TMG> config, InterfaceC88473Ynt<? super R, ? super A, ? super B, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LIZLLL(this, selectSubscribe, prop1, prop2, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, VM4 viewModel4, InterfaceC88474Ynu<? super S1, ? super S2, ? super S3, ? super S4, ? extends R> block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(viewModel4, "viewModel4");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIILJJIL(viewModel1, viewModel2, viewModel3, viewModel4, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, C73139Sn9<S4, PROP4> middleware4, InterfaceC88474Ynu<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? extends R> block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(middleware4, "middleware4");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIIZILJ(middleware1, middleware2, middleware3, middleware4, block);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, T> InterfaceC92693kP asyncSubscribe(JediViewModel<S> asyncSubscribe, TBW<S, ? extends AbstractC26082ALm<? extends T>> prop, C73165SnZ<C73140SnA> config, InterfaceC88471Ynr<? super R, ? super Throwable, C76800UCe> interfaceC88471Ynr, InterfaceC88472Yns<? super R, C76800UCe> interfaceC88472Yns, InterfaceC88471Ynr<? super R, ? super T, C76800UCe> interfaceC88471Ynr2) {
        o.LJIIJ(asyncSubscribe, "$this$asyncSubscribe");
        o.LJIIJ(prop, "prop");
        o.LJIIJ(config, "config");
        return C73156SnQ.LIZ(this, asyncSubscribe, prop, config, interfaceC88471Ynr, interfaceC88472Yns, interfaceC88471Ynr2);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, C73165SnZ<C157166Eu> config, InterfaceC88474Ynu<? super R, ? super A, ? super B, ? super C, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LJ(this, selectSubscribe, prop1, prop2, prop3, config, subscriber);
    }

    public <VM1 extends JediViewModel<S1>, S1 extends InterfaceC61312at, VM2 extends JediViewModel<S2>, S2 extends InterfaceC61312at, VM3 extends JediViewModel<S3>, S3 extends InterfaceC61312at, VM4 extends JediViewModel<S4>, S4 extends InterfaceC61312at, VM5 extends JediViewModel<S5>, S5 extends InterfaceC61312at, R> R withState(VM1 viewModel1, VM2 viewModel2, VM3 viewModel3, VM4 viewModel4, VM5 viewModel5, InterfaceC88475Ynv<? super S1, ? super S2, ? super S3, ? super S4, ? super S5, ? extends R> block) {
        o.LJIIJ(viewModel1, "viewModel1");
        o.LJIIJ(viewModel2, "viewModel2");
        o.LJIIJ(viewModel3, "viewModel3");
        o.LJIIJ(viewModel4, "viewModel4");
        o.LJIIJ(viewModel5, "viewModel5");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIILIIL(viewModel1, viewModel2, viewModel3, viewModel4, viewModel5, block);
    }

    public <M1 extends C73139Sn9<S1, PROP1>, PROP1 extends InterfaceC61312at, S1 extends InterfaceC61312at, M2 extends C73139Sn9<S2, PROP2>, PROP2 extends InterfaceC61312at, S2 extends InterfaceC61312at, M3 extends C73139Sn9<S3, PROP3>, PROP3 extends InterfaceC61312at, S3 extends InterfaceC61312at, M4 extends C73139Sn9<S4, PROP4>, PROP4 extends InterfaceC61312at, S4 extends InterfaceC61312at, M5 extends C73139Sn9<S5, PROP5>, PROP5 extends InterfaceC61312at, S5 extends InterfaceC61312at, R> R withSubstate(C73139Sn9<S1, PROP1> middleware1, C73139Sn9<S2, PROP2> middleware2, C73139Sn9<S3, PROP3> middleware3, C73139Sn9<S4, PROP4> middleware4, C73139Sn9<S5, PROP5> middleware5, InterfaceC88475Ynv<? super PROP1, ? super PROP2, ? super PROP3, ? super PROP4, ? super PROP5, ? extends R> block) {
        o.LJIIJ(middleware1, "middleware1");
        o.LJIIJ(middleware2, "middleware2");
        o.LJIIJ(middleware3, "middleware3");
        o.LJIIJ(middleware4, "middleware4");
        o.LJIIJ(middleware5, "middleware5");
        o.LJIIJ(block, "block");
        return (R) C73156SnQ.LJIILLIIL(middleware1, middleware2, middleware3, middleware4, middleware5, block);
    }

    @Override // X.InterfaceC73150SnK
    public <S extends InterfaceC61312at, A, B, C, D> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, C73165SnZ<W1T> config, InterfaceC88475Ynv<? super R, ? super A, ? super B, ? super C, ? super D, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LJFF(this, selectSubscribe, prop1, prop2, prop3, prop4, config, subscriber);
    }

    public <S extends InterfaceC61312at, A, B, C, D, E> InterfaceC92693kP selectSubscribe(JediViewModel<S> selectSubscribe, TBW<S, ? extends A> prop1, TBW<S, ? extends B> prop2, TBW<S, ? extends C> prop3, TBW<S, ? extends D> prop4, TBW<S, ? extends E> prop5, C73165SnZ<TMF> config, InterfaceC88476Ynw<? super R, ? super A, ? super B, ? super C, ? super D, ? super E, C76800UCe> subscriber) {
        o.LJIIJ(selectSubscribe, "$this$selectSubscribe");
        o.LJIIJ(prop1, "prop1");
        o.LJIIJ(prop2, "prop2");
        o.LJIIJ(prop3, "prop3");
        o.LJIIJ(prop4, "prop4");
        o.LJIIJ(prop5, "prop5");
        o.LJIIJ(config, "config");
        o.LJIIJ(subscriber, "subscriber");
        return C73156SnQ.LJI(this, selectSubscribe, prop1, prop2, prop3, prop4, prop5, config, subscriber);
    }
}
