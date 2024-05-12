package com.bytedance.jedi.ext.adapter.internal;

import X.AMK;
import X.C221108m2;
import X.C62822Ol8;
import X.C65352Pkq;
import X.C73250Sow;
import X.C73267SpD;
import X.InterfaceC73268SpE;
import X.InterfaceC74236TBo;
import X.InterfaceC98243tM;
import X.TBT;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.JediViewHolderProxyViewModelStore;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import androidx.lifecycle.OnLifecycleEvent;
import com.bytedance.jedi.ext.adapter.JediViewHolder;
import kotlin.jvm.internal.AqS162S0100000_12;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class JediViewHolderProxy implements GenericLifecycleObserver, AMK, InterfaceC73268SpE {
    public static final /* synthetic */ InterfaceC74236TBo[] LJLJLJ;
    public JediViewHolder<? extends InterfaceC98243tM, ?> LJLILLLLZI;
    public boolean LJLJI;
    public boolean LJLJJL;
    public boolean LJLJJLL;
    public boolean LJLIL = true;
    public final C62822Ol8 LJLJJI = C221108m2.LIZIZ(C73267SpD.LJLIL);
    public final C62822Ol8 LJLJL = C221108m2.LIZIZ(new AqS162S0100000_12(this, 78));

    static {
        TBT tbt = new TBT(C65352Pkq.LIZ(JediViewHolderProxy.class), "lifecycleRegistry", "getLifecycleRegistry()Landroidx/lifecycle/LifecycleRegistry;");
        C65352Pkq.LIZ.getClass();
        LJLJLJ = new InterfaceC74236TBo[]{tbt};
    }

    @Override // X.InterfaceC73141SnB
    public final LifecycleOwner getLifecycleOwner() {
        return this;
    }

    public final LifecycleRegistry getLifecycleRegistry() {
        return (LifecycleRegistry) this.LJLJL.getValue();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    public final void onCreate() {
        this.LJLJJL = false;
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_CREATE);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_CREATE) {
            onCreate();
            return;
        }
        if (event == Lifecycle.Event.ON_START) {
            onStart();
        } else if (event == Lifecycle.Event.ON_STOP) {
            onStop();
        } else if (event == Lifecycle.Event.ON_DESTROY) {
            onDestroy();
        }
    }

    @Override // X.InterfaceC73149SnJ
    public final JediViewHolder<? extends InterfaceC98243tM, ?> getReceiver() {
        if (this.LJLJI) {
            return null;
        }
        return this.LJLILLLLZI;
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_START)
    public final void onStart() {
        if (this.LJLJI || this.LJLILLLLZI == null) {
            return;
        }
        this.LJLIL = true;
        if (!this.LJLJJLL) {
            return;
        }
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_START);
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_STOP)
    public final void onStop() {
        if (this.LJLJI || this.LJLILLLLZI == null) {
            return;
        }
        this.LJLIL = true;
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_STOP);
    }

    @Override // X.AMK
    public final JediViewHolderProxyViewModelStore r6() {
        return (JediViewHolderProxyViewModelStore) this.LJLJJI.getValue();
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("Proxy@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append("(holder@");
        JediViewHolder<? extends InterfaceC98243tM, ?> jediViewHolder = this.LJLILLLLZI;
        if (jediViewHolder != null) {
            str = Integer.toHexString(jediViewHolder.hashCode());
        } else {
            str = null;
        }
        sb.append(str);
        sb.append(",detached:");
        sb.append(this.LJLJI);
        sb.append(",state:");
        sb.append(getLifecycleRegistry().getCurrentState());
        sb.append(')');
        return sb.toString();
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return getLifecycleRegistry();
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void onDestroy() {
        getLifecycleRegistry().handleLifecycleEvent(Lifecycle.Event.ON_DESTROY);
        if (this.LJLJJI.isInitialized()) {
            r6().clear();
        }
        this.LJLJJL = true;
    }

    @Override // X.InterfaceC73268SpE
    public final boolean Tr0() {
        return this.LJLIL;
    }

    public final void LIZ(C73250Sow manager, JediViewHolder<? extends InterfaceC98243tM, ?> jediViewHolder) {
        o.LJIIJ(manager, "manager");
        if (jediViewHolder != null) {
            this.LJLILLLLZI = jediViewHolder;
            jediViewHolder.currentProxy = this;
            this.LJLJI = false;
            if (manager.LIZJ.add(this)) {
                manager.LIZLLL.addObserver(this);
                return;
            }
            return;
        }
        this.LJLILLLLZI = null;
    }
}
