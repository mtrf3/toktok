package X;

import java.util.logging.Level;

/* renamed from: X.YIk, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C87154YIk extends AbstractC87153YIj {
    public final byte[] LJLJL;
    public final int LJLJLJ;
    public int LJLJLLL;

    @Override // X.AbstractC87153YIj
    public final void LJLJLLL(byte b) {
        try {
            byte[] bArr = this.LJLJL;
            int i = this.LJLJLLL;
            this.LJLJLLL = i + 1;
            bArr[i] = b;
        } catch (IndexOutOfBoundsException e) {
            throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), 1}), e);
        }
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLJ(int i) {
        try {
            byte[] bArr = this.LJLJL;
            int i2 = this.LJLJLLL;
            int i3 = i2 + 1;
            bArr[i2] = (byte) (i & 255);
            int i4 = i3 + 1;
            bArr[i3] = (byte) ((i >> 8) & 255);
            int i5 = i4 + 1;
            bArr[i4] = (byte) ((i >> 16) & 255);
            this.LJLJLLL = i5 + 1;
            bArr[i5] = (byte) ((i >> 24) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), 1}), e);
        }
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLLL(long j) {
        try {
            byte[] bArr = this.LJLJL;
            int i = this.LJLJLLL;
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
            this.LJLJLLL = i8 + 1;
            bArr[i8] = (byte) (((int) (j >> 56)) & 255);
        } catch (IndexOutOfBoundsException e) {
            throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), 1}), e);
        }
    }

    @Override // X.AbstractC87153YIj
    public final void LJLZ(int i) {
        if (i >= 0) {
            LL(i);
        } else {
            LLF(i);
        }
    }

    @Override // X.AbstractC87153YIj
    public final void LL(int i) {
        while ((i & (-128)) != 0) {
            try {
                byte[] bArr = this.LJLJL;
                int i2 = this.LJLJLLL;
                this.LJLJLLL = i2 + 1;
                bArr[i2] = (byte) ((i & 127) | 128);
                i >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), 1}), e);
            }
        }
        byte[] bArr2 = this.LJLJL;
        int i3 = this.LJLJLLL;
        this.LJLJLLL = i3 + 1;
        bArr2[i3] = (byte) i;
    }

    @Override // X.AbstractC87153YIj
    public final void LLF(long j) {
        if (AbstractC87153YIj.LJLJJLL && this.LJLJLJ - this.LJLJLLL >= 10) {
            while ((j & (-128)) != 0) {
                byte[] bArr = this.LJLJL;
                int i = this.LJLJLLL;
                this.LJLJLLL = i + 1;
                C87167YIx.LIZJ.LIZLLL(bArr, C87167YIx.LJ + i, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
            byte[] bArr2 = this.LJLJL;
            int i2 = this.LJLJLLL;
            this.LJLJLLL = i2 + 1;
            C87167YIx.LIZJ.LIZLLL(bArr2, C87167YIx.LJ + i2, (byte) j);
            return;
        }
        while ((j & (-128)) != 0) {
            try {
                byte[] bArr3 = this.LJLJL;
                int i3 = this.LJLJLLL;
                this.LJLJLLL = i3 + 1;
                bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                j >>>= 7;
            } catch (IndexOutOfBoundsException e) {
                throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), 1}), e);
            }
        }
        byte[] bArr4 = this.LJLJL;
        int i4 = this.LJLJLLL;
        this.LJLJLLL = i4 + 1;
        bArr4[i4] = (byte) j;
    }

    public C87154YIk(byte[] bArr, int i) {
        super(0);
        int length = bArr.length;
        if (((length - i) | i) >= 0) {
            this.LJLJL = bArr;
            this.LJLJLLL = 0;
            this.LJLJLJ = i;
            return;
        }
        throw new IllegalArgumentException(C16880lQ.LLLZ("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", new Object[]{Integer.valueOf(length), 0, Integer.valueOf(i)}));
    }

    @Override // X.AbstractC87153YIj
    public final void LJLL(int i, boolean z) {
        LL(i << 3);
        LJLJLLL(z ? (byte) 1 : (byte) 0);
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLI(int i, AbstractC87134YHq abstractC87134YHq) {
        LL((i << 3) | 2);
        LL(abstractC87134YHq.zzd());
        abstractC87134YHq.LJIIIIZZ(this);
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLILLLL(int i, int i2) {
        LL((i << 3) | 5);
        LJLLJ(i2);
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLL(int i, long j) {
        LL((i << 3) | 1);
        LJLLLL(j);
    }

    @Override // X.AbstractC87153YIj
    public final void LJLLLLLL(int i, int i2) {
        LL(i << 3);
        LJLZ(i2);
    }

    @Override // X.AbstractC87153YIj
    public final void LJZ(int i, String str) {
        LL((i << 3) | 2);
        int i2 = this.LJLJLLL;
        try {
            int LJLJL = AbstractC87153YIj.LJLJL(str.length() * 3);
            int LJLJL2 = AbstractC87153YIj.LJLJL(str.length());
            if (LJLJL2 == LJLJL) {
                int i3 = i2 + LJLJL2;
                this.LJLJLLL = i3;
                int LIZIZ = C64524PUa.LIZIZ(str, this.LJLJL, i3, this.LJLJLJ - i3);
                this.LJLJLLL = i2;
                LL((LIZIZ - i2) - LJLJL2);
                this.LJLJLLL = LIZIZ;
            } else {
                LL(C64524PUa.LIZJ(str));
                byte[] bArr = this.LJLJL;
                int i4 = this.LJLJLLL;
                this.LJLJLLL = C64524PUa.LIZIZ(str, bArr, i4, this.LJLJLJ - i4);
            }
        } catch (C64347PNf e) {
            this.LJLJLLL = i2;
            AbstractC87153YIj.LJLJJL.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
            byte[] bytes = str.getBytes(YIG.LIZ);
            try {
                int length = bytes.length;
                LL(length);
                LLI(bytes, length);
            } catch (IndexOutOfBoundsException e2) {
                throw new XG6(e2);
            }
        } catch (IndexOutOfBoundsException e3) {
            throw new XG6(e3);
        }
    }

    @Override // X.AbstractC87153YIj
    public final void LJZI(int i, int i2) {
        LL((i << 3) | i2);
    }

    @Override // X.AbstractC87153YIj
    public final void LJZL(int i, int i2) {
        LL(i << 3);
        LL(i2);
    }

    @Override // X.AbstractC87153YIj
    public final void LLD(int i, long j) {
        LL(i << 3);
        LLF(j);
    }

    public final void LLI(byte[] bArr, int i) {
        try {
            System.arraycopy(bArr, 0, this.LJLJL, this.LJLJLLL, i);
            this.LJLJLLL += i;
        } catch (IndexOutOfBoundsException e) {
            throw new XG6(C16880lQ.LLLZ("Pos: %d, limit: %d, len: %d", new Object[]{Integer.valueOf(this.LJLJLLL), Integer.valueOf(this.LJLJLJ), Integer.valueOf(i)}), e);
        }
    }
}
