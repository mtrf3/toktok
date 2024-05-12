package X;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* loaded from: classes12.dex */
public final class P9W extends FilterInputStream {
    public final byte[] LJLIL;
    public int LJLILLLLZI;
    public int LJLJI;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() {
        int read = ((FilterInputStream) this).in.read();
        if (read != -1) {
            return read;
        }
        int i = this.LJLILLLLZI;
        byte[] bArr = this.LJLIL;
        if (i >= bArr.length) {
            return -1;
        }
        this.LJLILLLLZI = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void reset() {
        if (((FilterInputStream) this).in.markSupported()) {
            ((FilterInputStream) this).in.reset();
            this.LJLILLLLZI = this.LJLJI;
            return;
        }
        throw new IOException("mark is not supported");
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final void mark(int i) {
        if (((FilterInputStream) this).in.markSupported()) {
            super.mark(i);
            this.LJLJI = this.LJLILLLLZI;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    public P9W(InputStream inputStream, byte[] bArr) {
        super(inputStream);
        this.LJLIL = bArr;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = ((FilterInputStream) this).in.read(bArr, i, i2);
        if (read != -1) {
            return read;
        }
        int i3 = 0;
        if (i2 == 0) {
            return 0;
        }
        while (i3 < i2) {
            int i4 = this.LJLILLLLZI;
            byte[] bArr2 = this.LJLIL;
            if (i4 >= bArr2.length) {
                break;
            }
            this.LJLILLLLZI = i4 + 1;
            int i5 = bArr2[i4] & 255;
            if (i5 == -1) {
                break;
            }
            bArr[i + i3] = (byte) i5;
            i3++;
        }
        if (i3 <= 0) {
            return -1;
        }
        return i3;
    }
}
