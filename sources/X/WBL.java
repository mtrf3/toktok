package X;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes15.dex */
public class WBL extends InputStream {
    public final InputStream LJLIL;
    public long LJLILLLLZI;
    public int LJLJI = 40;
    public volatile long LJLJJI;
    public volatile long LJLJJL;
    public long LJLJJLL;
    public long LJLJL;
    public long LJLJLJ;

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.LJLIL.reset();
    }

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
        return this.LJLIL.read();
    }

    public WBL(InputStream inputStream) {
        this.LJLIL = inputStream;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LJLIL.mark(i);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LJLIL.skip(j);
    }

    public final int LIZ(int i, byte[] bArr, int i2) {
        return super.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        if (this.LJLJJL > 0) {
            if (this.LJLJL == 0) {
                this.LJLJL = System.currentTimeMillis();
            }
            long j = this.LJLJJL - this.LJLJJLL;
            if (j > 0 && i2 > j) {
                i2 = (int) j;
            }
            int read = this.LJLIL.read(bArr, i, i2);
            if (read != -1) {
                this.LJLJJLL += read;
            }
            if (this.LJLJJLL >= this.LJLJJL) {
                long currentTimeMillis = System.currentTimeMillis();
                long j2 = currentTimeMillis - this.LJLJL;
                this.LJLJL = currentTimeMillis;
                long j3 = this.LJLJJI - j2;
                if (j3 > 0) {
                    long j4 = this.LJLJLJ;
                    if (j3 > j4) {
                        long j5 = j3 - j4;
                        this.LJLJLJ = 0L;
                        if (j5 > 0) {
                            this.LJLJL += j5;
                            try {
                                Thread.sleep(j5);
                            } catch (InterruptedException e) {
                                throw new IOException(e);
                            }
                        }
                    } else {
                        this.LJLJLJ = j4 - j3;
                    }
                } else if (j3 < 0) {
                    long j6 = this.LJLJLJ + (-j3);
                    this.LJLJLJ = j6;
                    if (j6 > 100) {
                        this.LJLJLJ = 100L;
                    }
                }
                this.LJLJJLL = 0L;
            }
            return read;
        }
        return this.LJLIL.read(bArr, i, i2);
    }
}
