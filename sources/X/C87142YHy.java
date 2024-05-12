package X;

import java.nio.charset.Charset;

/* renamed from: X.YHy, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87142YHy extends YI6 {
    public final byte[] LJLILLLLZI;

    public int LJIILJJIL() {
        return 0;
    }

    @Override // X.AbstractC87141YHx
    public int size() {
        return this.LJLILLLLZI.length;
    }

    @Override // X.AbstractC87141YHx
    public final boolean zzarf() {
        int LJIILJJIL = LJIILJJIL();
        if (PUZ.LIZ.LLLLLZIL(LJIILJJIL, this.LJLILLLLZI, size() + LJIILJJIL) == 0) {
            return true;
        }
        return false;
    }

    @Override // X.AbstractC87141YHx
    public final YI8 zzarg() {
        int LJIILJJIL = LJIILJJIL();
        int size = size();
        YI4 yi4 = new YI4(LJIILJJIL, size);
        try {
            yi4.LIZ(size);
            return yi4;
        } catch (YI5 e) {
            throw new IllegalArgumentException(e);
        }
    }

    public C87142YHy(byte[] bArr) {
        if (bArr != null) {
            this.LJLILLLLZI = bArr;
            return;
        }
        throw null;
    }

    @Override // X.AbstractC87141YHx
    public final String LIZJ(Charset charset) {
        return new String(this.LJLILLLLZI, LJIILJJIL(), size(), charset);
    }

    @Override // X.AbstractC87141YHx
    public final void LJFF(YI7 yi7) {
        yi7.LIZ(LJIILJJIL(), this.LJLILLLLZI, size());
    }

    @Override // X.AbstractC87141YHx
    public byte LJIIIZ(int i) {
        return this.LJLILLLLZI[i];
    }

    @Override // X.AbstractC87141YHx
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC87141YHx) || size() != ((AbstractC87141YHx) obj).size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C87142YHy) {
            C87142YHy c87142YHy = (C87142YHy) obj;
            int i = this.zzftx;
            int i2 = c87142YHy.zzftx;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int size = size();
            if (size <= c87142YHy.size()) {
                if (size <= c87142YHy.size()) {
                    byte[] bArr = this.LJLILLLLZI;
                    byte[] bArr2 = c87142YHy.LJLILLLLZI;
                    int LJIILJJIL = LJIILJJIL() + size;
                    int LJIILJJIL2 = LJIILJJIL();
                    int LJIILJJIL3 = c87142YHy.LJIILJJIL();
                    while (LJIILJJIL2 < LJIILJJIL) {
                        if (bArr[LJIILJJIL2] != bArr2[LJIILJJIL3]) {
                            return false;
                        }
                        LJIILJJIL2++;
                        LJIILJJIL3++;
                    }
                    return true;
                }
                int size2 = c87142YHy.size();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(size);
                sb.append(", ");
                sb.append(size2);
                throw new IllegalArgumentException(sb.toString());
            }
            int size3 = size();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(size);
            sb2.append(size3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC87141YHx
    public byte zzfi(int i) {
        return this.LJLILLLLZI[i];
    }

    @Override // X.AbstractC87141YHx
    public void LJII(byte[] bArr, int i) {
        System.arraycopy(this.LJLILLLLZI, 0, bArr, 0, i);
    }

    @Override // X.AbstractC87141YHx
    public final int LJIIIIZZ(int i, int i2) {
        byte[] bArr = this.LJLILLLLZI;
        int LJIILJJIL = LJIILJJIL();
        for (int i3 = LJIILJJIL; i3 < LJIILJJIL + i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC87141YHx
    public final AbstractC87141YHx zzw(int i, int i2) {
        int LJIIJ = AbstractC87141YHx.LJIIJ(0, i2, size());
        if (LJIIJ == 0) {
            return AbstractC87141YHx.zzfuo;
        }
        return new C87143YHz(this.LJLILLLLZI, LJIILJJIL(), LJIIJ);
    }
}
