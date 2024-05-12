package X;

import java.io.IOException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUF implements PUJ {
    public final /* synthetic */ PUA LJLIL;
    public final /* synthetic */ PUJ LJLILLLLZI;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.LJIIIIZZ();
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

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        this.LJLIL.LJIIIIZZ();
        try {
            try {
                this.LJLILLLLZI.flush();
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
        LIZ.append("AsyncTimeout.sink(");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PUJ
    public final /* bridge */ /* synthetic */ C64545PUv timeout() {
        return this.LJLIL;
    }

    public PUF(PU4 pu4, PUG pug) {
        this.LJLIL = pu4;
        this.LJLILLLLZI = pug;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        long j2 = j;
        o.LJIIJ(source, "source");
        C30581Hy.LJIIIIZZ(source.LJLILLLLZI, 0L, j2);
        while (true) {
            long j3 = 0;
            if (j2 > 0) {
                PUR pur = source.LJLIL;
                if (pur == null) {
                    o.LJIIZILJ();
                    throw null;
                }
                do {
                    if (j3 < 65536) {
                        j3 += pur.LIZJ - pur.LIZIZ;
                        if (j3 >= j2) {
                            j3 = j2;
                        } else {
                            pur = pur.LJFF;
                        }
                    }
                    this.LJLIL.LJIIIIZZ();
                    try {
                        try {
                            this.LJLILLLLZI.LLIIIL(source, j3);
                            j2 -= j3;
                            this.LJLIL.LJIIJJI(true);
                        } catch (IOException e) {
                            throw this.LJLIL.LJIIJ(e);
                        }
                    } catch (Throwable th) {
                        this.LJLIL.LJIIJJI(false);
                        throw th;
                    }
                } while (pur != null);
                o.LJIIZILJ();
                throw null;
            }
            return;
        }
    }
}
