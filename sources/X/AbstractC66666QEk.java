package X;

import java.util.concurrent.Executor;

/* renamed from: X.QEk, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public abstract class AbstractC66666QEk {
    public final Executor mExecutor;

    public abstract void onRequestFinished(QE2 qe2);

    public Executor getExecutor() {
        return this.mExecutor;
    }

    public AbstractC66666QEk(Executor executor) {
        if (executor != null) {
            this.mExecutor = executor;
            return;
        }
        throw new IllegalStateException("Executor must not be null");
    }
}
