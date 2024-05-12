package androidx.lifecycle;

import X.C36636EZk;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import X.XKX;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class PausingDispatcherKt {
    public static final <T> Object whenCreated(LifecycleOwner lifecycleOwner, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        return whenCreated(lifecycle, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenResumed(LifecycleOwner lifecycleOwner, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        return whenResumed(lifecycle, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenStarted(LifecycleOwner lifecycleOwner, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        return whenStarted(lifecycle, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenCreated(Lifecycle lifecycle, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.CREATED, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenResumed(Lifecycle lifecycle, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.RESUMED, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenStarted(Lifecycle lifecycle, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        return whenStateAtLeast(lifecycle, Lifecycle.State.STARTED, interfaceC88471Ynr, interfaceC67352kd);
    }

    public static final <T> Object whenStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super T>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super T> interfaceC67352kd) {
        return XKX.LJI(C36636EZk.LIZ.LJJIJIL(), new PausingDispatcherKt$whenStateAtLeast$2(lifecycle, state, interfaceC88471Ynr, null), interfaceC67352kd);
    }
}
