package com.bytedance;

import X.C221108m2;
import X.C29901Fi;
import X.C46601sG;
import X.C62822Ol8;
import X.C73411SrX;
import X.C73893SzJ;
import X.InterfaceC29911Fj;
import Y.AObjectS89S0100000_14;
import Y.IDRunnableS29S0200000;
import Y.IDfS292S0100000;
import android.os.Handler;
import androidx.lifecycle.GenericLifecycleObserver;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class RxLiveEvent<T> extends C29901Fi<T> {
    public T LJ;
    public final C73893SzJ<T> LIZLLL = new C73893SzJ<>();
    public final C62822Ol8 LJFF = C221108m2.LIZIZ(C46601sG.INSTANCE);

    @Override // com.bytedance.als.LiveEvent
    public final T LIZJ() {
        return this.LJ;
    }

    @Override // com.bytedance.als.LiveEvent
    public final void LJ(InterfaceC29911Fj<T> interfaceC29911Fj) {
        this.LIZLLL.LJJJJZI(new IDfS292S0100000((AObjectS89S0100000_14) interfaceC29911Fj, 5));
    }

    @Override // com.bytedance.als.LiveEvent
    public final void LJFF(InterfaceC29911Fj<T> observer) {
        o.LJIIIZ(observer, "observer");
        throw new RuntimeException("user  lifecycleOwner instead");
    }

    @Override // X.C29901Fi
    public final void LJI(T t) {
        ((Handler) this.LJFF.getValue()).post(new IDRunnableS29S0200000(this, t, 16));
    }

    @Override // X.C29901Fi
    public final void LJII(T t) {
        this.LJ = t;
        this.LIZLLL.onNext(t);
    }

    @Override // com.bytedance.als.LiveEvent
    public final void LIZLLL(LifecycleOwner owner, InterfaceC29911Fj<T> observer) {
        o.LJIIIZ(owner, "owner");
        o.LJIIIZ(observer, "observer");
        Lifecycle lifecycle = owner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "owner.lifecycle");
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        final C73411SrX c73411SrX = (C73411SrX) this.LIZLLL.LJJJJZI(new IDfS292S0100000(observer, 4));
        owner.getLifecycle().addObserver(new GenericLifecycleObserver() { // from class: com.bytedance.RxLiveEvent$observe$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    onDestroy();
                }
            }

            @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
            public final void onDestroy() {
                c73411SrX.dispose();
            }
        });
    }
}
