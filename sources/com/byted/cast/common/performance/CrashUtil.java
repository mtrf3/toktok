package com.byted.cast.common.performance;

import X.C16880lQ;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.system.Os;
import android.text.TextUtils;
import com.byted.cast.common.Logger;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FilenameFilter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

/* loaded from: classes29.dex */
public class CrashUtil {
    public static final String[] suPathname = {"/data/local/su", "/data/local/bin/su", "/data/local/xbin/su", "/system/xbin/su", "/system/bin/su", "/system/bin/.ext/su", "/system/bin/failsafe/su", "/system/sd/xbin/su", "/system/usr/we-need-root/su", "/sbin/su", "/su/bin/su"};

    public static boolean isRoot() {
        try {
            for (String str : suPathname) {
                if (new File(str).exists()) {
                    return true;
                }
            }
        } catch (Exception unused) {
        }
        return false;
    }

    public static String getAbiList() {
        return TextUtils.join(",", Build.SUPPORTED_ABIS);
    }

    public static String getFds() {
        String str;
        String trim;
        StringBuilder sb = new StringBuilder("open files:\n");
        try {
            File[] listFiles = new File("/proc/self/fd").listFiles(new FilenameFilter() { // from class: com.byted.cast.common.performance.CrashUtil.1
                @Override // java.io.FilenameFilter
                public boolean accept(File file, String str2) {
                    return TextUtils.isDigitsOnly(str2);
                }
            });
            if (listFiles != null) {
                int i = 0;
                for (File file : listFiles) {
                    try {
                        str = Os.readlink(file.getAbsolutePath());
                    } catch (Exception unused) {
                        str = null;
                    }
                    sb.append("    fd ");
                    sb.append(file.getName());
                    sb.append(": ");
                    if (TextUtils.isEmpty(str)) {
                        trim = "???";
                    } else {
                        trim = str.trim();
                    }
                    sb.append(trim);
                    sb.append('\n');
                    i++;
                    if (i > 1024) {
                        break;
                    }
                }
                if (listFiles.length > 1024) {
                    sb.append("    ......\n");
                }
                sb.append("    (number of FDs: ");
                sb.append(listFiles.length);
                sb.append(")\n");
            }
        } catch (Exception unused2) {
        }
        sb.append('\n');
        return sb.toString();
    }

    public static String getNetworkInfo() {
        if (Build.VERSION.SDK_INT >= 29) {
            return "network info:\nNot supported on Android Q (API level 29) and later.\n\n";
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("network info:\n TCP over IPv4 (From: /proc/PID/net/tcp)\n");
        LIZ.append(getFileContent("/proc/self/net/tcp", 1024));
        LIZ.append("-\n TCP over IPv6 (From: /proc/PID/net/tcp6)\n");
        LIZ.append(getFileContent("/proc/self/net/tcp6", 1024));
        LIZ.append("-\n UDP over IPv4 (From: /proc/PID/net/udp)\n");
        LIZ.append(getFileContent("/proc/self/net/udp", 1024));
        LIZ.append("-\n UDP over IPv6 (From: /proc/PID/net/udp6)\n");
        LIZ.append(getFileContent("/proc/self/net/udp6", 1024));
        LIZ.append("-\n ICMP in IPv4 (From: /proc/PID/net/icmp)\n");
        LIZ.append(getFileContent("/proc/self/net/icmp", 256));
        LIZ.append("-\n ICMP in IPv6 (From: /proc/PID/net/icmp6)\n");
        LIZ.append(getFileContent("/proc/self/net/icmp6", 256));
        LIZ.append("-\n UNIX domain (From: /proc/PID/net/unix)\n");
        LIZ.append(getFileContent("/proc/self/net/unix", 256));
        LIZ.append("\n");
        return X1D.LIZIZ(LIZ);
    }

    public static String getProcessMemoryInfo() {
        StringBuilder sb = new StringBuilder(" Process Summary (From: android.os.Debug.MemoryInfo)\n");
        Locale locale = Locale.US;
        sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"", "Pss(KB)"}));
        sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"", "------"}));
        try {
            Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
            Debug.getMemoryInfo(memoryInfo);
            if (Build.VERSION.SDK_INT >= 23) {
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Java Heap:", memoryInfo.getMemoryStat("summary.java-heap")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Native Heap:", memoryInfo.getMemoryStat("summary.native-heap")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Code:", memoryInfo.getMemoryStat("summary.code")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Stack:", memoryInfo.getMemoryStat("summary.stack")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Graphics:", memoryInfo.getMemoryStat("summary.graphics")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Private Other:", memoryInfo.getMemoryStat("summary.private-other")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"System:", memoryInfo.getMemoryStat("summary.system")}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s %21s %8s\n", new Object[]{"TOTAL:", memoryInfo.getMemoryStat("summary.total-pss"), "TOTAL SWAP:", memoryInfo.getMemoryStat("summary.total-swap")}));
            } else {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("~ ");
                LIZ.append(memoryInfo.dalvikPrivateDirty);
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Java Heap:", X1D.LIZIZ(LIZ)}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Native Heap:", String.valueOf(memoryInfo.nativePrivateDirty)}));
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("~ ");
                LIZ2.append(memoryInfo.otherPrivateDirty);
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"Private Other:", X1D.LIZIZ(LIZ2)}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"System:", String.valueOf((memoryInfo.getTotalPss() - memoryInfo.getTotalPrivateDirty()) - memoryInfo.getTotalPrivateClean())}));
                sb.append(C16880lQ.LLLZI(locale, "%21s %8s\n", new Object[]{"TOTAL:", String.valueOf(memoryInfo.getTotalPss())}));
            }
        } catch (Exception e) {
            Logger.e("CrashUtil", "Util getProcessMemoryInfo failed", e);
        }
        return sb.toString();
    }

    public static String getMemoryInfo() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("memory info:\n System Summary (From: /proc/meminfo)\n");
        LIZ.append(getFileContent("/proc/meminfo"));
        LIZ.append("-\n Process Status (From: /proc/PID/status)\n");
        LIZ.append(getFileContent("/proc/self/status"));
        LIZ.append("-\n Process Limits (From: /proc/PID/limits)\n");
        LIZ.append(getFileContent("/proc/self/limits"));
        LIZ.append("-\n");
        LIZ.append(getProcessMemoryInfo());
        LIZ.append("\n");
        return X1D.LIZIZ(LIZ);
    }

    public static boolean checkAndCreateDir(String str) {
        File file = new File(str);
        try {
            if (!file.exists()) {
                file.mkdirs();
                if (!file.exists() || !file.isDirectory()) {
                    return false;
                }
                return true;
            }
            return file.isDirectory();
        } catch (Exception unused) {
            return false;
        }
    }

    public static String getAppVersion(Context context) {
        String str;
        try {
            str = C16880lQ.LLLLLLZ(context.getPackageManager(), context.getPackageName(), 0).versionName;
        } catch (Exception unused) {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            return "unknown";
        }
        return str;
    }

    public static String getFileContent(String str) {
        return getFileContent(str, 0);
    }

    public static boolean checkProcessAnrState(Context context, long j) {
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager == null) {
            return false;
        }
        int myPid = Process.myPid();
        long j2 = j / 500;
        for (int i = 0; i < j2; i++) {
            List<ActivityManager.ProcessErrorStateInfo> processesInErrorState = activityManager.getProcessesInErrorState();
            if (processesInErrorState != null) {
                for (ActivityManager.ProcessErrorStateInfo processErrorStateInfo : processesInErrorState) {
                    if (processErrorStateInfo.pid == myPid && processErrorStateInfo.condition == 2) {
                        return true;
                    }
                }
            }
            try {
                Thread.sleep(500L);
            } catch (Exception unused) {
            }
        }
        return false;
    }

    public static String getFileContent(String str, int i) {
        StringBuilder sb = new StringBuilder();
        BufferedReader bufferedReader = null;
        try {
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new FileReader(str));
                    int i2 = 0;
                    while (true) {
                        try {
                            String readLine = bufferedReader2.readLine();
                            if (readLine == null) {
                                break;
                            }
                            String trim = readLine.trim();
                            if (trim.length() > 0) {
                                i2++;
                                if (i == 0 || i2 <= i) {
                                    sb.append("  ");
                                    sb.append(trim);
                                    sb.append("\n");
                                }
                            }
                        } catch (Exception e) {
                            e = e;
                            bufferedReader = bufferedReader2;
                            StringBuilder LIZ = X1D.LIZ();
                            LIZ.append("Util getInfo(");
                            LIZ.append(str);
                            LIZ.append(") failed");
                            Logger.e("CrashUtil", X1D.LIZIZ(LIZ), e);
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return sb.toString();
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (Exception unused) {
                                }
                            }
                            throw th;
                        }
                    }
                    if (i > 0 && i2 > i) {
                        sb.append("  ......\n");
                        sb.append("  (number of records: ");
                        sb.append(i2);
                        sb.append(")\n");
                    }
                    bufferedReader2.close();
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        } catch (Exception unused2) {
        }
        return sb.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0043, code lost:
    
        if (r3 == null) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.String getProcessName(android.content.Context r4, int r5) {
        /*
            r4 = 0
            java.io.BufferedReader r3 = new java.io.BufferedReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.io.FileReader r2 = new java.io.FileReader     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.StringBuilder r1 = X.X1D.LIZ()     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.String r0 = "/proc/"
            r1.append(r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            r1.append(r5)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.String r0 = "/cmdline"
            r1.append(r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.String r0 = X.X1D.LIZIZ(r1)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            r3.<init>(r2)     // Catch: java.lang.Throwable -> L3a java.lang.Exception -> L42
            java.lang.String r1 = r3.readLine()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            if (r0 != 0) goto L45
            java.lang.String r1 = r1.trim()     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            boolean r0 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L38 java.lang.Exception -> L43
            if (r0 != 0) goto L45
            r3.close()     // Catch: java.lang.Exception -> L37
        L37:
            return r1
        L38:
            r0 = move-exception
            goto L3c
        L3a:
            r0 = move-exception
            r3 = r4
        L3c:
            if (r3 == 0) goto L41
            r3.close()     // Catch: java.lang.Exception -> L41
        L41:
            throw r0
        L42:
            r3 = r4
        L43:
            if (r3 == 0) goto L48
        L45:
            r3.close()     // Catch: java.lang.Exception -> L48
        L48:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.byted.cast.common.performance.CrashUtil.getProcessName(android.content.Context, int):java.lang.String");
    }

    public static String getLogHeader(Date date, Date date2, String str, String str2, String str3) {
        String str4;
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ", Locale.US);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("*** *** *** *** *** *** *** *** *** *** *** *** *** *** *** ***\nTombstone maker: 'xCrash 3.0.0'\nCrash type: '");
        LIZ.append(str);
        LIZ.append("'\nStart time: '");
        LIZ.append(simpleDateFormat.format(date));
        LIZ.append("'\nCrash time: '");
        LIZ.append(simpleDateFormat.format(date2));
        LIZ.append("'\nApp ID: '");
        LIZ.append(str2);
        LIZ.append("'\nApp version: '");
        LIZ.append(str3);
        LIZ.append("'\nRooted: '");
        if (isRoot()) {
            str4 = "Yes";
        } else {
            str4 = "No";
        }
        LIZ.append(str4);
        LIZ.append("'\nAPI level: '");
        LIZ.append(Build.VERSION.SDK_INT);
        LIZ.append("'\nOS version: '");
        LIZ.append(Build.VERSION.RELEASE);
        LIZ.append("'\nABI list: '");
        LIZ.append(getAbiList());
        LIZ.append("'\nManufacturer: '");
        LIZ.append(Build.MANUFACTURER);
        LIZ.append("'\nBrand: '");
        LIZ.append(Build.BRAND);
        LIZ.append("'\nModel: '");
        LIZ.append(Build.MODEL);
        LIZ.append("'\nBuild fingerprint: '");
        LIZ.append(Build.FINGERPRINT);
        LIZ.append("'\n");
        return X1D.LIZIZ(LIZ);
    }
}
