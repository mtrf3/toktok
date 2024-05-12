package X;

import java.nio.charset.Charset;

/* renamed from: X.Zlr, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public class C90895Zlr extends AbstractC90737ZjJ {
    public final byte[] LJLIL;

    @Override // X.AbstractC90364ZdI
    public final String LJII(Charset charset) {
        return new String(this.LJLIL, 0, zzd(), charset);
    }

    public void LJIIJ() {
    }

    @Override // X.AbstractC90364ZdI
    public int zzd() {
        return this.LJLIL.length;
    }

    @Override // X.AbstractC90364ZdI
    public final boolean zzi() {
        byte[] bArr = this.LJLIL;
        int zzd = zzd();
        C90389Zdh.LIZ.getClass();
        return C90286Zc2.LIZ(bArr, zzd);
    }

    public C90895Zlr(byte[] bArr) {
        bArr.getClass();
        this.LJLIL = bArr;
    }

    @Override // X.AbstractC90364ZdI
    public byte LIZJ(int i) {
        return this.LJLIL[i];
    }

    @Override // X.AbstractC90364ZdI
    public final void LJIIIIZZ(AbstractC90761Zjh abstractC90761Zjh) {
        ((C90898Zlu) abstractC90761Zjh).LJIL(this.LJLIL, zzd());
    }

    @Override // X.AbstractC90364ZdI
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC90364ZdI) || zzd() != ((AbstractC90364ZdI) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof C90895Zlr) {
            C90895Zlr c90895Zlr = (C90895Zlr) obj;
            int i = this.zzc;
            int i2 = c90895Zlr.zzc;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= c90895Zlr.zzd()) {
                if (zzd <= c90895Zlr.zzd()) {
                    byte[] bArr = this.LJLIL;
                    byte[] bArr2 = c90895Zlr.LJLIL;
                    c90895Zlr.LJIIJ();
                    int i3 = 0;
                    int i4 = 0;
                    while (i3 < zzd) {
                        if (bArr[i3] != bArr2[i4]) {
                            return false;
                        }
                        i3++;
                        i4++;
                    }
                    return true;
                }
                int zzd2 = c90895Zlr.zzd();
                StringBuilder sb = new StringBuilder(59);
                sb.append("Ran off end of other: 0, ");
                sb.append(zzd);
                sb.append(", ");
                sb.append(zzd2);
                throw new IllegalArgumentException(sb.toString());
            }
            int zzd3 = zzd();
            StringBuilder sb2 = new StringBuilder(40);
            sb2.append("Length too large: ");
            sb2.append(zzd);
            sb2.append(zzd3);
            throw new IllegalArgumentException(sb2.toString());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC90364ZdI
    public byte zza(int i) {
        return this.LJLIL[i];
    }

    @Override // X.AbstractC90364ZdI
    public final int LJFF(int i, int i2) {
        byte[] bArr = this.LJLIL;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC90364ZdI
    public final AbstractC90364ZdI zzf(int i, int i2) {
        AbstractC90364ZdI.LJIIIZ(i2, zzd());
        if (i2 == 0) {
            return AbstractC90364ZdI.zzb;
        }
        return new C90963Zmx(this.LJLIL, i2);
    }
}
