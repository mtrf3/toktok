package androidx.lifecycle;

import X.C48841JEv;
import X.C76800UCe;
import X.EnumC58928NAu;
import X.InterfaceC67352kd;
import X.InterfaceC70422pa;
import X.InterfaceC88471Ynr;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class RepeatOnLifecycleKt {
    public static final Object repeatOnLifecycle(Lifecycle lifecycle, Lifecycle.State state, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        if (state != Lifecycle.State.INITIALIZED) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                return C76800UCe.LIZ;
            }
            Object LJI = C48841JEv.LJI(new RepeatOnLifecycleKt$repeatOnLifecycle$3(lifecycle, state, interfaceC88471Ynr, null), interfaceC67352kd);
            if (LJI == EnumC58928NAu.COROUTINE_SUSPENDED) {
                return LJI;
            }
            return C76800UCe.LIZ;
        }
        "repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.".toString();
        throw new IllegalArgumentException("repeatOnLifecycle cannot start work with the INITIALIZED lifecycle state.");
    }

    public static final Object repeatOnLifecycle(LifecycleOwner lifecycleOwner, Lifecycle.State state, InterfaceC88471Ynr<? super InterfaceC70422pa, ? super InterfaceC67352kd<? super C76800UCe>, ? extends Object> interfaceC88471Ynr, InterfaceC67352kd<? super C76800UCe> interfaceC67352kd) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        o.LJIIIIZZ(lifecycle, "lifecycle");
        Object repeatOnLifecycle = repeatOnLifecycle(lifecycle, state, interfaceC88471Ynr, interfaceC67352kd);
        if (repeatOnLifecycle == EnumC58928NAu.COROUTINE_SUSPENDED) {
            return repeatOnLifecycle;
        }
        return C76800UCe.LIZ;
    }
}
