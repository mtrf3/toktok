package X;

import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.Closeable;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public final class FTE {
    public static final java.util.Map<String, Object> LIZ = new ConcurrentHashMap();

    public static void LIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static int LIZIZ(byte[] bArr, int i) {
        byte b;
        while (i < bArr.length && (b = bArr[i]) != 10) {
            if (Character.isDigit(b)) {
                int i2 = i + 1;
                while (i2 < bArr.length && Character.isDigit(bArr[i2])) {
                    i2++;
                }
                return CastIntegerProtector.parseInt(new String(bArr, 0, i, i2 - i));
            }
            i++;
        }
        return -1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0014, code lost:
    
        if (r1 == 10) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZJ(java.lang.String r8, java.io.FileInputStream r9) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r7 = new byte[r0]
            r6 = -1
            int r5 = r9.read(r7)     // Catch: java.lang.Throwable -> L3a
            r4 = 0
        La:
            if (r4 >= r5) goto L3a
            r1 = r7[r4]     // Catch: java.lang.Throwable -> L3a
            r0 = 10
            if (r1 == r0) goto L16
            if (r4 != 0) goto L36
            if (r1 != r0) goto L18
        L16:
            int r4 = r4 + 1
        L18:
            r3 = r4
        L19:
            if (r3 >= r5) goto L36
            int r2 = r3 - r4
            r1 = r7[r3]     // Catch: java.lang.Throwable -> L3a
            char r0 = r8.charAt(r2)     // Catch: java.lang.Throwable -> L3a
            if (r1 == r0) goto L26
            goto L36
        L26:
            int r0 = r8.length()     // Catch: java.lang.Throwable -> L3a
            int r0 = r0 + (-1)
            if (r2 != r0) goto L33
            int r0 = LIZIZ(r7, r3)     // Catch: java.lang.Throwable -> L3a
            goto L39
        L33:
            int r3 = r3 + 1
            goto L19
        L36:
            int r4 = r4 + 1
            goto La
        L39:
            return r0
        L3a:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: X.FTE.LIZJ(java.lang.String, java.io.FileInputStream):int");
    }
}
