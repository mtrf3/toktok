package com.bytedance.ies.powerlist;

import X.ActivityC45651qj;
import X.AnonymousClass030;
import X.C16960lY;
import X.C16970lZ;
import X.C212558Vv;
import X.C212988Xm;
import X.C227568wS;
import X.C57939MoZ;
import X.C61878OQg;
import X.C73849Syb;
import X.InterfaceC117044ia;
import X.InterfaceC212978Xl;
import X.InterfaceC212998Xn;
import X.InterfaceC227588wU;
import X.InterfaceC57784Mm4;
import X.InterfaceC93923mO;
import X.InterfaceC94653nZ;
import X.SIT;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.RecyclerView;
import com.ss.android.ugc.aweme.services.PowerContextImpl;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes4.dex */
public abstract class PowerCell<T extends InterfaceC57784Mm4> extends RecyclerView.ViewHolder implements LifecycleOwner, LifecycleEventObserver, InterfaceC212998Xn<PowerCell<T>, T>, InterfaceC94653nZ, InterfaceC93923mO, InterfaceC227588wU {
    public PowerAdapter adapter;
    public RecyclerView attachView;
    public final InterfaceC212978Xl<PowerCell<T>, T> child;
    public SIT chunk;
    public boolean isLifecycleObserved;
    public boolean isResumed;
    public T item;
    public final LifecycleRegistry lifecycleRegistry;
    public LifecycleOwner parent;
    public C212988Xm<PowerCell<T>, T> proxy;
    public PowerStub stub;
    public final PowerCell<T> vmReceiver;

    private final void moveToResumeState() {
        this.isResumed = true;
        int i = C212558Vv.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            dispatchResume(false);
        } else {
            dispatchStart();
            dispatchResume(false);
        }
    }

    public int getLayoutId() {
        return 0;
    }

    public void onBindItemView(T t, List<? extends Object> payloads) {
        o.LJIIIZ(t, "t");
        o.LJIIIZ(payloads, "payloads");
    }

    @Override // X.InterfaceC227608wW
    public void onCreate() {
    }

    public void onDestroy() {
    }

    public void onItemViewCreated() {
    }

    public void onItemViewCreated(Object obj) {
    }

    @Override // X.InterfaceC227608wW
    public void onPause() {
    }

    @Override // X.InterfaceC227608wW
    public void onResume(boolean z) {
    }

    @Override // X.InterfaceC227608wW
    public void onStart() {
    }

    @Override // X.InterfaceC227608wW
    public void onStop() {
    }

    public void onVMSubscribeForReusedReceiver() {
    }

    public void unBind() {
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public PowerCell() {
        this((View) C227568wS.LIZJ.getValue());
        C227568wS c227568wS = C227568wS.LIZ;
        if (!C227568wS.LIZLLL) {
            synchronized (c227568wS) {
                if (!C227568wS.LIZLLL) {
                    Application application = PowerContextImpl.createIPowerContextbyMonsterPlugin(false).getApplication();
                    if (application != null) {
                        C227568wS.LIZIZ = application;
                    }
                    C227568wS.LIZLLL = true;
                }
            }
        }
    }

    private final boolean getAsyncInflate() {
        C73849Syb<C57939MoZ> c73849Syb;
        C57939MoZ LJJZZIII;
        PowerAdapter powerAdapter = this.adapter;
        if (powerAdapter != null && (c73849Syb = powerAdapter.LJLZ) != null && (LJJZZIII = c73849Syb.LJJZZIII()) != null) {
            return LJJZZIII.LJ;
        }
        return false;
    }

    public void dispatchPause() {
        if (!this.isResumed) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_PAUSE);
        onPause();
    }

    public void dispatchStart() {
        if (!this.isResumed) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
        onStart();
    }

    public void dispatchStop() {
        if (!this.isResumed) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
        onStop();
    }

    @Override // X.InterfaceC93923mO
    public Context getContext() {
        return this.itemView.getContext();
    }

    public final LifecycleOwner getCurrentLifecycleOwner() {
        PowerAdapter powerAdapter = this.adapter;
        if (powerAdapter != null) {
            return powerAdapter.LLIIIILZ();
        }
        return null;
    }

    public final void rebind() {
        onBindViewHolder(this.item, null);
    }

    public final void tryObserveLifecycle() {
        Lifecycle lifecycle;
        if (!this.isLifecycleObserved) {
            LifecycleOwner parent = getParent();
            if (parent != null && (lifecycle = parent.getLifecycle()) != null) {
                lifecycle.addObserver(this);
            }
            this.isLifecycleObserved = true;
        }
    }

    private final void moveToResume() {
        tryObserveLifecycle();
        moveToResumeState();
    }

    private final void moveToStopState() {
        int i = C212558Vv.LIZIZ[getLifecycle().getCurrentState().ordinal()];
        if (i != 1 && i != 2) {
            if (i == 3) {
                dispatchPause();
                dispatchStop();
            }
        } else {
            dispatchStop();
        }
        this.isResumed = false;
    }

    public void dispatchCreate() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
        onCreate();
    }

    public void dispatchDestroy() {
        Lifecycle lifecycle;
        moveToStopState();
        this.lifecycleRegistry.handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        LifecycleOwner parent = getParent();
        if (parent != null && (lifecycle = parent.getLifecycle()) != null) {
            lifecycle.removeObserver(this);
        }
        onDestroy();
    }

    /* JADX WARN: Incorrect return type in method signature: <T::LX/4ia;>()TT; */
    public final InterfaceC117044ia getControl() {
        if (getStub() == null) {
            return null;
        }
        o.LJIJ();
        throw null;
    }

    @Override // X.InterfaceC93923mO
    public LifecycleOwner getCurrentLifeCycleOwner() {
        return getCurrentLifecycleOwner();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    public void onViewAttachedToWindow() {
        moveToResumeState();
        tryObserveLifecycle();
    }

    private final void moveToStop() {
        moveToStopState();
    }

    public final PowerAdapter getAdapter$powerlist_release() {
        return this.adapter;
    }

    public final RecyclerView getAttachView$powerlist_release() {
        return this.attachView;
    }

    public InterfaceC212978Xl<PowerCell<T>, T> getChild() {
        return this.child;
    }

    public final SIT getChunk() {
        return this.chunk;
    }

    public final T getItem() {
        return this.item;
    }

    @Override // X.InterfaceC227588wU
    public LifecycleRegistry getLifecycleRegistry() {
        return this.lifecycleRegistry;
    }

    public LifecycleOwner getParent() {
        return this.parent;
    }

    @Override // X.InterfaceC212998Xn
    public C212988Xm<PowerCell<T>, T> getProxy() {
        return this.proxy;
    }

    public final PowerStub getStub() {
        return this.stub;
    }

    public final boolean isResumed$powerlist_release() {
        return this.isResumed;
    }

    public void onViewDetachedFromWindow() {
        moveToStopState();
    }

    public PowerCell<T> getVmReceiver() {
        return this.vmReceiver;
    }

    public PowerCell(View view) {
        super(view);
        this.lifecycleRegistry = new LifecycleRegistry(this);
        this.vmReceiver = this;
    }

    public final void bindItem$powerlist_release(T t) {
        o.LJIIIZ(t, "t");
        this.item = t;
    }

    public void dispatchResume(boolean z) {
        if (!this.isResumed) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_RESUME);
        onResume(z);
    }

    public void onBindItemView(T t) {
        o.LJIIIZ(t, "t");
        onBindItemView(t, C61878OQg.INSTANCE);
    }

    public View onCreateItemView(ViewGroup parent) {
        View inflateItemView;
        o.LJIIIZ(parent, "parent");
        Integer valueOf = Integer.valueOf(getLayoutId());
        if (valueOf.intValue() > 0 && (inflateItemView = inflateItemView(parent, valueOf.intValue())) != null) {
            return inflateItemView;
        }
        throw new IllegalArgumentException("onCreateItemView layoutId is valid!!");
    }

    public final void setAdapter$powerlist_release(PowerAdapter powerAdapter) {
        this.adapter = powerAdapter;
    }

    public final void setAttachView$powerlist_release(RecyclerView recyclerView) {
        this.attachView = recyclerView;
    }

    public final void setChunk(SIT sit) {
        this.chunk = sit;
    }

    public final void setItem(T t) {
        this.item = t;
    }

    public void setParent(LifecycleOwner lifecycleOwner) {
        this.parent = lifecycleOwner;
    }

    @Override // X.InterfaceC212998Xn
    public void setProxy(C212988Xm<PowerCell<T>, T> c212988Xm) {
        this.proxy = c212988Xm;
    }

    public final void setResumed$powerlist_release(boolean z) {
        this.isResumed = z;
    }

    public final void setStub(PowerStub powerStub) {
        this.stub = powerStub;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;Landroidx/lifecycle/ViewModelProvider$Factory;)TT; */
    @Override // X.InterfaceC94653nZ
    public ViewModel getActivityViewModel(Class modelClass, ViewModelProvider.Factory factory) {
        ActivityC45651qj LLIFFJFJJ;
        o.LJIIIZ(modelClass, "modelClass");
        PowerAdapter powerAdapter = this.adapter;
        if (powerAdapter != null && (LLIFFJFJJ = powerAdapter.LLIFFJFJJ()) != null) {
            return ViewModelProviders.of(LLIFFJFJJ, factory).get(modelClass);
        }
        return null;
    }

    /* JADX WARN: Incorrect return type in method signature: <T:Landroidx/lifecycle/ViewModel;>(Ljava/lang/Class<TT;>;Landroidx/lifecycle/ViewModelProvider$Factory;)TT; */
    @Override // X.InterfaceC94653nZ
    public ViewModel getFragmentViewModel(Class modelClass, ViewModelProvider.Factory factory) {
        Fragment LLIIII;
        o.LJIIIZ(modelClass, "modelClass");
        PowerAdapter powerAdapter = this.adapter;
        if (powerAdapter != null && (LLIIII = powerAdapter.LLIIII()) != null) {
            return ViewModelProviders.of(LLIIII, factory).get(modelClass);
        }
        return null;
    }

    public final View inflateItemView(ViewGroup parent, int i) {
        o.LJIIIZ(parent, "parent");
        Context context = parent.getContext();
        if (getAsyncInflate()) {
            if (context instanceof Activity) {
                C16960lY.LIZ(i);
                View LIZLLL = C16970lZ.LIZLLL((Activity) context, i);
                if (!C16970lZ.LIZ(i, context)) {
                    C16970lZ.LJ(i, context);
                }
                o.LJIIIIZZ(LIZLLL, "{\n            check(cont…}\n            }\n        }");
                return LIZLLL;
            }
            "context is not an Activity??".toString();
            throw new IllegalStateException("context is not an Activity??");
        }
        return AnonymousClass030.LIZLLL(context, i, parent, false, "{\n            LayoutInfl… parent, false)\n        }");
    }

    public final void onBindViewHolder(T t, List<? extends Object> list) {
        moveToStopState();
        moveToResume();
        if (t == null) {
            return;
        }
        if (list == null || list.isEmpty()) {
            onBindItemView(t);
        } else {
            onBindItemView(t, list);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        switch (C212558Vv.LIZ[event.ordinal()]) {
            case 1:
                dispatchCreate();
                return;
            case 2:
                dispatchStart();
                return;
            case 3:
                dispatchResume(true);
                return;
            case 4:
                dispatchPause();
                return;
            case 5:
                dispatchStop();
                return;
            case 6:
                dispatchDestroy();
                return;
            default:
                return;
        }
    }
}
