package X;

import java.util.logging.Level;

/* renamed from: X.YIl, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87155YIl extends AbstractC87156YIm {
    public final byte[] LIZLLL;
    public final int LJ;
    public int LJFF;

    @Override // X.AbstractC87156YIm
    public final int LJII() {
        return this.LJ - this.LJFF;
    }

    @Override // X.AbstractC87156YIm
    public final void LJIIL(byte b) {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            this.LJFF = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC87156YIm
    public final void LJIILJJIL(long j) {
        if (AbstractC87156YIm.LIZJ && this.LJ - this.LJFF >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i = this.LJFF;
                this.LJFF = i + 1;
                C87166YIw.LIZLLL(bArr, i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i2 = this.LJFF;
            this.LJFF = i2 + 1;
            C87166YIw.LIZLLL(bArr2, i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.LIZLLL;
                int i3 = this.LJFF;
                this.LJFF = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr4 = this.LIZLLL;
        int i4 = this.LJFF;
        this.LJFF = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    @Override // X.AbstractC87156YIm
    public final void LJIILL(long j) {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            int i2 = i + 1;
            bArr[i] = (byte) j;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (j >> 8);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (j >> 16);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (j >> 24);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (j >> 32);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (j >> 40);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (j >> 48);
            this.LJFF = i8 + 1;
            bArr[i8] = (byte) (j >> 56);
        } catch (IndexOutOfBoundsException e) {
            throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC87156YIm
    public final void LJIIZILJ(int i) {
        if (i >= 0) {
            LJIJ(i);
        } else {
            LJIILJJIL(i);
        }
    }

    @Override // X.AbstractC87156YIm
    public final void LJIJ(int i) {
        if (AbstractC87156YIm.LIZJ && this.LJ - this.LJFF >= 10) {
            while ((i & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i2 = this.LJFF;
                this.LJFF = i2 + 1;
                C87166YIw.LIZLLL(bArr, i2, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = i3 + 1;
            C87166YIw.LIZLLL(bArr2, i3, (byte) i);
            return;
        }
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr3 = this.LIZLLL;
                int i4 = this.LJFF;
                this.LJFF = i4 + 1;
                bArr3[i4] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr4 = this.LIZLLL;
        int i5 = this.LJFF;
        this.LJFF = i5 + 1;
        bArr4[i5] = (byte) i;
    }

    @Override // X.AbstractC87156YIm
    public final void LJIJI(int i) {
        try {
            byte[] bArr = this.LIZLLL;
            int i2 = this.LJFF;
            int i3 = i2 + 1;
            bArr[i2] = (byte) i;
            int i4 = i3 + 1;
            bArr[i3] = (byte) (i >> 8);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (i >> 16);
            this.LJFF = i5 + 1;
            bArr[i5] = (byte) (i >>> 24);
        } catch (IndexOutOfBoundsException e) {
            throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    public final void LJJIJIIJI(AbstractC87141YHx abstractC87141YHx) {
        LJIJ(abstractC87141YHx.size());
        abstractC87141YHx.LJFF(this);
    }

    public final void LJJIJIIJIL(YIZ yiz) {
        LJIJ(yiz.LIZLLL());
        yiz.LIZ(this);
    }

    public final void LJJIJIL(String str) {
        int i = this.LJFF;
        try {
            int LJIL = AbstractC87156YIm.LJIL(str.length() * 3);
            int LJIL2 = AbstractC87156YIm.LJIL(str.length());
            if (LJIL2 == LJIL) {
                int i2 = i + LJIL2;
                this.LJFF = i2;
                int LLLLLZL = PUZ.LIZ.LLLLLZL(str, this.LIZLLL, i2, this.LJ - i2);
                this.LJFF = i;
                LJIJ((LLLLLZL - i) - LJIL2);
                this.LJFF = LLLLLZL;
                return;
            }
            LJIJ(PUZ.LIZ(str));
            byte[] bArr = this.LIZLLL;
            int i3 = this.LJFF;
            this.LJFF = PUZ.LIZ.LLLLLZL(str, bArr, i3, this.LJ - i3);
        } catch (C64346PNe e) {
            this.LJFF = i;
            AbstractC87156YIm.LIZIZ.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(YI0.LIZ);
            try {
                LJIJ(bytes.length);
                LJJIJ(bytes, 0, bytes.length);
            } catch (XG7 e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new XG7(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new XG7(e4);
        }
    }

    public C87155YIl(byte[] bArr, int i) {
        if (((bArr.length - i) | i) >= 0) {
            this.LIZLLL = bArr;
            this.LJFF = 0;
            this.LJ = i;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(bArr.length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC87156YIm
    public final void LIZIZ(int i, AbstractC87141YHx abstractC87141YHx) {
        LJJIIJZLJL(i, 2);
        LJJIJIIJI(abstractC87141YHx);
    }

    @Override // X.AbstractC87156YIm
    public final void LIZLLL(int i, int i2) {
        LJJIIJZLJL(i, 5);
        LJIJI(i2);
    }

    @Override // X.AbstractC87156YIm
    public final void LJIIIIZZ(int i, AbstractC87141YHx abstractC87141YHx) {
        LJJIIJZLJL(1, 3);
        LJJIIZI(2, i);
        LIZIZ(3, abstractC87141YHx);
        LJJIIJZLJL(1, 4);
    }

    @Override // X.AbstractC87156YIm
    public final void LJIIIZ(int i, YIZ yiz) {
        LJJIIJZLJL(1, 3);
        LJJIIZI(2, i);
        LJJIIJZLJL(3, 2);
        LJJIJIIJIL(yiz);
        LJJIIJZLJL(1, 4);
    }

    @Override // X.AbstractC87156YIm
    public final void LJIILIIL(int i, String str) {
        LJJIIJZLJL(i, 2);
        LJJIJIL(str);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJI(int i, long j) {
        LJJIIJZLJL(i, 0);
        LJIILJJIL(j);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJIFFI(int i, long j) {
        LJJIIJZLJL(i, 1);
        LJIILL(j);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJII(int i, boolean z) {
        LJJIIJZLJL(i, 0);
        LJIIL(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJIIJZLJL(int i, int i2) {
        LJIJ((i << 3) | i2);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJIIZ(int i, int i2) {
        LJJIIJZLJL(i, 0);
        LJIIZILJ(i2);
    }

    @Override // X.AbstractC87156YIm
    public final void LJJIIZI(int i, int i2) {
        LJJIIJZLJL(i, 0);
        LJIJ(i2);
    }

    @Override // X.YI7
    public final void LIZ(int i, byte[] bArr, int i2) {
        LJJIJ(bArr, i, i2);
    }

    @Override // X.AbstractC87156YIm
    public final void LIZJ(int i, YIZ yiz, YIU yiu) {
        LJJIIJZLJL(i, 2);
        YIQ yiq = (YIQ) yiz;
        int LJFF = yiq.LJFF();
        if (LJFF == -1) {
            LJFF = yiu.LJ(yiq);
            yiq.LJI(LJFF);
        }
        LJIJ(LJFF);
        yiu.LJIIIZ(yiz, this.LIZ);
    }

    public final void LJJIJ(byte[] bArr, int i, int i2) {
        try {
            System.arraycopy(bArr, i, this.LIZLLL, this.LJFF, i2);
            this.LJFF += i2;
        } catch (IndexOutOfBoundsException e) {
            throw new XG7(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), Integer.valueOf(i2)}), e);
        }
    }
}
