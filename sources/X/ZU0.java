package X;

import android.content.Context;
import android.graphics.Point;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.WindowManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.File;

/* loaded from: classes19.dex */
public final class ZU0 {
    public static final /* synthetic */ int LIZ = 0;

    public static long LIZIZ(Context context) {
        long j;
        if (context == null) {
            return -1L;
        }
        try {
            String packageName = context.getPackageName();
            if (TextUtils.isEmpty(packageName)) {
                return -1L;
            }
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/data/data/");
            LIZ2.append(packageName);
            File file = new File(X1D.LIZIZ(LIZ2));
            if (!file.exists()) {
                return -1L;
            }
            long LIZJ = LIZJ(file);
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append(C16880lQ.LLLLLLLLLL().getAbsolutePath());
            LIZ3.append("/Android/data/");
            LIZ3.append(packageName);
            File file2 = new File(X1D.LIZIZ(LIZ3));
            if (file2.exists()) {
                j = LIZJ(file2);
            } else {
                j = 0;
            }
            return LIZJ + j;
        } catch (Throwable unused) {
            return -1L;
        }
    }

    public static long LIZJ(File file) {
        long length;
        File[] listFiles = file.listFiles();
        long j = 0;
        if (listFiles == null) {
            return 0L;
        }
        for (File file2 : listFiles) {
            if (file2.isDirectory()) {
                length = LIZJ(file2);
            } else {
                length = file2.length();
            }
            j += length;
        }
        return j;
    }

    public static ZU1 LIZLLL(Context context) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        WindowManager windowManager = (WindowManager) C16880lQ.LLILL(context, "window");
        ZU1 zu1 = new ZU1();
        if (windowManager != null) {
            Display defaultDisplay = windowManager.getDefaultDisplay();
            defaultDisplay.getMetrics(displayMetrics);
            zu1.LIZ = displayMetrics.widthPixels;
            zu1.LIZIZ = displayMetrics.heightPixels;
            zu1.LIZJ = displayMetrics.xdpi;
            zu1.LIZLLL = displayMetrics.ydpi;
            zu1.LJ = displayMetrics.density;
            zu1.LJFF = displayMetrics.densityDpi;
            Point point = new Point();
            windowManager.getDefaultDisplay().getRealSize(point);
            int i = point.x;
            if (i > zu1.LIZ) {
                zu1.LIZ = i;
            }
            int i2 = point.y;
            if (i2 > zu1.LIZIZ) {
                zu1.LIZIZ = i2;
            }
            windowManager.getDefaultDisplay().getRealMetrics(displayMetrics);
            int i3 = displayMetrics.widthPixels;
            if (i3 > zu1.LIZ) {
                zu1.LIZ = i3;
            }
            int i4 = displayMetrics.heightPixels;
            if (i4 > zu1.LIZIZ) {
                zu1.LIZIZ = i4;
            }
            if (Build.VERSION.SDK_INT >= 23) {
                int physicalWidth = defaultDisplay.getMode().getPhysicalWidth();
                int physicalHeight = defaultDisplay.getMode().getPhysicalHeight();
                if (physicalWidth > zu1.LIZ) {
                    zu1.LIZ = physicalWidth;
                }
                if (physicalHeight > zu1.LIZIZ) {
                    zu1.LIZIZ = physicalHeight;
                }
            }
            zu1.LJI = Math.sqrt(Math.pow(zu1.LIZ / zu1.LIZJ, 2.0d) + Math.pow(zu1.LIZIZ / zu1.LIZLLL, 2.0d));
        }
        return zu1;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x003b, code lost:
    
        if (r3 == 10) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:4:0x0018, code lost:
    
        if (r1 == (-1)) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0073, code lost:
    
        if (0 != 0) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long LJ(android.content.Context r10) {
        /*
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo
            r1.<init>()
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r10, r0)
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0
            r3 = -1
            if (r0 == 0) goto L1c
            r0.getMemoryInfo(r1)
            long r1 = r1.totalMem
            int r0 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r0 != 0) goto L7d
        L1a:
            r3 = 0
            goto L1f
        L1c:
            r1 = -1
            goto L1a
        L1f:
            java.io.FileInputStream r8 = new java.io.FileInputStream     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String r0 = "/proc/meminfo"
            r8.<init>(r0)     // Catch: java.lang.Throwable -> L71 java.lang.Exception -> L73
            java.lang.String r10 = "MemTotal"
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r9 = new byte[r0]     // Catch: java.lang.Throwable -> L65 java.lang.Exception -> L6f
            int r7 = r8.read(r9)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65 java.lang.Exception -> L6f
            r6 = 0
        L31:
            if (r6 >= r7) goto L5c
            r3 = r9[r6]     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65 java.lang.Exception -> L6f
            r0 = 10
            if (r3 == r0) goto L3d
            if (r6 != 0) goto L54
            if (r3 != r0) goto L3f
        L3d:
            int r6 = r6 + 1
        L3f:
            r5 = r6
        L40:
            if (r5 >= r7) goto L54
            int r4 = r5 - r6
            r3 = r9[r5]     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65 java.lang.Exception -> L6f
            char r0 = r10.charAt(r4)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65 java.lang.Exception -> L6f
            if (r3 == r0) goto L4d
            goto L54
        L4d:
            r0 = 7
            if (r4 != r0) goto L51
            goto L57
        L51:
            int r5 = r5 + 1
            goto L40
        L54:
            int r6 = r6 + 1
            goto L31
        L57:
            int r0 = LIZ(r9, r5)     // Catch: java.lang.Throwable -> L5c java.lang.Throwable -> L65 java.lang.Exception -> L6f
            goto L5d
        L5c:
            r0 = -1
        L5d:
            long r3 = (long) r0
            r1 = 1024(0x400, double:5.06E-321)
            long r1 = r1 * r3
            r8.close()     // Catch: java.lang.Exception -> L79
            goto L7d
        L65:
            r1 = move-exception
            r8.close()     // Catch: java.lang.Exception -> L6a
            goto L72
        L6a:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L72
        L6f:
            r3 = r8
            goto L75
        L71:
            r1 = move-exception
        L72:
            throw r1
        L73:
            if (r3 == 0) goto L7d
        L75:
            r3.close()     // Catch: java.lang.Exception -> L79
            goto L7d
        L79:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L7d:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: X.ZU0.LJ(android.content.Context):long");
    }

    public static int LIZ(byte[] bArr, int i) {
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
}
