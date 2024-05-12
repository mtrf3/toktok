package X;

import java.io.InputStream;

/* renamed from: X.Vwj, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81377Vwj extends InputStream {
    public final InterfaceC81378Vwk LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.LJLIL.size() - this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final void reset() {
        this.LJLILLLLZI = this.LJLJI;
    }

    @Override // java.io.InputStream
    public final int read() {
        if (available() <= 0) {
            return -1;
        }
        InterfaceC81378Vwk interfaceC81378Vwk = this.LJLIL;
        int i = this.LJLILLLLZI;
        this.LJLILLLLZI = i + 1;
        return interfaceC81378Vwk.read(i) & 255;
    }

    public C81377Vwj(InterfaceC81378Vwk interfaceC81378Vwk) {
        C32151Nz.LJI(!interfaceC81378Vwk.isClosed());
        this.LJLIL = interfaceC81378Vwk;
        this.LJLILLLLZI = 0;
        this.LJLJI = 0;
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        this.LJLJI = this.LJLILLLLZI;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final long skip(long j) {
        boolean z;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        int min = Math.min((int) j, available());
        this.LJLILLLLZI += min;
        return min;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        if (i >= 0 && i2 >= 0 && i + i2 <= bArr.length) {
            int available = available();
            if (available <= 0) {
                return -1;
            }
            if (i2 <= 0) {
                return 0;
            }
            int min = Math.min(available, i2);
            this.LJLIL.read(this.LJLILLLLZI, bArr, i, min);
            this.LJLILLLLZI += min;
            return min;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("length=");
        C15890jp.LIZIZ(LIZ, bArr.length, "; regionStart=", i, "; regionLength=");
        LIZ.append(i2);
        throw new ArrayIndexOutOfBoundsException(X1D.LIZIZ(LIZ));
    }
}
