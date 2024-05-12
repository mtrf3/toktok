package X;

import java.io.InputStream;

/* renamed from: X.EnB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37469EnB extends InputStream {
    public final C37468EnA LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public final C37469EnB LIZ() {
        C37469EnB c37469EnB;
        synchronized (this.LJLIL) {
            C37468EnA c37468EnA = this.LJLIL;
            c37468EnA.LIZLLL++;
            c37469EnB = new C37469EnB(c37468EnA);
        }
        return c37469EnB;
    }

    @Override // java.io.InputStream
    public final int available() {
        int available;
        synchronized (this.LJLIL) {
            C37468EnA c37468EnA = this.LJLIL;
            available = (c37468EnA.LIZ.available() + c37468EnA.LIZJ) - this.LJLILLLLZI;
        }
        return available;
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.LJLIL) {
            C37468EnA c37468EnA = this.LJLIL;
            int i = c37468EnA.LIZLLL - 1;
            c37468EnA.LIZLLL = i;
            if (i <= 0) {
                c37468EnA.LIZ.close();
                c37468EnA.LIZIZ = null;
            }
        }
    }

    @Override // java.io.InputStream
    public final int read() {
        synchronized (this.LJLIL) {
            this.LJLIL.LIZ(this.LJLILLLLZI + 1);
            int i = this.LJLILLLLZI;
            C37468EnA c37468EnA = this.LJLIL;
            if (i >= c37468EnA.LIZJ) {
                return -1;
            }
            byte[] bArr = c37468EnA.LIZIZ;
            this.LJLILLLLZI = i + 1;
            return bArr[i] & 255;
        }
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LJLILLLLZI = this.LJLJI;
    }

    public C37469EnB(C37468EnA c37468EnA) {
        this.LJLIL = c37468EnA;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLJI = this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        synchronized (this.LJLIL) {
            if (bArr != null) {
                if (i >= 0 && i2 >= 0 && i2 <= bArr.length - i) {
                    int min = Math.min(bArr.length - i, i2);
                    this.LJLIL.LIZ(this.LJLILLLLZI + min);
                    int i3 = this.LJLIL.LIZJ - this.LJLILLLLZI;
                    if (i3 <= 0) {
                        return -1;
                    }
                    int min2 = Math.min(i3, min);
                    System.arraycopy(this.LJLIL.LIZIZ, this.LJLILLLLZI, bArr, i, min2);
                    this.LJLILLLLZI += min2;
                    return min2;
                }
                throw new IndexOutOfBoundsException();
            }
            throw new NullPointerException();
        }
    }
}
