package X;

import android.content.Context;
import android.os.Environment;
import android.text.TextUtils;
import com.ss.android.ugc.effectmanager.common.utils.FileUtils;
import java.io.Closeable;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: X.HgJ, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C44687HgJ {
    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        if (C44694HgQ.LJIL(str)) {
            return C44694HgQ.LJIJJLI(str, null);
        }
        return C1B6.LIZIZ(str);
    }

    public static void LIZJ(Closeable closeable) {
        if (closeable == null) {
            return;
        }
        try {
            closeable.close();
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJI(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
        file.exists();
    }

    public static int LJII(File file) {
        if (!file.exists() || !file.isDirectory()) {
            return 0;
        }
        int i = 0;
        for (File file2 : file.listFiles()) {
            if (file2.isDirectory()) {
                i += LJII(file2);
            } else if (file2.isFile() && file2.exists()) {
                i++;
            }
        }
        return i;
    }

    public static long LJIIIIZZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        return C44694HgQ.LJFF(str);
    }

    public static File LJIIIZ(Context context) {
        if (Environment.isExternalStorageEmulated()) {
            return C16880lQ.LLIIJLIL(context);
        }
        File LLIIJI = C16880lQ.LLIIJI(context, null);
        if (LLIIJI != null) {
            LJI(LLIIJI);
            return LLIIJI;
        }
        return C16880lQ.LLIIJLIL(context);
    }

    /* JADX WARN: Not initialized variable reg: 3, insn: 0x0033: MOVE (r4 I:??[OBJECT, ARRAY]) = (r3 I:??[OBJECT, ARRAY]) (LINE:16777267), block:B:29:0x0033 */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0036 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String LJIIJ(java.io.InputStream r6) {
        /*
            java.io.StringWriter r5 = new java.io.StringWriter
            r5.<init>()
            r4 = 0
            java.io.InputStreamReader r3 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r3.<init>(r6)     // Catch: java.lang.Throwable -> L2a java.lang.Exception -> L2c
            r0 = 8192(0x2000, float:1.148E-41)
            char[] r2 = new char[r0]     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L32
        Lf:
            int r1 = r3.read(r2)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L32
            r0 = -1
            if (r0 == r1) goto L1b
            r0 = 0
            r5.write(r2, r0, r1)     // Catch: java.lang.Exception -> L28 java.lang.Throwable -> L32
            goto Lf
        L1b:
            r3.close()     // Catch: java.io.IOException -> L1f
            goto L23
        L1f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L23:
            java.lang.String r0 = r5.toString()
            return r0
        L28:
            r0 = move-exception
            goto L2e
        L2a:
            r1 = move-exception
            goto L34
        L2c:
            r0 = move-exception
            r3 = r4
        L2e:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L32
            goto L3f
        L32:
            r1 = move-exception
            r4 = r3
        L34:
            if (r4 == 0) goto L3e
            r4.close()     // Catch: java.io.IOException -> L3a
            goto L3e
        L3a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3e:
            throw r1
        L3f:
            if (r3 == 0) goto L49
            r3.close()     // Catch: java.io.IOException -> L45
            goto L49
        L45:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L49:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44687HgJ.LJIIJ(java.io.InputStream):java.lang.String");
    }

    public static boolean LJIIJJI(String str) {
        if (!LIZIZ(str)) {
            return false;
        }
        return C44694HgQ.LJIJI(str, true);
    }

    public static void LJIIL(File file) {
        File[] listFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJIIL(file2);
                } else {
                    C16880lQ.LLLZZIL(file2);
                }
            }
            C16880lQ.LLLZZIL(file);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILIIL(String str) {
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
                LJIIL(file2);
            } else {
                C16880lQ.LLLZZIL(file2);
            }
        }
    }

    public static boolean LJIILJJIL(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        try {
            if (!"mounted".equals(C16880lQ.LLLLLLLZIL())) {
                return false;
            }
            File file = new File(str);
            if (!file.exists() || !C16880lQ.LLLZZIL(file)) {
                return false;
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void LIZ(String str, InterfaceC44688HgK interfaceC44688HgK) {
        if (TextUtils.isEmpty(str)) {
            interfaceC44688HgK.LIZ(Boolean.FALSE);
        } else if (C44694HgQ.LJIL(str)) {
            C44694HgQ.LJIJJLI(str, interfaceC44688HgK);
        } else {
            interfaceC44688HgK.LIZ(Boolean.valueOf(new File(str).exists()));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:84:0x0096, code lost:
    
        if (r4 == null) goto L64;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b4 A[Catch: IOException -> 0x00c7, TRY_ENTER, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00b9 A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00be A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0076 A[Catch: IOException -> 0x00c7, TRY_ENTER, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x007b A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0080 A[Catch: IOException -> 0x00c7, TryCatch #9 {IOException -> 0x00c7, blocks: (B:54:0x0076, B:56:0x007b, B:58:0x0080, B:46:0x00c3, B:40:0x00b4, B:42:0x00b9, B:44:0x00be), top: B:16:0x0028 }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LIZLLL(java.lang.String r12, java.lang.String r13) {
        /*
            Method dump skipped, instructions count: 204
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C44687HgJ.LIZLLL(java.lang.String, java.lang.String):boolean");
    }

    public static void LJ(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[FileUtils.BUFFER_SIZE];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    } else {
                        outputStream.write(bArr, 0, read);
                    }
                } catch (Exception e) {
                    C16880lQ.LLLLIIL(e);
                }
            } finally {
                LIZJ(inputStream);
                LIZJ(outputStream);
            }
        }
        outputStream.flush();
    }

    public static void LJFF(String str, boolean z) {
        if (!TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists()) {
                if (!z) {
                    file.mkdirs();
                    return;
                }
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
    }

    public static void LJIILL(File file, C14Q<File, Boolean> c14q) {
        File[] listFiles;
        try {
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return;
            }
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    LJIILL(file2, c14q);
                } else if (c14q.apply(file2).booleanValue()) {
                    C16880lQ.LLLZZIL(file2);
                }
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public static void LJIILLIIL(String str, C14Q<File, Boolean> c14q) {
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
                LJIILL(file2, c14q);
            } else if (c14q.apply(file2).booleanValue()) {
                C16880lQ.LLLZZIL(file2);
            }
        }
    }
}
