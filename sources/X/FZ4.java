package X;

import java.util.concurrent.Semaphore;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FZ4 {
    public final long LIZ;
    public final Semaphore LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FZ4)) {
            return false;
        }
        FZ4 fz4 = (FZ4) obj;
        return this.LIZ == fz4.LIZ && o.LJ(this.LIZIZ, fz4.LIZIZ);
    }

    public final int hashCode() {
        int LLJIJIL = C16880lQ.LLJIJIL(this.LIZ) * 31;
        Semaphore semaphore = this.LIZIZ;
        return LLJIJIL + (semaphore == null ? 0 : semaphore.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("BlockWrapper(block=");
        LIZ.append(this.LIZ);
        LIZ.append(", sem=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public FZ4(long j, Semaphore semaphore) {
        this.LIZ = j;
        this.LIZIZ = semaphore;
    }
}
