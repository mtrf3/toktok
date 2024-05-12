package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* renamed from: X.1A3, reason: invalid class name */
/* loaded from: classes.dex */
public final class C1A3 implements LifecycleOwner {
    public final LifecycleRegistry LJLIL = new LifecycleRegistry(this);

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return this.LJLIL;
    }
}
