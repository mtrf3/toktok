package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.FiM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39718FiM extends InputStream {
    public final InputStream[] LJLIL;
    public int LJLILLLLZI;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLIL[this.LJLILLLLZI].available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i = this.LJLILLLLZI;
        IOException iOException = null;
        int i2 = 0;
        while (true) {
            InputStream[] inputStreamArr = this.LJLIL;
            if (i2 < inputStreamArr.length) {
                try {
                    inputStreamArr[i2].close();
                } catch (IOException e) {
                    if (i2 == i || iOException == null) {
                        iOException = e;
                    }
                }
                i2++;
            } else {
                return;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        int read;
        int i;
        while (true) {
            read = this.LJLIL[this.LJLILLLLZI].read();
            if (read != -1 || (i = this.LJLILLLLZI + 1) >= this.LJLIL.length) {
                break;
            }
            this.LJLILLLLZI = i;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException();
    }

    public C39718FiM(InputStream[] inputStreamArr) {
        if (inputStreamArr.length >= 2) {
            this.LJLIL = inputStreamArr;
            this.LJLILLLLZI = 0;
            return;
        }
        throw new IllegalArgumentException("Streams must be non-null and have more than 1 entry");
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        int i = (int) j;
        int read = read(new byte[i], 0, i);
        if (read >= 0) {
            return read;
        }
        return -1L;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read;
        int i3;
        while (true) {
            read = this.LJLIL[this.LJLILLLLZI].read(bArr, i, i2);
            if (read != -1 || (i3 = this.LJLILLLLZI + 1) >= this.LJLIL.length) {
                break;
            }
            this.LJLILLLLZI = i3;
        }
        return read;
    }
}
