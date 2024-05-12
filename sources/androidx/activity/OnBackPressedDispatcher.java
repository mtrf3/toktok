package androidx.activity;

import X.AbstractC008101l;
import X.C18E;
import X.InterfaceC008001k;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    public final Runnable LIZ;
    public final ArrayDeque<AbstractC008101l> LIZIZ = new ArrayDeque<>();

    /* loaded from: classes.dex */
    public class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, InterfaceC008001k {
        public final Lifecycle LJLIL;
        public final AbstractC008101l LJLILLLLZI;
        public C18E LJLJI;

        @Override // X.InterfaceC008001k
        public final void cancel() {
            this.LJLIL.removeObserver(this);
            this.LJLILLLLZI.LIZIZ.remove(this);
            C18E c18e = this.LJLJI;
            if (c18e != null) {
                c18e.cancel();
                this.LJLJI = null;
            }
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
            if (event == Lifecycle.Event.ON_START) {
                this.LJLJI = OnBackPressedDispatcher.this.LIZIZ(this.LJLILLLLZI);
                return;
            }
            if (event == Lifecycle.Event.ON_STOP) {
                C18E c18e = this.LJLJI;
                if (c18e == null) {
                    return;
                }
                c18e.cancel();
                return;
            }
            if (event != Lifecycle.Event.ON_DESTROY) {
                return;
            }
            cancel();
        }

        public LifecycleOnBackPressedCancellable(Lifecycle lifecycle, AbstractC008101l abstractC008101l) {
            this.LJLIL = lifecycle;
            this.LJLILLLLZI = abstractC008101l;
            lifecycle.addObserver(this);
        }
    }

    public final void LIZJ() {
        Iterator<AbstractC008101l> descendingIterator = this.LIZIZ.descendingIterator();
        while (descendingIterator.hasNext()) {
            AbstractC008101l next = descendingIterator.next();
            if (next.LIZ) {
                next.LIZ();
                return;
            }
        }
        Runnable runnable = this.LIZ;
        if (runnable != null) {
            runnable.run();
        }
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this.LIZ = runnable;
    }

    public final C18E LIZIZ(AbstractC008101l abstractC008101l) {
        this.LIZIZ.add(abstractC008101l);
        C18E c18e = new C18E(this, abstractC008101l);
        abstractC008101l.LIZIZ.add(c18e);
        return c18e;
    }

    public final void LIZ(LifecycleOwner lifecycleOwner, AbstractC008101l abstractC008101l) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        abstractC008101l.LIZIZ.add(new LifecycleOnBackPressedCancellable(lifecycle, abstractC008101l));
    }
}
