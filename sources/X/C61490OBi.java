package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.OBi, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public class C61490OBi extends InputStream {
    public final InputStream LJLIL;

    public void LIZ(IOException iOException) {
        throw null;
    }

    @Override // java.io.InputStream
    public final synchronized void reset() {
        try {
            this.LJLIL.reset();
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        try {
            return this.LJLIL.available();
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        try {
            this.LJLIL.close();
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return this.LJLIL.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        try {
            return this.LJLIL.read();
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    public C61490OBi(InputStream inputStream) {
        this.LJLIL = inputStream;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        this.LJLIL.mark(i);
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        try {
            return this.LJLIL.read(bArr);
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        try {
            return this.LJLIL.skip(j);
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        try {
            return this.LJLIL.read(bArr, i, i2);
        } catch (IOException e) {
            LIZ(e);
            throw e;
        }
    }
}
