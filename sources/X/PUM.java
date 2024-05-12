package X;

import java.util.zip.Deflater;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUM implements PUJ {
    public boolean LJLIL;
    public final PVU LJLILLLLZI;
    public final Deflater LJLJI;

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        LIZ(true);
        this.LJLILLLLZI.flush();
    }

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLIL) {
            return;
        }
        try {
            this.LJLJI.finish();
            LIZ(false);
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.LJLJI.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.LJLILLLLZI.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.LJLIL = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLILLLLZI.timeout();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("DeflaterSink(");
        LIZ.append(this.LJLILLLLZI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final void LIZ(boolean z) {
        PUR LJIJJ;
        int deflate;
        C64533PUj LJJIJ = this.LJLILLLLZI.LJJIJ();
        while (true) {
            LJIJJ = LJJIJ.LJIJJ(1);
            if (z) {
                Deflater deflater = this.LJLJI;
                byte[] bArr = LJIJJ.LIZ;
                int i = LJIJJ.LIZJ;
                deflate = deflater.deflate(bArr, i, 8192 - i, 2);
            } else {
                Deflater deflater2 = this.LJLJI;
                byte[] bArr2 = LJIJJ.LIZ;
                int i2 = LJIJJ.LIZJ;
                deflate = deflater2.deflate(bArr2, i2, 8192 - i2);
            }
            if (deflate > 0) {
                LJIJJ.LIZJ += deflate;
                LJJIJ.LJLILLLLZI += deflate;
                this.LJLILLLLZI.LLIFFJFJJ();
            } else if (this.LJLJI.needsInput()) {
                break;
            }
        }
        if (LJIJJ.LIZIZ == LJIJJ.LIZJ) {
            LJJIJ.LJLIL = LJIJJ.LIZ();
            PUS.LIZ(LJIJJ);
        }
    }

    public PUM(C64535PUl c64535PUl, Deflater deflater) {
        this.LJLILLLLZI = c64535PUl;
        this.LJLJI = deflater;
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        long j2 = j;
        o.LJIIJ(source, "source");
        C30581Hy.LJIIIIZZ(source.LJLILLLLZI, 0L, j2);
        while (j2 > 0) {
            PUR pur = source.LJLIL;
            if (pur != null) {
                int min = (int) Math.min(j2, pur.LIZJ - pur.LIZIZ);
                this.LJLJI.setInput(pur.LIZ, pur.LIZIZ, min);
                LIZ(false);
                long j3 = min;
                source.LJLILLLLZI -= j3;
                int i = pur.LIZIZ + min;
                pur.LIZIZ = i;
                if (i == pur.LIZJ) {
                    source.LJLIL = pur.LIZ();
                    PUS.LIZ(pur);
                }
                j2 -= j3;
            } else {
                o.LJIIZILJ();
                throw null;
            }
        }
    }
}
