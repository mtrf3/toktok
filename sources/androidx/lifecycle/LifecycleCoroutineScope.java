package androidx.lifecycle;

import X.C76800UCe;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC79150V4o;
import X.InterfaceC88471Ynr;
import X.MBA;
import X.XKX;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public abstract class LifecycleCoroutineScope implements InterfaceC70422pa {
    @Override // X.InterfaceC70422pa
    public abstract /* synthetic */ MBA getCoroutineContext();

    public abstract Lifecycle getLifecycle$lifecycle_runtime_ktx_release();

    public final InterfaceC79150V4o launchWhenCreated(InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> block) {
        o.LJIIIZ(block, "block");
        return XKX.LIZLLL(this, null, null, new LifecycleCoroutineScope$launchWhenCreated$1(this, block, null), 3);
    }

    public final InterfaceC79150V4o launchWhenResumed(InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> block) {
        o.LJIIIZ(block, "block");
        return XKX.LIZLLL(this, null, null, new LifecycleCoroutineScope$launchWhenResumed$1(this, block, null), 3);
    }

    public final InterfaceC79150V4o launchWhenStarted(InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> block) {
        o.LJIIIZ(block, "block");
        return XKX.LIZLLL(this, null, null, new LifecycleCoroutineScope$launchWhenStarted$1(this, block, null), 3);
    }
}
