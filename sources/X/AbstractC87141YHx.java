package X;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Iterator;

/* renamed from: X.YHx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC87141YHx implements Serializable, Iterable<Byte> {
    public static final InterfaceC78595Usx LJLIL;
    public static final AbstractC87141YHx zzfuo = new C87142YHy(YI0.LIZIZ);
    public int zzftx;

    public abstract String LIZJ(Charset charset);

    public abstract void LJFF(YI7 yi7);

    public abstract void LJII(byte[] bArr, int i);

    public abstract int LJIIIIZZ(int i, int i2);

    public abstract byte LJIIIZ(int i);

    public abstract boolean equals(Object obj);

    public abstract int size();

    public final String toString() {
        return C16880lQ.LLLZ("<ByteString@%s size=%d>", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size())});
    }

    public abstract boolean zzarf();

    public abstract YI8 zzarg();

    public abstract byte zzfi(int i);

    public abstract AbstractC87141YHx zzw(int i, int i2);

    static {
        InterfaceC78595Usx c78605Ut7;
        int i = 0;
        if (C64525PUb.LIZ()) {
            c78605Ut7 = new C78588Usq(i);
        } else {
            c78605Ut7 = new C78605Ut7(i);
        }
        LJLIL = c78605Ut7;
    }

    public final int hashCode() {
        int i = this.zzftx;
        if (i == 0) {
            int size = size();
            i = LJIIIIZZ(size, size);
            if (i == 0) {
                i = 1;
            }
            this.zzftx = i;
        }
        return i;
    }

    @Override // java.lang.Iterable
    public /* synthetic */ Iterator<Byte> iterator() {
        return new YI1(this);
    }

    public final String zzare() {
        Charset charset = YI0.LIZ;
        if (size() == 0) {
            return "";
        }
        return LIZJ(charset);
    }

    public final byte[] toByteArray() {
        int size = size();
        if (size == 0) {
            return YI0.LIZIZ;
        }
        byte[] bArr = new byte[size];
        LJII(bArr, size);
        return bArr;
    }

    public static AbstractC87141YHx zzgt(String str) {
        return new C87142YHy(str.getBytes(YI0.LIZ));
    }

    public static AbstractC87141YHx zzy(byte[] bArr) {
        return zzi(bArr, 0, bArr.length);
    }

    public static int LJIIJ(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) < 0) {
            if (i >= 0) {
                if (i2 < i) {
                    StringBuilder sb = new StringBuilder(66);
                    sb.append("Beginning index larger than ending index: ");
                    sb.append(i);
                    sb.append(", ");
                    sb.append(i2);
                    throw new IndexOutOfBoundsException(sb.toString());
                }
                StringBuilder sb2 = new StringBuilder(37);
                sb2.append("End index: ");
                sb2.append(i2);
                sb2.append(" >= ");
                sb2.append(i3);
                throw new IndexOutOfBoundsException(sb2.toString());
            }
            StringBuilder sb3 = new StringBuilder(32);
            sb3.append("Beginning index: ");
            sb3.append(i);
            sb3.append(" < 0");
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        return i4;
    }

    public static AbstractC87141YHx zzi(byte[] bArr, int i, int i2) {
        LJIIJ(i, i + i2, bArr.length);
        return new C87142YHy(LJLIL.LJIILJJIL(i, bArr, i2));
    }
}
