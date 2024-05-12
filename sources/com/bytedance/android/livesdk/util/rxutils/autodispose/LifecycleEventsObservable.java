package com.bytedance.android.livesdk.util.rxutils.autodispose;

import X.AbstractC73672Svk;
import X.AbstractC73929Szt;
import X.C16880lQ;
import X.C73849Syb;
import X.C73864Syq;
import X.InterfaceC116954iR;
import android.os.Looper;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.OnLifecycleEvent;

/* loaded from: classes13.dex */
public final class LifecycleEventsObservable extends AbstractC73672Svk<Lifecycle.Event> {
    public final Lifecycle LJLIL;
    public final C73849Syb<Lifecycle.Event> LJLILLLLZI = new C73849Syb<>();

    /* loaded from: classes13.dex */
    public static final class ArchLifecycleObserver extends AbstractC73929Szt implements LifecycleObserver {
        public final Lifecycle LJLILLLLZI;
        public final InterfaceC116954iR<? super Lifecycle.Event> LJLJI;
        public final C73849Syb<Lifecycle.Event> LJLJJI;

        @Override // X.AbstractC73929Szt
        public final void LIZ() {
            this.LJLILLLLZI.removeObserver(this);
        }

        @OnLifecycleEvent(Lifecycle.Event.ON_ANY)
        public void onStateChange(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (!isDisposed()) {
                if (event != Lifecycle.Event.ON_CREATE || this.LJLJJI.LJJZZIII() != event) {
                    this.LJLJJI.onNext(event);
                }
                this.LJLJI.onNext(event);
            }
        }

        public ArchLifecycleObserver(Lifecycle lifecycle, InterfaceC116954iR<? super Lifecycle.Event> interfaceC116954iR, C73849Syb<Lifecycle.Event> c73849Syb) {
            this.LJLILLLLZI = lifecycle;
            this.LJLJI = interfaceC116954iR;
            this.LJLJJI = c73849Syb;
        }
    }

    public LifecycleEventsObservable(Lifecycle lifecycle) {
        this.LJLIL = lifecycle;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super Lifecycle.Event> interfaceC116954iR) {
        ArchLifecycleObserver archLifecycleObserver = new ArchLifecycleObserver(this.LJLIL, interfaceC116954iR, this.LJLILLLLZI);
        interfaceC116954iR.onSubscribe(archLifecycleObserver);
        try {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                this.LJLIL.addObserver(archLifecycleObserver);
                if (archLifecycleObserver.isDisposed()) {
                    this.LJLIL.removeObserver(archLifecycleObserver);
                    return;
                }
                return;
            }
            interfaceC116954iR.onError(new IllegalStateException("Lifecycles can only be bound to on the main thread!"));
        } catch (Exception e) {
            throw C73864Syq.LIZIZ(e);
        }
    }
}
