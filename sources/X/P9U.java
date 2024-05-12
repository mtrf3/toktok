package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class P9U extends FilterInputStream {
    public long LJLIL;
    public long LJLILLLLZI;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            if (this.LJLILLLLZI != -1) {
                ((FilterInputStream) this).in.reset();
                this.LJLIL = this.LJLILLLLZI;
            } else {
                throw new IOException("Mark not set");
            }
        } else {
            throw new IOException("Mark not supported");
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int available() {
        return (int) Math.min(((FilterInputStream) this).in.available(), this.LJLIL);
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

    public P9U(InputStream inputStream) {
        super(inputStream);
        this.LJLILLLLZI = -1L;
        this.LJLIL = 1048577L;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        ((FilterInputStream) this).in.mark(i);
        this.LJLILLLLZI = this.LJLIL;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) {
        long skip = ((FilterInputStream) this).in.skip(Math.min(j, this.LJLIL));
        this.LJLIL -= skip;
        return skip;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        long j = this.LJLIL;
        if (j == 0) {
            return -1;
        }
        int read = ((FilterInputStream) this).in.read(bArr, i, (int) Math.min(i2, j));
        if (read != -1) {
            this.LJLIL -= read;
        }
        return read;
    }
}
