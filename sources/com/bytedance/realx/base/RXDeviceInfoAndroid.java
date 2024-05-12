package com.bytedance.realx.base;

import X.C16880lQ;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import defpackage.b1;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

/* loaded from: classes7.dex */
public class RXDeviceInfoAndroid {
    public static final FileFilter CPU_FILTER = new FileFilter() { // from class: com.bytedance.realx.base.RXDeviceInfoAndroid.1
        @Override // java.io.FileFilter
        public boolean accept(File file) {
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
    public static String RomVersion = "";
    public static String sCpuModel = "";

    public static int getCPUMaxFrequency() {
        int read;
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < getNumberOfCPUCores(); i3++) {
            try {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("/sys/devices/system/cpu/cpu");
                LIZ.append(i3);
                LIZ.append("/cpufreq/cpuinfo_max_freq");
                File file = new File(X1D.LIZIZ(LIZ));
                if (file.exists() && file.canRead()) {
                    byte[] bArr = new byte[128];
                    FileInputStream fileInputStream = new FileInputStream(file);
                    try {
                        read = fileInputStream.read(bArr);
                    } catch (NumberFormatException unused) {
                    } catch (Throwable th) {
                        fileInputStream.close();
                        throw th;
                    }
                    if (read != -1 && read <= 128) {
                        int i4 = 0;
                        while (Character.isDigit(bArr[i4]) && i4 < 128) {
                            i4++;
                        }
                        Integer valueOf = Integer.valueOf(Integer.parseInt(new String(bArr, 0, i4, "UTF-8")));
                        if (valueOf.intValue() > i2) {
                            i2 = valueOf.intValue();
                        }
                        fileInputStream.close();
                    } else {
                        throw new NumberFormatException();
                        break;
                    }
                }
            } catch (IOException unused2) {
            }
        }
        if (i2 == -1) {
            FileInputStream fileInputStream2 = new FileInputStream("/proc/cpuinfo");
            try {
                int parseFileForValue = parseFileForValue("cpu MHz", fileInputStream2) * 1000;
                if (parseFileForValue > i2) {
                    i2 = parseFileForValue;
                }
                fileInputStream2.close();
            } catch (Throwable th2) {
                fileInputStream2.close();
                throw th2;
            }
        }
        i = i2;
        return i / 1000;
    }

    public static int getNumberOfCPUCores() {
        int i = -1;
        try {
            int coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/possible");
            if (coresFromFileInfo == -1) {
                coresFromFileInfo = getCoresFromFileInfo("/sys/devices/system/cpu/present");
            }
            if (coresFromFileInfo == -1) {
                File[] listFiles = new File("/sys/devices/system/cpu/").listFiles(CPU_FILTER);
                if (listFiles == null) {
                    return -1;
                }
                i = listFiles.length;
                return i;
            }
            return coresFromFileInfo;
        } catch (NullPointerException | SecurityException unused) {
            return i;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0065, code lost:
    
        if (r3 == null) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String GetCpuModel() {
        /*
            java.lang.String r0 = com.bytedance.realx.base.RXDeviceInfoAndroid.sCpuModel
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto Lb
            java.lang.String r0 = com.bytedance.realx.base.RXDeviceInfoAndroid.sCpuModel
            return r0
        Lb:
            java.lang.String r5 = ""
            r4 = 0
            java.lang.ProcessBuilder r2 = new java.lang.ProcessBuilder     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5f
            java.lang.String r1 = "/system/bin/cat"
            java.lang.String r0 = "/proc/cpuinfo"
            java.lang.String[] r0 = new java.lang.String[]{r1, r0}     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5f
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5f
            java.lang.Process r3 = r2.start()     // Catch: java.lang.Throwable -> L52 java.io.IOException -> L5f
            java.io.InputStream r4 = r3.getInputStream()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            if (r4 == 0) goto L4a
            java.util.Scanner r2 = new java.util.Scanner     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            java.lang.String r0 = "UTF-8"
            r2.<init>(r4, r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            java.lang.String r1 = "Hardware[\\s]*:[\\s]*([\\S\\s]*)\n"
            r0 = 3000(0xbb8, float:4.204E-42)
            java.lang.String r0 = r2.findWithinHorizon(r1, r0)     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            if (r0 == 0) goto L47
            java.util.regex.MatchResult r1 = r2.match()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            int r0 = r1.groupCount()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
            if (r0 <= 0) goto L47
            r0 = 1
            java.lang.String r5 = r1.group(r0)     // Catch: java.lang.NumberFormatException -> L47 java.lang.Throwable -> L50 java.io.IOException -> L60
            com.bytedance.realx.base.RXDeviceInfoAndroid.sCpuModel = r5     // Catch: java.lang.NumberFormatException -> L47 java.lang.Throwable -> L50 java.io.IOException -> L60
        L47:
            r2.close()     // Catch: java.lang.Throwable -> L50 java.io.IOException -> L60
        L4a:
            if (r4 == 0) goto L67
            r4.close()     // Catch: java.lang.Exception -> L67
            goto L67
        L50:
            r0 = move-exception
            goto L54
        L52:
            r0 = move-exception
            r3 = r4
        L54:
            if (r4 == 0) goto L59
            r4.close()     // Catch: java.lang.Exception -> L59
        L59:
            if (r3 == 0) goto L5e
            r3.destroy()     // Catch: java.lang.Exception -> L5e
        L5e:
            throw r0
        L5f:
            r3 = r4
        L60:
            if (r4 == 0) goto L65
            r4.close()     // Catch: java.lang.Exception -> L65
        L65:
            if (r3 == 0) goto L6a
        L67:
            r3.destroy()     // Catch: java.lang.Exception -> L6a
        L6a:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.RXDeviceInfoAndroid.GetCpuModel():java.lang.String");
    }

    public static String GetDeviceBrand() {
        String str = Build.MANUFACTURER;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String GetDeviceModel() {
        String str = Build.MODEL;
        if (str == null) {
            return "";
        }
        return str;
    }

    public static String getAppRootPath() {
        String str = "";
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return "";
            }
            str = C16880lQ.LLIIJLIL(applicationContext).getAbsolutePath();
            return str;
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return str;
        }
    }

    public static String getCpuName() {
        String valueFromCpuInfoFile = getValueFromCpuInfoFile("Hardware", "");
        if (valueFromCpuInfoFile == null) {
            return Build.HARDWARE;
        }
        String trim = valueFromCpuInfoFile.trim();
        if (trim.equals("")) {
            return Build.HARDWARE;
        }
        StringBuilder LIZJ = b1.LIZJ(trim, ";");
        LIZJ.append(Build.HARDWARE);
        return X1D.LIZIZ(LIZJ);
    }

    public static String getGpuName() {
        String gPURendererFallback;
        if (Build.VERSION.SDK_INT >= 22) {
            gPURendererFallback = GPUUtil.getGPURenderer();
        } else {
            gPURendererFallback = GPUUtil.getGPURendererFallback();
        }
        if (gPURendererFallback == null) {
            return "null-null";
        }
        return gPURendererFallback;
    }

    public static String getRomVersionName() {
        if (TextUtils.isEmpty(RomVersion)) {
            RomVersion = RXDeviceUtil.getPhoneSystem(Build.BRAND);
        }
        return RomVersion;
    }

    public static String getSdkVersion() {
        return String.valueOf(Build.VERSION.SDK_INT);
    }

    public static int getCpuThreads() {
        return getNumberOfCPUCores();
    }

    public static String getSystemDefaultLanguage() {
        return Locale.getDefault().getLanguage();
    }

    public static int getMemSize() {
        try {
            Context applicationContext = ContextUtils.getApplicationContext();
            if (applicationContext == null) {
                return -1;
            }
            ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(applicationContext, "activity");
            if (activityManager == null) {
                return -1;
            }
            activityManager.getMemoryInfo(memoryInfo);
            return (int) Math.ceil((((memoryInfo.totalMem * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
            return (int) Math.ceil(((((-1) * 1.024d) / 1024.0d) / 1024.0d) / 1024.0d);
        }
    }

    public static String getAndroidBuildId() {
        return Build.ID;
    }

    public static String getBrand() {
        return Build.BRAND;
    }

    public static String getBuildRelease() {
        return Build.VERSION.RELEASE;
    }

    public static String getBuildType() {
        return Build.TYPE;
    }

    public static String getDevice() {
        return Build.DEVICE;
    }

    public static String getDeviceManufacturer() {
        return Build.MANUFACTURER;
    }

    public static String getProduct() {
        return Build.PRODUCT;
    }

    public static int getCoresFromFileInfo(String str) {
        FileInputStream fileInputStream = null;
        try {
            FileInputStream fileInputStream2 = new FileInputStream(str);
            try {
                BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(fileInputStream2, "UTF-8"));
                String readLine = bufferedReader.readLine();
                bufferedReader.close();
                int coresFromFileString = getCoresFromFileString(readLine);
                try {
                    fileInputStream2.close();
                } catch (IOException unused) {
                }
                return coresFromFileString;
            } catch (IOException unused2) {
                fileInputStream = fileInputStream2;
                try {
                    fileInputStream.close();
                    return -1;
                } catch (IOException unused3) {
                    return -1;
                }
            } catch (Throwable th) {
                try {
                    fileInputStream2.close();
                    throw th;
                } catch (IOException unused4) {
                    throw th;
                }
            }
        } catch (IOException unused5) {
            if (0 == 0) {
                return -1;
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public static int getCoresFromFileString(String str) {
        if (str == null || !str.matches("0-[\\d]+$")) {
            return -1;
        }
        return CastIntegerProtector.valueOf(str.substring(2)).intValue() + 1;
    }

    public static int extractValue(byte[] bArr, int i) {
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

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0035, code lost:
    
        r7 = r2[1];
        r2 = r2;
        r7 = r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0037, code lost:
    
        r4.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x003b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x003c, code lost:
    
        X.C16880lQ.LLLLIIL(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0052, code lost:
    
        if (r2 == 0) goto L32;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:64:0x007a -> B:22:0x007d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getValueFromCpuInfoFile(java.lang.String r6, java.lang.String r7) {
        /*
            java.lang.String r5 = ":"
            r2 = 0
            java.io.FileInputStream r3 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L67
            java.lang.String r0 = "/proc/cpuinfo"
            r3.<init>(r0)     // Catch: java.lang.Exception -> L4b java.lang.Throwable -> L67
            java.io.BufferedReader r4 = new java.io.BufferedReader     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L51
            java.io.InputStreamReader r1 = new java.io.InputStreamReader     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L51
            java.nio.charset.Charset r0 = java.nio.charset.Charset.defaultCharset()     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L51
            r1.<init>(r3, r0)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L51
            r4.<init>(r1)     // Catch: java.lang.Exception -> L49 java.lang.Throwable -> L51
        L18:
            java.lang.String r1 = r4.readLine()     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r1 == 0) goto L37
            boolean r0 = r1.contains(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r0 == 0) goto L18
            java.lang.String[] r2 = r1.split(r5)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            int r0 = r2.length     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            r1 = 1
            if (r0 <= r1) goto L18
            r0 = 0
            r0 = r2[r0]     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            boolean r0 = r0.contains(r6)     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
            if (r0 == 0) goto L18
            r7 = r2[r1]     // Catch: java.lang.Throwable -> L43 java.lang.Exception -> L46
        L37:
            r4.close()     // Catch: java.lang.Exception -> L3b
            goto L3f
        L3b:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L3f:
            r3.close()     // Catch: java.lang.Exception -> L79
            goto L7d
        L43:
            r1 = move-exception
            r2 = r4
            goto L54
        L46:
            r0 = move-exception
            r2 = r4
            goto L4d
        L49:
            r0 = move-exception
            goto L4d
        L4b:
            r0 = move-exception
            r3 = r2
        L4d:
            X.C16880lQ.LLLLIIL(r0)     // Catch: java.lang.Throwable -> L51
            goto L69
        L51:
            r1 = move-exception
            if (r2 == 0) goto L5c
        L54:
            r2.close()     // Catch: java.lang.Exception -> L58
            goto L5c
        L58:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L5c:
            if (r3 == 0) goto L68
            r3.close()     // Catch: java.lang.Exception -> L62
            goto L68
        L62:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L68
        L67:
            r1 = move-exception
        L68:
            throw r1
        L69:
            if (r2 == 0) goto L73
            r2.close()     // Catch: java.lang.Exception -> L6f
            goto L73
        L6f:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L73:
            if (r3 == 0) goto L7d
            r3.close()     // Catch: java.lang.Exception -> L79
            goto L7d
        L79:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
        L7d:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.RXDeviceInfoAndroid.getValueFromCpuInfoFile(java.lang.String, java.lang.String):java.lang.String");
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0013, code lost:
    
        if (r1 == 10) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static int parseFileForValue(java.lang.String r7, java.io.FileInputStream r8) {
        /*
            r0 = 1024(0x400, float:1.435E-42)
            byte[] r6 = new byte[r0]
            int r5 = r8.read(r6)     // Catch: java.lang.Throwable -> L39
            r4 = 0
        L9:
            if (r4 >= r5) goto L39
            r1 = r6[r4]     // Catch: java.lang.Throwable -> L39
            r0 = 10
            if (r1 == r0) goto L15
            if (r4 != 0) goto L35
            if (r1 != r0) goto L17
        L15:
            int r4 = r4 + 1
        L17:
            r3 = r4
        L18:
            if (r3 >= r5) goto L35
            int r2 = r3 - r4
            r1 = r6[r3]     // Catch: java.lang.Throwable -> L39
            char r0 = r7.charAt(r2)     // Catch: java.lang.Throwable -> L39
            if (r1 == r0) goto L25
            goto L35
        L25:
            int r0 = r7.length()     // Catch: java.lang.Throwable -> L39
            int r0 = r0 + (-1)
            if (r2 != r0) goto L32
            int r0 = extractValue(r6, r3)     // Catch: java.lang.Throwable -> L39
            goto L38
        L32:
            int r3 = r3 + 1
            goto L18
        L35:
            int r4 = r4 + 1
            goto L9
        L38:
            return r0
        L39:
            r0 = -1
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.realx.base.RXDeviceInfoAndroid.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }
}
