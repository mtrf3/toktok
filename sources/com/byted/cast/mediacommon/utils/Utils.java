package com.byted.cast.mediacommon.utils;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Process;
import android.util.Size;
import android.view.WindowManager;
import java.util.Random;

/* loaded from: classes29.dex */
public class Utils {
    public static final String TAG = C16880lQ.LJLLJ(Utils.class);

    public static int Alias8(int i) {
        return (i & 7) == 0 ? i : (i + 8) & (-8);
    }

    public static String deviceId() {
        Random random = new Random();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("");
        LIZ.append(random.nextInt(999));
        return X1D.LIZIZ(LIZ);
    }

    public static String osVersion() {
        return Build.VERSION.RELEASE;
    }

    public static String getAppName(Context context) {
        ApplicationInfo applicationInfo = context.getApplicationInfo();
        int i = applicationInfo.labelRes;
        if (i == 0) {
            return applicationInfo.nonLocalizedLabel.toString();
        }
        return context.getString(i);
    }

    public static String getAppVersion(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0021, code lost:
    
        if (r3 != 3) goto L8;
     */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0023 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getDeviceDefaultOrientation(android.content.Context r4) {
        /*
            java.lang.String r0 = "window"
            java.lang.Object r1 = X.C16880lQ.LLILL(r4, r0)
            android.view.WindowManager r1 = (android.view.WindowManager) r1
            android.content.res.Resources r0 = r4.getResources()
            android.content.res.Configuration r4 = r0.getConfiguration()
            android.view.Display r0 = r1.getDefaultDisplay()
            int r3 = r0.getRotation()
            r2 = 1
            r1 = 2
            if (r3 == 0) goto L29
            if (r3 == r2) goto L24
            if (r3 == r1) goto L29
            r0 = 3
            if (r3 == r0) goto L24
        L23:
            return r2
        L24:
            int r0 = r4.orientation
            if (r0 != r2) goto L23
            return r1
        L29:
            int r0 = r4.orientation
            if (r0 != r1) goto L23
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.mediacommon.utils.Utils.getDeviceDefaultOrientation(android.content.Context):int");
    }

    public static int getDeviceRotationDegree(Context context) {
        int displayDefaultRotation = getDisplayDefaultRotation(context);
        if (displayDefaultRotation != 1) {
            if (displayDefaultRotation != 2) {
                if (displayDefaultRotation != 3) {
                    return 0;
                }
                return 270;
            }
            return 180;
        }
        return 90;
    }

    public static int getDisplayDefaultRotation(Context context) {
        return ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getRotation();
    }

    public static String getPackageName(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).packageName;
        } catch (PackageManager.NameNotFoundException unused) {
            return "";
        }
    }

    public static Point getScreenSize(Context context) {
        Point point = new Point();
        ((WindowManager) C16880lQ.LLILL(context, "window")).getDefaultDisplay().getRealSize(point);
        return point;
    }

    public static boolean isLandscape(Context context) {
        Point screenSize = getScreenSize(context);
        if (screenSize.x > screenSize.y) {
            return true;
        }
        return false;
    }

    public static boolean isSystemApp(Context context) {
        try {
            if ((C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).applicationInfo.flags & 1) == 0) {
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public static String getProperty(String str, String str2) {
        String str3 = (String) ReflectMethods.invokeStaticMethod("android.os.SystemProperties", "get", new Class[]{String.class, String.class}, new Object[]{str, str2});
        String str4 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getProp, version is: ");
        LIZ.append(Build.VERSION.SDK_INT);
        LIZ.append(" platform: ");
        LIZ.append(str3);
        Logger.i(str4, X1D.LIZIZ(LIZ));
        return str3;
    }

    public static boolean hasPermission(Context context, String str) {
        if (context != null && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static Size computeVideoSize(int i, int i2, int i3) {
        boolean z;
        int i4;
        int i5;
        int i6 = i & (-8);
        int i7 = i2 & (-8);
        if (i3 > 0) {
            if (i7 > i6) {
                z = true;
                i4 = i7;
            } else {
                z = false;
                i4 = i6;
                i6 = i7;
            }
            if (i4 > i3) {
                i6 = (((i6 * i3) / i4) + 4) & (-8);
            } else {
                i3 = i4;
            }
            if (z) {
                i5 = i6;
                i6 = i3;
            } else {
                i5 = i3;
            }
            i7 = i6;
            i6 = i5;
        }
        return new Size(i6, i7);
    }

    public static Size computeVideoSize(int i, int i2, int i3, int i4) {
        if (i3 > 0 && i4 > 0) {
            float f = (float) ((i4 * 1.0d) / i2);
            float f2 = (float) ((i3 * 1.0d) / i);
            if (f > f2) {
                f = f2;
            }
            if (f - 1.0f < 1.0E-5d) {
                i = Alias8((int) (i * f));
                i2 = Alias8((int) (i2 * f));
            }
        }
        return new Size(i, i2);
    }
}
