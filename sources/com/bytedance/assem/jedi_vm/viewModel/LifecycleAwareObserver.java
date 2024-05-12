package com.bytedance.assem.jedi_vm.viewModel;

import X.C214368bA;
import X.C73374Sqw;
import X.C73392SrE;
import X.C73397SrJ;
import X.C73398SrK;
import X.C73411SrX;
import X.C73548Stk;
import X.C73674Svm;
import X.C76800UCe;
import X.C8XU;
import X.InterfaceC116954iR;
import X.InterfaceC58433MwX;
import X.InterfaceC73396SrI;
import X.InterfaceC88472Yns;
import X.InterfaceC92693kP;
import Y.ARunnableS48S0100000_12;
import Y.AfS64S0100000_12;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.AqS101S0300000_12;
import kotlin.jvm.internal.AqS178S0100000_12;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class LifecycleAwareObserver<T> extends AtomicReference<InterfaceC92693kP> implements LifecycleEventObserver, InterfaceC116954iR<T>, InterfaceC92693kP {
    public final LifecycleOwner LJLIL;
    public final boolean LJLILLLLZI;
    public final boolean LJLJI;
    public final InterfaceC73396SrI LJLJJI;
    public T LJLJJL;
    public T LJLJJLL;
    public final AtomicBoolean LJLJL;
    public final AqS178S0100000_12 LJLJLJ;
    public volatile boolean LJLJLLL;
    public final InterfaceC88472Yns<InterfaceC92693kP, C76800UCe> onDestroyAction;
    public LifecycleOwner owner;
    public InterfaceC116954iR<T> sourceObserver;

    public final void onProxyAttach() {
        this.LJLJLLL = true;
        LIZIZ(this.LJLIL, false);
    }

    public final void onProxyDetach() {
        this.LJLJLLL = true;
        this.LJLJL.set(false);
    }

    public final LifecycleOwner requireOwner() {
        LifecycleOwner lifecycleOwner = this.owner;
        if (lifecycleOwner != null) {
            return lifecycleOwner;
        }
        "cannot access owner after destroy".toString();
        throw new IllegalArgumentException("cannot access owner after destroy");
    }

    public final InterfaceC116954iR<T> requireSourceObserver() {
        InterfaceC116954iR<T> interfaceC116954iR = this.sourceObserver;
        if (interfaceC116954iR != null) {
            return interfaceC116954iR;
        }
        "cannot access observer after destroy".toString();
        throw new IllegalArgumentException("cannot access observer after destroy");
    }

    @Override // X.InterfaceC92693kP
    public void dispose() {
        InterfaceC73396SrI interfaceC73396SrI;
        InterfaceC92693kP andSet;
        InterfaceC92693kP interfaceC92693kP = get();
        C73397SrJ c73397SrJ = C73398SrK.LIZ;
        if (interfaceC92693kP != c73397SrJ && (andSet = getAndSet(c73397SrJ)) != c73397SrJ && andSet != null) {
            andSet.dispose();
        }
        if (C214368bA.LJIJJ && (interfaceC73396SrI = this.LJLJJI) != null) {
            interfaceC73396SrI.LIZ(this.LJLJLJ);
        }
    }

    @Override // X.InterfaceC92693kP
    public boolean isDisposed() {
        if (get() == C73398SrK.LIZ) {
            return true;
        }
        return false;
    }

    @Override // X.InterfaceC116954iR
    public void onComplete() {
        requireSourceObserver().onComplete();
    }

    public final void onDestroy() {
        if (C73374Sqw.LIZ()) {
            InterfaceC88472Yns<InterfaceC92693kP, C76800UCe> interfaceC88472Yns = this.onDestroyAction;
            if (interfaceC88472Yns != null) {
                interfaceC88472Yns.invoke(this);
            }
            requireOwner().getLifecycle().removeObserver(this);
            if (!isDisposed()) {
                dispose();
            }
            this.owner = null;
            this.sourceObserver = null;
            return;
        }
        C73374Sqw.LIZ.post(new ARunnableS48S0100000_12(this, 5));
    }

    public final void LIZ(boolean z) {
        T t;
        if (!this.LJLJL.getAndSet(true) && !isDisposed()) {
            if (z) {
                t = this.LJLJJL;
            } else if (this.LJLILLLLZI) {
                t = this.LJLJJL;
                if (t == null) {
                    t = this.LJLJJLL;
                }
            } else {
                t = this.LJLJJL;
            }
            this.LJLJJL = null;
            if (t != null) {
                onNext(t);
            }
        }
    }

    @Override // X.InterfaceC116954iR
    public void onError(Throwable e) {
        o.LJIIIZ(e, "e");
        if (!isDisposed()) {
            lazySet(C73398SrK.LIZ);
            requireSourceObserver().onError(e);
        }
    }

    public final void onLifecycleEvent(LifecycleOwner lifecycleOwner) {
        LIZIZ(lifecycleOwner, true);
    }

    @Override // X.InterfaceC116954iR
    public void onNext(T t) {
        if (this.LJLJI) {
            requireSourceObserver().onNext(t);
        } else if (this.LJLJL.get()) {
            requireSourceObserver().onNext(t);
        } else {
            this.LJLJJL = t;
        }
        this.LJLJJLL = t;
    }

    @Override // X.InterfaceC116954iR
    public void onSubscribe(InterfaceC92693kP d) {
        o.LJIIIZ(d, "d");
        if (!compareAndSet(null, d)) {
            d.dispose();
            if (get() != C73398SrK.LIZ) {
                C73548Stk.LIZIZ(new C73392SrE("Disposable already set!"));
                return;
            }
            return;
        }
        if (C73374Sqw.LIZ()) {
            requireOwner().getLifecycle().addObserver(this);
            requireSourceObserver().onSubscribe(this);
        } else {
            C73374Sqw.LIZ.post(new ARunnableS48S0100000_12(this, 6));
        }
    }

    public final void LIZIZ(LifecycleOwner lifecycleOwner, boolean z) {
        Lifecycle.State currentState = lifecycleOwner.getLifecycle().getCurrentState();
        o.LJIIIIZZ(currentState, "realOwner.lifecycle.currentState");
        boolean z2 = true;
        if (C214368bA.LJIJJ) {
            InterfaceC73396SrI interfaceC73396SrI = this.LJLJJI;
            if ((interfaceC73396SrI == null || interfaceC73396SrI.LIZIZ()) && currentState.isAtLeast(Lifecycle.State.STARTED)) {
                if (this.LJLJLLL) {
                    z = false;
                }
                LIZ(z);
                this.LJLJLLL = false;
                return;
            }
            this.LJLJL.set(false);
            return;
        }
        if (lifecycleOwner instanceof C8XU) {
            z2 = ((C8XU) lifecycleOwner).AI();
        }
        if (currentState.isAtLeast(Lifecycle.State.STARTED)) {
            LIZ(z2);
        } else {
            this.LJLJL.set(false);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        AqS101S0300000_12 aqS101S0300000_12 = new AqS101S0300000_12((LifecycleAwareObserver) this, source, (LifecycleOwner) event, (Lifecycle.Event) 0);
        InterfaceC58433MwX interfaceC58433MwX = C214368bA.LJJIII;
        if (interfaceC58433MwX != null) {
            interfaceC58433MwX.LIZ(source, event, aqS101S0300000_12);
        } else {
            aqS101S0300000_12.invoke();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, InterfaceC73396SrI interfaceC73396SrI, InterfaceC88472Yns<? super T, C76800UCe> onNext, InterfaceC88472Yns<? super Throwable, C76800UCe> interfaceC88472Yns, InterfaceC88472Yns<? super InterfaceC92693kP, C76800UCe> interfaceC88472Yns2) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(onNext, "onNext");
        this.LJLIL = lifecycleOwner;
        this.LJLILLLLZI = z;
        this.LJLJI = z2;
        this.LJLJJI = interfaceC73396SrI;
        this.onDestroyAction = interfaceC88472Yns2;
        this.owner = lifecycleOwner;
        this.sourceObserver = new C73411SrX(new AfS64S0100000_12((InterfaceC88472Yns) onNext, 11), new AfS64S0100000_12((InterfaceC88472Yns) interfaceC88472Yns, 12), C73674Svm.LIZJ, C73674Svm.LIZLLL);
        this.LJLJL = new AtomicBoolean(false);
        AqS178S0100000_12 aqS178S0100000_12 = new AqS178S0100000_12((LifecycleAwareObserver) this, 84);
        this.LJLJLJ = aqS178S0100000_12;
        if (C214368bA.LJIJJ && interfaceC73396SrI != null) {
            interfaceC73396SrI.LIZJ(aqS178S0100000_12);
        }
        this.LJLJLLL = true;
    }

    public /* synthetic */ LifecycleAwareObserver(LifecycleOwner lifecycleOwner, boolean z, boolean z2, InterfaceC73396SrI interfaceC73396SrI, InterfaceC88472Yns interfaceC88472Yns, InterfaceC88472Yns interfaceC88472Yns2, InterfaceC88472Yns interfaceC88472Yns3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(lifecycleOwner, (i & 2) != 0 ? false : z, (i & 4) != 0 ? false : z2, (i & 8) != 0 ? null : interfaceC73396SrI, interfaceC88472Yns, (i & 32) != 0 ? null : interfaceC88472Yns2, (i & 64) == 0 ? interfaceC88472Yns3 : null);
    }
}
