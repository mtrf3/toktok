package com.bytedance.jedi.arch.internal;

import X.C16880lQ;
import X.C73168Snc;
import X.C73392SrE;
import X.C73393SrF;
import X.C73394SrG;
import X.C73411SrX;
import X.C73548Stk;
import X.C73674Svm;
import X.C76800UCe;
import X.InterfaceC116954iR;
import X.InterfaceC73268SpE;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import Y.ARunnableS48S0100000_12;
import Y.AfS64S0100000_12;
import android.os.Looper;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LifecycleAwareObserver<T> extends AtomicReference<InterfaceC92693kP> implements GenericLifecycleObserver, InterfaceC116954iR<T>, InterfaceC92693kP {
    public LifecycleOwner LJLIL;
    public C73411SrX LJLILLLLZI;
    public T LJLJI;
    public T LJLJJI;
    public final AtomicBoolean LJLJJL;
    public final boolean LJLJJLL;
    public final boolean LJLJL;

    public final void onDestroy() {
        com_bytedance_jedi_arch_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_lancet_LifecycleAwareObserverLancet_onDestroy(this);
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        onLifecycleEvent(lifecycleOwner);
        if (event == Lifecycle.Event.ON_DESTROY) {
            com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___();
        }
    }

    public final LifecycleOwner requireOwner() {
        LifecycleOwner lifecycleOwner = this.LJLIL;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "cannot access owner after destroy".toString();
        throw new IllegalArgumentException("cannot access owner after destroy");
    }

    public final InterfaceC116954iR<T> requireSourceObserver() {
        C73411SrX c73411SrX = this.LJLILLLLZI;
        if (c73411SrX != null) {
            return c73411SrX;
        }
        "cannot access observer after destroy".toString();
        throw new IllegalArgumentException("cannot access observer after destroy");
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    public final void com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___() {
        requireOwner().getLifecycle().removeObserver(this);
        if (!isDisposed()) {
            dispose();
        }
        this.LJLIL = null;
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        InterfaceC92693kP andSet;
        InterfaceC92693kP interfaceC92693kP = get();
        C73393SrF c73393SrF = C73394SrG.LIZ;
        if (interfaceC92693kP != c73393SrF && (andSet = getAndSet(c73393SrF)) != c73393SrF && andSet != null) {
            andSet.dispose();
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == C73394SrG.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        requireSourceObserver().onComplete();
    }

    public static void com_bytedance_jedi_arch_internal_LifecycleAwareObserver_com_ss_android_ugc_aweme_lancet_LifecycleAwareObserverLancet_onDestroy(LifecycleAwareObserver lifecycleAwareObserver) {
        try {
            lifecycleAwareObserver.com_bytedance_jedi_arch_internal_LifecycleAwareObserver__onDestroy$___twin___();
        } catch (Throwable unused) {
        }
    }

    @Override // X.InterfaceC116954iR
    public void onError(Throwable e) {
        o.LJIIJ(e, "e");
        if (!isDisposed()) {
            lazySet(C73394SrG.LIZ);
            requireSourceObserver().onError(e);
        }
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
    public final void onLifecycleEvent(LifecycleOwner realOwner) {
        boolean z;
        T t;
        o.LJIIJ(realOwner, "realOwner");
        Lifecycle lifecycle = realOwner.getLifecycle();
        o.LJFF(lifecycle, "realOwner.lifecycle");
        if (lifecycle.getCurrentState().isAtLeast(Lifecycle.State.STARTED)) {
            if (realOwner instanceof InterfaceC73268SpE) {
                z = ((InterfaceC73268SpE) realOwner).Tr0();
            } else {
                z = true;
            }
            if (this.LJLJJL.getAndSet(true) || isDisposed()) {
                return;
            }
            if (z) {
                t = this.LJLJI;
            } else if (!this.LJLJJLL || (t = this.LJLJJI) == null) {
                t = this.LJLJI;
            }
            this.LJLJI = null;
            if (t == null) {
                return;
            }
            onNext(t);
            return;
        }
        this.LJLJJL.set(false);
    }

    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
        if (this.LJLJL) {
            requireSourceObserver().onNext(t);
        } else if (this.LJLJJL.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.LJLJI = t;
        }
        this.LJLJJI = t;
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP d) {
        o.LJIIJ(d, "d");
        if (!compareAndSet(null, d)) {
            d.dispose();
            if (get() != C73394SrG.LIZ) {
                C73548Stk.LIZIZ(new C73392SrE("Disposable already set!"));
                return;
            }
            return;
        }
        if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
            requireOwner().getLifecycle().addObserver(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            C73168Snc.LIZ.post(new ARunnableS48S0100000_12(this, 8));
        }
    }

    public LifecycleAwareObserver(LifecycleOwner owner, boolean z, boolean z2, InterfaceC88472Yns<? super T, C76800UCe> onNext) {
        o.LJIIJ(owner, "owner");
        o.LJIIJ(onNext, "onNext");
        this.LJLJJLL = z;
        this.LJLJL = z2;
        this.LJLIL = owner;
        this.LJLILLLLZI = new C73411SrX(new AfS64S0100000_12((InterfaceC88472Yns) onNext, 13), C73674Svm.LJFF, C73674Svm.LIZJ, C73674Svm.LIZLLL);
        this.LJLJJL = new AtomicBoolean(false);
    }

    public /* synthetic */ LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, InterfaceC88472Yns interfaceC88472Yns, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, interfaceC88472Yns);
    }
}
