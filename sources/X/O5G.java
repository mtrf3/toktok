package X;

import Y.ARunnableS13S0201000_10;
import Y.ARunnableS29S0200000_10;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.IDqS435S0100000_10;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class O5G extends O4P {
    public final int LJIIIZ;
    public volatile byte[] LJIIJ;
    public volatile int LJIIJJI;
    public final int LJIIL;
    public O5I LJIILIIL;
    public byte[] LJIILJJIL;
    public final boolean LJIILL;

    @Override // X.O4P
    public final void LJ(int i) {
    }

    @Override // X.O4P
    public final void LJII() {
        boolean z;
        if (!this.LJIILL || this.LJ) {
            return;
        }
        byte[] bArr = this.LJIILJJIL;
        if (bArr != null) {
            LJI(this.LJIIJJI, bArr, 0);
            return;
        }
        O5I o5i = this.LJIILIIL;
        if (o5i != null) {
            IDqS435S0100000_10 iDqS435S0100000_10 = new IDqS435S0100000_10(this, 5);
            O5H o5h = o5i.LIZ;
            do {
                byte[] bArr2 = o5h.LIZJ.get();
                if (bArr2 != null) {
                    if (o5h.LIZ == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    iDqS435S0100000_10.invoke(Boolean.valueOf(z), Integer.valueOf(o5h.LIZLLL), bArr2);
                }
                o5h = o5h.LIZ;
            } while (o5h != null);
        }
    }

    public final byte[] LJIILJJIL() {
        byte[] bArr = this.LJIIJ;
        byte[] bArr2 = null;
        if (bArr != null) {
            if (this.LJIIJJI < bArr.length) {
                return null;
            }
            O5I o5i = this.LJIILIIL;
            if (o5i != null) {
                bArr2 = new byte[this.LJIIIZ];
                O5H o5h = o5i.LIZIZ;
                O5H o5h2 = new O5H(o5i, bArr2, o5i.LIZIZ.LIZLLL + 1);
                o5h2.LIZIZ = o5i.LIZIZ;
                o5i.LIZIZ = o5h2;
                o5h.LIZ = o5h2;
                this.LJIIJ = bArr2;
                this.LJIIJJI = 0;
                this.LJII += this.LJIIIZ;
                int i = this.LJI;
                if (!this.LJIILL) {
                    LJI(bArr.length, bArr, i - bArr.length);
                } else {
                    C61325O4z.LIZLLL(new ARunnableS13S0201000_10(i, this, bArr, 5));
                }
            }
        }
        return bArr2;
    }

    @Override // X.O4P
    public final void LIZJ() {
        super.LIZJ();
        this.LJIILIIL = null;
        this.LJIILJJIL = null;
        this.LJIIJ = null;
        this.LJIIJJI = 0;
        this.LJI = 0;
        this.LJII = 0;
    }

    @Override // X.O4P
    public final byte[] LJIIIZ() {
        return this.LJIILJJIL;
    }

    public O5G(boolean z) {
        this(0, new byte[C39821Fk1.LJ], z);
    }

    @Override // X.O4P
    public final void LJFF(int i) {
        byte[] bArr;
        this.LIZIZ = i;
        LIZIZ(i);
        byte[] bArr2 = this.LJIIJ;
        if (bArr2 != null) {
            if (this.LJI == bArr2.length) {
                bArr = bArr2;
            } else if (this.LJI < bArr2.length) {
                bArr = Arrays.copyOf(bArr2, this.LJI);
                o.LJFF(bArr, "java.util.Arrays.copyOf(this, newSize)");
            } else {
                bArr = null;
            }
            this.LJIILJJIL = bArr;
            if (!this.LJIILL) {
                LJI(this.LJIIJJI, bArr2, this.LJI - this.LJIIJJI);
            } else {
                C61325O4z.LIZLLL(new ARunnableS29S0200000_10(bArr2, this, 47));
            }
        }
        this.LJIIJ = null;
    }

    @Override // X.O4P
    public final void LJIIJJI(int i, byte b) {
        LIZIZ(i);
        byte[] bArr = this.LJIIJ;
        if (bArr != null) {
            byte[] LJIILJJIL = LJIILJJIL();
            if (LJIILJJIL != null) {
                bArr = LJIILJJIL;
            }
            bArr[this.LJIIJJI] = b;
            this.LJI++;
            this.LJIIJJI++;
            LJIILJJIL();
            C39930Flm.LJI("DiscreteMeta", C0NY.LIZIZ("start record bytes, startPos ", i, ", one byte"), false, 4);
            return;
        }
        throw new IndexOutOfBoundsException("current buffer is empty");
    }

    @Override // X.O4P
    public final int LJIILIIL(InputStream inputStream, int i) {
        LIZIZ(i);
        byte[] bArr = this.LJIIJ;
        if (bArr != null) {
            int i2 = 0;
            while (true) {
                int read = inputStream.read(bArr, this.LJIIJJI, bArr.length - this.LJIIJJI);
                if (read == -1) {
                    break;
                }
                this.LJIIJJI += read;
                this.LJI += read;
                i2 += read;
                byte[] LJIILJJIL = LJIILJJIL();
                if (LJIILJJIL != null) {
                    bArr = LJIILJJIL;
                }
            }
            C39930Flm.LJI("DiscreteMeta", C48263Iwt.LIZLLL("start record bytes, startPos ", i, ", totalWriteCount ", i2), false, 4);
            if (i2 > 0) {
                return i2;
            }
            return -1;
        }
        throw new IndexOutOfBoundsException("current buffer is empty");
    }

    public O5G(int i, byte[] bArr, boolean z) {
        super(true);
        this.LJIILL = z;
        this.LJIIIZ = C39821Fk1.LJ;
        this.LJIIJ = bArr;
        this.LJIIJJI = i;
        this.LJIIL = bArr.length;
        this.LJIILIIL = new O5I(bArr, !z);
        this.LJII = bArr.length;
        this.LJI = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // X.O4P
    public final int LJIIJ(int i, int i2, byte[] bytes, int i3) {
        int i4;
        int i5;
        T t;
        o.LJIIJ(bytes, "bytes");
        byte[] bArr = this.LJIILJJIL;
        if (bArr != null) {
            System.arraycopy(bArr, i, bytes, i2, i3);
            return i;
        }
        C76732zl c76732zl = new C76732zl();
        int i6 = i3 + i;
        c76732zl.element = i6;
        if (i6 > this.LJI) {
            C39930Flm.LIZJ("DiscreteMeta", "ptr is larger than pointer", null, true);
        }
        int i7 = c76732zl.element;
        int i8 = this.LJIIL;
        int i9 = 0;
        if (i7 > i8) {
            int i10 = (i7 - i8) - 1;
            if (i10 < 0) {
                i10 = 0;
            }
            i4 = (i10 / this.LJIIIZ) + 1;
        } else {
            i4 = 0;
        }
        O5I o5i = this.LJIILIIL;
        if (o5i != null) {
            i5 = o5i.LIZIZ.LIZLLL + 1;
        } else {
            i5 = 0;
        }
        if (i4 >= i5) {
            IOException iOException = new IOException("read bytes failed since page not enough");
            String message = iOException.getMessage();
            if (message == null) {
                message = "";
            }
            C39930Flm.LIZJ("DiscreteMeta", message, iOException, true);
            throw iOException;
        }
        C68322mC c68322mC = new C68322mC();
        int i11 = c76732zl.element;
        int i12 = this.LJIIL;
        if (i11 <= i12) {
            t = Integer.valueOf(i11);
        } else {
            int i13 = i4 - 1;
            if (i13 >= 0) {
                i9 = i13;
            }
            t = Integer.valueOf((i11 - (i9 * this.LJIIIZ)) - i12);
        }
        c68322mC.element = t;
        O5I o5i2 = this.LJIILIIL;
        if (o5i2 != null) {
            LV5 lv5 = new LV5(c68322mC, c76732zl, i, bytes, i2);
            O5H o5h = o5i2.LIZ;
            while (true) {
                if (o5h.LIZLLL < i4) {
                    if (o5h.LIZJ.get() == null) {
                        o5h.LIZIZ = null;
                        o5i2.LIZ = o5h;
                    }
                    o5h = o5h.LIZ;
                    if (o5h == null) {
                        break;
                    }
                } else {
                    do {
                        byte[] bArr2 = o5h.LIZJ.get();
                        if (bArr2 == null) {
                            break;
                        }
                        lv5.invoke(bArr2);
                        o5h = o5h.LIZIZ;
                    } while (o5h != null);
                }
            }
        }
        return c76732zl.element;
    }

    @Override // X.O4P
    public final void LJIIL(int i, int i2, byte[] bytes, int i3) {
        o.LJIIJ(bytes, "bytes");
        LIZIZ(i);
        if (i >= 0 && i2 >= 0 && i2 <= bytes.length && i3 >= 0) {
            int i4 = i2 + i3;
            if (i4 - bytes.length <= 0) {
                if (i4 <= bytes.length) {
                    int i5 = 0;
                    C39930Flm.LJI("DiscreteMeta", C48263Iwt.LIZLLL("start record bytes, startPos ", i, ", length ", i3), false, 4);
                    byte[] bArr = this.LJIIJ;
                    if (bArr != null) {
                        while (i5 < i3) {
                            int i6 = i3 - i5;
                            int length = bArr.length - this.LJIIJJI;
                            if (i6 > length) {
                                i6 = length;
                            }
                            if (i6 != 0) {
                                System.arraycopy(bytes, i2 + i5, bArr, this.LJIIJJI, i6);
                                this.LJIIJJI += i6;
                                this.LJI += i6;
                                i5 += i6;
                            }
                            byte[] LJIILJJIL = LJIILJJIL();
                            if (LJIILJJIL != null) {
                                bArr = LJIILJJIL;
                            }
                        }
                        return;
                    }
                    throw new IndexOutOfBoundsException("current buffer is empty");
                }
                StringBuilder LIZJ = C06460Ne.LIZJ("can not copy bytes from ", i2, " to ", i3, ", input bytearray size is ");
                LIZJ.append(bytes.length);
                throw new IllegalArgumentException(X1D.LIZIZ(LIZJ));
            }
        }
        throw new IndexOutOfBoundsException("bounds check failed");
    }
}
