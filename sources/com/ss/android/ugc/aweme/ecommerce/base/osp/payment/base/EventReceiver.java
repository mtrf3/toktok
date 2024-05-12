package com.ss.android.ugc.aweme.ecommerce.base.osp.payment.base;

import X.C09G;
import X.C76800UCe;
import X.InterfaceC70352pT;
import X.InterfaceC88472Yns;
import X.XKQ;
import X.XLL;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class EventReceiver implements GenericLifecycleObserver, DefaultLifecycleObserver {
    public final InterfaceC70352pT<Object> LJLIL;
    public final Lifecycle LJLILLLLZI;
    public final ConcurrentHashMap<Integer, InterfaceC88472Yns<Object, C76800UCe>> LJLJI = new ConcurrentHashMap<>();
    public XKQ LJLJJI;
    public final boolean LJLJJL;
    public boolean LJLJJLL;

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onCreate(LifecycleOwner lifecycleOwner) {
        C09G.LIZ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onPause(LifecycleOwner lifecycleOwner) {
        C09G.LIZJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onResume(LifecycleOwner lifecycleOwner) {
        C09G.LIZLLL(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStart(LifecycleOwner lifecycleOwner) {
        C09G.LJ(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final /* synthetic */ void onStop(LifecycleOwner lifecycleOwner) {
        C09G.LJFF(this, lifecycleOwner);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver, androidx.lifecycle.FullLifecycleObserver
    public final void onDestroy(LifecycleOwner owner) {
        o.LJIIIZ(owner, "owner");
        this.LJLILLLLZI.removeObserver(this);
        XKQ xkq = this.LJLJJI;
        if (xkq != null) {
            xkq.LIZIZ(null);
        }
        this.LJLJI.clear();
        this.LJLJJLL = true;
    }

    public EventReceiver(XLL xll, Lifecycle lifecycle) {
        this.LJLIL = xll;
        this.LJLILLLLZI = lifecycle;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            this.LJLJJL = true;
            this.LJLJJLL = true;
        } else {
            lifecycle.addObserver(this);
        }
    }
}
