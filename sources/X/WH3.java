package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes15.dex */
public final class WH3 implements LifecycleOwner {
    public LifecycleRegistry LJLIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        if (this.LJLIL == null) {
            this.LJLIL = new LifecycleRegistry(this);
        }
        return this.LJLIL;
    }

    public final void LIZ(Lifecycle.Event event) {
        if (this.LJLIL == null) {
            this.LJLIL = new LifecycleRegistry(this);
        }
        this.LJLIL.handleLifecycleEvent(event);
    }
}
