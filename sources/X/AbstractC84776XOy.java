package X;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: X.XOy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84776XOy<V> extends XPE<V> {
    public static final Logger LJLIL = Logger.getLogger(AbstractC84776XOy.class.getName());

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public abstract V get();

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    @Override // X.C76L
    public final void LJFF(Runnable runnable, Executor executor) {
        C76917UGr.LJII(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e) {
            Logger logger = LJLIL;
            Level level = Level.SEVERE;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("RuntimeException while executing runnable ");
            LIZ.append(runnable);
            LIZ.append(" with executor ");
            LIZ.append(executor);
            logger.log(level, X1D.LIZIZ(LIZ), (Throwable) e);
        }
    }

    @Override // java.util.concurrent.Future
    public final V get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return get();
    }
}
