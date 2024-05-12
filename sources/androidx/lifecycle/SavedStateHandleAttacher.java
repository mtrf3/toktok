package androidx.lifecycle;

import X.X1D;
import androidx.lifecycle.Lifecycle;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class SavedStateHandleAttacher implements LifecycleEventObserver {
    public final SavedStateHandlesProvider provider;

    public SavedStateHandleAttacher(SavedStateHandlesProvider provider) {
        o.LJIIIZ(provider, "provider");
        this.provider = provider;
    }

    @Override // androidx.lifecycle.LifecycleEventObserver
    public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "event");
        if (event == Lifecycle.Event.ON_CREATE) {
            source.getLifecycle().removeObserver(this);
            this.provider.performRestore();
            return;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Next event must be ON_CREATE, it was ");
        LIZ.append(event);
        String LIZIZ = X1D.LIZIZ(LIZ);
        LIZIZ.toString();
        throw new IllegalStateException(LIZIZ);
    }
}
