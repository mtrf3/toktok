package X;

import java.io.InputStream;
import java.util.Arrays;

/* renamed from: X.EsS, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37796EsS extends InputStream {
    public int LJLIL;
    public int LJLILLLLZI;
    public final int LJLJI;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLJI - this.LJLIL;
    }

    @Override // java.io.InputStream
    public final int read() {
        int i = this.LJLIL;
        if (i < this.LJLJI) {
            this.LJLIL = i + 1;
            return 0;
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LJLIL = this.LJLILLLLZI;
    }

    public C37796EsS(int i) {
        this.LJLJI = i;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLILLLLZI = this.LJLIL;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int i;
        if (bArr != null) {
            i = bArr.length;
        } else {
            i = 0;
        }
        return read(bArr, 0, i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = this.LJLJI;
        int i2 = this.LJLIL;
        long j2 = i - i2;
        if (j < j2) {
            if (j < 0) {
                j = 0;
            }
            j2 = j;
        }
        this.LJLIL = i2 + ((int) j2);
        return j2;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (bArr != null) {
            if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                int i3 = this.LJLIL;
                int i4 = this.LJLJI;
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
                Arrays.fill(bArr, i, i + i2, (byte) 0);
                this.LJLIL += i2;
                return i2;
            }
            throw new IndexOutOfBoundsException();
        }
        throw null;
    }
}
