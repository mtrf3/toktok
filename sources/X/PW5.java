package X;

import java.io.ByteArrayOutputStream;
import java.io.EOFException;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class PW5 extends ByteArrayOutputStream {
    public final PW6 LJLIL;

    public final synchronized boolean LIZ() {
        boolean z = false;
        try {
            C64533PUj c64533PUj = new C64533PUj();
            byte[] bArr = ((ByteArrayOutputStream) this).buf;
            int i = 64;
            if (bArr.length < 64) {
                i = bArr.length;
            }
            c64533PUj.LJJ(0, bArr, i);
            int i2 = 0;
            while (!c64533PUj.LLJ()) {
                int LJIJ = c64533PUj.LJIJ();
                if (Character.isISOControl(LJIJ) && !Character.isWhitespace(LJIJ)) {
                    return false;
                }
                i2++;
                if (i2 >= 16) {
                    break;
                }
            }
            z = true;
        } catch (EOFException unused) {
        }
        return z;
    }

    @Override // java.io.ByteArrayOutputStream
    public final void reset() {
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        super.close();
        this.LJLIL.LIZ(((ByteArrayOutputStream) this).count);
    }

    public PW5(PW6 manager) {
        o.LJIIIZ(manager, "manager");
        this.LJLIL = manager;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final void write(int i) {
        long LIZIZ = this.LJLIL.LIZIZ(1L);
        synchronized (this) {
            if (LIZIZ > 0) {
                super.write(i);
            }
        }
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) {
        long LIZIZ = this.LJLIL.LIZIZ(i2);
        synchronized (this) {
            if (LIZIZ > 0) {
                super.write(bArr, i, (int) LIZIZ);
            }
        }
    }
}
