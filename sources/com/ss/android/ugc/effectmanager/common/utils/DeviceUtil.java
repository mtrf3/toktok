package com.ss.android.ugc.effectmanager.common.utils;

import X.C16880lQ;
import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes7.dex */
public class DeviceUtil {
    public static final Map<String, Object> cachedMap = new ConcurrentHashMap();

    public static String getCpuModel() {
        Map<String, Object> map = cachedMap;
        Object obj = map.get("cache_key_cpu_model");
        if (obj != null) {
            return (String) obj;
        }
        String cpuModelInternal = getCpuModelInternal();
        map.put("cache_key_cpu_model", cpuModelInternal);
        return cpuModelInternal;
    }

    public static synchronized String getCpuModelInternal() {
        synchronized (DeviceUtil.class) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    if (new File("/proc/cpuinfo").exists()) {
                        BufferedReader bufferedReader2 = new BufferedReader(new FileReader("/proc/cpuinfo"));
                        while (true) {
                            try {
                                String readLine = bufferedReader2.readLine();
                                if (readLine != null) {
                                    if (readLine.contains(":")) {
                                        String[] split = readLine.split(":");
                                        if (split[0].contains("Hardware")) {
                                            String str = split[1];
                                            closeSafety(bufferedReader2);
                                            return str;
                                        }
                                    }
                                } else {
                                    bufferedReader = bufferedReader2;
                                    break;
                                }
                            } catch (Exception e) {
                                e = e;
                                bufferedReader = bufferedReader2;
                                C16880lQ.LLLLIIL(e);
                                closeSafety(bufferedReader);
                                return Build.HARDWARE;
                            } catch (Throwable th) {
                                th = th;
                                bufferedReader = bufferedReader2;
                                closeSafety(bufferedReader);
                                throw th;
                            }
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                }
            } catch (Exception e2) {
                e = e2;
            }
            closeSafety(bufferedReader);
            return Build.HARDWARE;
        }
    }

    /* loaded from: classes7.dex */
    public static class MemoryInfo {
        public long availableSize;
        public long totalSize;

        public long getAvailableSize() {
            return this.availableSize;
        }

        public long getTotalSize() {
            return this.totalSize;
        }
    }

    public static void closeSafety(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static long getAvailableMemory(Context context) {
        long j;
        FileInputStream fileInputStream;
        FileInputStream fileInputStream2;
        ActivityManager.MemoryInfo memoryInfo;
        ActivityManager activityManager;
        try {
            memoryInfo = new ActivityManager.MemoryInfo();
            activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        } catch (Exception unused) {
        }
        try {
            try {
                if (activityManager != null) {
                    activityManager.getMemoryInfo(memoryInfo);
                    j = memoryInfo.availMem;
                    if (j == -1) {
                        fileInputStream = null;
                        fileInputStream2 = new FileInputStream("/proc/meminfo");
                        long parseFileForValue = parseFileForValue("MemAvailable", fileInputStream2) * 1024;
                        closeSafety(fileInputStream2);
                        return parseFileForValue;
                    }
                    return j;
                }
                long parseFileForValue2 = parseFileForValue("MemAvailable", fileInputStream2) * 1024;
                closeSafety(fileInputStream2);
                return parseFileForValue2;
            } catch (Exception unused2) {
                fileInputStream = fileInputStream2;
                closeSafety(fileInputStream);
                return j;
            } catch (Throwable th) {
                th = th;
                closeSafety(fileInputStream2);
                throw th;
            }
            fileInputStream2 = new FileInputStream("/proc/meminfo");
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
            fileInputStream2 = null;
        }
        j = -1;
        fileInputStream = null;
    }

    public static MemoryInfo getMemoryInfo(Context context) {
        Map<String, Object> map = cachedMap;
        Object obj = map.get("cache_key_memory_info");
        if (obj != null) {
            return (MemoryInfo) obj;
        }
        MemoryInfo memoryInfoInternal = getMemoryInfoInternal(context);
        map.put("cache_key_memory_info", memoryInfoInternal);
        return memoryInfoInternal;
    }

    public static MemoryInfo getMemoryInfoInternal(Context context) {
        MemoryInfo memoryInfo = new MemoryInfo();
        memoryInfo.totalSize = getTotalMemory(context);
        memoryInfo.availableSize = getAvailableMemory(context);
        return memoryInfo;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(12:1|2|3|(3:5|(6:7|8|9|10|(4:12|14|15|16)|23)|27)|29|8|9|10|(0)|23|27|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0042, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0043, code lost:
    
        r4 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002b A[Catch: Exception -> 0x003e, all -> 0x0042, TRY_LEAVE, TryCatch #5 {Exception -> 0x003e, all -> 0x0042, blocks: (B:10:0x001e, B:12:0x002b), top: B:9:0x001e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static long getTotalMemory(android.content.Context r6) {
        /*
            r4 = -1
            android.app.ActivityManager$MemoryInfo r1 = new android.app.ActivityManager$MemoryInfo     // Catch: java.lang.Exception -> L1b
            r1.<init>()     // Catch: java.lang.Exception -> L1b
            java.lang.String r0 = "activity"
            java.lang.Object r0 = X.C16880lQ.LLILL(r6, r0)     // Catch: java.lang.Exception -> L1b
            android.app.ActivityManager r0 = (android.app.ActivityManager) r0     // Catch: java.lang.Exception -> L1b
            if (r0 == 0) goto L1b
            r0.getMemoryInfo(r1)     // Catch: java.lang.Exception -> L1b
            long r2 = r1.totalMem     // Catch: java.lang.Exception -> L1b
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 != 0) goto L41
            goto L1d
        L1b:
            r2 = -1
        L1d:
            r5 = 0
            java.lang.String r1 = "/proc/meminfo"
            java.io.File r0 = new java.io.File     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L42
            r0.<init>(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L42
            boolean r0 = r0.exists()     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L42
            if (r0 == 0) goto L3e
            java.io.FileInputStream r4 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L42
            r4.<init>(r1)     // Catch: java.lang.Exception -> L3e java.lang.Throwable -> L42
            java.lang.String r0 = "MemTotal"
            int r0 = parseFileForValue(r0, r4)     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            long r2 = (long) r0     // Catch: java.lang.Throwable -> L3b java.lang.Exception -> L3d
            r0 = 1024(0x400, double:5.06E-321)
            long r2 = r2 * r0
            goto L3d
        L3b:
            r0 = move-exception
            goto L44
        L3d:
            r5 = r4
        L3e:
            closeSafety(r5)
        L41:
            return r2
        L42:
            r0 = move-exception
            r4 = r5
        L44:
            closeSafety(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.DeviceUtil.getTotalMemory(android.content.Context):long");
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
        throw new UnsupportedOperationException("Method not decompiled: com.ss.android.ugc.effectmanager.common.utils.DeviceUtil.parseFileForValue(java.lang.String, java.io.FileInputStream):int");
    }
}
