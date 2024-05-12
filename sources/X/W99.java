package X;

import java.io.InputStream;

/* loaded from: classes15.dex */
public final class W99 {
    public static void LIZ(int i, InputStream inputStream, byte[] bArr) {
        boolean z;
        inputStream.getClass();
        if (bArr.length >= i) {
            z = true;
        } else {
            z = false;
        }
        C32151Nz.LJI(z);
        if (inputStream.markSupported()) {
            try {
                inputStream.mark(i);
                C81826W9m.LIZ(inputStream, bArr, i);
                return;
            } finally {
                inputStream.reset();
            }
        }
        C81826W9m.LIZ(inputStream, bArr, i);
    }
}
