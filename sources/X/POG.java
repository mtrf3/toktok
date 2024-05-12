package X;

import java.io.InputStream;

/* loaded from: classes12.dex */
public final class POG extends InputStream {
    public boolean LJLIL;
    public final /* synthetic */ InputStream LJLILLLLZI;
    public final /* synthetic */ C65208PiW LJLJI;
    public final /* synthetic */ C65206PiU LJLJJI;

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            this.LJLILLLLZI.close();
        } finally {
            if (!this.LJLIL) {
                this.LJLIL = true;
                C65206PiU c65206PiU = this.LJLJJI;
                C65208PiW c65208PiW = this.LJLJI;
                c65206PiU.getClass();
                C65206PiU.LIZIZ(c65208PiW, null);
            }
        }
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        this.LJLILLLLZI.reset();
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLILLLLZI.available();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LJLILLLLZI.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        return this.LJLILLLLZI.read();
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LJLILLLLZI.mark(i);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return this.LJLILLLLZI.read(bArr);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        return this.LJLILLLLZI.skip(j);
    }

    public POG(C65206PiU c65206PiU, InputStream inputStream, C65208PiW c65208PiW) {
        this.LJLJJI = c65206PiU;
        this.LJLILLLLZI = inputStream;
        this.LJLJI = c65208PiW;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        return this.LJLILLLLZI.read(bArr, i, i2);
    }
}
