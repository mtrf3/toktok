package androidx.lifecycle;

import X.AbstractC78621UtN;
import X.C09H;
import X.C36636EZk;
import X.MBA;
import java.util.ArrayDeque;
import java.util.Queue;
import kotlin.jvm.internal.o;

/* loaded from: classes.dex */
public final class DispatchQueue {
    public boolean finished;
    public boolean isDraining;
    public boolean paused = true;
    public final Queue<Runnable> queue = new ArrayDeque();

    public final void finish() {
        this.finished = true;
        drainQueue();
    }

    public final void pause() {
        this.paused = true;
    }

    public final boolean canRun() {
        if (this.finished || !this.paused) {
            return true;
        }
        return false;
    }

    public final void drainQueue() {
        if (this.isDraining) {
            return;
        }
        try {
            this.isDraining = true;
            while ((!this.queue.isEmpty()) && canRun()) {
                Runnable poll = this.queue.poll();
                if (poll != null) {
                    poll.run();
                }
            }
        } finally {
            this.isDraining = false;
        }
    }

    public final void resume() {
        if (!this.paused) {
            return;
        }
        if (!this.finished) {
            this.paused = false;
            drainQueue();
        } else {
            "Cannot resume a finished dispatcher".toString();
            throw new IllegalStateException("Cannot resume a finished dispatcher");
        }
    }

    private final void enqueue(Runnable runnable) {
        if (this.queue.offer(runnable)) {
            drainQueue();
        } else {
            "cannot enqueue any more runnables".toString();
            throw new IllegalStateException("cannot enqueue any more runnables");
        }
    }

    /* renamed from: dispatchAndEnqueue$lambda-2$lambda-1, reason: not valid java name */
    public static final void m50dispatchAndEnqueue$lambda2$lambda1(DispatchQueue this$0, Runnable runnable) {
        o.LJIIIZ(this$0, "this$0");
        o.LJIIIZ(runnable, "$runnable");
        this$0.enqueue(runnable);
    }

    public final void dispatchAndEnqueue(MBA context, Runnable runnable) {
        o.LJIIIZ(context, "context");
        o.LJIIIZ(runnable, "runnable");
        AbstractC78621UtN LJJIJIL = C36636EZk.LIZ.LJJIJIL();
        if (LJJIJIL.isDispatchNeeded(context) || canRun()) {
            LJJIJIL.dispatch(context, new C09H(0, this, runnable));
        } else {
            enqueue(runnable);
        }
    }
}
