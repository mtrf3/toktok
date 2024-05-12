package androidx.compose.ui.platform;

import X.AnonymousClass049;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class WindowRecomposer_androidKt$bindRecomposeLifecycleWhenAttachToWindow$2 implements LifecycleEventObserver {
    @Override // androidx.lifecycle.LifecycleEventObserver
    public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(event, "event");
        int i = AnonymousClass049.LIZ[event.ordinal()];
        if (i != 2) {
            if (i != 3) {
                if (i != 4) {
                    return;
                } else {
                    throw null;
                }
            } else {
                o.LJIIIZ(null, "<this>");
                throw null;
            }
        }
        o.LJIIIZ(null, "<this>");
        throw null;
    }
}
