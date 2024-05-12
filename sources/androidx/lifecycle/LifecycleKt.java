package androidx.lifecycle;

import X.C36636EZk;
import X.T2R;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LifecycleKt {
    public static final LifecycleCoroutineScope getCoroutineScope(Lifecycle lifecycle) {
        o.LJIIIZ(lifecycle, "<this>");
        while (true) {
            LifecycleCoroutineScope lifecycleCoroutineScope = (LifecycleCoroutineScope) lifecycle.mInternalScopeRef.get();
            if (lifecycleCoroutineScope != null) {
                return lifecycleCoroutineScope;
            }
            LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImpl = new LifecycleCoroutineScopeImpl(lifecycle, T2R.LJIIJJI().plus(C36636EZk.LIZ.LJJIJIL()));
            AtomicReference<Object> atomicReference = lifecycle.mInternalScopeRef;
            while (!atomicReference.compareAndSet(null, lifecycleCoroutineScopeImpl)) {
                if (atomicReference.get() != null) {
                    break;
                }
            }
            lifecycleCoroutineScopeImpl.register();
            return lifecycleCoroutineScopeImpl;
        }
    }
}
