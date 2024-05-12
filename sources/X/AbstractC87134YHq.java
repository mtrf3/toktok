package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.YHq, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87134YHq implements Iterable, Serializable {
    public static final AbstractC87134YHq zzb = new C87135YHr(YIG.LIZIZ);
    public int zzc;

    public abstract byte LIZJ(int i);

    public abstract int LJFF(int i, int i2);

    public abstract String LJII(Charset charset);

    public abstract void LJIIIIZZ(AbstractC87153YIj abstractC87153YIj);

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new C87137YHt(this);
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract AbstractC87134YHq zzf(int i, int i2);

    public abstract boolean zzi();

    public final int hashCode() {
        int i = this.zzc;
        if (i == 0) {
            int zzd = zzd();
            i = LJFF(zzd, zzd);
            if (i == 0) {
                i = 1;
            }
            this.zzc = i;
        }
        return i;
    }

    public final String toString() {
        String concat;
        Locale locale = Locale.ROOT;
        Object[] objArr = new Object[3];
        objArr[0] = Integer.toHexString(System.identityHashCode(this));
        objArr[1] = Integer.valueOf(zzd());
        if (zzd() <= 50) {
            concat = C1DJ.LJJJI(this);
        } else {
            concat = C1DJ.LJJJI(zzf(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return C16880lQ.LLLZI(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static AbstractC87134YHq zzm(String str) {
        return new C87135YHr(str.getBytes(YIG.LIZ));
    }

    public final String zzn(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return LJII(charset);
    }

    public static int LJIIIZ(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("Beginning index larger than ending index: ", i, ", ", i2));
                }
                throw new IndexOutOfBoundsException(C48263Iwt.LIZIZ("End index: ", i2, " >= ", i3));
            }
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        }
        return i4;
    }

    public static AbstractC87134YHq zzl(byte[] bArr, int i, int i2) {
        LJIIIZ(i, i + i2, bArr.length);
        byte[] bArr2 = new byte[i2];
        System.arraycopy(bArr, i, bArr2, 0, i2);
        return new C87135YHr(bArr2);
    }
}
