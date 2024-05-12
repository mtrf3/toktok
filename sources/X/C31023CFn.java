package X;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.other.LiveCpuMemoryOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.LivePullSdkGetDataIntervalSettings;
import com.bytedance.android.livesdk.livesetting.performance.PerformanceSampleSetting;
import com.bytedance.android.livesdk.model.CpuMemoryOptList;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import java.util.HashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.CFn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31023CFn {
    public static long LIZJ;
    public static long LIZLLL;
    public static java.util.Map<String, Integer> LJI;
    public static boolean LJII;
    public static HashMap<String, Double> LIZ = new HashMap<>();
    public static HashMap<String, Long> LIZIZ = new HashMap<>();
    public static String LJ = "";
    public static String LJFF = "";

    public static java.util.Map LIZ(String str) {
        int i;
        Integer num;
        java.util.Map<String, Integer> map;
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return LIZ;
        }
        if (!PerformanceSampleSetting.INSTANCE.isReportCpu(LJII)) {
            return LIZ;
        }
        if (LJI == null) {
            CpuMemoryOptList value = LiveCpuMemoryOptSetting.INSTANCE.getValue();
            if (value != null) {
                map = value.optList;
            } else {
                map = null;
            }
            LJI = map;
        }
        java.util.Map<String, Integer> map2 = LJI;
        if (map2 != null && (num = map2.get(str)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        long j = i * 1000000000;
        if (LIZ.isEmpty() || j <= 0) {
            HashMap<String, Double> cpuRate = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).getCpuRate();
            o.LJIIIIZZ(cpuRate, "getService(IHostPerforma…itor::class.java).cpuRate");
            LIZ = cpuRate;
            LIZJ = System.nanoTime();
            LJ = str;
            return LIZ;
        }
        if (o.LJ("live_pull_sdk_get_data_interval", str)) {
            j = LivePullSdkGetDataIntervalSettings.INSTANCE.getValue() * 1000000000;
        }
        if (TextUtils.isEmpty(str) || ((!o.LJ(LJ, str) && o.LJ(LJ, "livesdk_cpu_memory_now_key")) || System.nanoTime() - LIZJ >= j)) {
            HashMap<String, Double> cpuRate2 = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).getCpuRate();
            o.LJIIIIZZ(cpuRate2, "getService(IHostPerforma…itor::class.java).cpuRate");
            LIZ = cpuRate2;
            LIZJ = System.nanoTime();
            LJ = str;
        }
        return LIZ;
    }

    public static java.util.Map LIZIZ(String str) {
        int i;
        Integer num;
        java.util.Map<String, Integer> map;
        if (o.LJ(Looper.myLooper(), C16880lQ.LLJJJJ())) {
            return LIZIZ;
        }
        if (!PerformanceSampleSetting.INSTANCE.isReportMem(LJII)) {
            return LIZIZ;
        }
        if (LJI == null) {
            CpuMemoryOptList value = LiveCpuMemoryOptSetting.INSTANCE.getValue();
            if (value != null) {
                map = value.optList;
            } else {
                map = null;
            }
            LJI = map;
        }
        java.util.Map<String, Integer> map2 = LJI;
        if (map2 != null && (num = map2.get(str)) != null) {
            i = num.intValue();
        } else {
            i = 0;
        }
        long j = i * 1000000000;
        if (LIZIZ.isEmpty() || j <= 0) {
            HashMap<String, Long> memory = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).getMemory();
            o.LJIIIIZZ(memory, "getService(IHostPerforma…nitor::class.java).memory");
            LIZIZ = memory;
            LIZLLL = System.nanoTime();
            LJFF = str;
            return LIZIZ;
        }
        if (o.LJ("live_pull_sdk_get_data_interval", str)) {
            j = LivePullSdkGetDataIntervalSettings.INSTANCE.getValue() * 1000000000;
        }
        if (TextUtils.isEmpty(str) || ((!o.LJ(LJFF, str) && o.LJ(LJFF, "livesdk_cpu_memory_now_key")) || System.nanoTime() - LIZLLL >= j)) {
            HashMap<String, Long> memory2 = ((IHostPerformanceMonitor) CN1.LIZ(IHostPerformanceMonitor.class)).getMemory();
            o.LJIIIIZZ(memory2, "getService(IHostPerforma…nitor::class.java).memory");
            LIZIZ = memory2;
            LIZLLL = System.nanoTime();
            LJFF = str;
        }
        return LIZIZ;
    }

    public static void LIZJ(boolean z) {
        if (z || System.nanoTime() - LIZJ > 15000000000L) {
            LIZ.clear();
            LIZIZ.clear();
            LJI = null;
        }
    }
}
