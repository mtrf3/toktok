package X;

import com.bytedance.forest.Forest;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.RandomAccessFile;
import kotlin.jvm.internal.AqS157S0200000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O4Q extends InputStream {
    public int LJLIL;
    public boolean LJLILLLLZI;
    public int LJLJI;
    public OSZ<? extends File, ? extends RandomAccessFile> LJLJJI;
    public final C61295O3v LJLJJL;
    public final O4O LJLJJLL;
    public final int LJLJL;

    public final void LIZ() {
        if (this.LJLJJLL.LJLLJ == this.LJLJL) {
        } else {
            throw new IOException("input stream corrupted");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        if (!this.LJLILLLLZI) {
            try {
                int LJIIJJI = this.LJLJJLL.LJIIJJI() - this.LJLIL;
                if (LJIIJJI < 0) {
                    return 0;
                }
                return LJIIJJI;
            } catch (Throwable th) {
                LIZIZ("available", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        C76800UCe c76800UCe;
        RandomAccessFile second;
        C61295O3v response = this.LJLJJL;
        o.LJIIJ(response, "response");
        C61325O4z.LJ(new AqS157S0200000_10(response, (Throwable) null, 20));
        try {
            OSZ<? extends File, ? extends RandomAccessFile> osz = this.LJLJJI;
            if (osz != null && (second = osz.getSecond()) != null) {
                second.close();
                c76800UCe = C76800UCe.LIZ;
            } else {
                c76800UCe = null;
            }
            C3C5.m7constructorimpl(c76800UCe);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        this.LJLJJI = null;
        this.LJLILLLLZI = true;
        try {
            this.LJLJJLL.LIZIZ(false);
        } catch (Throwable th2) {
            LIZIZ("close", th2);
            throw null;
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        if (!this.LJLILLLLZI) {
            byte[] bArr = new byte[1];
            if (read(bArr, 0, 1) == -1) {
                return -1;
            }
            return bArr[0] & 255;
        }
        throw new IOException("input stream closed");
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        if (!this.LJLILLLLZI) {
            try {
                return super.skip(j);
            } catch (Throwable th) {
                LIZIZ("skip", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }

    public final void LIZIZ(String str, Throwable th) {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("error happens when executing ");
        LIZ.append(str);
        C39930Flm.LIZJ("ForestInputStream", X1D.LIZIZ(LIZ), th, true);
        if (this.LJLJJLL.LJIILIIL()) {
            O40.LIZLLL(this.LJLJJL);
            C61295O3v response = this.LJLJJL;
            o.LJIIJ(response, "response");
            C61325O4z.LJ(new AqS157S0200000_10(response, th, 20));
            throw th;
        }
        throw th;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (!this.LJLILLLLZI) {
            bArr.getClass();
            LIZ();
            try {
                int LJIIJ = this.LJLJJLL.LJIIJ(this.LJLIL, bArr, i, i2, this.LJLJJL, this);
                if (this.LJLJJLL.LJIILIIL()) {
                    O40.LIZLLL(this.LJLJJL);
                }
                if (LJIIJ == -1) {
                    return -1;
                }
                if (LJIIJ == 0 && this.LJLJI == 0) {
                    C39930Flm.LIZJ("ForestInputStream", "unexpected code reached, repeating read 0 byte", null, true);
                    return -1;
                }
                this.LJLJI = LJIIJ;
                this.LJLIL += LJIIJ;
                return LJIIJ;
            } catch (Throwable th) {
                LIZIZ("read", th);
                throw null;
            }
        }
        throw new IOException("input stream closed");
    }

    public O4Q(Forest forest, C61295O3v response, O4O forestBuffer, int i) {
        o.LJIIJ(forest, "forest");
        o.LJIIJ(response, "response");
        o.LJIIJ(forestBuffer, "forestBuffer");
        this.LJLJJL = response;
        this.LJLJJLL = forestBuffer;
        this.LJLJL = i;
        this.LJLJI = -1;
    }
}
