package com.ss.avframework.livestreamv2.core.interact.statistic;

import X.C16880lQ;
import X.X1D;
import android.app.ActivityManager;
import android.content.Context;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;

/* loaded from: classes9.dex */
public class MonitorUtils {
    public static long getTotalCPUTime() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(" ");
            long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[5]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
            close(bufferedReader);
            return parseLong;
        } catch (Exception unused2) {
            bufferedReader2 = bufferedReader;
            close(bufferedReader2);
            return -1L;
        } catch (Throwable th2) {
            th = th2;
            close(bufferedReader);
            throw th;
        }
    }

    public static long getUsedCPUTime() {
        BufferedReader bufferedReader;
        BufferedReader bufferedReader2 = null;
        try {
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream("/proc/stat")), 1000);
        } catch (Exception unused) {
        } catch (Throwable th) {
            th = th;
            bufferedReader = null;
        }
        try {
            String readLine = bufferedReader.readLine();
            bufferedReader.close();
            String[] split = readLine.split(" ");
            long parseLong = Long.parseLong(split[2]) + Long.parseLong(split[3]) + Long.parseLong(split[4]) + Long.parseLong(split[6]) + Long.parseLong(split[7]) + Long.parseLong(split[8]);
            close(bufferedReader);
            return parseLong;
        } catch (Exception unused2) {
            bufferedReader2 = bufferedReader;
            close(bufferedReader2);
            return -1L;
        } catch (Throwable th2) {
            th = th2;
            close(bufferedReader);
            throw th;
        }
    }

    public static boolean isProcStatCanRead() {
        File file = new File("/proc/stat");
        if (file.exists() && file.canRead()) {
            return true;
        }
        return false;
    }

    public static void close(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (Throwable unused) {
            }
        }
    }

    public static long getAppCPUTime(int i) {
        BufferedReader bufferedReader = null;
        try {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("/proc/");
            LIZ.append(i);
            LIZ.append("/stat");
            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ))), 1000);
            try {
                String readLine = bufferedReader2.readLine();
                bufferedReader2.close();
                String[] split = readLine.split(" ");
                long parseLong = Long.parseLong(split[13]) + Long.parseLong(split[14]) + Long.parseLong(split[15]) + Long.parseLong(split[16]);
                close(bufferedReader2);
                return parseLong;
            } catch (Exception unused) {
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                return -1L;
            } catch (Throwable th) {
                th = th;
                bufferedReader = bufferedReader2;
                close(bufferedReader);
                throw th;
            }
        } catch (Exception unused2) {
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public static long getSysUsedMemory(Context context) {
        if (context == null) {
            return -1L;
        }
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
        if (activityManager == null) {
            return -1L;
        }
        activityManager.getMemoryInfo(memoryInfo);
        return memoryInfo.availMem / 1024;
    }

    public static int getPidMemorySize(int i, Context context) {
        if (context == null) {
            return -1;
        }
        try {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager == null) {
                return -1;
            }
            return C16880lQ.LLJJL(activityManager, new int[]{i})[0].getTotalPss();
        } catch (Exception unused) {
            return -1;
        }
    }
}
