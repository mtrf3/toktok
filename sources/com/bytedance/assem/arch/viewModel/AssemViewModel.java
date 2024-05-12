package com.bytedance.assem.arch.viewModel;

import X.AbstractC72932td;
import X.AbstractC73547Stj;
import X.AbstractC73638SvC;
import X.AbstractC73672Svk;
import X.C16880lQ;
import X.C213178Yf;
import X.C213688a4;
import X.C214198at;
import X.C214208au;
import X.C214218av;
import X.C214368bA;
import X.C221108m2;
import X.C226098u5;
import X.C33Q;
import X.C48841JEv;
import X.C55258LmQ;
import X.C56412MCa;
import X.C5H3;
import X.C63242e0;
import X.C63252e1;
import X.C65352Pkq;
import X.C65777Prh;
import X.C73318Sq2;
import X.C73461SsL;
import X.C75814TpC;
import X.C76800UCe;
import X.C7C3;
import X.C88508YoS;
import X.C8K7;
import X.C8VA;
import X.C8WI;
import X.C8YR;
import X.C8YS;
import X.EnumC221088m0;
import X.InterfaceC214228aw;
import X.InterfaceC48038ItG;
import X.InterfaceC64592gB;
import X.InterfaceC65784Pro;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.InterfaceC88472Yns;
import X.InterfaceC88763e4;
import X.InterfaceC92693kP;
import X.SZE;
import X.TBW;
import X.XKX;
import Y.IDhS94S0100000_1;
import android.util.SparseArray;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.ViewModel;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.AqS0S0700000_3;
import kotlin.jvm.internal.AqS134S0200000_3;
import kotlin.jvm.internal.AqS153S0100000_3;
import kotlin.jvm.internal.AqS169S0100000_3;
import kotlin.jvm.internal.AqS20S0500000_3;
import kotlin.jvm.internal.AqS49S0400000_3;
import kotlin.jvm.internal.AqS7S0600000_3;
import kotlin.jvm.internal.AqS92S0300000_3;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class AssemViewModel<S extends C33Q> extends ViewModel implements LifecycleOwner {
    public volatile boolean _initialized;
    public Object _item;
    public final C226098u5 assemVMScope$delegate;
    public final C5H3 disposables$delegate;
    public C7C3 hierarchyDataStore;
    public C8VA hierarchyServiceStore;
    public S initialState;
    public final C226098u5 internalAssemVMScope$delegate;
    public final boolean isHolderVM;
    public InterfaceC88472Yns<Object, C76800UCe> itemSync2StateCallback;
    public WeakReference<Lifecycle> lifecycleRef;
    public final C5H3 mainThreadVMScope$delegate;
    public long maxScheduledGeneration;
    public Object onItemChangeCallback;
    public final SparseArray<InterfaceC214228aw<?>> repos;
    public InterfaceC88471Ynr<Object, ? super S, ? extends Object> syncState2Item;
    public boolean useOwnerLifecycle;
    public boolean usedInReusedScene;
    public C8YR<S> vmDispatcher;

    public static /* synthetic */ void getAssemVMScope$annotations() {
    }

    public static /* synthetic */ void getHierarchyDataStore$annotations() {
    }

    public static /* synthetic */ void getHierarchyServiceStore$annotations() {
    }

    public static /* synthetic */ void getVmDispatcher$annotations() {
    }

    public abstract S defaultState();

    public void onPrepared() {
    }

    private final C73318Sq2 getDisposables() {
        return (C73318Sq2) this.disposables$delegate.getValue();
    }

    private final InterfaceC70422pa getMainThreadVMScope() {
        return (InterfaceC70422pa) this.mainThreadVMScope$delegate.getValue();
    }

    public final InterfaceC70422pa getAssemVMScope() {
        return (InterfaceC70422pa) this.assemVMScope$delegate.getValue();
    }

    public final InterfaceC70422pa getInternalAssemVMScope$assem_release() {
        return (InterfaceC70422pa) this.internalAssemVMScope$delegate.getValue();
    }

    public final WeakReference<Lifecycle> getLifecycleRef() {
        WeakReference<Lifecycle> weakReference = this.lifecycleRef;
        if (weakReference != null) {
            return weakReference;
        }
        o.LJIJI("lifecycleRef");
        throw null;
    }

    public final C8YR<S> getVmDispatcher() {
        C8YR<S> c8yr = this.vmDispatcher;
        if (c8yr != null) {
            return c8yr;
        }
        o.LJIJI("vmDispatcher");
        throw null;
    }

    @Override // androidx.lifecycle.ViewModel
    public void onCleared() {
        C7C3 c7c3 = this.hierarchyDataStore;
        if (c7c3 != null) {
            ((LinkedHashMap) c7c3.LIZIZ).clear();
        }
        C8VA c8va = this.hierarchyServiceStore;
        if (c8va != null) {
            ((LinkedHashMap) c8va.LIZIZ).clear();
            ((LinkedHashMap) c8va.LIZJ).clear();
        }
        int size = this.repos.size();
        for (int i = 0; i < size; i++) {
            InterfaceC214228aw<?> interfaceC214228aw = this.repos.get(i);
            if (interfaceC214228aw != null) {
                interfaceC214228aw.release();
            }
        }
        C48841JEv.LIZJ(getAssemVMScope(), null);
        C48841JEv.LIZJ(getInternalAssemVMScope$assem_release(), null);
        C48841JEv.LIZJ(getMainThreadVMScope(), null);
        getDisposables().LIZLLL();
        if (this.vmDispatcher != null) {
            getVmDispatcher().LJIIZILJ();
        }
        super.onCleared();
    }

    public AssemViewModel() {
        Executor executor = C214368bA.LJJIFFI;
        this.assemVMScope$delegate = new C226098u5(executor == null ? C214368bA.LIZ() : executor);
        this.internalAssemVMScope$delegate = new C226098u5(C214368bA.LIZ());
        this.mainThreadVMScope$delegate = C221108m2.LIZ(EnumC221088m0.NONE, C55258LmQ.INSTANCE);
        this.disposables$delegate = C221108m2.LIZIZ(C214218av.LJLIL);
        this.repos = new SparseArray<>();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        Lifecycle lifecycle = getLifecycleRef().get();
        if (lifecycle != null) {
            return lifecycle;
        }
        "Required value was null.".toString();
        throw new IllegalArgumentException("Required value was null.");
    }

    public final S getState() {
        return getVmDispatcher().getState();
    }

    public boolean isHolderVM() {
        return this.isHolderVM;
    }

    /* renamed from: getState */
    public /* bridge */ /* synthetic */ C75814TpC m66getState() {
        return (C75814TpC) getState();
    }

    public final InterfaceC92693kP disposeOnClear(InterfaceC92693kP interfaceC92693kP) {
        o.LJIIIZ(interfaceC92693kP, "<this>");
        getDisposables().LIZ(interfaceC92693kP);
        return interfaceC92693kP;
    }

    public <OPT extends InterfaceC88763e4> void putCreatedRepository(InterfaceC214228aw<OPT> assemRepository) {
        o.LJIIIZ(assemRepository, "assemRepository");
        SparseArray<InterfaceC214228aw<?>> sparseArray = this.repos;
        sparseArray.put(sparseArray.size(), assemRepository);
    }

    public final void runOnUIThread(InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe> task) {
        o.LJIIIZ(task, "task");
        XKX.LIZLLL(getMainThreadVMScope(), null, null, new C63242e0(task, null), 3);
    }

    public final void runOnWorkThread(InterfaceC88472Yns<? super InterfaceC70422pa, C76800UCe> task) {
        o.LJIIIZ(task, "task");
        XKX.LIZLLL(getAssemVMScope(), null, null, new C63252e1(task, null), 3);
    }

    public final void setLifecycleRef(WeakReference<Lifecycle> weakReference) {
        o.LJIIIZ(weakReference, "<set-?>");
        this.lifecycleRef = weakReference;
    }

    public final void setState(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIIZ(reducer, "reducer");
        getVmDispatcher().LIZ(new AqS134S0200000_3(this, reducer, 31));
    }

    public final void setStateImmediate(InterfaceC88472Yns<? super S, ? extends S> reducer) {
        o.LJIIIZ(reducer, "reducer");
        getVmDispatcher().LJI(reducer);
    }

    public final void setVmDispatcher(C8YR<S> c8yr) {
        o.LJIIIZ(c8yr, "<set-?>");
        this.vmDispatcher = c8yr;
    }

    public final void withState(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        getVmDispatcher().LJII(block);
    }

    public final void withStateImmediate(InterfaceC88472Yns<? super S, C76800UCe> block) {
        o.LJIIIZ(block, "block");
        block.invoke(getVmDispatcher().getState());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC92693kP execute(AbstractC73638SvC<T> abstractC73638SvC, InterfaceC88471Ynr<? super S, ? super AbstractC72932td<? extends T>, ? extends S> stateReducer) {
        o.LJIIIZ(abstractC73638SvC, "<this>");
        o.LJIIIZ(stateReducer, "stateReducer");
        AbstractC73672Svk<T> LJJIIJZLJL = abstractC73638SvC.LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "toObservable()");
        return execute(LJJIIJZLJL, C214198at.LJLIL, stateReducer);
    }

    public final void initialize(C8YR<S> dispatcher, InterfaceC88472Yns<? super S, ? extends S> argsAcceptor) {
        o.LJIIIZ(dispatcher, "dispatcher");
        o.LJIIIZ(argsAcceptor, "argsAcceptor");
        if (this.initialState == null) {
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) this, 56), false);
            C8WI.LIZ(new AqS92S0300000_3(this, argsAcceptor, dispatcher, 0));
            C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) this, 57), false);
        }
    }

    public final InterfaceC92693kP execute(AbstractC73547Stj abstractC73547Stj, InterfaceC88471Ynr<? super S, ? super AbstractC72932td<C76800UCe>, ? extends S> stateReducer) {
        o.LJIIIZ(abstractC73547Stj, "<this>");
        o.LJIIIZ(stateReducer, "stateReducer");
        return execute(new C73461SsL(abstractC73547Stj, new Callable() { // from class: X.8ar
            @Override // java.util.concurrent.Callable
            public final /* bridge */ /* synthetic */ Object call() {
                return C76800UCe.LIZ;
            }
        }, null), stateReducer);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <T> InterfaceC92693kP execute(AbstractC73672Svk<T> abstractC73672Svk, InterfaceC88471Ynr<? super S, ? super AbstractC72932td<? extends T>, ? extends S> stateReducer) {
        o.LJIIIZ(abstractC73672Svk, "<this>");
        o.LJIIIZ(stateReducer, "stateReducer");
        return execute(abstractC73672Svk, C214208au.LJLIL, stateReducer);
    }

    public final <T, V> InterfaceC92693kP execute(AbstractC73672Svk<T> abstractC73672Svk, InterfaceC88472Yns<? super T, ? extends V> mapper, final InterfaceC88471Ynr<? super S, ? super AbstractC72932td<? extends V>, ? extends S> stateReducer) {
        final Thread thread;
        o.LJIIIZ(abstractC73672Svk, "<this>");
        o.LJIIIZ(mapper, "mapper");
        o.LJIIIZ(stateReducer, "stateReducer");
        final boolean z = C214368bA.LIZ;
        if (z) {
            thread = C16880lQ.LLLLIIIILLL();
        } else {
            thread = null;
        }
        setState(new AqS169S0100000_3((InterfaceC88471Ynr) stateReducer, 55));
        InterfaceC92693kP LJJJJZI = abstractC73672Svk.LJJIJL(new IDhS94S0100000_1(mapper, 4)).LJJJJ(new InterfaceC48038ItG() { // from class: X.2mO
            @Override // X.InterfaceC48038ItG
            public final Object apply(Object obj) {
                Throwable it = (Throwable) obj;
                o.LJIIIZ(it, "it");
                return new C3C1(it);
            }
        }).LJJJJZI(new InterfaceC64592gB() { // from class: X.8aq
            @Override // X.InterfaceC64592gB
            public final void accept(Object obj) {
                AbstractC72932td abstractC72932td = (AbstractC72932td) obj;
                if (!z || thread != C16880lQ.LLLLIIIILLL()) {
                    this.setState(new AqS134S0200000_3(stateReducer, (InterfaceC88471Ynr<C33Q, ? super AbstractC72932td<Object>, C33Q>) abstractC72932td, (AbstractC72932td<Object>) 32));
                } else {
                    "you need schedule upstream to another thread, you can call subscribeOn(IO)".toString();
                    throw new IllegalStateException("you need schedule upstream to another thread, you can call subscribeOn(IO)");
                }
            }
        });
        disposeOnClear(LJJJJZI);
        return LJJJJZI;
    }

    public final void syncState2Item(Object obj, Object reducer, Object onItemChange) {
        o.LJIIIZ(reducer, "reducer");
        o.LJIIIZ(onItemChange, "onItemChange");
        C65777Prh.LJ(2, reducer);
        this.syncState2Item = (InterfaceC88471Ynr) reducer;
        this._item = obj;
        this.onItemChangeCallback = onItemChange;
    }

    public final <T, V> InterfaceC92693kP execute(AbstractC73638SvC<T> abstractC73638SvC, InterfaceC88472Yns<? super T, ? extends V> mapper, InterfaceC88471Ynr<? super S, ? super AbstractC72932td<? extends V>, ? extends S> stateReducer) {
        o.LJIIIZ(abstractC73638SvC, "<this>");
        o.LJIIIZ(mapper, "mapper");
        o.LJIIIZ(stateReducer, "stateReducer");
        AbstractC73672Svk<T> LJJIIJZLJL = abstractC73638SvC.LJJIIJZLJL();
        o.LJIIIIZZ(LJJIIJZLJL, "toObservable()");
        return execute(LJJIIJZLJL, mapper, stateReducer);
    }

    public final void subscribeInternal(C56412MCa<S> config, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super S, C76800UCe> subscriber) {
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LJ(C65352Pkq.LIZ(C88508YoS.class), new C8YS(this), new AqS20S0500000_3((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) config, (InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super Throwable, C76800UCe>) subscriber, 1));
    }

    public final void syncItem2State(Object obj, List<? extends Object> list, Object reducer, InterfaceC88471Ynr<Object, ? super List<? extends Object>, C76800UCe> interfaceC88471Ynr) {
        o.LJIIIZ(reducer, "reducer");
        C8K7.LIZ("assem_vm", new AqS153S0100000_3((AssemViewModel) this, 58), false);
        getVmDispatcher().LIZ(new AqS49S0400000_3(reducer, list, obj, interfaceC88471Ynr, 4));
    }

    public final <T> void asyncSubscribe(TBW<S, ? extends AbstractC72932td<? extends T>> prop, C56412MCa<C213178Yf<AbstractC72932td<T>>> config, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        SZE.LJ(C65352Pkq.LIZ(C88508YoS.class), new C8YS(this), new AqS7S0600000_3((AssemViewModel) this, (TBW) prop, (C56412MCa) config, (InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super Throwable, C76800UCe>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) interfaceC88472Yns2, 0));
    }

    public final <A> void selectSubscribe(TBW<S, ? extends A> prop1, C56412MCa<C213178Yf<A>> config, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super A, C76800UCe> subscriber) {
        o.LJIIIZ(prop1, "prop1");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(subscriber, "subscriber");
        SZE.LJ(C65352Pkq.LIZ(C88508YoS.class), new C8YS(this), new AqS7S0600000_3((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) prop1, (C56412MCa) config, (InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super Throwable, C76800UCe>) subscriber, 1));
    }

    public final <T> void asyncSubscribe(TBW<S, ? extends AbstractC72932td<? extends T>> prop, C56412MCa<C213178Yf<AbstractC72932td<T>>> config, LifecycleOwner lifecycleOwner, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, InterfaceC88472Yns<? super T, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(prop, "prop");
        o.LJIIIZ(config, "config");
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        SZE.LJ(C65352Pkq.LIZ(C88508YoS.class), new C8YS(this), new AqS0S0700000_3((AssemViewModel) this, lifecycleOwner, (LifecycleOwner) prop, (C56412MCa) config, (InterfaceC88472Yns) interfaceC88472Yns, (InterfaceC88472Yns<? super Throwable, C76800UCe>) interfaceC65784Pro, (InterfaceC65784Pro<C76800UCe>) interfaceC88472Yns2, 0));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void subscribeInternal$default(AssemViewModel assemViewModel, C56412MCa c56412MCa, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        if (obj == null) {
            if ((i & 1) != 0) {
                c56412MCa = C213688a4.LIZIZ(false);
            }
            if ((i & 2) != 0) {
                lifecycleOwner = null;
            }
            if ((i & 4) != 0) {
                interfaceC88472Yns = null;
            }
            assemViewModel.subscribeInternal(c56412MCa, lifecycleOwner, interfaceC88472Yns, interfaceC88472Yns2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: subscribeInternal");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void syncItem2State$default(AssemViewModel assemViewModel, Object obj, List list, Object obj2, InterfaceC88471Ynr interfaceC88471Ynr, int i, Object obj3) {
        if (obj3 == null) {
            if ((i & 8) != 0) {
                interfaceC88471Ynr = null;
            }
            assemViewModel.syncItem2State(obj, list, obj2, interfaceC88471Ynr);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: syncItem2State");
    }

    public static /* synthetic */ void asyncSubscribe$default(AssemViewModel assemViewModel, TBW tbw, C56412MCa c56412MCa, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        C56412MCa c56412MCa2 = c56412MCa;
        InterfaceC88472Yns interfaceC88472Yns3 = interfaceC88472Yns;
        if (obj == null) {
            if ((i & 2) != 0) {
                c56412MCa2 = C213688a4.LIZIZ(false);
            }
            InterfaceC88472Yns interfaceC88472Yns4 = null;
            if ((i & 4) != 0) {
                interfaceC88472Yns3 = null;
            }
            if ((i & 8) != 0) {
                interfaceC65784Pro2 = null;
            }
            if ((i & 16) == 0) {
                interfaceC88472Yns4 = interfaceC88472Yns2;
            }
            assemViewModel.asyncSubscribe(tbw, c56412MCa2, interfaceC88472Yns3, interfaceC65784Pro2, interfaceC88472Yns4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }

    public static /* synthetic */ void selectSubscribe$default(AssemViewModel assemViewModel, TBW tbw, C56412MCa c56412MCa, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        C56412MCa c56412MCa2 = c56412MCa;
        LifecycleOwner lifecycleOwner2 = lifecycleOwner;
        if (obj == null) {
            if ((i & 2) != 0) {
                c56412MCa2 = C213688a4.LIZIZ(false);
            }
            InterfaceC88472Yns interfaceC88472Yns3 = null;
            if ((i & 4) != 0) {
                lifecycleOwner2 = null;
            }
            if ((i & 8) == 0) {
                interfaceC88472Yns3 = interfaceC88472Yns;
            }
            assemViewModel.selectSubscribe(tbw, c56412MCa2, lifecycleOwner2, interfaceC88472Yns3, interfaceC88472Yns2);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: selectSubscribe");
    }

    public static /* synthetic */ void asyncSubscribe$default(AssemViewModel assemViewModel, TBW tbw, C56412MCa c56412MCa, LifecycleOwner lifecycleOwner, InterfaceC88472Yns interfaceC88472Yns, InterfaceC65784Pro interfaceC65784Pro, InterfaceC88472Yns interfaceC88472Yns2, int i, Object obj) {
        InterfaceC88472Yns interfaceC88472Yns3 = interfaceC88472Yns;
        InterfaceC65784Pro interfaceC65784Pro2 = interfaceC65784Pro;
        if (obj == null) {
            InterfaceC88472Yns interfaceC88472Yns4 = null;
            if ((i & 8) != 0) {
                interfaceC88472Yns3 = null;
            }
            if ((i & 16) != 0) {
                interfaceC65784Pro2 = null;
            }
            if ((i & 32) == 0) {
                interfaceC88472Yns4 = interfaceC88472Yns2;
            }
            assemViewModel.asyncSubscribe(tbw, c56412MCa, lifecycleOwner, interfaceC88472Yns3, interfaceC65784Pro2, interfaceC88472Yns4);
            return;
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: asyncSubscribe");
    }
}
