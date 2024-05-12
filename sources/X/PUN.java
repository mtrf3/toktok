package X;

import java.util.zip.CRC32;
import java.util.zip.Deflater;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PUN implements PUJ {
    public final C64535PUl LJLIL;
    public final Deflater LJLILLLLZI;
    public final PUM LJLJI;
    public boolean LJLJJI;
    public final CRC32 LJLJJL;

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLJJI) {
            return;
        }
        try {
            PUM pum = this.LJLJI;
            pum.LJLJI.finish();
            pum.LIZ(false);
            this.LJLIL.LLLLIILL((int) this.LJLJJL.getValue());
            this.LJLIL.LLLLIILL((int) this.LJLILLLLZI.getBytesRead());
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.LJLILLLLZI.end();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        try {
            this.LJLIL.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.LJLJJI = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // X.PUJ, java.io.Flushable
    public final void flush() {
        this.LJLJI.flush();
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLIL.timeout();
    }

    public PUN(PUG pug) {
        C64535PUl c64535PUl = new C64535PUl(pug);
        this.LJLIL = c64535PUl;
        Deflater deflater = new Deflater(-1, true);
        this.LJLILLLLZI = deflater;
        this.LJLJI = new PUM(c64535PUl, deflater);
        this.LJLJJL = new CRC32();
        C64533PUj c64533PUj = c64535PUl.LJLIL;
        c64533PUj.LJJIJIL(8075);
        c64533PUj.LJJIII(8);
        c64533PUj.LJJIII(0);
        c64533PUj.LJJIIZI(0);
        c64533PUj.LJJIII(0);
        c64533PUj.LJJIII(0);
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        o.LJIIJ(source, "source");
        if (j >= 0) {
            if (j == 0) {
                return;
            }
            PUR pur = source.LJLIL;
            if (pur != null) {
                long j2 = j;
                while (j2 > 0) {
                    int min = (int) Math.min(j2, pur.LIZJ - pur.LIZIZ);
                    this.LJLJJL.update(pur.LIZ, pur.LIZIZ, min);
                    j2 -= min;
                    pur = pur.LJFF;
                    if (pur == null) {
                        o.LJIIZILJ();
                        throw null;
                    }
                }
                this.LJLJI.LLIIIL(source, j);
                return;
            }
            o.LJIIZILJ();
            throw null;
        }
        String LIZ = C61845OOz.LIZ("byteCount < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }
}
