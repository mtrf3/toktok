package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* renamed from: X.LeS, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C54764LeS implements InterfaceC54770LeY {
    public final /* synthetic */ LifecycleOwner LJLIL;

    @Override // androidx.lifecycle.LifecycleOwner
    public final Lifecycle getLifecycle() {
        Lifecycle lifecycle = this.LJLIL.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycleOwner.lifecycle");
        return lifecycle;
    }

    public C54764LeS(LifecycleOwner lifecycleOwner) {
        this.LJLIL = lifecycleOwner;
    }
}