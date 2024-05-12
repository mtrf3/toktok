package X;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleObserver;
import java.util.concurrent.ConcurrentLinkedQueue;
import kotlin.jvm.internal.o;

/* renamed from: X.8qv, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C224138qv extends Lifecycle {
    public final ConcurrentLinkedQueue<LifecycleObserver> LJLIL = new ConcurrentLinkedQueue<>();

    @Override // androidx.lifecycle.Lifecycle
    public final Lifecycle.State getCurrentState() {
        return Lifecycle.State.CREATED;
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void addObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.offer(observer);
    }

    @Override // androidx.lifecycle.Lifecycle
    public final void removeObserver(LifecycleObserver observer) {
        o.LJIIIZ(observer, "observer");
        this.LJLIL.remove(observer);
    }
}
