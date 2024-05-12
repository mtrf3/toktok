package X;

import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import kotlin.jvm.internal.o;

/* renamed from: X.PUl, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64535PUl implements PVU {
    public final C64533PUj LJLIL = new C64533PUj();
    public boolean LJLILLLLZI;
    public final PUJ LJLJI;

    @Override // X.PVU
    public final OutputStream H() {
        return new C64538PUo(this);
    }

    @Override // X.PVU
    public final PVU LLIFFJFJJ() {
        if (!this.LJLILLLLZI) {
            long LIZJ = this.LJLIL.LIZJ();
            if (LIZJ > 0) {
                this.LJLJI.LLIIIL(this.LJLIL, LIZJ);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLLZIL() {
        if (!this.LJLILLLLZI) {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PUJ, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.LJLILLLLZI) {
            return;
        }
        try {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            th = null;
        } catch (Throwable th) {
            th = th;
        }
        try {
            this.LJLJI.close();
        } catch (Throwable th2) {
            if (th == null) {
                th = th2;
            }
        }
        this.LJLILLLLZI = true;
        if (th == null) {
        } else {
            throw th;
        }
    }

    @Override // X.PVU, X.PUJ, java.io.Flushable
    public final void flush() {
        if (!this.LJLILLLLZI) {
            C64533PUj c64533PUj = this.LJLIL;
            long j = c64533PUj.LJLILLLLZI;
            if (j > 0) {
                this.LJLJI.LLIIIL(c64533PUj, j);
            }
            this.LJLJI.flush();
            return;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.LJLILLLLZI;
    }

    @Override // X.PUJ
    public final C64545PUv timeout() {
        return this.LJLJI.timeout();
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("buffer(");
        LIZ.append(this.LJLJI);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    @Override // X.PVU
    public final C64533PUj LJJIJ() {
        return this.LJLIL;
    }

    public C64535PUl(PUJ puj) {
        this.LJLJI = puj;
    }

    @Override // X.PVU
    public final PVU LJJZZIII(long j) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIIJ(j);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLIIIZ(String string) {
        o.LJIIJ(string, "string");
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJJI(string);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLJZIJLIL(long j) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIJIIJIL(C30581Hy.LJJIZ(j));
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLLLIILL(int i) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIIZI(((i & 255) << 24) | (((-16777216) & i) >>> 24) | ((16711680 & i) >>> 8) | ((65280 & i) << 8));
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU LLLLLILLIL(long j) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIIJZLJL(j);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU c(C64537PUn byteString) {
        o.LJIIJ(byteString, "byteString");
        if (!this.LJLILLLLZI) {
            C64533PUj c64533PUj = this.LJLIL;
            c64533PUj.getClass();
            byteString.write$jvm(c64533PUj);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final long j(PUC puc) {
        long j = 0;
        while (true) {
            long read = ((PUE) puc).read(this.LJLIL, FileUtils.BUFFER_SIZE);
            if (read == -1) {
                return j;
            }
            j += read;
            LLIFFJFJJ();
        }
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer source) {
        o.LJIIJ(source, "source");
        if (!this.LJLILLLLZI) {
            int write = this.LJLIL.write(source);
            LLIFFJFJJ();
            return write;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeByte(int i) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIII(i);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeInt(int i) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIIZI(i);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU writeShort(int i) {
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJIJIL(i);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PVU
    public final PVU write(byte[] source) {
        o.LJIIJ(source, "source");
        if (!this.LJLILLLLZI) {
            this.LJLIL.m27write(source);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }

    @Override // X.PUJ
    public final void LLIIIL(C64533PUj source, long j) {
        o.LJIIJ(source, "source");
        if (!this.LJLILLLLZI) {
            this.LJLIL.LLIIIL(source, j);
            LLIFFJFJJ();
        } else {
            "closed".toString();
            throw new IllegalStateException("closed");
        }
    }

    @Override // X.PVU
    public final PVU LJJI(int i, byte[] source, int i2) {
        o.LJIIJ(source, "source");
        if (!this.LJLILLLLZI) {
            this.LJLIL.LJJ(i, source, i2);
            LLIFFJFJJ();
            return this;
        }
        "closed".toString();
        throw new IllegalStateException("closed");
    }
}
