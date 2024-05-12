package X;

import java.util.logging.Level;

/* renamed from: X.Zlu, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public final class C90898Zlu extends AbstractC90761Zjh {
    public final byte[] LIZLLL;
    public final int LJ;
    public int LJFF;

    public final int LJIJJLI() {
        return this.LJ - this.LJFF;
    }

    @Override // X.AbstractC90761Zjh
    public final void LIZJ(byte b) {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            this.LJFF = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC90761Zjh
    public final void LJI(int i) {
        try {
            byte[] bArr = this.LIZLLL;
            int i2 = this.LJFF;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.LJFF = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIIIIZZ(long j) {
        try {
            byte[] bArr = this.LIZLLL;
            int i = this.LJFF;
            int i2 = i + 1;
            bArr[i] = (byte) (((int) j) & 255);
            int i3 = i2 + 1;
            bArr[i2] = (byte) (((int) (j >> 8)) & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) (((int) (j >> 16)) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) (((int) (j >> 24)) & 255);
            int i6 = i5 + 1;
            bArr[i5] = (byte) (((int) (j >> 32)) & 255);
            int i7 = i6 + 1;
            bArr[i6] = (byte) (((int) (j >> 40)) & 255);
            int i8 = i7 + 1;
            bArr[i7] = (byte) (((int) (j >> 48)) & 255);
            this.LJFF = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
        }
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIIJ(int i) {
        if (i >= 0) {
            LJIILJJIL(i);
        } else {
            LJIILLIIL(i);
        }
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIILJJIL(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.LIZLLL;
                int i2 = this.LJFF;
                this.LJFF = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr2 = this.LIZLLL;
        int i3 = this.LJFF;
        this.LJFF = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIILLIIL(long j) {
        if (AbstractC90761Zjh.LIZJ && this.LJ - this.LJFF >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.LIZLLL;
                int i = this.LJFF;
                this.LJFF = i + 1;
                C90376ZdU.LIZJ.LIZLLL(bArr, C90376ZdU.LJ + i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.LIZLLL;
            int i2 = this.LJFF;
            this.LJFF = i2 + 1;
            C90376ZdU.LIZJ.LIZLLL(bArr2, C90376ZdU.LJ + i2, (byte) j);
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
                throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), 1}), e);
            }
        }
        byte[] bArr4 = this.LIZLLL;
        int i4 = this.LJFF;
        this.LJFF = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    public C90898Zlu(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.LIZLLL = bArr;
            this.LJFF = 0;
            this.LJ = i;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC90761Zjh
    public final void LIZLLL(int i, boolean z) {
        LJIILJJIL(i << 3);
        LIZJ(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJ(int i, AbstractC90364ZdI abstractC90364ZdI) {
        LJIILJJIL((i << 3) | 2);
        LJIILJJIL(abstractC90364ZdI.zzd());
        abstractC90364ZdI.LJIIIIZZ(this);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJFF(int i, int i2) {
        LJIILJJIL((i << 3) | 5);
        LJI(i2);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJII(int i, long j) {
        LJIILJJIL((i << 3) | 1);
        LJIIIIZZ(j);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIIIZ(int i, int i2) {
        LJIILJJIL(i << 3);
        LJIIJ(i2);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIIJJI(int i, String str) {
        LJIILJJIL((i << 3) | 2);
        int i2 = this.LJFF;
        try {
            int LIZ = AbstractC90761Zjh.LIZ(str.length() * 3);
            int LIZ2 = AbstractC90761Zjh.LIZ(str.length());
            if (LIZ2 == LIZ) {
                int i3 = i2 + LIZ2;
                this.LJFF = i3;
                int LIZIZ = C90389Zdh.LIZIZ(str, this.LIZLLL, i3, this.LJ - i3);
                this.LJFF = i2;
                LJIILJJIL((LIZIZ - i2) - LIZ2);
                this.LJFF = LIZIZ;
            } else {
                LJIILJJIL(C90389Zdh.LIZJ(str));
                byte[] bArr = this.LIZLLL;
                int i4 = this.LJFF;
                this.LJFF = C90389Zdh.LIZIZ(str, bArr, i4, this.LJ - i4);
            }
        } catch (C90382Zda e) {
            this.LJFF = i2;
            AbstractC90761Zjh.LIZIZ.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(C90359ZdD.LIZ);
            try {
                int length = bytes.length;
                LJIILJJIL(length);
                LJIL(bytes, length);
            } catch (C90388Zdg e2) {
                throw e2;
            } catch (IndexOutOfBoundsException e3) {
                throw new C90388Zdg(e3);
            }
        } catch (IndexOutOfBoundsException e4) {
            throw new C90388Zdg(e4);
        }
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIIL(int i, int i2) {
        LJIILJJIL((i << 3) | i2);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIILIIL(int i, int i2) {
        LJIILJJIL(i << 3);
        LJIILJJIL(i2);
    }

    @Override // X.AbstractC90761Zjh
    public final void LJIILL(int i, long j) {
        LJIILJJIL(i << 3);
        LJIILLIIL(j);
    }

    public final void LJIL(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.LIZLLL, this.LJFF, i);
            this.LJFF += i;
        } catch (IndexOutOfBoundsException e) {
            throw new C90388Zdg(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJFF), Integer.valueOf(this.LJ), Integer.valueOf(i)}), e);
        }
    }
}
