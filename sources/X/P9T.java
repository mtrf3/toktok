package X;

import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class P9T extends InputStream {
    public final InputStream LJLIL;
    public long LJLILLLLZI;
    public long LJLJI;
    public long LJLJJI;
    public long LJLJJL = -1;

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLIL.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.LJLIL.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LJLIL.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        int read = this.LJLIL.read();
        if (read != -1) {
            this.LJLILLLLZI++;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final void reset() {
        LIZIZ(this.LJLJJL);
    }

    public P9T(InputStream inputStream) {
        this.LJLIL = inputStream.markSupported() ? inputStream : new BufferedInputStream(inputStream, 4096);
    }

    public final void LIZIZ(long j) {
        if (this.LJLILLLLZI <= this.LJLJJI && j >= this.LJLJI) {
            this.LJLIL.reset();
            LIZ(this.LJLJI, j);
            this.LJLILLLLZI = j;
            return;
        }
        throw new IOException("reset failed");
    }

    public final long LIZJ(int i) {
        long j = this.LJLILLLLZI;
        long j2 = i + j;
        long j3 = this.LJLJJI;
        if (j3 < j2) {
            try {
                if (this.LJLJI < j && j <= j3) {
                    this.LJLIL.reset();
                    this.LJLIL.mark((int) (j2 - this.LJLJI));
                    LIZ(this.LJLJI, this.LJLILLLLZI);
                } else {
                    this.LJLJI = j;
                    this.LJLIL.mark((int) (j2 - j));
                }
                this.LJLJJI = j2;
            } catch (Throwable th) {
                throw new IllegalStateException(C25620zW.LIZ("set index failed: ", th));
            }
        }
        return this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLJJL = LIZJ(i);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        int read = this.LJLIL.read(bArr);
        if (read != -1) {
            this.LJLILLLLZI += read;
        }
        return read;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        long skip = this.LJLIL.skip(j);
        this.LJLILLLLZI += skip;
        return skip;
    }

    public final void LIZ(long j, long j2) {
        while (j < j2) {
            long skip = this.LJLIL.skip(j2 - j);
            if (skip == 0) {
                if (read() == -1) {
                    return;
                } else {
                    skip = 1;
                }
            }
            j += skip;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.LJLIL.read(bArr, i, i2);
        if (read != -1) {
            this.LJLILLLLZI += read;
        }
        return read;
    }
}
