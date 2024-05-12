package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Environment;
import android.os.Process;
import android.os.StatFs;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.Fhr, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39687Fhr {
    public static final FT8 LIZ = new FT8();

    public static int LJIIJ() {
        FileInputStream fileInputStream;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(Process.myPid());
            LIZ2.append("/limits");
            fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ2));
            try {
                try {
                    int LJIJI = LJIJI("Max open files", fileInputStream);
                    LIZIZ(fileInputStream);
                    return LJIJI;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    LIZIZ(fileInputStream);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                LIZIZ(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    public static int LJIIJJI() {
        int i = -1;
        try {
            int LJII = LJII("/sys/devices/system/cpu/possible");
            if (LJII == -1) {
                LJII = LJII("/sys/devices/system/cpu/present");
            }
            if (LJII == -1) {
                i = new File("/sys/devices/system/cpu/").listFiles(LIZ).length;
                return i;
            }
            return LJII;
        } catch (NullPointerException | SecurityException unused) {
            return i;
        }
    }

    public static int LJIILJJIL() {
        FileInputStream fileInputStream;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(Process.myPid());
            LIZ2.append("/status");
            fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ2));
            try {
                try {
                    int LJIJI = LJIJI("Threads", fileInputStream);
                    LIZIZ(fileInputStream);
                    return LJIJI;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    LIZIZ(fileInputStream);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                LIZIZ(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    public static int LJIILLIIL() {
        FileInputStream fileInputStream;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(Process.myPid());
            LIZ2.append("/status");
            fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ2));
            try {
                try {
                    int LJIJI = LJIJI("VmPeak", fileInputStream);
                    LIZIZ(fileInputStream);
                    return LJIJI;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    LIZIZ(fileInputStream);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                LIZIZ(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    public static int LJIIZILJ() {
        FileInputStream fileInputStream;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(Process.myPid());
            LIZ2.append("/status");
            fileInputStream = new FileInputStream(X1D.LIZIZ(LIZ2));
            try {
                try {
                    int LJIJI = LJIJI("VmSize", fileInputStream);
                    LIZIZ(fileInputStream);
                    return LJIJI;
                } catch (Exception e) {
                    e = e;
                    C16880lQ.LLLLIIL(e);
                    LIZIZ(fileInputStream);
                    return -1;
                }
            } catch (Throwable th) {
                th = th;
                LIZIZ(fileInputStream);
                throw th;
            }
        } catch (Exception e2) {
            e = e2;
            fileInputStream = null;
        } catch (Throwable th2) {
            th = th2;
            fileInputStream = null;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.lang.String[]] */
    public static String LJIIIIZZ() {
        BufferedReader bufferedReader = null;
        ?? r2 = 0;
        BufferedReader bufferedReader2 = null;
        try {
            try {
                BufferedReader bufferedReader3 = new BufferedReader(new FileReader("/proc/cpuinfo"));
                while (true) {
                    try {
                        String readLine = bufferedReader3.readLine();
                        if (readLine != null) {
                            if (readLine.contains(":")) {
                                r2 = readLine.split(":");
                                if (r2[0].contains("Hardware")) {
                                    ?? r0 = r2[1];
                                    LIZIZ(bufferedReader3);
                                    return r0;
                                }
                            }
                        } else {
                            LIZIZ(bufferedReader3);
                            bufferedReader = r2;
                            break;
                        }
                    } catch (IOException e) {
                        e = e;
                        bufferedReader2 = bufferedReader3;
                        C16880lQ.LLLLIIL(e);
                        LIZIZ(bufferedReader2);
                        bufferedReader = bufferedReader2;
                        return Build.HARDWARE;
                    } catch (Throwable th) {
                        th = th;
                        bufferedReader = bufferedReader3;
                        LIZIZ(bufferedReader);
                        throw th;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e2) {
            e = e2;
        }
    }

    public static boolean LJIJ() {
        String str = Build.TAGS;
        if (str != null && str.contains("test-keys")) {
            return true;
        }
        try {
            if (new File("/system/app/Superuser.apk").exists()) {
                return true;
            }
        } catch (Exception unused) {
        }
        if (LIZ("/system/xbin/which su") || LIZ("/system/bin/which su") || LIZ("which su") || LIZ("busybox which su")) {
            return true;
        }
        return false;
    }

    public static long LJFF() {
        if (Environment.getDataDirectory() == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(Environment.getDataDirectory().getPath());
            return statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
            return -1L;
        }
    }

    public static boolean LIZ(String str) {
        boolean z = false;
        Process process = null;
        try {
            process = Runtime.getRuntime().exec(str);
            if (new BufferedReader(new InputStreamReader(process.getInputStream())).readLine() != null) {
                z = true;
            }
            process.destroy();
            return z;
        } catch (Exception unused) {
            if (process != null) {
                process.destroy();
            }
            return false;
        } catch (Throwable th) {
            if (process != null) {
                process.destroy();
            }
            throw th;
        }
    }

    public static void LIZIZ(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:9|10|11|(6:13|15|16|(1:18)|20|21)|23|15|16|(0)|20|21) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0032 A[Catch: all -> 0x003b, TRY_LEAVE, TryCatch #1 {all -> 0x003b, blocks: (B:16:0x0028, B:18:0x0032), top: B:15:0x0028 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LIZLLL(android.content.Context r6) {
        /*
            r1 = -1
            if (r6 != 0) goto L5
            return r1
        L5:
            java.lang.String r0 = r6.getPackageName()     // Catch: java.lang.Throwable -> L3d
            boolean r0 = android.text.TextUtils.isEmpty(r0)     // Catch: java.lang.Throwable -> L3d
            if (r0 == 0) goto L10
            return r1
        L10:
            r4 = 0
            java.io.File r0 = X.C16880lQ.LLIIIL(r6)     // Catch: java.lang.Throwable -> L26
            java.lang.String r1 = r0.getParent()     // Catch: java.lang.Throwable -> L26
            if (r1 == 0) goto L26
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L26
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L26
            long r2 = LJIIIZ(r0)     // Catch: java.lang.Throwable -> L26
            goto L28
        L26:
            r2 = 0
        L28:
            java.io.File r0 = X.C16880lQ.LLIIIZ(r6)     // Catch: java.lang.Throwable -> L3b
            java.lang.String r1 = r0.getParent()     // Catch: java.lang.Throwable -> L3b
            if (r1 == 0) goto L3b
            java.io.File r0 = new java.io.File     // Catch: java.lang.Throwable -> L3b
            r0.<init>(r1)     // Catch: java.lang.Throwable -> L3b
            long r4 = LJIIIZ(r0)     // Catch: java.lang.Throwable -> L3b
        L3b:
            long r2 = r2 + r4
            return r2
        L3d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39687Fhr.LIZLLL(android.content.Context):long");
    }

    public static long LJ(Context context) {
        File LLIIIZ;
        long blockSizeLong;
        if (context == null || (LLIIIZ = C16880lQ.LLIIIZ(context)) == null) {
            return -1L;
        }
        try {
            StatFs statFs = new StatFs(LLIIIZ.getPath());
            blockSizeLong = statFs.getBlockSizeLong() * statFs.getAvailableBlocksLong();
        } catch (IllegalArgumentException unused) {
        }
        if (blockSizeLong == -1) {
            return -1L;
        }
        return blockSizeLong;
    }

    public static long LJI(Context context) {
        long j;
        FileInputStream fileInputStream;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.availMem;
            if (j != -1) {
                return j;
            }
        } else {
            j = -1;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            long LJIJI = 1024 * LJIJI("MemAvailable", fileInputStream);
            LIZIZ(fileInputStream);
            return LJIJI;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            LIZIZ(fileInputStream2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (0 != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LJII(java.lang.String r4) {
        /*
            r3 = -1
            r0 = 0
            java.io.FileInputStream r2 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            r2.<init>(r4)     // Catch: java.lang.Throwable -> L44 java.io.IOException -> L46
            java.io.BufferedReader r1 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            java.io.InputStreamReader r0 = new java.io.InputStreamReader     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            java.lang.String r1 = r1.readLine()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            if (r1 == 0) goto L2f
            java.lang.String r0 = "0-[\\d]+$"
            boolean r0 = r1.matches(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            if (r0 != 0) goto L20
            goto L2f
        L20:
            r0 = 2
            java.lang.String r0 = r1.substring(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            java.lang.Integer r0 = com.bytedance.mt.protector.impl.string2number.CastIntegerProtector.valueOf(r0)     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            int r0 = r0.intValue()     // Catch: java.lang.Throwable -> L38 java.io.IOException -> L42
            int r3 = r0 + 1
        L2f:
            r2.close()     // Catch: java.io.IOException -> L33
            goto L37
        L33:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L37:
            return r3
        L38:
            r1 = move-exception
            r2.close()     // Catch: java.io.IOException -> L3d
            goto L45
        L3d:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L45
        L42:
            r0 = r2
            goto L48
        L44:
            r1 = move-exception
        L45:
            throw r1
        L46:
            if (r0 == 0) goto L50
        L48:
            r0.close()     // Catch: java.io.IOException -> L4c
            goto L50
        L4c:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L50:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39687Fhr.LJII(java.lang.String):int");
    }

    public static long LJIIIZ(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = LJIIIZ(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static C39690Fhu LJIIL(Context context) {
        C39690Fhu c39690Fhu = new C39690Fhu();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            c39690Fhu.LIZ = displayMetrics.densityDpi;
            c39690Fhu.LIZIZ = displayMetrics.widthPixels;
            c39690Fhu.LIZJ = displayMetrics.heightPixels;
            c39690Fhu.LIZLLL = displayMetrics.xdpi;
            c39690Fhu.LJ = displayMetrics.ydpi;
            c39690Fhu.LJFF = displayMetrics.density;
        }
        return c39690Fhu;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:1|(2:2|3)|(19:5|6|7|8|(14:10|11|(1:13)|14|(11:16|17|18|19|20|21|(4:23|24|(2:30|(3:33|(4:36|(1:56)(4:38|39|(3:41|42|44)(2:54|55)|(3:50|51|52)(3:46|47|48))|49|34)|57))|26)|58|24|(3:28|30|(3:33|(1:34)|57))|26)|64|19|20|21|(0)|58|24|(0)|26)|66|11|(0)|14|(0)|64|19|20|21|(0)|58|24|(0)|26)|69|6|7|8|(0)|66|11|(0)|14|(0)|64|19|20|21|(0)|58|24|(0)|26) */
    /* JADX WARN: Can't wrap try/catch for region: R(23:1|2|3|(19:5|6|7|8|(14:10|11|(1:13)|14|(11:16|17|18|19|20|21|(4:23|24|(2:30|(3:33|(4:36|(1:56)(4:38|39|(3:41|42|44)(2:54|55)|(3:50|51|52)(3:46|47|48))|49|34)|57))|26)|58|24|(3:28|30|(3:33|(1:34)|57))|26)|64|19|20|21|(0)|58|24|(0)|26)|66|11|(0)|14|(0)|64|19|20|21|(0)|58|24|(0)|26)|69|6|7|8|(0)|66|11|(0)|14|(0)|64|19|20|21|(0)|58|24|(0)|26) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0084, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0085, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:8:0x001f, B:10:0x0029), top: B:7:0x001f }] */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00c7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static X.C39689Fht LJIILIIL(android.content.Context r9) {
        /*
            Method dump skipped, instructions count: 274
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C39687Fhr.LJIILIIL(android.content.Context):X.Fht");
    }

    public static long LJIILL(Context context) {
        long j;
        FileInputStream fileInputStream;
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager != null) {
            activityManager.getMemoryInfo(memoryInfo);
            j = memoryInfo.totalMem;
            if (j != -1) {
                return j;
            }
        } else {
            j = -1;
        }
        FileInputStream fileInputStream2 = null;
        try {
            fileInputStream = new FileInputStream("/proc/meminfo");
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            fileInputStream = null;
        }
        try {
            long LJIJI = 1024 * LJIJI("MemTotal", fileInputStream);
            LIZIZ(fileInputStream);
            return LJIJI;
        } catch (Exception unused2) {
            fileInputStream2 = fileInputStream;
            LIZIZ(fileInputStream2);
            return j;
        } catch (Throwable th2) {
            th = th2;
            LIZIZ(fileInputStream);
            throw th;
        }
    }

    public static int LIZJ(byte[] bArr, int i) {
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
    public static int LJIJI(java.lang.String r8, java.io.FileInputStream r9) {
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
            int r0 = LIZJ(r7, r3)     // Catch: java.lang.Throwable -> L3a
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
        throw new UnsupportedOperationException("Method not decompiled: X.C39687Fhr.LJIJI(java.lang.String, java.io.FileInputStream):int");
    }
}
