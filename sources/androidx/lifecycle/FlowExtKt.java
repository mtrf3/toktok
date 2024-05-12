package androidx.lifecycle;

import X.InterfaceC65462ha;
import X.V1M;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class FlowExtKt {
    public static final <T> InterfaceC65462ha<T> flowWithLifecycle(InterfaceC65462ha<? extends T> interfaceC65462ha, Lifecycle lifecycle, Lifecycle.State minActiveState) {
        o.LJIIIZ(interfaceC65462ha, "<this>");
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(minActiveState, "minActiveState");
        return V1M.LJFF(new FlowExtKt$flowWithLifecycle$1(lifecycle, minActiveState, interfaceC65462ha, null));
    }

    public static /* synthetic */ InterfaceC65462ha flowWithLifecycle$default(InterfaceC65462ha interfaceC65462ha, Lifecycle lifecycle, Lifecycle.State state, int i, Object obj) {
        if ((i & 2) != 0) {
            state = Lifecycle.State.STARTED;
        }
        return flowWithLifecycle(interfaceC65462ha, lifecycle, state);
    }
}
