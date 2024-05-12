package androidx.lifecycle;

import X.C16880lQ;
import X.C36636EZk;
import X.C79146V4k;
import X.MBA;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LifecycleCoroutineScopeImpl extends LifecycleCoroutineScope implements LifecycleEventObserver {
    public final MBA coroutineContext;
    public final Lifecycle lifecycle;

    public final void register() {
        XKX.LIZLLL(this, C36636EZk.LIZ.LJJIJIL(), null, new LifecycleCoroutineScopeImpl$register$1(this, null), 2);
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope, X.InterfaceC70422pa
    public MBA getCoroutineContext() {
        return this.coroutineContext;
    }

    @Override // androidx.lifecycle.LifecycleCoroutineScope
    public Lifecycle getLifecycle$lifecycle_runtime_ktx_release() {
        return this.lifecycle;
    }

    public LifecycleCoroutineScopeImpl(Lifecycle lifecycle, MBA coroutineContext) {
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(coroutineContext, "coroutineContext");
        this.lifecycle = lifecycle;
        this.coroutineContext = coroutineContext;
        if (getLifecycle$lifecycle_runtime_ktx_release().getCurrentState() == Lifecycle.State.DESTROYED) {
            C79146V4k.LJIJ(getCoroutineContext(), null);
        }
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (C16880lQ.LLJJIJIL(getLifecycle$lifecycle_runtime_ktx_release().getCurrentState(), Lifecycle.State.DESTROYED) <= 0) {
            getLifecycle$lifecycle_runtime_ktx_release().removeObserver(this);
            C79146V4k.LJIJ(getCoroutineContext(), null);
        }
    }
}
