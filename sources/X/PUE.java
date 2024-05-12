package X;

import java.io.IOException;
import java.io.InputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUE implements PUC {
    public final InputStream LJLIL;
    public final C64545PUv LJLILLLLZI;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("source(");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PUC
    public final C64545PUv timeout() {
        return this.LJLILLLLZI;
    }

    public PUE(InputStream input, C64545PUv c64545PUv) {
        o.LJIIJ(input, "input");
        this.LJLIL = input;
        this.LJLILLLLZI = c64545PUv;
    }

    @Override // X.PUC
    public final long read(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        if (j == 0) {
            return 0L;
        }
        if (j >= 0) {
            try {
                this.LJLILLLLZI.LJFF();
                PUR LJIJJ = sink.LJIJJ(1);
                int read = this.LJLIL.read(LJIJJ.LIZ, LJIJJ.LIZJ, (int) Math.min(j, 8192 - LJIJJ.LIZJ));
                if (read == -1) {
                    return -1L;
                }
                LJIJJ.LIZJ += read;
                long j2 = read;
                sink.LJLILLLLZI += j2;
                return j2;
            } catch (AssertionError e) {
                if (PU7.LIZIZ(e)) {
                    throw new IOException(e);
                }
                throw e;
            }
        }
        String LIZ = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }
}
