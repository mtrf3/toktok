package X;

import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public abstract class PUH implements PUJ {
    public final PUJ LJLIL;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        this.LJLIL.flush();
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLIL.timeout();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('(');
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public PUH(PUJ delegate) {
        o.LJIIJ(delegate, "delegate");
        this.LJLIL = delegate;
    }
}
