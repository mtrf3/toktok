package com.byted.cast.sdk.utils;

import X.C16880lQ;
import X.F9J;
import X.X1D;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Point;
import android.os.Build;
import android.os.Process;
import android.view.WindowManager;
import com.byted.cast.common.CastLogger;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.StringUtil;
import com.bytedance.mt.protector.impl.string2number.CastFloatProtector;
import java.util.Random;

/* loaded from: classes29.dex */
public class Utils {
    public static final String TAG = C16880lQ.LJLLJ(Utils.class);

    public static String deviceId() {
        Random random = new Random();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(System.currentTimeMillis());
        LIZ.append("");
        LIZ.append(random.nextInt(999));
        return X1D.LIZIZ(LIZ);
    }

    public static int getArch() {
        String str = Build.CPU_ABI;
        if (str.contains("arm64-v8a")) {
            return 64;
        }
        if (!str.contains("armeabi-v7a") && !str.contains("armeabi")) {
            return 64;
        }
        return 32;
    }

    public static float getOSVersionF() {
        String[] split = Build.VERSION.RELEASE.split("\\.");
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int i2 = 0; i2 < split.length; i2++) {
            if (StringUtil.isNumeric(split[i2])) {
                sb.append(split[i2]);
                if (i == 0) {
                    sb.append(".");
                }
                i++;
            }
        }
        int length = sb.length() - 1;
        if (length >= 0 && '.' == sb.charAt(length)) {
            sb.deleteCharAt(length);
        }
        String str = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getOSVersionF, newVersion:");
        LIZ.append((Object) sb);
        Logger.i(str, X1D.LIZIZ(LIZ));
        if (sb.length() == 0) {
            Logger.w(str, "getOSVersionF, parse Build.VERSION.RELEASE error, use default version 4.4");
            return 4.4f;
        }
        try {
            return CastFloatProtector.parseFloat(sb.toString());
        } catch (Exception unused) {
            Logger.w(TAG, "getOSVersionF, parse float error, use default version 4.4");
            return 4.4f;
        }
    }

    public static String osVersion() {
        return Build.VERSION.RELEASE;
    }

    public static boolean checkCameraHardware(Context context) {
        if (context.getPackageManager().hasSystemFeature("android.hardware.camera")) {
            return true;
        }
        return false;
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
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.sdk.utils.Utils.getDeviceDefaultOrientation(android.content.Context):int");
    }

    public static String getDeviceId(Context context) {
        SharedPreferences LIZIZ = F9J.LIZIZ(context, 0, "bytelink");
        String string = LIZIZ.getString("deviceId", "");
        if ("".equals(string)) {
            String deviceId = deviceId();
            SharedPreferences.Editor edit = LIZIZ.edit();
            edit.putString("deviceId", deviceId);
            edit.apply();
            return deviceId;
        }
        return string;
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

    public static String getNetworkInterfaceName(ContextManager.CastContext castContext) {
        return getProperty("wifi.interface", "wlan0", castContext);
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

    public static boolean hasPermission(Context context, String str) {
        if (context != null && context.checkPermission(str, Process.myPid(), Process.myUid()) == 0) {
            return true;
        }
        return false;
    }

    public static String getProperty(String str, String str2, ContextManager.CastContext castContext) {
        CastLogger logger = ContextManager.getLogger(castContext);
        String str3 = (String) ReflectMethods.invokeStaticMethod("android.os.SystemProperties", "get", new Class[]{String.class, String.class}, new Object[]{str, str2}, castContext);
        String str4 = TAG;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("getProp, version is: ");
        LIZ.append(Build.VERSION.SDK_INT);
        LIZ.append(" platform: ");
        LIZ.append(str3);
        logger.i(str4, X1D.LIZIZ(LIZ));
        return str3;
    }
}
