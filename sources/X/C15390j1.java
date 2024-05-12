package X;

import android.app.ActivityManager;
import android.content.Context;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.WindowManager;
import com.bytedance.android.livesdk.livesetting.performance.CpuTemperaturePathListSetting;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/* renamed from: X.0j1, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15390j1 {
    public static final C15370iz LIZ = new FileFilter() { // from class: X.0iz
        @Override // java.io.FileFilter
        public final boolean accept(File file) {
            String name = file.getName();
            if (!name.startsWith("cpu")) {
                return false;
            }
            for (int i = 3; i < name.length(); i++) {
                if (!Character.isDigit(name.charAt(i))) {
                    return false;
                }
            }
            return true;
        }
    };
    public static int LIZIZ = -1;
    public static float LIZJ = -1.0f;

    public static boolean LJFF(double d) {
        return d >= -30.0d && d <= 250.0d;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0046, code lost:
    
        if (0 != 0) goto L30;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZ(java.lang.String r4) {
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
        throw new UnsupportedOperationException("Method not decompiled: X.C15390j1.LIZ(java.lang.String):int");
    }

    public static float LIZIZ(Context context) {
        if (context == null) {
            return -999.0f;
        }
        C29889BoD LIZJ2 = C29889BoD.LIZJ(context, "live-app-core-sdk");
        String str = (String) LIZJ2.LIZLLL("cpu_temperature_path", EnumC29921Boj.STRING, "");
        if (TextUtils.equals(str, "unknow")) {
            return -999.0f;
        }
        if (!TextUtils.isEmpty(str)) {
            float LJI = LJI(new File(str));
            if (LJI != -999.0f) {
                if (LJFF(LJI)) {
                    return LJI;
                }
                float f = LJI / 1000.0f;
                if (!LJFF(f)) {
                    return -999.0f;
                }
                return f;
            }
        }
        for (String str2 : CpuTemperaturePathListSetting.INSTANCE.getPathList()) {
            float LJI2 = LJI(new File(str2));
            if (LJI2 != -999.0f) {
                if (LJFF(LJI2)) {
                    LIZJ2.LJII(str2, "cpu_temperature_path");
                } else {
                    LJI2 /= 1000.0f;
                    if (!LJFF(LJI2)) {
                        return -999.0f;
                    }
                    LIZJ2.LJII(str2, "cpu_temperature_path");
                }
                return LJI2;
            }
        }
        LIZJ2.LJII("unknow", "cpu_temperature_path");
        return -999.0f;
    }

    public static float LIZJ(Context context) {
        if (context == null) {
            return -999.0f;
        }
        float f = LIZJ;
        if (f != -1.0f) {
            return f;
        }
        C29889BoD LIZJ2 = C29889BoD.LIZJ(context, "live-app-core-sdk");
        int LJFF = LIZJ2.LJFF("device_total_memory", -1);
        if (LJFF != -1) {
            float f2 = LJFF;
            LIZJ = f2;
            return f2;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ((ActivityManager) C16880lQ.LLILL(context, "activity")).getMemoryInfo(memoryInfo);
        float f3 = (float) memoryInfo.totalMem;
        if (f3 != -1.0f) {
            LIZJ2.LJII(Float.valueOf(f3), "device_total_memory");
            LIZJ = f3;
            return f3;
        }
        LIZJ = -999.0f;
        return -999.0f;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x003b, code lost:
    
        if (r1 != (-1)) goto L18;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int LIZLLL(android.content.Context r6) {
        /*
            r5 = -999(0xfffffffffffffc19, float:NaN)
            if (r6 != 0) goto L5
            return r5
        L5:
            int r0 = X.C15390j1.LIZIZ
            r4 = -1
            if (r0 == r4) goto Lb
            return r0
        Lb:
            java.lang.String r0 = "live-app-core-sdk"
            X.BoD r3 = X.C29889BoD.LIZJ(r6, r0)
            java.lang.String r2 = "cpu_core"
            int r0 = r3.LJFF(r2, r4)
            if (r0 == r4) goto L1c
            X.C15390j1.LIZIZ = r0
            return r0
        L1c:
            java.lang.String r0 = "/sys/devices/system/cpu/possible"
            int r1 = LIZ(r0)     // Catch: java.lang.Throwable -> L47
            if (r1 != r4) goto L2a
            java.lang.String r0 = "/sys/devices/system/cpu/present"
            int r1 = LIZ(r0)     // Catch: java.lang.Throwable -> L47
        L2a:
            if (r1 != r4) goto L3b
            java.io.File r1 = new java.io.File     // Catch: java.lang.Throwable -> L47
            java.lang.String r0 = "/sys/devices/system/cpu/"
            r1.<init>(r0)     // Catch: java.lang.Throwable -> L47
            X.0iz r0 = X.C15390j1.LIZ     // Catch: java.lang.Throwable -> L47
            java.io.File[] r0 = r1.listFiles(r0)     // Catch: java.lang.Throwable -> L47
            int r1 = r0.length     // Catch: java.lang.Throwable -> L47
            goto L3d
        L3b:
            if (r1 == r4) goto L47
        L3d:
            java.lang.Integer r0 = java.lang.Integer.valueOf(r1)
            r3.LJII(r0, r2)
            X.C15390j1.LIZIZ = r1
            return r1
        L47:
            X.C15390j1.LIZIZ = r5
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: X.C15390j1.LIZLLL(android.content.Context):int");
    }

    public static C1XD LJ(Context context) {
        C1XD c1xd = new C1XD();
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        if (windowManager != null && windowManager.getDefaultDisplay() != null) {
            windowManager.getDefaultDisplay().getMetrics(displayMetrics);
            c1xd.LJLIL = displayMetrics.densityDpi;
            c1xd.LJLILLLLZI = displayMetrics.widthPixels;
            c1xd.LJLJI = displayMetrics.heightPixels;
        }
        return c1xd;
    }

    public static float LJI(File file) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            InputStreamReader inputStreamReader = new InputStreamReader(fileInputStream);
            BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            inputStreamReader.close();
            fileInputStream.close();
            return CastFloatProtector.parseFloat(readLine);
        } catch (IOException | NumberFormatException unused) {
            return -999.0f;
        }
    }
}
