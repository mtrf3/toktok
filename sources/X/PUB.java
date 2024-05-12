package X;

import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUB implements PUC {
    public final /* synthetic */ PUA LJLIL;
    public final /* synthetic */ PUC LJLILLLLZI;

    @Override // X.PUC, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            try {
                this.LJLILLLLZI.close();
                this.LJLIL.LJIIJJI(true);
            } catch (IOException e) {
                throw this.LJLIL.LJIIJ(e);
            }
        } catch (Throwable th) {
            this.LJLIL.LJIIJJI(false);
            throw th;
        }
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("AsyncTimeout.source(");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PUC
    public final /* bridge */ /* synthetic */ C64545PUv timeout() {
        return this.LJLIL;
    }

    public PUB(PU4 pu4, PUE pue) {
        this.LJLIL = pu4;
        this.LJLILLLLZI = pue;
    }

    @Override // X.PUC
    public final long read(C64533PUj sink, long j) {
        o.LJIIJ(sink, "sink");
        this.LJLIL.LJIIIIZZ();
        try {
            try {
                long read = this.LJLILLLLZI.read(sink, j);
                this.LJLIL.LJIIJJI(true);
                return read;
            } catch (IOException e) {
                throw this.LJLIL.LJIIJ(e);
            }
        } catch (Throwable th) {
            this.LJLIL.LJIIJJI(false);
            throw th;
        }
    }
}
