package com.byted.cast.common;

import X.C03880Dg;
import X.C16880lQ;
import X.C39519Ff9;
import X.C65300Pk0;
import X.X1D;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Build;
import android.text.TextUtils;
import com.byted.cast.common.ContextManager;
import com.byted.cast.common.config.ConfigManager;
import com.byted.cast.common.sink.CastInfo;
import com.byted.cast.common.sink.ClientInfo;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import java.io.File;
import java.io.FileFilter;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;
import java.util.regex.Pattern;

/* loaded from: classes29.dex */
public class Utils {
    public static final FileFilter CPU_FILTER;
    public static String chromeCastId;
    public static final List<String> filterActionList;
    public static final boolean isAndroid6;
    public static Method newStringFromBytesProxyByteCast;
    public static final String TAG = C16880lQ.LJLLJ(Utils.class);
    public static final Pattern IPV4_PATTERN = PatternProtector.compile("^(([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])\\.){3}([0-9]|[1-9][0-9]|1[0-9]{2}|2[0-4][0-9]|25[0-5])$");
    public static int sTotalMemory = 0;
    public static int sCPUCores = 0;

    public static Object com_byted_cast_common_Utils_java_lang_reflect_Method_invoke(Method method, Object obj, Object[] objArr) {
        C39519Ff9 LIZJ = new C03880Dg(2).LIZJ(110000, "java/lang/reflect/Method", "invoke", method, new Object[]{obj, objArr}, "java.lang.Object", new C65300Pk0(true, "(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;", "7191314071434614460"));
        return LIZJ.LIZ ? LIZJ.LIZIZ : method.invoke(obj, objArr);
    }

    public static String tryGetDidFromAppLog() {
        try {
            return (String) Class.forName("com.bytedance.applog.AppLog").getMethod("getDid", new Class[0]).invoke(null, new Object[0]);
        } catch (Throwable unused) {
            return null;
        }
    }

    static {
        boolean z;
        if (Build.VERSION.SDK_INT == 23) {
            z = true;
        } else {
            z = false;
        }
        isAndroid6 = z;
        if (z) {
            try {
                Class<?> cls = Class.forName("java.lang.StringFactory");
                Class<?> cls2 = Integer.TYPE;
                Method declaredMethod = cls.getDeclaredMethod("newStringFromBytes", byte[].class, cls2, cls2, Charset.class);
                newStringFromBytesProxyByteCast = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (Throwable unused) {
            }
        }
        filterActionList = Arrays.asList("GetPositionInfo", "GetTransportInfo", "GetMediaInfo");
        CPU_FILTER = new FileFilter() { // from class: com.byted.cast.common.Utils.1
            @Override // java.io.FileFilter
            public boolean accept(File file) {
                String name = file.getName();
                if (!name.startsWith("cpu")) {
                    return false;
                }
                for (int i = 3; i < name.length(); i++) {
                    if (name.charAt(i) < '0' || name.charAt(i) > '9') {
                        return false;
                    }
                }
                return true;
            }
        };
    }

    public static int getNumberOfCPUCores() {
        int i = sCPUCores;
        if (i != 0) {
            return i;
        }
        int i2 = -1;
        try {
            i2 = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER).length;
        } catch (Throwable unused) {
        }
        if (i2 > 0) {
            sCPUCores = i2;
        }
        return i2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0040, code lost:
    
        if (0 != 0) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int getTotalMemory() {
        /*
            int r0 = com.byted.cast.common.Utils.sTotalMemory
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.String r1 = "/proc/meminfo"
            r0 = 0
            r3 = 0
            java.io.BufferedReader r5 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L40
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L40
            r2.<init>(r1)     // Catch: java.lang.Throwable -> L40
            r1 = 8
            r5.<init>(r2, r1)     // Catch: java.lang.Throwable -> L40
            java.lang.String r4 = r5.readLine()     // Catch: java.lang.Throwable -> L3e
            if (r4 == 0) goto L3a
            r1 = 58
            int r3 = r4.indexOf(r1)     // Catch: java.lang.Throwable -> L3e
            r1 = 107(0x6b, float:1.5E-43)
            int r2 = r4.indexOf(r1)     // Catch: java.lang.Throwable -> L3e
            int r1 = r3 + 1
            java.lang.String r1 = r4.substring(r1, r2)     // Catch: java.lang.Throwable -> L3e
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L3e
            int r1 = java.lang.Integer.parseInt(r1)     // Catch: java.lang.Throwable -> L3e
            long r3 = (long) r1     // Catch: java.lang.Throwable -> L3e
            r1 = 1024(0x400, double:5.06E-321)
            long r3 = r3 / r1
            int r0 = (int) r3     // Catch: java.lang.Throwable -> L3e
        L3a:
            r5.close()     // Catch: java.lang.Throwable -> L45
            goto L45
        L3e:
            r3 = r5
            goto L42
        L40:
            if (r3 == 0) goto L45
        L42:
            r3.close()     // Catch: java.lang.Throwable -> L45
        L45:
            com.byted.cast.common.Utils.sTotalMemory = r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.Utils.getTotalMemory():int");
    }

    public static boolean isOppo6() {
        if (Build.VERSION.SDK_INT != 23) {
            return false;
        }
        try {
            String str = Build.BRAND;
            boolean equals = str.equals("OPPO");
            String str2 = TAG;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("is oppo 6:");
            LIZ.append(equals);
            LIZ.append(",brand:");
            LIZ.append(str);
            Logger.i(str2, X1D.LIZIZ(LIZ));
            if (equals) {
                return equals;
            }
            String str3 = Build.MANUFACTURER;
            boolean equals2 = "OPPO".equals(str3);
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("is oppo 6:");
            LIZ2.append(equals2);
            LIZ2.append(",manufacture:");
            LIZ2.append(str3);
            Logger.i(str2, X1D.LIZIZ(LIZ2));
            return equals2;
        } catch (Exception unused) {
            return false;
        }
    }

    public static String generateCastDid() {
        String format = new DecimalFormat("0000000000000000").format(ThreadLocalRandom.current().nextLong(1000000000000000L, 10000000000000000L));
        if (format.startsWith(CardStruct.IStatusCode.DEFAULT)) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(new Random().nextInt(9) + 1);
            LIZ.append(format.substring(1));
            return X1D.LIZIZ(LIZ);
        }
        return format;
    }

    public static boolean isLowSpecDevice() {
        boolean z;
        boolean z2;
        boolean z3;
        if (getTotalMemory() <= 1024) {
            z = true;
        } else {
            z = false;
        }
        if (getNumberOfCPUCores() <= 2) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (Build.VERSION.SDK_INT < 23) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z || z2 || z3) {
            return true;
        }
        return false;
    }

    public static String getChromeCastId() {
        return chromeCastId;
    }

    public static int changeToSeconds(String str) {
        String str2;
        String str3;
        int intValue;
        int intValue2;
        int i = 0;
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            if (TextUtils.isEmpty(str)) {
                return 0;
            }
            String[] split = str.split(":");
            String str4 = "00";
            if (split.length <= 0) {
                str2 = "00";
            } else {
                str2 = split[0];
            }
            int intValue3 = CastIntegerProtector.valueOf(str2).intValue();
            if (split.length <= 1) {
                str3 = "00";
            } else {
                str3 = split[1];
            }
            if (str3.startsWith(CardStruct.IStatusCode.DEFAULT)) {
                intValue = CastIntegerProtector.valueOf(str3.substring(1)).intValue();
            } else {
                intValue = CastIntegerProtector.valueOf(str3).intValue();
            }
            if (split.length > 2) {
                str4 = split[2];
            }
            if (str4.startsWith(CardStruct.IStatusCode.DEFAULT)) {
                intValue2 = CastIntegerProtector.valueOf(str4.substring(1)).intValue();
            } else {
                intValue2 = CastIntegerProtector.valueOf(str4).intValue();
            }
            i = (intValue3 * 3600) + (intValue * 60) + intValue2;
            return i;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return i;
        }
    }

    public static String changeToTime(long j) {
        String LIZIZ;
        long j2 = j / 1000;
        try {
            long j3 = j2 / 3600;
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append(j3);
            LIZ.append(":");
            String LIZIZ2 = X1D.LIZIZ(LIZ);
            Long.signum(j3);
            long j4 = j2 - (j3 * 3600);
            long j5 = j4 / 60;
            if (j5 < 10) {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(LIZIZ2);
                LIZ2.append(CardStruct.IStatusCode.DEFAULT);
                LIZ2.append(j5);
                LIZ2.append(":");
                LIZIZ = X1D.LIZIZ(LIZ2);
            } else {
                StringBuilder LIZ3 = X1D.LIZ();
                LIZ3.append(LIZIZ2);
                LIZ3.append(j5);
                LIZ3.append(":");
                LIZIZ = X1D.LIZIZ(LIZ3);
            }
            long j6 = j4 - (j5 * 60);
            if (j6 < 10) {
                StringBuilder LIZ4 = X1D.LIZ();
                LIZ4.append(LIZIZ);
                LIZ4.append(CardStruct.IStatusCode.DEFAULT);
                LIZ4.append(j6);
                return X1D.LIZIZ(LIZ4);
            }
            StringBuilder LIZ5 = X1D.LIZ();
            LIZ5.append(LIZIZ);
            LIZ5.append(j6);
            return X1D.LIZIZ(LIZ5);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }

    public static long changeToTimestamp(String str) {
        String str2;
        String str3;
        int intValue;
        int intValue2;
        long j = 0;
        if (TextUtils.isEmpty(str)) {
            return 0L;
        }
        try {
            String[] split = str.split(":");
            String str4 = "00";
            if (split.length <= 0) {
                str2 = "00";
            } else {
                str2 = split[0];
            }
            int intValue3 = CastIntegerProtector.valueOf(str2).intValue();
            if (split.length <= 1) {
                str3 = "00";
            } else {
                str3 = split[1];
            }
            if (str3.startsWith(CardStruct.IStatusCode.DEFAULT)) {
                intValue = CastIntegerProtector.valueOf(str3.substring(1)).intValue();
            } else {
                intValue = CastIntegerProtector.valueOf(str3).intValue();
            }
            if (split.length > 2) {
                str4 = split[2];
            }
            if (str4.startsWith(CardStruct.IStatusCode.DEFAULT)) {
                intValue2 = CastIntegerProtector.valueOf(str4.substring(1)).intValue();
            } else {
                intValue2 = CastIntegerProtector.valueOf(str4).intValue();
            }
            j = ((intValue3 * 3600) + (intValue * 60) + intValue2) * 1000;
            return j;
        } catch (NumberFormatException e) {
            e.printStackTrace();
            return j;
        }
    }

    public static CastInfo conversionCastInfo(CastInfo castInfo) {
        CastInfo castInfo2 = new CastInfo();
        if (castInfo != null) {
            castInfo2.sourceDeviceType = castInfo.sourceDeviceType;
            castInfo2.protocol = castInfo.protocol;
            castInfo2.mediaArtist = castInfo.mediaArtist;
            castInfo2.mediaAlbumUrl = castInfo.mediaAlbumUrl;
            castInfo2.mediaAlbum = castInfo.mediaAlbum;
            castInfo2.key = castInfo.key;
            castInfo2.handleInside = castInfo.handleInside;
            castInfo2.clientID = castInfo.clientID;
            castInfo2.connectID = castInfo.connectID;
            castInfo2.castType = castInfo.castType;
            castInfo2.infoType = castInfo.infoType;
            castInfo2.aesKey = castInfo.aesKey;
            castInfo2.aesIV = castInfo.aesIV;
            castInfo2.url = castInfo.url;
            castInfo2.mediaTitle = castInfo.mediaTitle;
            castInfo2.mimeType = castInfo.mimeType;
            if (castInfo.startInfo != null) {
                CastInfo.StartInfo startInfo = new CastInfo.StartInfo();
                CastInfo.StartInfo startInfo2 = castInfo.startInfo;
                startInfo.width = startInfo2.width;
                startInfo.type = startInfo2.type;
                startInfo.height = startInfo2.height;
                startInfo.frameRate = startInfo2.frameRate;
                startInfo.bitRate = startInfo2.bitRate;
                castInfo2.startInfo = startInfo;
            }
            if (castInfo.stopInfo != null) {
                CastInfo.StopInfo stopInfo = new CastInfo.StopInfo();
                CastInfo.StopInfo stopInfo2 = castInfo.stopInfo;
                stopInfo.stopReason = stopInfo2.stopReason;
                stopInfo.stopDetail = stopInfo2.stopDetail;
                castInfo2.stopInfo = stopInfo;
            }
            if (castInfo.sizeInfo != null) {
                CastInfo.SizeInfo sizeInfo = new CastInfo.SizeInfo();
                CastInfo.SizeInfo sizeInfo2 = castInfo.sizeInfo;
                sizeInfo.width = sizeInfo2.width;
                sizeInfo.height = sizeInfo2.height;
                castInfo2.sizeInfo = sizeInfo;
            }
            ClientInfo clientInfo = castInfo.clientInfo;
            if (clientInfo != null) {
                castInfo2.clientInfo = clientInfo;
            }
        }
        return castInfo2;
    }

    public static int conversionIpToInt(String str) {
        int i = 0;
        if (str == null) {
            return 0;
        }
        String[] split = str.split("\\.");
        if (split.length != 4) {
            return 0;
        }
        try {
            int length = split.length;
            int i2 = 0;
            while (i < length) {
                try {
                    i2 = (i2 << 8) ^ CastIntegerProtector.parseInt(split[i]);
                    i++;
                } catch (NumberFormatException e) {
                    e = e;
                    i = i2;
                    Logger.e(TAG, e.getMessage());
                    return i;
                }
            }
            return i2;
        } catch (NumberFormatException e2) {
            e = e2;
        }
    }

    public static String getAppName(Context context) {
        PackageManager packageManager = context.getPackageManager();
        try {
            return packageManager.getApplicationLabel(C16880lQ.LLLLLLLLL(packageManager, context.getPackageName(), 0)).toString();
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "Unknown";
        }
    }

    public static String getAppVersionName(Context context) {
        try {
            return C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            return "Unknown";
        }
    }

    public static boolean isSupportPlayList(String str) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String[] split = str.split("\\.");
        try {
            if (split.length > 0 && CastIntegerProtector.parseInt(split[0]) > 2) {
                return true;
            }
            if (split.length > 0 && CastIntegerProtector.parseInt(split[0]) < 2) {
                return false;
            }
            if (split.length > 1 && CastIntegerProtector.parseInt(split[1]) > 1) {
                return true;
            }
            if (split.length > 1 && CastIntegerProtector.parseInt(split[1]) < 1) {
                return false;
            }
            if ((split.length <= 2 || CastIntegerProtector.parseInt(split[2]) <= 9) && split.length > 2) {
                if (CastIntegerProtector.parseInt(split[2]) < 9) {
                    return false;
                }
            }
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public static void setChromeCastId(String str) {
        chromeCastId = str;
    }

    public static boolean shouldTrackAction(String str) {
        return !filterActionList.contains(str);
    }

    public static int compareVersion(String str, String str2) {
        if (TextUtils.isEmpty(str)) {
            if (!ConfigManager.getInstance().getInitConfig().isEnableDebug()) {
                Logger.e(TAG, "current version empty");
                return -1;
            }
            throw new IllegalArgumentException("current version empty");
        }
        if (TextUtils.isEmpty(str2)) {
            if (!ConfigManager.getInstance().getInitConfig().isEnableDebug()) {
                Logger.e(TAG, "target version empty");
                return 1;
            }
            throw new IllegalArgumentException("target version empty");
        }
        if (!TextUtils.equals(str, str2) && !TextUtils.equals(str.replaceAll("[^0-9.]", ""), str2.replaceAll("[^0-9.]", ""))) {
            try {
                String[] split = str.replaceAll("[^0-9.]", "").split("[.]");
                String[] split2 = str2.replaceAll("[^0-9.]", "").split("[.]");
                int min = Math.min(split.length, split2.length);
                for (int i = 0; i < min; i++) {
                    if (CastIntegerProtector.parseInt(split[i]) < CastIntegerProtector.parseInt(split2[i])) {
                        return -1;
                    }
                    if (CastIntegerProtector.parseInt(split[i]) > CastIntegerProtector.parseInt(split2[i])) {
                        return 1;
                    }
                }
                if (split.length < split2.length) {
                    if (CastIntegerProtector.parseInt(split2[split2.length - 1]) > 0) {
                        return -1;
                    }
                    return 1;
                }
                if (split.length > split2.length) {
                    if (CastIntegerProtector.parseInt(split[split.length - 1]) <= 0) {
                        return -1;
                    }
                    return 1;
                }
            } catch (Exception e) {
                Logger.e(e.toString());
            }
        }
        return 0;
    }

    public static String getConnectionIP(String str, ContextManager.CastContext castContext) {
        List<String> localIpAddr = NetworkUtil.getLocalIpAddr(castContext);
        String str2 = "";
        if (localIpAddr != null && localIpAddr.size() != 0) {
            int conversionIpToInt = conversionIpToInt(str);
            int i = Integer.MAX_VALUE;
            for (String str3 : localIpAddr) {
                int abs = Math.abs(conversionIpToInt(str3) ^ conversionIpToInt);
                if (abs < i) {
                    str2 = str3;
                    i = abs;
                }
            }
        }
        return str2;
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

    public static String newString(byte[] bArr, int i, int i2) {
        if (isAndroid6) {
            return newString(bArr, i, i2, Charset.defaultCharset());
        }
        return new String(bArr, i, i2);
    }

    public static String newString(byte[] bArr, int i, int i2, Charset charset) {
        Method method;
        if (isAndroid6 && (method = newStringFromBytesProxyByteCast) != null) {
            try {
                return (String) com_byted_cast_common_Utils_java_lang_reflect_Method_invoke(method, null, new Object[]{bArr, Integer.valueOf(i), Integer.valueOf(i2), charset});
            } catch (Throwable unused) {
            }
        }
        return new String(bArr, i, i2, charset);
    }
}
