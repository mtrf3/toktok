package androidx.lifecycle;

import X.C16880lQ;
import X.InterfaceC79150V4o;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleController;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class LifecycleController {
    public final DispatchQueue dispatchQueue;
    public final Lifecycle lifecycle;
    public final Lifecycle.State minState;
    public final LifecycleEventObserver observer;

    public final void finish() {
        this.lifecycle.removeObserver(this.observer);
        this.dispatchQueue.finish();
    }

    private final void handleDestroy(InterfaceC79150V4o interfaceC79150V4o) {
        interfaceC79150V4o.LIZIZ(null);
        finish();
    }

    public LifecycleController(Lifecycle lifecycle, Lifecycle.State minState, DispatchQueue dispatchQueue, final InterfaceC79150V4o parentJob) {
        o.LJIIIZ(lifecycle, "lifecycle");
        o.LJIIIZ(minState, "minState");
        o.LJIIIZ(dispatchQueue, "dispatchQueue");
        o.LJIIIZ(parentJob, "parentJob");
        this.lifecycle = lifecycle;
        this.minState = minState;
        this.dispatchQueue = dispatchQueue;
        LifecycleEventObserver lifecycleEventObserver = new LifecycleEventObserver() { // from class: X.1hn
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                LifecycleController.m53observer$lambda0(LifecycleController.this, parentJob, lifecycleOwner, event);
            }
        };
        this.observer = lifecycleEventObserver;
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            parentJob.LIZIZ(null);
            finish();
        } else {
            lifecycle.addObserver(lifecycleEventObserver);
        }
    }

    /* renamed from: observer$lambda-0, reason: not valid java name */
    public static final void m53observer$lambda0(LifecycleController this$0, InterfaceC79150V4o parentJob, LifecycleOwner source, Lifecycle.Event event) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(parentJob, "$parentJob");
        o.LJIIIZ(source, "source");
        o.LJIIIZ(event, "<anonymous parameter 1>");
        if (source.getLifecycle().getCurrentState() == Lifecycle.State.DESTROYED) {
            parentJob.LIZIZ(null);
            this$0.finish();
        } else if (C16880lQ.LLJJIJIL(source.getLifecycle().getCurrentState(), this$0.minState) < 0) {
            this$0.dispatchQueue.pause();
        } else {
            this$0.dispatchQueue.resume();
        }
    }
}
