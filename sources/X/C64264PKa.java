package X;

import android.app.ActivityManager;
import android.content.Context;
import android.os.Build;
import android.os.Debug;
import android.os.Process;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.lang.reflect.Field;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PKa, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64264PKa {
    public static String LIZ;
    public static Class<?> LIZIZ;
    public static Field LIZJ;
    public static Field LIZLLL;
    public static boolean LJ;

    public static long LJIIIZ(int i) {
        if (i < 0) {
            return 0L;
        }
        return i * 1024;
    }

    public static Class<?> LIZIZ(Context context) {
        if (LIZIZ == null && !LJ) {
            try {
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append(context.getPackageName());
                LIZ2.append(".BuildConfig");
                LIZIZ = Class.forName(X1D.LIZIZ(LIZ2));
            } catch (ClassNotFoundException unused) {
            }
            LJ = true;
        }
        return LIZIZ;
    }

    public static String LIZJ(Context context) {
        BufferedReader bufferedReader;
        if (!TextUtils.isEmpty(LIZ)) {
            return LIZ;
        }
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        String str = runningAppProcessInfo.processName;
                        LIZ = str;
                        return str;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        String str2 = null;
        try {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("/proc/");
            LIZ2.append(Process.myPid());
            LIZ2.append("/cmdline");
            bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(X1D.LIZIZ(LIZ2)), "iso-8859-1"));
            try {
                StringBuilder sb = new StringBuilder();
                while (true) {
                    int read = bufferedReader.read();
                    if (read <= 0) {
                        break;
                    }
                    sb.append((char) read);
                }
                str2 = sb.toString();
            } catch (Throwable unused2) {
            }
        } catch (Throwable unused3) {
            bufferedReader = null;
        }
        FPX.LIZIZ(bufferedReader);
        LIZ = str2;
        if (str2 == null) {
            return "";
        }
        return str2;
    }

    public static void LIZLLL(JSONObject jSONObject) {
        Debug.MemoryInfo memoryInfo = new Debug.MemoryInfo();
        Debug.getMemoryInfo(memoryInfo);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("dalvikPrivateDirty", LJIIIZ(memoryInfo.dalvikPrivateDirty));
        jSONObject2.put("dalvikPss", LJIIIZ(memoryInfo.dalvikPss));
        jSONObject2.put("dalvikSharedDirty", LJIIIZ(memoryInfo.dalvikSharedDirty));
        jSONObject2.put("nativePrivateDirty", LJIIIZ(memoryInfo.nativePrivateDirty));
        jSONObject2.put("nativePss", LJIIIZ(memoryInfo.nativePss));
        jSONObject2.put("nativeSharedDirty", LJIIIZ(memoryInfo.nativeSharedDirty));
        jSONObject2.put("otherPrivateDirty", LJIIIZ(memoryInfo.otherPrivateDirty));
        jSONObject2.put("otherPss", LJIIIZ(memoryInfo.otherPss));
        jSONObject2.put("otherSharedDirty", memoryInfo.otherSharedDirty);
        if (Build.VERSION.SDK_INT >= 23) {
            try {
                String memoryStat = memoryInfo.getMemoryStat("summary.graphics");
                if (!TextUtils.isEmpty(memoryStat)) {
                    jSONObject2.put("summary.graphics", LJIIIZ(CastIntegerProtector.parseInt(memoryStat)));
                }
            } catch (Throwable unused) {
            }
        }
        jSONObject2.put("totalPrivateClean", memoryInfo.getTotalPrivateClean());
        jSONObject2.put("totalPrivateDirty", memoryInfo.getTotalPrivateDirty());
        jSONObject2.put("totalPss", LJIIIZ(memoryInfo.getTotalPss()));
        jSONObject2.put("totalSharedClean", memoryInfo.getTotalSharedClean());
        jSONObject2.put("totalSharedDirty", LJIIIZ(memoryInfo.getTotalSharedDirty()));
        jSONObject2.put("totalSwappablePss", LJIIIZ(memoryInfo.getTotalSwappablePss()));
        jSONObject.put("memory_info", jSONObject2);
    }

    public static boolean LJI(Context context) {
        String str;
        if (context == null) {
            return !C64269PKf.LIZLLL().LJIILLIIL;
        }
        if (!C64269PKf.LIZLLL().LJIILLIIL) {
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager == null) {
                return true;
            }
            try {
                List<ActivityManager.RunningAppProcessInfo> runningAppProcesses = activityManager.getRunningAppProcesses();
                if (runningAppProcesses == null) {
                    return true;
                }
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : runningAppProcesses) {
                    if (runningAppProcessInfo != null && (str = runningAppProcessInfo.processName) != null && str.equals(context.getPackageName())) {
                        int i = runningAppProcessInfo.importance;
                        if (i != 200 && i != 100) {
                            return true;
                        }
                    }
                }
                return true;
            } catch (Throwable unused) {
                return true;
            }
        }
        return false;
    }

    public static boolean LJII(Context context) {
        String LIZJ2 = LIZJ(context);
        if (LIZJ2 == null || LIZJ2.contains(":") || LIZJ2 == null) {
            return false;
        }
        if (!LIZJ2.equals(context.getPackageName()) && !LIZJ2.equals(context.getApplicationInfo().processName)) {
            return false;
        }
        return true;
    }

    public static void LIZ(JSONObject jSONObject, ActivityManager activityManager) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        String str;
        JSONObject jSONObject2 = new JSONObject();
        long nativeHeapAllocatedSize = Debug.getNativeHeapAllocatedSize() / 1048576;
        boolean z5 = true;
        if (nativeHeapAllocatedSize > 200) {
            z = true;
        } else {
            z = false;
        }
        PKN.LJIILIIL(String.valueOf(z), "filters", "native_heap_leak", jSONObject);
        if (nativeHeapAllocatedSize > 300) {
            z2 = true;
        } else {
            z2 = false;
        }
        PKN.LJIILIIL(String.valueOf(z2), "filters", "native_heap_leak_300M", jSONObject);
        if (nativeHeapAllocatedSize > 500) {
            z3 = true;
        } else {
            z3 = false;
        }
        PKN.LJIILIIL(String.valueOf(z3), "filters", "native_heap_leak_500M", jSONObject);
        if (nativeHeapAllocatedSize > 800) {
            z4 = true;
        } else {
            z4 = false;
        }
        PKN.LJIILIIL(String.valueOf(z4), "filters", "native_heap_leak_800M", jSONObject);
        jSONObject2.put("native_heap_size", Debug.getNativeHeapSize());
        jSONObject2.put("native_heap_alloc_size", Debug.getNativeHeapAllocatedSize());
        jSONObject2.put("native_heap_free_size", Debug.getNativeHeapFreeSize());
        Runtime runtime = Runtime.getRuntime();
        long maxMemory = runtime.maxMemory();
        long freeMemory = runtime.freeMemory();
        long j = runtime.totalMemory();
        jSONObject2.put("max_memory", maxMemory);
        jSONObject2.put("free_memory", freeMemory);
        jSONObject2.put("total_memory", j);
        float f = (float) (j - freeMemory);
        float f2 = (float) maxMemory;
        if (f > 0.95f * f2) {
            str = ">95%";
        } else {
            if (f > 0.85f * f2) {
                str = "(85%-95%]";
            } else if (f > 0.75f * f2) {
                str = "(75%-85%]";
            } else if (f > 0.65f * f2) {
                str = "(65%-75%]";
            } else if (f > f2 * 0.5f) {
                str = "(50%-65%]";
            } else {
                str = "<=50%";
            }
            z5 = false;
        }
        PKN.LJIILIIL(String.valueOf(z5), "filters", "java_heap_leak", jSONObject);
        PKN.LJIILIIL(str, "filters", "java_heap_usage", jSONObject);
        if (activityManager != null) {
            jSONObject2.put("memory_class", activityManager.getMemoryClass());
            jSONObject2.put("large_memory_class", activityManager.getLargeMemoryClass());
        }
        jSONObject.put("app_memory_info", jSONObject2);
    }

    public static void LJ(Context context, JSONObject jSONObject) {
        try {
            LIZLLL(jSONObject);
            ActivityManager activityManager = (ActivityManager) C16880lQ.LLILL(context, "activity");
            if (activityManager != null) {
                LJFF(jSONObject, activityManager);
            }
            LIZ(jSONObject, activityManager);
        } catch (Throwable unused) {
        }
    }

    public static void LJFF(JSONObject jSONObject, ActivityManager activityManager) {
        JSONObject jSONObject2 = new JSONObject();
        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
        activityManager.getMemoryInfo(memoryInfo);
        jSONObject2.put("availMem", memoryInfo.availMem);
        jSONObject2.put("lowMemory", memoryInfo.lowMemory);
        jSONObject2.put("threshold", memoryInfo.threshold);
        jSONObject2.put("totalMem", memoryInfo.totalMem);
        jSONObject.put("sys_memory_info", jSONObject2);
    }

    public static boolean LJIIIIZZ(Context context, String str) {
        if (str != null && (str.equals(context.getPackageName()) || str.equals(context.getApplicationInfo().processName))) {
            return true;
        }
        return false;
    }
}
