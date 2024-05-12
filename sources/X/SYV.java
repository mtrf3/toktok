package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import androidx.lifecycle.LifecycleRegistry;

/* loaded from: classes13.dex */
public final class SYV implements LifecycleOwner {
    public static final SYV LJLIL;
    public static final LifecycleRegistry LJLILLLLZI;

    static {
        SYV syv = new SYV();
        LJLIL = syv;
        LJLILLLLZI = new LifecycleRegistry(syv);
    }

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        return LJLILLLLZI;
    }
}
