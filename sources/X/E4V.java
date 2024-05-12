package X;

import java.util.concurrent.Executor;

/* loaded from: classes7.dex */
public final class E4V implements W87 {
    public volatile ExecutorC37714Er8 LIZ;

    @Override // X.W87
    public final Executor LIZIZ() {
        if (((Boolean) DLO.LIZ.getValue()).booleanValue()) {
            return LJFF();
        }
        return C38995FSd.LIZLLL();
    }

    @Override // X.W87
    public final Executor LIZJ() {
        if (((Boolean) DLO.LIZ.getValue()).booleanValue()) {
            return LJFF();
        }
        return C38995FSd.LIZLLL();
    }

    public final Executor LJFF() {
        ExecutorC37714Er8 executorC37714Er8 = this.LIZ;
        if (executorC37714Er8 != null) {
            return executorC37714Er8;
        }
        synchronized (this) {
            ExecutorC37714Er8 executorC37714Er82 = this.LIZ;
            if (executorC37714Er82 != null) {
                return executorC37714Er82;
            }
            ExecutorC37714Er8 executorC37714Er83 = new ExecutorC37714Er8(C38995FSd.LIZLLL());
            this.LIZ = executorC37714Er83;
            return executorC37714Er83;
        }
    }

    @Override // X.W87
    public final Executor LIZ() {
        return C38995FSd.LIZIZ();
    }

    @Override // X.W87
    public final Executor LIZLLL() {
        return C38995FSd.LIZIZ();
    }

    @Override // X.W87
    public final Executor LJ() {
        return C38995FSd.LIZIZ();
    }
}
