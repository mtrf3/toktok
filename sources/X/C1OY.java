package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;
import kotlin.jvm.internal.o;

/* renamed from: X.1OY, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1OY extends Lifecycle implements LifecycleOwner {
    public final LifecycleRegistry LJLIL = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        Lifecycle.State currentState = this.LJLIL.getCurrentState();
        o.LJIIIIZZ(currentState, "lifecycleRegistry.currentState");
        return currentState;
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.addObserver(observer);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.removeObserver(observer);
    }
}
