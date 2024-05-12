package X;

import Y.ARunnableS41S0100000_5;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Method;
import kotlin.jvm.internal.o;

/* renamed from: X.Fg7, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39579Fg7 implements InterfaceC39580Fg8, InterfaceC60688Nro {
    public static Context LJLIL;

    public void LJIILLIIL(View view) {
        throw null;
    }

    public static boolean LJIILJJIL() {
        Method method;
        try {
            String LLLLLLLZIL = C16880lQ.LLLLLLLZIL();
            if (!"mounted".equals(LLLLLLLZIL)) {
                if (!"mounted_ro".equals(LLLLLLLZIL)) {
                    return false;
                }
            }
        } catch (Exception unused) {
            Context context = LJLIL;
            Method method2 = null;
            if (context == null) {
                return false;
            }
            Object LLILL = C16880lQ.LLILL(context, "storage");
            try {
                method = LLILL.getClass().getMethod("getVolumeList", new Class[0]);
            } catch (Exception e) {
                e = e;
                method = null;
            }
            try {
                method2 = LLILL.getClass().getMethod("getVolumeState", String.class);
            } catch (Exception e2) {
                e = e2;
                C16880lQ.LLLLIIL(e);
                if (LLILL != null || method == null || method2 == null) {
                    return false;
                }
                try {
                    Object[] objArr = (Object[]) method.invoke(LLILL, new Object[0]);
                    if (objArr != null && objArr.length != 0) {
                        Method method3 = objArr[0].getClass().getMethod("getPath", new Class[0]);
                        Method method4 = objArr[0].getClass().getMethod("isEmulated", new Class[0]);
                        if (method3 != null && method4 != null) {
                            for (Object obj : objArr) {
                                if (((Boolean) method4.invoke(obj, new Object[0])).booleanValue() && method2.invoke(LLILL, (String) method3.invoke(obj, new Object[0])).equals("mounted")) {
                                    return true;
                                }
                            }
                            return false;
                        }
                        return false;
                    }
                    return false;
                } catch (Exception e3) {
                    C16880lQ.LLLLIIL(e3);
                    return false;
                }
            }
            return LLILL != null ? false : false;
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJIILL() {
        /*
            java.lang.String r4 = "file_path"
            r7 = 0
            java.lang.String r5 = X.C16880lQ.LLLLLLLZIL()     // Catch: java.lang.Exception -> L10
            java.lang.String r0 = "mounted"
            boolean r2 = r0.equals(r5)     // Catch: java.lang.Exception -> L14
            if (r2 != 0) goto La2
            goto L1b
        L10:
            r1 = move-exception
            java.lang.String r5 = ""
            goto L15
        L14:
            r1 = move-exception
        L15:
            java.lang.String r0 = "isSdcardWritable catch error"
            com.ss.android.agilelogger.ALog.e(r4, r0, r1)
            r2 = 0
        L1b:
            X.Ol8 r0 = X.C33994DVu.LIZIZ
            java.lang.Object r0 = r0.getValue()
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r0 == 0) goto L89
            r6 = 0
            android.content.Context r0 = X.C39579Fg7.LJLIL     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.File r0 = X.C16880lQ.LLIIJI(r0, r6)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r0 = r0.getPath()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r3 = "sd_can_write"
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r0 = "/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r1.append(r3)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            java.io.File r1 = X.P8H.LIZ(r0)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r1 == 0) goto L88
            boolean r0 = r1.exists()     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            if (r0 == 0) goto L88
            java.io.FileOutputStream r2 = new java.io.FileOutputStream     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L6b java.lang.Exception -> L6d
            byte[] r0 = r3.getBytes()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L78
            r2.write(r0)     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L78
            r2.flush()     // Catch: java.lang.Exception -> L69 java.lang.Throwable -> L78
            r7 = 1
            r2.close()     // Catch: java.io.IOException -> L84
            goto L88
        L69:
            r0 = move-exception
            goto L6f
        L6b:
            r1 = move-exception
            goto L83
        L6d:
            r0 = move-exception
            r2 = r6
        L6f:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L78
            if (r2 == 0) goto L88
            r2.close()     // Catch: java.io.IOException -> L84
            goto L88
        L78:
            r1 = move-exception
            if (r2 == 0) goto L83
            r2.close()     // Catch: java.io.IOException -> L7f
            goto L83
        L7f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L83:
            throw r1
        L84:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L88:
            r2 = r7
        L89:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r0 = "isSdcardWritable: "
            r1.<init>(r0)
            r1.append(r2)
            java.lang.String r0 = ", externalStorageState: "
            r1.append(r0)
            r1.append(r5)
            java.lang.String r0 = r1.toString()
            com.ss.android.agilelogger.ALog.com_ss_android_agilelogger_ALog_com_ss_android_ugc_aweme_lancet_AlogLancet_alogE(r4, r0)
        La2:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39579Fg7.LJIILL():boolean");
    }

    public static File LJIIJJI() {
        if (!LJIILJJIL() || !LJIILL()) {
            return null;
        }
        File file = new File(LJII(LJLIL), "picture");
        LJFF(file);
        return file;
    }

    public static File LJIIL() {
        if (!LJIILJJIL() || !LJIILL()) {
            return null;
        }
        File file = new File(LJII(LJLIL), "video");
        LJFF(file);
        return file;
    }

    public static long LJIILIIL() {
        if (!LJIILJJIL()) {
            return 0L;
        }
        return C268513p.LIZJ(EF7.LIZIZ());
    }

    public static boolean LIZIZ(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        return C1B6.LIZIZ(str);
    }

    public static void LJFF(File file) {
        if (!file.exists()) {
            file.mkdirs();
        }
    }

    public static File LJII(Context context) {
        File LLIIIZ = C16880lQ.LLIIIZ(context);
        if (LLIIIZ == null) {
            return C16880lQ.LLIIIL(context);
        }
        return LLIIIZ;
    }

    public static long LJIIIIZZ(String str) {
        File[] listFiles;
        long LJIIIIZZ;
        long j = 0;
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (LJIILL() && !TextUtils.isEmpty(str)) {
            File file = new File(str);
            if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                return 0L;
            }
            for (File file2 : listFiles) {
                if (file2.isFile()) {
                    LJIIIIZZ = file2.length();
                } else if (file2.isDirectory()) {
                    LJIIIIZZ = LJIIIIZZ(file2.getAbsolutePath());
                }
                j += LJIIIIZZ;
            }
            return j;
        }
        return 0L;
    }

    public static File LJIIIZ(File file) {
        if (!LJIILJJIL() || !LJIILL() || TextUtils.isEmpty("cache")) {
            return null;
        }
        if (file == null) {
            file = LJII(LJLIL);
        }
        File file2 = new File(file, "cache");
        LJFF(file2);
        return file2;
    }

    public static File LJIIJ(String str) {
        if (!LJIILJJIL() || !LJIILL() || TextUtils.isEmpty(str)) {
            return null;
        }
        File file = new File(LJII(LJLIL), str);
        LJFF(file);
        return file;
    }

    public static String LJIJI(String str) {
        FileReader fileReader;
        FileReader fileReader2 = null;
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            fileReader = new FileReader(str);
            try {
                StringBuilder sb = new StringBuilder();
                char[] cArr = new char[1024];
                while (true) {
                    int read = fileReader.read(cArr);
                    if (read == -1) {
                        break;
                    }
                    sb.append(cArr, 0, read);
                }
                String sb2 = sb.toString();
                try {
                    fileReader.close();
                } catch (IOException unused) {
                }
                return sb2;
            } catch (Exception unused2) {
                if (fileReader != null) {
                    try {
                        fileReader.close();
                    } catch (IOException unused3) {
                    }
                }
                return null;
            } catch (Throwable th) {
                th = th;
                fileReader2 = fileReader;
                if (fileReader2 != null) {
                    try {
                        fileReader2.close();
                    } catch (IOException unused4) {
                    }
                }
                throw th;
            }
        } catch (Exception unused5) {
            fileReader = null;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static void LJIJJ(File file) {
        File[] listFiles;
        if (file != null) {
            try {
                if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null) {
                    return;
                }
                for (File file2 : listFiles) {
                    if (file2.isDirectory()) {
                        LJIJJ(file2);
                    } else {
                        C16880lQ.LLLZZIL(file2);
                    }
                }
                C16880lQ.LLLZZIL(file);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LJIJJLI(String str) {
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
                LJIJJ(file2);
            } else {
                C16880lQ.LLLZZIL(file2);
            }
        }
    }

    public static boolean LJIL(String str) {
        if (TextUtils.isEmpty(str) || !LJIILL()) {
            return false;
        }
        File file = new File(str);
        if (!file.exists() || !C16880lQ.LLLZZIL(file)) {
            return false;
        }
        return true;
    }

    @Override // X.InterfaceC60688Nro
    public InterfaceC61488OBg LIZ(C60737Nsb hybridContext) {
        o.LJIIJ(hybridContext, "hybridContext");
        return C60905NvJ.LIZIZ(hybridContext, null);
    }

    public static void LIZJ(String str, String str2) {
        File[] listFiles;
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        File file = new File(str);
        if (!file.exists() || !file.isDirectory() || (listFiles = file.listFiles()) == null || listFiles.length == 0) {
            return;
        }
        File file2 = new File(str2);
        if (!file2.exists() || !file2.isDirectory()) {
            file2.mkdirs();
        }
        for (File file3 : listFiles) {
            if (file3.isDirectory()) {
                String path = file3.getPath();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(str2);
                LIZ.append(File.separator);
                LIZ.append(file3.getName());
                LIZJ(path, X1D.LIZIZ(LIZ));
            } else {
                String path2 = file3.getPath();
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(str2);
                LIZ2.append(File.separator);
                LIZ2.append(file3.getName());
                LJI(path2, X1D.LIZIZ(LIZ2));
            }
        }
    }

    public static boolean LIZLLL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2) || !C1B6.LIZIZ(str)) {
            return false;
        }
        LJ(str2, true);
        return LJI(str, str2);
    }

    public static void LJ(String str, boolean z) {
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

    /* JADX WARN: Code restructure failed: missing block: B:86:0x0088, code lost:
    
        if (r10 == null) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00ab A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:41:0x00a6, B:31:0x00ab, B:33:0x00b0, B:35:0x00b5), top: B:40:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b0 A[Catch: IOException -> 0x00b9, TryCatch #0 {IOException -> 0x00b9, blocks: (B:41:0x00a6, B:31:0x00ab, B:33:0x00b0, B:35:0x00b5), top: B:40:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00b5 A[Catch: IOException -> 0x00b9, TRY_LEAVE, TryCatch #0 {IOException -> 0x00b9, blocks: (B:41:0x00a6, B:31:0x00ab, B:33:0x00b0, B:35:0x00b5), top: B:40:0x00a6 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00a6 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0061 A[Catch: IOException -> 0x006f, TryCatch #9 {IOException -> 0x006f, blocks: (B:57:0x005c, B:47:0x0061, B:49:0x0066, B:51:0x006b), top: B:56:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0066 A[Catch: IOException -> 0x006f, TryCatch #9 {IOException -> 0x006f, blocks: (B:57:0x005c, B:47:0x0061, B:49:0x0066, B:51:0x006b), top: B:56:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x006b A[Catch: IOException -> 0x006f, TRY_LEAVE, TryCatch #9 {IOException -> 0x006f, blocks: (B:57:0x005c, B:47:0x0061, B:49:0x0066, B:51:0x006b), top: B:56:0x005c }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x005c A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean LJI(java.lang.String r11, java.lang.String r12) {
        /*
            Method dump skipped, instructions count: 190
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39579Fg7.LJI(java.lang.String, java.lang.String):boolean");
    }

    public static boolean LJJ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        File file = new File(str);
        File file2 = new File(str2);
        if (!file.exists() || !file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    public static boolean LJJI(String str, String str2) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str)) {
            return true;
        }
        try {
            FileWriter fileWriter = new FileWriter(str, false);
            fileWriter.write(str2);
            fileWriter.flush();
            fileWriter.close();
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public void LJIIZILJ(View rootView, String url) {
        o.LJIIIZ(rootView, "rootView");
        o.LJIIIZ(url, "url");
        rootView.post(new ARunnableS41S0100000_5(rootView, 312));
    }

    public void LJIJ(ConstraintLayout constraintLayout, String url) {
        o.LJIIIZ(url, "url");
        constraintLayout.post(new ARunnableS41S0100000_5(constraintLayout, 312));
    }
}
