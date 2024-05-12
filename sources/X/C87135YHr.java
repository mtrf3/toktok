package X;

import java.nio.charset.Charset;

/* renamed from: X.YHr, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public class C87135YHr extends AbstractC87140YHw {
    public final byte[] LJLIL;

    @Override // X.AbstractC87134YHq
    public final String LJII(Charset charset) {
        return new String(this.LJLIL, 0, zzd(), charset);
    }

    public void LJIIJ() {
    }

    @Override // X.AbstractC87134YHq
    public int zzd() {
        return this.LJLIL.length;
    }

    @Override // X.AbstractC87134YHq
    public final boolean zzi() {
        byte[] bArr = this.LJLIL;
        int zzd = zzd();
        C64524PUa.LIZ.getClass();
        return AbstractC64527PUd.LIZ(0, bArr, zzd);
    }

    public C87135YHr(byte[] bArr) {
        bArr.getClass();
        this.LJLIL = bArr;
    }

    @Override // X.AbstractC87134YHq
    public byte LIZJ(int i) {
        return this.LJLIL[i];
    }

    @Override // X.AbstractC87134YHq
    public final void LJIIIIZZ(AbstractC87153YIj abstractC87153YIj) {
        ((C87154YIk) abstractC87153YIj).LLI(this.LJLIL, zzd());
    }

    @Override // X.AbstractC87134YHq
    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC87134YHq) || zzd() != ((AbstractC87134YHq) obj).zzd()) {
            return false;
        }
        if (zzd() == 0) {
            return true;
        }
        if (obj instanceof C87135YHr) {
            C87135YHr c87135YHr = (C87135YHr) obj;
            int i = this.zzc;
            int i2 = c87135YHr.zzc;
            if (i != 0 && i2 != 0 && i != i2) {
                return false;
            }
            int zzd = zzd();
            if (zzd <= c87135YHr.zzd()) {
                if (zzd <= c87135YHr.zzd()) {
                    byte[] bArr = this.LJLIL;
                    byte[] bArr2 = c87135YHr.LJLIL;
                    c87135YHr.LJIIJ();
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
                throw new IllegalArgumentException(C48263Iwt.LIZIZ("Ran off end of other: 0, ", zzd, ", ", c87135YHr.zzd()));
            }
            throw new IllegalArgumentException("Length too large: " + zzd + zzd());
        }
        return obj.equals(this);
    }

    @Override // X.AbstractC87134YHq
    public byte zza(int i) {
        return this.LJLIL[i];
    }

    @Override // X.AbstractC87134YHq
    public final int LJFF(int i, int i2) {
        byte[] bArr = this.LJLIL;
        for (int i3 = 0; i3 < i2; i3++) {
            i = (i * 31) + bArr[i3];
        }
        return i;
    }

    @Override // X.AbstractC87134YHq
    public final AbstractC87134YHq zzf(int i, int i2) {
        int LJIIIZ = AbstractC87134YHq.LJIIIZ(0, i2, zzd());
        if (LJIIIZ == 0) {
            return AbstractC87134YHq.zzb;
        }
        return new C87136YHs(this.LJLIL, LJIIIZ);
    }
}
