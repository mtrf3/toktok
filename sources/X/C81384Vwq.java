package X;

import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.Vwq, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81384Vwq extends InputStream {
    public final InputStream LJLIL;
    public final byte[] LJLILLLLZI;
    public final VWQ<byte[]> LJLJI;
    public int LJLJJI;
    public int LJLJJL;
    public boolean LJLJJLL;

    public final void LIZ() {
        if (!this.LJLJJLL) {
        } else {
            throw new IOException("stream already closed");
        }
    }

    @Override // java.io.InputStream
    public final int available() {
        boolean z;
        if (this.LJLJJL <= this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        LIZ();
        return this.LJLIL.available() + (this.LJLJJI - this.LJLJJL);
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (!this.LJLJJLL) {
            this.LJLJJLL = true;
            this.LJLJI.LIZ(this.LJLILLLLZI);
            super.close();
        }
    }

    public final void finalize() {
        if (!this.LJLJJLL) {
            W58.LJI("PooledByteInputStream", "Finalized without closing");
            close();
        }
        super.finalize();
    }

    @Override // java.io.InputStream
    public final int read() {
        boolean z;
        if (this.LJLJJL <= this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        LIZ();
        if (this.LJLJJL >= this.LJLJJI) {
            int read = this.LJLIL.read(this.LJLILLLLZI);
            if (read <= 0) {
                return -1;
            }
            this.LJLJJI = read;
            this.LJLJJL = 0;
        }
        byte[] bArr = this.LJLILLLLZI;
        int i = this.LJLJJL;
        this.LJLJJL = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        boolean z;
        if (this.LJLJJL <= this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        LIZ();
        int i = this.LJLJJI;
        int i2 = this.LJLJJL;
        long j2 = i - i2;
        if (j2 >= j) {
            this.LJLJJL = (int) (i2 + j);
            return j;
        }
        this.LJLJJL = i;
        return this.LJLIL.skip(j - j2) + j2;
    }

    public C81384Vwq(InputStream inputStream, byte[] bArr, WB4 wb4) {
        inputStream.getClass();
        this.LJLIL = inputStream;
        bArr.getClass();
        this.LJLILLLLZI = bArr;
        wb4.getClass();
        this.LJLJI = wb4;
        this.LJLJJI = 0;
        this.LJLJJL = 0;
        this.LJLJJLL = false;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        boolean z;
        if (this.LJLJJL <= this.LJLJJI) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJIIIZ(z);
        LIZ();
        if (this.LJLJJL >= this.LJLJJI) {
            int read = this.LJLIL.read(this.LJLILLLLZI);
            if (read <= 0) {
                return -1;
            }
            this.LJLJJI = read;
            this.LJLJJL = 0;
        }
        int min = Math.min(this.LJLJJI - this.LJLJJL, i2);
        System.arraycopy(this.LJLILLLLZI, this.LJLJJL, bArr, i, min);
        this.LJLJJL += min;
        return min;
    }
}
