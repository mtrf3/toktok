package X;

import java.io.InputStream;

/* renamed from: X.PZj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64663PZj extends InputStream {
    public final InputStream LJLIL;
    public final InterfaceC64803Pbz LJLILLLLZI;

    @Override // java.io.InputStream
    public final synchronized void reset() {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            inputStream.reset();
        } else {
            super.reset();
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.available();
        }
        return super.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            InputStream inputStream = this.LJLIL;
            if (inputStream != null) {
                inputStream.close();
            }
            InterfaceC64803Pbz interfaceC64803Pbz = this.LJLILLLLZI;
            if (interfaceC64803Pbz != null) {
                interfaceC64803Pbz.cancel();
            }
        } catch (Throwable unused) {
        }
        super.close();
    }

    @Override // java.io.InputStream
    public final boolean markSupported() {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.markSupported();
        }
        return super.markSupported();
    }

    @Override // java.io.InputStream
    public final int read() {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.read();
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized void mark(int i) {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            inputStream.mark(i);
        } else {
            super.mark(i);
        }
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.read(bArr);
        }
        return super.read(bArr);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.skip(j);
        }
        return super.skip(j);
    }

    public C64663PZj(InputStream inputStream, InterfaceC64803Pbz interfaceC64803Pbz) {
        this.LJLIL = inputStream;
        this.LJLILLLLZI = interfaceC64803Pbz;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        InputStream inputStream = this.LJLIL;
        if (inputStream != null) {
            return inputStream.read(bArr, i, i2);
        }
        return super.read(bArr, i, i2);
    }
}
