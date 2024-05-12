package X;

import android.content.Context;
import java.io.File;

/* renamed from: X.Eem, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C36948Eem {
    public static volatile Context LIZ;
    public static volatile boolean LIZIZ;
    public static String LIZJ;
    public static volatile String LIZLLL;

    public static void LIZIZ(Context context) {
        if (context == null) {
            return;
        }
        LIZ = context;
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
        String str = File.separator;
        LIZLLL = JBR.LJFF(LIZ2, str, "ph_out", LIZ2);
        File file = new File(LIZLLL);
        if (!file.exists() && !LIZIZ) {
            synchronized (C36948Eem.class) {
                if (!LIZIZ) {
                    try {
                        StringBuilder LIZ3 = X1D.LIZ();
                        LIZ3.append(C16880lQ.LLIIJLIL(context).getAbsolutePath());
                        LIZ3.append(str);
                        LIZ3.append("ph_reg");
                        LIZJ = X1D.LIZIZ(LIZ3);
                        File file2 = new File(LIZJ);
                        if (file2.exists()) {
                            C16880lQ.LLLZZIL(file2);
                        }
                        file2.mkdir();
                        StringBuilder LIZ4 = X1D.LIZ();
                        LIZ4.append(LIZJ);
                        LIZ4.append(str);
                        LIZ4.append("ph_index");
                        File file3 = new File(X1D.LIZIZ(LIZ4));
                        if (!LIZ(context, "ph_index", file3)) {
                            LIZJ = null;
                            return;
                        }
                        StringBuilder LIZ5 = X1D.LIZ();
                        LIZ5.append(LIZJ);
                        LIZ5.append(str);
                        LIZ5.append("ph_raw");
                        File file4 = new File(X1D.LIZIZ(LIZ5));
                        if (!LIZ(context, "ph_raw", file4)) {
                            LIZJ = null;
                            return;
                        }
                        StringBuilder LIZ6 = X1D.LIZ();
                        LIZ6.append(LIZLLL);
                        LIZ6.append(".tmp");
                        File file5 = new File(X1D.LIZIZ(LIZ6));
                        if (file5.exists()) {
                            C16880lQ.LLLZZIL(file5);
                        }
                        file5.mkdir();
                        StringBuilder LIZ7 = X1D.LIZ();
                        LIZ7.append(LIZJ);
                        LIZ7.append(str);
                        LIZ7.append("ph_raw");
                        File file6 = new File(X1D.LIZIZ(LIZ7));
                        StringBuilder LIZ8 = X1D.LIZ();
                        LIZ8.append(LIZJ);
                        LIZ8.append(str);
                        LIZ8.append("ph_index");
                        if (!LIZJ(file6, new File(X1D.LIZIZ(LIZ8)), file5)) {
                            C16880lQ.LLLZZIL(file5);
                        } else if (!file5.renameTo(file)) {
                            C16880lQ.LLLZZIL(file5);
                            C16880lQ.LLLZZIL(file);
                        } else {
                            LIZIZ = true;
                        }
                        C16880lQ.LLLZZIL(file3);
                        C16880lQ.LLLZZIL(file4);
                        C16880lQ.LLLZZIL(file2);
                    } catch (Throwable unused) {
                        C16880lQ.LLLZZIL(file);
                        LIZJ = null;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:39:0x0048, code lost:
    
        if (r2 == null) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.io.FilterInputStream, com.bytedance.compression.zstd.ZstdInputStream] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZ(android.content.Context r6, java.lang.String r7, java.io.File r8) {
        /*
            r5 = 0
            r2 = 0
            android.content.res.AssetManager r0 = r6.getAssets()     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L58
            java.io.InputStream r0 = r0.open(r7)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L58
            java.io.FileOutputStream r4 = new java.io.FileOutputStream     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L58
            r4.<init>(r8)     // Catch: java.io.IOException -> L41 java.lang.Throwable -> L58
            com.bytedance.compression.zstd.ZstdInputStream r3 = new com.bytedance.compression.zstd.ZstdInputStream     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r3.<init>(r0)     // Catch: java.lang.Throwable -> L39 java.io.IOException -> L3d
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r2 = new byte[r0]     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
        L18:
            int r1 = r3.read(r2)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r0 = -1
            if (r1 == r0) goto L23
            r4.write(r2, r5, r1)     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            goto L18
        L23:
            r4.flush()     // Catch: java.lang.Throwable -> L33 java.io.IOException -> L36
            r4.close()     // Catch: java.lang.Exception -> L2d
            r3.close()     // Catch: java.lang.Exception -> L2d
            goto L31
        L2d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L31:
            r0 = 1
            return r0
        L33:
            r1 = move-exception
            r2 = r3
            goto L3a
        L36:
            r1 = move-exception
            r2 = r3
            goto L3e
        L39:
            r1 = move-exception
        L3a:
            r0 = r2
            r2 = r4
            goto L4a
        L3d:
            r1 = move-exception
        L3e:
            r0 = r2
            r2 = r4
            goto L43
        L41:
            r1 = move-exception
            r0 = r2
        L43:
            X.C16880lQ.LLLLIIL(r1)     // Catch: java.lang.Throwable -> L47
            goto L5a
        L47:
            r1 = move-exception
            if (r2 == 0) goto L4d
        L4a:
            r2.close()     // Catch: java.lang.Exception -> L53
        L4d:
            if (r0 == 0) goto L59
            r0.close()     // Catch: java.lang.Exception -> L53
            goto L59
        L53:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L59
        L58:
            r1 = move-exception
        L59:
            throw r1
        L5a:
            if (r2 == 0) goto L5f
            r2.close()     // Catch: java.lang.Exception -> L65
        L5f:
            if (r0 == 0) goto L69
            r0.close()     // Catch: java.lang.Exception -> L65
            goto L69
        L65:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L69:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36948Eem.LIZ(android.content.Context, java.lang.String, java.io.File):boolean");
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x012d, code lost:
    
        r12.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:?, code lost:
    
        return true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0131, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0132, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0135, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZJ(java.io.File r15, java.io.File r16, java.io.File r17) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C36948Eem.LIZJ(java.io.File, java.io.File, java.io.File):boolean");
    }
}
