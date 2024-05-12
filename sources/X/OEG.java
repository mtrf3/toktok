package X;

import java.io.InputStream;

/* loaded from: classes11.dex */
public final class OEG extends InputStream {
    public final OEF LJLIL;
    public long LJLILLLLZI;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.LJLIL.position(this.LJLILLLLZI);
    }

    @Override // java.io.InputStream
    public final int available() {
        long length = this.LJLIL.length() - this.LJLIL.position();
        if (length > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) length;
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.LJLIL.read();
    }

    public OEG(OEF oef) {
        this.LJLIL = oef;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LJLILLLLZI = i;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.LJLIL.read(bArr);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LJLIL.skip(j);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.LJLIL.read(bArr, i, i2);
    }
}
