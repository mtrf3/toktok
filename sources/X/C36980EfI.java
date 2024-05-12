package X;

import android.content.Context;
import java.io.File;
import java.io.FileInputStream;

/* renamed from: X.EfI, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36980EfI {
    public static void LIZ(String str) {
        File file = new File(str);
        if (!file.exists()) {
            return;
        }
        File[] listFiles = file.listFiles();
        int length = listFiles.length;
        for (int i = 0; i < length; i++) {
            if (listFiles[i].isDirectory()) {
                LJ(listFiles[i].getAbsolutePath());
            } else if (listFiles[i].isFile()) {
                C16880lQ.LLLZZIL(listFiles[i]);
            }
        }
    }

    public static String LIZJ(Context context) {
        if (context != null) {
            String str = null;
            try {
                if (C16880lQ.LLIIIL(context) != null) {
                    str = C16880lQ.LLIIIL(context).getPath();
                } else {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("/data/data/");
                    LIZ.append(context.getPackageName());
                    LIZ.append("/cache/");
                    File dir = context.getDir(X1D.LIZIZ(LIZ), 0);
                    if (dir != null) {
                        str = dir.getPath();
                    }
                }
            } catch (Throwable unused) {
            }
            if (!C38354F3m.LJ(str)) {
                return str;
            }
            throw new NullPointerException("Cannot Create Cache Dir");
        }
        throw new NullPointerException("Context is NUll");
    }

    public static long LIZLLL(File file) {
        long length;
        long j = 0;
        if (!file.exists() && file.isDirectory()) {
            return 0L;
        }
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                length = LIZLLL(file2);
            } else if (file2.isFile()) {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static void LJ(String str) {
        File file = new File(str);
        if (file.exists() && file.isDirectory()) {
            File[] listFiles = file.listFiles();
            int length = listFiles.length;
            for (int i = 0; i < length; i++) {
                if (listFiles[i].isDirectory()) {
                    LJ(listFiles[i].getAbsolutePath());
                } else {
                    C16880lQ.LLLZZIL(listFiles[i]);
                }
            }
            C16880lQ.LLLZZIL(file);
        }
    }

    public static boolean LIZIZ(String str, String str2, String str3) {
        FileInputStream fileInputStream;
        if (C38354F3m.LJ(str) || C38354F3m.LJ(str2) || C38354F3m.LJ(str3)) {
            return false;
        }
        FileInputStream fileInputStream2 = null;
        try {
            try {
                fileInputStream = new FileInputStream(str);
            } catch (Throwable th) {
                th = th;
                if (0 == 0) {
                    throw th;
                }
            }
        } catch (Exception e) {
            e = e;
        }
        try {
            boolean LJFF = LJFF(fileInputStream, str2, str3);
            try {
                fileInputStream.close();
            } catch (Exception e2) {
                C16880lQ.LLLLIIL(e2);
            }
            return LJFF;
        } catch (Exception e3) {
            e = e3;
            C16880lQ.LLLLIIL(e);
            if (fileInputStream2 != null) {
                try {
                    fileInputStream2.close();
                } catch (Exception e4) {
                    C16880lQ.LLLLIIL(e4);
                }
            }
            return false;
        } finally {
            th = th;
            try {
                fileInputStream2.close();
            } catch (Exception e5) {
                C16880lQ.LLLLIIL(e5);
                throw th;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x0059, code lost:
    
        if (0 != 0) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJFF(java.io.InputStream r6, java.lang.String r7, java.lang.String r8) {
        /*
            r5 = 0
            r4 = 0
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            r1.<init>(r7)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            if (r0 != 0) goto L1c
            boolean r0 = r1.mkdirs()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            if (r0 != 0) goto L1c
            r6.close()     // Catch: java.lang.Exception -> L17
            goto L1b
        L17:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L1b:
            return r5
        L1c:
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            r0.<init>(r1, r8)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            java.io.FileOutputStream r3 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
        L2a:
            int r1 = r6.read(r2)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r0 = -1
            if (r1 == r0) goto L35
            r3.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            goto L2a
        L35:
            r3.flush()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r3.close()     // Catch: java.lang.Throwable -> L48 java.lang.Exception -> L4d
            r6.close()     // Catch: java.lang.Throwable -> L4f java.lang.Exception -> L59
            r6.close()     // Catch: java.lang.Exception -> L42
            goto L46
        L42:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L46:
            r0 = 1
            return r0
        L48:
            r1 = move-exception
            r3.close()     // Catch: java.lang.Exception -> L50
            goto L50
        L4d:
            r4 = r3
            goto L5b
        L4f:
            r1 = move-exception
        L50:
            r6.close()     // Catch: java.lang.Exception -> L54
            goto L58
        L54:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L58:
            throw r1
        L59:
            if (r4 == 0) goto L5e
        L5b:
            r4.close()     // Catch: java.lang.Exception -> L5e
        L5e:
            r6.close()     // Catch: java.lang.Exception -> L62
            goto L66
        L62:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L66:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36980EfI.LJFF(java.io.InputStream, java.lang.String, java.lang.String):boolean");
    }
}
