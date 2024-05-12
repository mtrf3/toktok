package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PUD implements PUC {
    public final PUC delegate;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.delegate.close();
    }

    @Override // X.PUC
    public C64545PUv timeout() {
        return this.delegate.timeout();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('(');
        LIZ.append(this.delegate);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PUD(PUC delegate) {
        o.LJIIJ(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // X.PUC
    public long read(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        return this.delegate.read(sink, j);
    }
}
