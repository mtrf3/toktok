package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;

/* renamed from: X.0kt, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public class C16550kt {
    public final Lifecycle LIZ;
    public LifecycleEventObserver LIZIZ;

    public C16550kt(Lifecycle lifecycle, LifecycleEventObserver lifecycleEventObserver) {
        this.LIZ = lifecycle;
        this.LIZIZ = lifecycleEventObserver;
        lifecycle.addObserver(lifecycleEventObserver);
    }
}
