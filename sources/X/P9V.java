package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class P9V extends FilterInputStream {
    public int LJLIL;
    public int LJLILLLLZI;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return Math.min(((FilterInputStream) this).in.available(), this.LJLIL);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        if (this.LJLIL == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            this.LJLIL--;
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.LJLILLLLZI != -1) {
                ((FilterInputStream) this).in.reset();
                this.LJLIL = this.LJLILLLLZI;
                return;
            }
            throw new IOException("mark not set");
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.mark(i);
            this.LJLILLLLZI = this.LJLIL;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.LJLIL));
        this.LJLIL = (int) (this.LJLIL - skip);
        return skip;
    }

    public P9V(InputStream inputStream, int i) {
        super(inputStream);
        if (i >= 0) {
            this.LJLIL = i;
            this.LJLILLLLZI = -1;
            return;
        }
        throw new IllegalArgumentException("limit must be >= 0");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int i3 = this.LJLIL;
        if (i3 == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, Math.min(i2, i3));
        if (read > 0) {
            this.LJLIL -= read;
        }
        return read;
    }
}
