package X;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* renamed from: X.0rI, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class ExecutorC20520rI implements Executor {
    public final Executor LJLILLLLZI;
    public volatile Runnable LJLJJI;
    public final ArrayDeque<RunnableC20510rH> LJLIL = new ArrayDeque<>();
    public final Object LJLJI = new Object();

    public final boolean LIZ() {
        boolean z;
        synchronized (this.LJLJI) {
            if (!this.LJLIL.isEmpty()) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void LIZIZ() {
        synchronized (this.LJLJI) {
            RunnableC20510rH poll = this.LJLIL.poll();
            this.LJLJJI = poll;
            if (poll != null) {
                this.LJLILLLLZI.execute(this.LJLJJI);
            }
        }
    }

    public ExecutorC20520rI(Executor executor) {
        this.LJLILLLLZI = executor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.concurrent.Executor
    public final void execute(final Runnable runnable) {
        synchronized (this.LJLJI) {
            this.LJLIL.add(new Runnable(this, runnable) { // from class: X.0rH
                public final ExecutorC20520rI LJLIL;
                public final Runnable LJLILLLLZI;

                @Override // java.lang.Runnable
                public final void run() {
                    boolean LIZ;
                    try {
                        try {
                            this.LJLILLLLZI.run();
                            this.LJLIL.LIZIZ();
                        } catch (Throwable th) {
                            this.LJLIL.LIZIZ();
                            throw th;
                        }
                    } finally {
                        if (LIZ) {
                        }
                    }
                }

                {
                    this.LJLIL = this;
                    this.LJLILLLLZI = runnable;
                }
            });
            if (this.LJLJJI == null) {
                LIZIZ();
            }
        }
    }
}
