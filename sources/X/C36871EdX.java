package X;

import android.text.TextUtils;
import defpackage.i0;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: X.EdX, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36871EdX {
    public static void LIZ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0035: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777269), block:B:29:0x0035 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0038 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LIZJ(java.io.InputStream r6) {
        /*
            java.lang.String r0 = "UTF-8"
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r3.<init>(r6, r0)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L2e
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
        L11:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
            r0 = -1
            if (r0 == r1) goto L1d
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L2a java.lang.Throwable -> L34
            goto L11
        L1d:
            r3.close()     // Catch: java.io.IOException -> L21
            goto L25
        L21:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L25:
            java.lang.String r0 = r5.toString()
            return r0
        L2a:
            r0 = move-exception
            goto L30
        L2c:
            r1 = move-exception
            goto L36
        L2e:
            r0 = move-exception
            r3 = r4
        L30:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L34
            goto L41
        L34:
            r1 = move-exception
            r4 = r3
        L36:
            if (r4 == 0) goto L40
            r4.close()     // Catch: java.io.IOException -> L3c
            goto L40
        L3c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L40:
            throw r1
        L41:
            if (r3 == 0) goto L4b
            r3.close()     // Catch: java.io.IOException -> L47
            goto L4b
        L47:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L4b:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36871EdX.LIZJ(java.io.InputStream):java.lang.String");
    }

    public static void LJ(String str) {
        File[] listFiles;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
            return;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                LJ(file2.getPath());
            } else {
                C16880lQ.LLLZZIL(file2);
            }
        }
        C16880lQ.LLLZZIL(file);
    }

    public static File LIZIZ(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                } else {
                    try {
                        File parentFile = file.getParentFile();
                        if (!parentFile.exists()) {
                            parentFile.mkdirs();
                        }
                        file.createNewFile();
                    } catch (IOException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            return file;
        }
        return null;
    }

    public static byte[] LIZLLL(InputStream inputStream, long j, String str) {
        int i = (int) j;
        byte[] bArr = new byte[i];
        int i2 = 0;
        while (i2 < i) {
            int read = inputStream.read(bArr, i2, i - i2);
            if (read < 0) {
                break;
            }
            i2 += read;
        }
        if (i2 >= i) {
            inputStream.close();
            return bArr;
        }
        throw new IOException(i0.LJFF("Could not completely read file ", str));
    }
}
