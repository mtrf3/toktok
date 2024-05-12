package com.byted.cast.common.ble;

import X.C16880lQ;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Process;
import android.util.Base64;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.Logger;
import com.byted.cast.common.config.ConfigManager;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;

/* loaded from: classes29.dex */
public class BleUtils {
    public static boolean isBleBrowse;
    public static boolean isBlePublish;

    public static boolean isEnabledBle() {
        return isEnabledBle(null);
    }

    public static boolean isBleBrowse() {
        return isBleBrowse;
    }

    public static boolean isBlePublish() {
        return isBlePublish;
    }

    public static String byteToString(byte[] bArr) {
        byte[] decode;
        if (bArr == null || bArr.length == 0 || (decode = Base64.decode(bArr, 0)) == null || bArr.length == 0) {
            return "UNKNOWN";
        }
        return new String(decode);
    }

    public static int getIntIp(String str) {
        int i = 0;
        if (str == null || str.length() == 0) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return 0;
        }
        int i2 = 0;
        int i3 = 0;
        do {
            i2 |= (CastIntegerProtector.parseInt(split[i]) & 255) << i3;
            i++;
            i3 += 8;
        } while (i < 4);
        return i2;
    }

    public static String[] getPermissions(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 4096).requestedPermissions;
        } catch (PackageManager.NameNotFoundException unused) {
            Logger.e("BleUtils", "NameNotFoundException");
            return new String[0];
        }
    }

    public static BleData getReceivedData(byte[] bArr) {
        byte[] decode;
        if (bArr == null || bArr.length == 0 || (decode = Base64.decode(bArr, 0)) == null || decode.length < 13 || decode[0] != 1) {
            return null;
        }
        int byteToInt = byteToInt(decode, 1, 4);
        int byteToInt2 = byteToInt(decode, 5, 4);
        int byteToInt3 = byteToInt(decode, 9, 2);
        int byteToInt4 = byteToInt(decode, 11, 2);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("ip: ");
        LIZ.append(byteToInt);
        LIZ.append(", netMask: ");
        LIZ.append(byteToInt2);
        LIZ.append(", port: ");
        LIZ.append(byteToInt3);
        LIZ.append(", portMirror: ");
        LIZ.append(byteToInt4);
        Logger.d("BleUtils", X1D.LIZIZ(LIZ));
        return new BleData(byteToInt, byteToInt2, byteToInt3, byteToInt4);
    }

    public static byte[] getSentData(BleData bleData) {
        byte[] bArr = new byte[13];
        bArr[0] = 1;
        intToByte(bleData.getIp(), bArr, 1, 4);
        intToByte(bleData.getNetMask(), bArr, 5, 4);
        intToByte(bleData.getPort(), bArr, 9, 2);
        intToByte(bleData.getPortMirror(), bArr, 11, 2);
        return Base64.encode(bArr, 0);
    }

    public static String getStringIp(int i) {
        String str = "";
        int i2 = 0;
        int i3 = 0;
        do {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(str);
            LIZ.append((i >> i3) & 255);
            LIZ.append(".");
            str = X1D.LIZIZ(LIZ);
            i2++;
            i3 += 8;
        } while (i2 < 4);
        return str.substring(0, str.length() - 1);
    }

    public static boolean hasBrowsePermissions(Context context) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (i < 31) {
                if (isBleStaticPermissionsGranted(context) && isBleDynamicPermissionsGranted(context)) {
                    return true;
                }
            } else if (isScanPermissionGranted(context)) {
                return true;
            }
        } else if (isBleStaticPermissionsGranted(context)) {
            return true;
        }
        return false;
    }

    public static boolean hasDynamicPermissions(Context context) {
        boolean z = false;
        boolean z2 = false;
        for (String str : getPermissions(context)) {
            if ("android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
                z = true;
            } else if ("android.permission.ACCESS_FINE_LOCATION".equals(str)) {
                z2 = true;
            }
        }
        if (!z || !z2) {
            return false;
        }
        return true;
    }

    public static boolean hasPublishPermissions(Context context) {
        if (Build.VERSION.SDK_INT < 31) {
            if (isBleStaticPermissionsGranted(context)) {
                return true;
            }
        } else if (isAdvertisePermissionGranted(context)) {
            return true;
        }
        return false;
    }

    public static boolean isAdvertisePermissionGranted(Context context) {
        if (checkSelfPermission(context, "android.permission.BLUETOOTH_ADVERTISE") == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBleDynamicPermissionsGranted(Context context) {
        if (checkSelfPermission(context, "android.permission.ACCESS_COARSE_LOCATION") == 0 && checkSelfPermission(context, "android.permission.ACCESS_FINE_LOCATION") == 0) {
            return true;
        }
        return false;
    }

    public static boolean isBleStaticPermissionsGranted(Context context) {
        if (checkSelfPermission(context, "android.permission.BLUETOOTH") == 0 && checkSelfPermission(context, "android.permission.BLUETOOTH_ADMIN") == 0) {
            return true;
        }
        return false;
    }

    public static boolean isEnabledBle(ContextManager.CastContext castContext) {
        ConfigManager configManager;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("isEnabledBle: ");
        LIZ.append(castContext);
        Logger.i("BleUtils", X1D.LIZIZ(LIZ));
        if (castContext == null) {
            configManager = ConfigManager.getInstance();
        } else {
            configManager = ContextManager.getConfigManager(castContext);
        }
        if (Boolean.TRUE.equals(configManager.getInitConfig().isEnableBLE())) {
            return true;
        }
        Boolean optionByBoolean = configManager.getOptionByBoolean(10020);
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("isEnabledBle local value: ");
        LIZ2.append(optionByBoolean);
        Logger.d("BleUtils", X1D.LIZIZ(LIZ2));
        if (optionByBoolean == null) {
            return configManager.getRemoteGrayConfigByBoolean("ByteCast.EnableBle", false);
        }
        return optionByBoolean.booleanValue();
    }

    public static boolean isScanPermissionGranted(Context context) {
        if (checkSelfPermission(context, "android.permission.BLUETOOTH_SCAN") == 0) {
            return true;
        }
        return false;
    }

    public static void setBleBrowse(boolean z) {
        isBleBrowse = z;
    }

    public static void setBlePublish(boolean z) {
        isBlePublish = z;
    }

    public static byte[] stringToByte(String str) {
        if (str == null || str.length() == 0) {
            return new byte[0];
        }
        return Base64.encode(str.getBytes(), 0);
    }

    public static int checkSelfPermission(Context context, String str) {
        if (str != null) {
            return context.checkPermission(str, Process.myPid(), Process.myUid());
        }
        throw new IllegalArgumentException("permission is null");
    }

    public static int byteToInt(byte[] bArr, int i, int i2) {
        int i3 = 0;
        int i4 = i;
        int i5 = 0;
        while (i4 < i + i2) {
            i3 |= (bArr[i4] & 255) << i5;
            i4++;
            i5 += 8;
        }
        return i3;
    }

    public static void intToByte(int i, byte[] bArr, int i2, int i3) {
        int i4 = 0;
        int i5 = i2;
        while (i5 < i2 + i3) {
            bArr[i5] = (byte) ((i >> i4) & 255);
            i5++;
            i4 += 8;
        }
    }
}
