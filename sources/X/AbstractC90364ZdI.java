package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: X.ZdI, reason: case insensitive filesystem */
/* loaded from: classes29.dex */
public abstract class AbstractC90364ZdI implements Iterable<Byte>, Serializable {
    public static final AbstractC90364ZdI zzb = new C90895Zlr(C90359ZdD.LIZIZ);
    public int zzc;

    public abstract byte LIZJ(int i);

    public abstract int LJFF(int i, int i2);

    public abstract String LJII(Charset charset);

    public abstract void LJIIIIZZ(AbstractC90761Zjh abstractC90761Zjh);

    public abstract boolean equals(Object obj);

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator<Byte> iterator() {
        return new C90711Zit(this);
    }

    public abstract byte zza(int i);

    public abstract int zzd();

    public abstract AbstractC90364ZdI zzf(int i, int i2);

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
            concat = ZYK.LIZ(this);
        } else {
            concat = ZYK.LIZ(zzf(0, 47)).concat("...");
        }
        objArr[2] = concat;
        return C16880lQ.LLLZI(locale, "<ByteString@%s size=%d contents=\"%s\">", objArr);
    }

    public static AbstractC90364ZdI zzl(String str) {
        return new C90895Zlr(str.getBytes(C90359ZdD.LIZ));
    }

    public final String zzm(Charset charset) {
        if (zzd() == 0) {
            return "";
        }
        return LJII(charset);
    }

    public static void LJIIIZ(int i, int i2) {
        if (((i2 - i) | i) >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(37);
        sb.append("End index: ");
        sb.append(i);
        sb.append(" >= ");
        sb.append(i2);
        throw new IndexOutOfBoundsException(sb.toString());
    }
}
