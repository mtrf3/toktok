package X;

import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.F8p, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38487F8p extends InputStream {
    public final byte[] LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;
    public final int LJLJJI;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLJJI - this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.LJLILLLLZI;
        if (i >= this.LJLJJI) {
            return -1;
        }
        byte[] bArr = this.LJLIL;
        this.LJLILLLLZI = i + 1;
        return bArr[i];
    }

    @Override // java.io.InputStream
    public final byte[] readAllBytes() {
        byte[] result = Arrays.copyOfRange(this.LJLIL, this.LJLILLLLZI, this.LJLJJI);
        this.LJLILLLLZI = this.LJLJJI;
        o.LJIIIIZZ(result, "result");
        return result;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LJLILLLLZI = this.LJLJI;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLJI = this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.LJLJJI;
        int i2 = this.LJLILLLLZI;
        long j2 = i - i2;
        if (j < j2) {
            if (j < 0) {
                j = 0;
            }
            j2 = j;
        }
        this.LJLILLLLZI = i2 + ((int) j2);
        return j2;
    }

    @Override // java.io.InputStream
    public final long transferTo(OutputStream out) {
        o.LJIIIZ(out, "out");
        int i = this.LJLJJI;
        int i2 = this.LJLILLLLZI;
        int i3 = i - i2;
        out.write(this.LJLIL, i2, i3);
        this.LJLILLLLZI = this.LJLJJI;
        return i3;
    }

    public C38487F8p(byte[] buf, int i) {
        o.LJIIIZ(buf, "buf");
        this.LJLIL = buf;
        this.LJLJI = 0;
        this.LJLJJI = Math.min(i, buf.length);
        this.LJLILLLLZI = 0;
    }

    @Override // java.io.InputStream
    public final int read(byte[] b, int i, int i2) {
        o.LJIIIZ(b, "b");
        if (i + i2 <= b.length) {
            int i3 = this.LJLILLLLZI;
            int i4 = this.LJLJJI;
            if (i3 >= i4) {
                return -1;
            }
            int i5 = i4 - i3;
            if (i2 > i5) {
                i2 = i5;
            }
            if (i2 <= 0) {
                return 0;
            }
            System.arraycopy(this.LJLIL, i3, b, i, i2);
            this.LJLILLLLZI += i2;
            return i2;
        }
        throw new IndexOutOfBoundsException("checkFromIndexSize error");
    }

    @Override // java.io.InputStream
    public final int readNBytes(byte[] b, int i, int i2) {
        o.LJIIIZ(b, "b");
        int read = read(b, i, i2);
        if (read == -1) {
            return 0;
        }
        return read;
    }
}
