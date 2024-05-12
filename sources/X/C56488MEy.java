package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.MEy, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C56488MEy implements InterfaceC54770LeY {
    public final LifecycleOwner LJLIL;
    public C65769PrZ LJLILLLLZI;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    public C56488MEy(LifecycleOwner lifecycleOwner) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        this.LJLIL = lifecycleOwner;
    }
}
