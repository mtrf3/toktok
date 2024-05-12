package X;

import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes12.dex */
public final class PU3 implements Executor {
    public static final AtomicBoolean LJLJJLL = new AtomicBoolean(false);
    public final BlockingQueue<Runnable> LJLIL = new LinkedBlockingQueue();
    public boolean LJLILLLLZI;
    public boolean LJLJI;
    public InterruptedIOException LJLJJI;
    public RuntimeException LJLJJL;

    public final void LIZ(int i) {
        long nanoTime = System.nanoTime();
        long convert = TimeUnit.NANOSECONDS.convert(i, TimeUnit.MILLISECONDS);
        if (this.LJLJI) {
            InterruptedIOException interruptedIOException = this.LJLJJI;
            if (interruptedIOException != null) {
                throw interruptedIOException;
            }
            throw this.LJLJJL;
        }
        if (!this.LJLILLLLZI) {
            this.LJLILLLLZI = true;
            while (this.LJLILLLLZI) {
                if (i == 0) {
                    try {
                        LIZIZ(0L, false).run();
                    } catch (SocketTimeoutException e) {
                        this.LJLILLLLZI = false;
                        this.LJLJI = true;
                        throw e;
                    } catch (InterruptedIOException e2) {
                        this.LJLILLLLZI = false;
                        this.LJLJI = true;
                        this.LJLJJI = e2;
                        throw e2;
                    } catch (RuntimeException e3) {
                        this.LJLILLLLZI = false;
                        this.LJLJI = true;
                        this.LJLJJL = e3;
                        throw e3;
                    }
                } else {
                    LIZIZ((convert - System.nanoTime()) + nanoTime, true).run();
                }
            }
            return;
        }
        throw new IllegalStateException("Cannot run loop when it is already running.");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (runnable != null) {
            try {
                ((LinkedBlockingQueue) this.LJLIL).put(runnable);
                return;
            } catch (InterruptedException e) {
                throw new RejectedExecutionException(e);
            }
        }
        throw new IllegalArgumentException();
    }

    public final Runnable LIZIZ(long j, boolean z) {
        Runnable runnable;
        try {
            if (!z) {
                runnable = (Runnable) ((LinkedBlockingQueue) this.LJLIL).take();
            } else {
                runnable = (Runnable) ((LinkedBlockingQueue) this.LJLIL).poll(j, TimeUnit.NANOSECONDS);
            }
            if (runnable != null) {
                return runnable;
            }
            throw new SocketTimeoutException("ttnet");
        } catch (InterruptedException e) {
            InterruptedIOException interruptedIOException = new InterruptedIOException();
            interruptedIOException.initCause(e);
            throw interruptedIOException;
        }
    }
}
