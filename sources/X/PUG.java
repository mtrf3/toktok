package X;

import java.io.OutputStream;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUG implements PUJ {
    public final OutputStream LJLIL;
    public final C64545PUv LJLILLLLZI;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        this.LJLIL.flush();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("sink(");
        LIZ.append(this.LJLIL);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLILLLLZI;
    }

    public PUG(OutputStream out, C64545PUv c64545PUv) {
        o.LJIIJ(out, "out");
        this.LJLIL = out;
        this.LJLILLLLZI = c64545PUv;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        long j2 = j;
        o.LJIIJ(source, "source");
        C30581Hy.LJIIIIZZ(source.LJLILLLLZI, 0L, j2);
        while (j2 > 0) {
            this.LJLILLLLZI.LJFF();
            PUR pur = source.LJLIL;
            if (pur != null) {
                int min = (int) Math.min(j2, pur.LIZJ - pur.LIZIZ);
                this.LJLIL.write(pur.LIZ, pur.LIZIZ, min);
                int i = pur.LIZIZ + min;
                pur.LIZIZ = i;
                long j3 = min;
                j2 -= j3;
                source.LJLILLLLZI -= j3;
                if (i == pur.LIZJ) {
                    source.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                }
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }
}
