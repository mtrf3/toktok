package X;

import java.io.EOFException;
import java.io.InputStream;
import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.PUe, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64528PUe {
    public static C64537PUn LIZ(String receiver) {
        o.LJIIJ(receiver, "$receiver");
        byte[] bytes = receiver.getBytes(PVC.LIZ);
        o.LJFF(bytes, "(this as java.lang.String).getBytes(charset)");
        C64537PUn c64537PUn = new C64537PUn(bytes);
        c64537PUn.setUtf8$jvm(receiver);
        return c64537PUn;
    }

    public static C64537PUn LIZIZ(byte... data) {
        o.LJIIJ(data, "data");
        byte[] copyOf = Arrays.copyOf(data, data.length);
        o.LJFF(copyOf, "java.util.Arrays.copyOf(this, size)");
        return new C64537PUn(copyOf);
    }

    public static C64537PUn LIZJ(C64528PUe c64528PUe, byte[] bArr) {
        int length = bArr.length;
        c64528PUe.getClass();
        C30581Hy.LJIIIIZZ(bArr.length, 0, length);
        byte[] bArr2 = new byte[length];
        V1M.LIZJ(bArr, 0, 0, bArr2, length);
        return new C64537PUn(bArr2);
    }

    public static C64537PUn LIZLLL(InputStream receiver, int i) {
        o.LJIIJ(receiver, "$receiver");
        int i2 = 0;
        if (i >= 0) {
            byte[] bArr = new byte[i];
            while (i2 < i) {
                int read = receiver.read(bArr, i2, i - i2);
                if (read != -1) {
                    i2 += read;
                } else {
                    throw new EOFException();
                }
            }
            return new C64537PUn(bArr);
        }
        String LJ = KMP.LJ("byteCount < 0: ", i);
        LJ.toString();
        throw new IllegalArgumentException(LJ);
    }
}
