package X;

import java.io.FileInputStream;

/* renamed from: X.Pwn, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66093Pwn {
    public static String LIZ;
    public static boolean LIZIZ;

    public static String LIZ() {
        byte[] bArr = new byte[64];
        FileInputStream fileInputStream = new FileInputStream("/proc/self/cmdline");
        try {
            int read = fileInputStream.read(bArr);
            int i = 0;
            while (true) {
                if (i >= 64) {
                    i = -1;
                    break;
                }
                if (bArr[i] == 0) {
                    break;
                }
                i++;
            }
            if (i > 0) {
                read = i;
            }
            return new String(bArr, 0, read);
        } finally {
            fileInputStream.close();
        }
    }
}
