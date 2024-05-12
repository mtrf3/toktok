package X;

import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O5F extends O4P {
    public byte[] LJIIIZ;

    @Override // X.O4P
    public final void LJII() {
    }

    @Override // X.O4P
    public final byte[] LJIIIZ() {
        if (this.LJIIIZ.length == this.LJI) {
            return this.LJIIIZ;
        }
        return null;
    }

    @Override // X.O4P
    public final void LIZJ() {
        super.LIZJ();
        this.LJIIIZ = new byte[0];
        this.LJI = 0;
        this.LJII = 0;
    }

    public O5F(int i) {
        super(false);
        this.LJIIIZ = new byte[i];
        this.LJII = i;
    }

    @Override // X.O4P
    public final void LJ(int i) {
        byte[] copyOf = Arrays.copyOf(this.LJIIIZ, i);
        o.LJFF(copyOf, "java.util.Arrays.copyOf(this, newSize)");
        this.LJIIIZ = copyOf;
        this.LJII = i;
    }

    @Override // X.O4P
    public final void LJFF(int i) {
        this.LIZIZ = i;
        LIZIZ(i);
        if (this.LJI != this.LJIIIZ.length) {
            if (this.LJI > this.LJIIIZ.length) {
                C39930Flm.LIZJ("ContinuousMeta", "unexpected count is larger than the size of buf", null, true);
            }
            byte[] copyOf = Arrays.copyOf(this.LJIIIZ, this.LJI);
            o.LJFF(copyOf, "java.util.Arrays.copyOf(this, newSize)");
            this.LJIIIZ = copyOf;
        }
    }

    @Override // X.O4P
    public final void LJIIJJI(int i, byte b) {
        LIZIZ(i);
        byte[] bArr = this.LJIIIZ;
        int i2 = i + 1;
        if (bArr.length >= i2) {
            bArr[this.LJI] = b;
            this.LJI++;
            C39930Flm.LJI("ContinuousMeta", C0NY.LIZIZ("start record bytes, startPos ", i, ", one byte"), false, 4);
        } else {
            StringBuilder LJ = C7MY.LJ("target buffer size: ", i2, " is larger than buffer: ");
            LJ.append(this.LJIIIZ.length);
            throw new IndexOutOfBoundsException(X1D.LIZIZ(LJ));
        }
    }

    @Override // X.O4P
    public final int LJIILIIL(InputStream inputStream, int i) {
        LIZIZ(i);
        byte[] bArr = this.LJIIIZ;
        int read = inputStream.read(bArr, i, bArr.length - this.LJI);
        C39930Flm.LJI("ContinuousMeta", C48263Iwt.LIZLLL("start record bytes, startPos ", i, ", bytes ", read), false, 4);
        if (read == -1) {
            return -1;
        }
        this.LJI += read;
        return read;
    }

    @Override // X.O4P
    public final int LJIIJ(int i, int i2, byte[] bytes, int i3) {
        o.LJIIJ(bytes, "bytes");
        System.arraycopy(this.LJIIIZ, i, bytes, i2, i3);
        return i;
    }

    @Override // X.O4P
    public final void LJIIL(int i, int i2, byte[] bytes, int i3) {
        o.LJIIJ(bytes, "bytes");
        LIZIZ(i);
        if (i >= 0 && i2 >= 0 && i2 <= bytes.length && i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 - bytes.length <= 0) {
                if (i4 <= bytes.length) {
                    C39930Flm.LJI("ContinuousMeta", C48263Iwt.LIZLLL("start record bytes, startPos ", i, ", length ", i3), false, 4);
                    System.arraycopy(bytes, i2, this.LJIIIZ, this.LJI, i3);
                    this.LJI += i3;
                    return;
                } else {
                    StringBuilder LIZJ = C06460Ne.LIZJ("can not copy bytes from ", i2, " to ", i3, ", input bytearray size is ");
                    LIZJ.append(bytes.length);
                    throw new IllegalArgumentException(X1D.LIZIZ(LIZJ));
                }
            }
        }
        throw new IndexOutOfBoundsException("index out of bounds");
    }
}
