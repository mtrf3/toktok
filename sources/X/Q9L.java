package X;

import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class Q9L extends Q9K {
    public final byte[] LIZIZ;
    public final InputStream LIZJ;
    public final int LIZLLL;
    public int LJ;

    @Override // X.Q9I
    public final boolean LJJIII() {
        if (this.LIZLLL - this.LJ > 0) {
            return true;
        }
        return false;
    }

    @Override // X.Q9I
    public final byte readByte() {
        this.LJ++;
        return (byte) this.LIZJ.read();
    }

    public Q9L(InputStream inputStream) {
        int i;
        this.LIZIZ = new byte[256];
        this.LIZJ = inputStream;
        try {
            i = inputStream.available();
        } catch (IOException unused) {
            i = -1;
        }
        this.LIZLLL = i;
    }

    @Override // X.Q9I
    public final String LJJIFFI(long j) {
        byte[] bArr;
        this.LJ = (int) (this.LJ + j);
        if (j > 256) {
            int i = (int) j;
            bArr = new byte[i];
            this.LIZJ.read(bArr, 0, i);
        } else {
            this.LIZJ.read(this.LIZIZ, 0, (int) j);
            bArr = this.LIZIZ;
        }
        return new String(bArr, 0, (int) j, Q9K.LIZ);
    }

    @Override // X.Q9I
    public final byte[] LJJII(long j) {
        this.LJ = (int) (this.LJ + j);
        byte[] bArr = new byte[(int) j];
        this.LIZJ.read(bArr);
        return bArr;
    }

    @Override // X.Q9I
    public final void skip(long j) {
        this.LJ = (int) (this.LJ + j);
        this.LIZJ.skip(j);
    }

    public Q9L(C38487F8p c38487F8p, int i) {
        this.LIZIZ = new byte[256];
        this.LIZJ = c38487F8p;
        this.LIZLLL = i;
    }
}
