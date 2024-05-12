package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* renamed from: X.1B9, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1B9 implements LifecycleOwner {
    public LifecycleRegistry LJLIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.LJLIL == null) {
            this.LJLIL = new LifecycleRegistry(this);
        }
        return this.LJLIL;
    }

    public final void LIZ(Lifecycle.Event event) {
        this.LJLIL.handleLifecycleEvent(event);
    }
}
