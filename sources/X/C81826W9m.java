package X;

import java.io.InputStream;

/* renamed from: X.W9m, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81826W9m {
    public static int LIZ(InputStream inputStream, byte[] bArr, int i) {
        inputStream.getClass();
        if (i >= 0) {
            int i2 = 0;
            while (i2 < i) {
                int read = inputStream.read(bArr, i2, i - i2);
                if (read == -1) {
                    break;
                }
                i2 += read;
            }
            return i2;
        }
        throw new IndexOutOfBoundsException("len is negative");
    }
}
