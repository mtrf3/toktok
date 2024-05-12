package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import kotlin.jvm.internal.o;

/* renamed from: X.Sbb, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C72423Sbb extends Lifecycle {
    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
    }

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return Lifecycle.State.DESTROYED;
    }
}
