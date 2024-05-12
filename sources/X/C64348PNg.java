package X;

import android.content.Intent;
import android.content.IntentFilter;
import android.os.PowerManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadThreadPriority;
import com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService;
import com.ss.android.ugc.aweme.services.performance.LagDataCallback;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import oy0.a;

/* renamed from: X.PNg, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64348PNg implements ICreativePerformanceMonitorService {
    public final C1HQ<String, C64351PNj> LIZ = new C1HQ<>();
    public final C1HQ<String, C64349PNh> LIZIZ = new C1HQ<>();

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final java.util.Map<String, Double> getCpuRate() {
        HashMap hashMap = new HashMap();
        a LIZ = PJ3.LIZ();
        hashMap.put("cpu_rate", Double.valueOf(LIZ.LIZ));
        hashMap.put("cpu_speed", Double.valueOf(LIZ.LIZIZ));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final java.util.Map<String, Long> getMemory() {
        HashMap hashMap = new HashMap();
        PJ4 LIZIZ = PJ3.LIZIZ(EF7.LIZIZ());
        hashMap.put("mem_java_total", Long.valueOf(LIZIZ.LIZ));
        hashMap.put("mem_java_free", Long.valueOf(LIZIZ.LIZIZ));
        hashMap.put("mem_java_used", Long.valueOf(LIZIZ.LIZJ));
        hashMap.put("mem_pss_dalvik", Long.valueOf(LIZIZ.LIZLLL));
        hashMap.put("mem_pss_native", Long.valueOf(LIZIZ.LJ));
        hashMap.put("mem_pss_total", Long.valueOf(LIZIZ.LJFF));
        hashMap.put("mem_graphics", Long.valueOf(LIZIZ.LJI));
        hashMap.put("mem_vmsize", Long.valueOf(LIZIZ.LJII));
        return hashMap;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final String getBatteryPercent() {
        Intent LJJLIIIJ = C16880lQ.LJJLIIIJ(C83739Wtj.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (LJJLIIIJ != null) {
            int intExtra = LJJLIIIJ.getIntExtra("level", LiveLayoutPreloadThreadPriority.DEFAULT);
            int intExtra2 = LJJLIIIJ.getIntExtra("scale", LiveLayoutPreloadThreadPriority.DEFAULT);
            if (intExtra == Integer.MIN_VALUE || intExtra2 == Integer.MIN_VALUE) {
                return "";
            }
            return String.valueOf((intExtra * 100) / intExtra2);
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final int getBatteryState() {
        int intExtra;
        Intent LJJLIIIJ = C16880lQ.LJJLIIIJ(C83739Wtj.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (LJJLIIIJ != null && (intExtra = LJJLIIIJ.getIntExtra("status", LiveLayoutPreloadThreadPriority.DEFAULT)) != Integer.MIN_VALUE && intExtra != 1) {
            if (intExtra != 2) {
                if (intExtra == 3 || intExtra == 4) {
                    return 1;
                }
                if (intExtra == 5) {
                    return 3;
                }
            } else {
                return 2;
            }
        }
        return 0;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final String getBatteryTemperature() {
        int intExtra;
        Intent LJJLIIIJ = C16880lQ.LJJLIIIJ(C83739Wtj.LIZ(), null, new IntentFilter("android.intent.action.BATTERY_CHANGED"));
        if (LJJLIIIJ != null && (intExtra = LJJLIIIJ.getIntExtra("temperature", Integer.MAX_VALUE)) != Integer.MAX_VALUE) {
            return String.valueOf(intExtra / 10);
        }
        return "";
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final String getCpuUsedRate() {
        String valueOf = String.valueOf(PJ3.LIZ().LIZ);
        if (valueOf == null) {
            return "";
        }
        return valueOf;
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final String getMemoryUsedRate() {
        PJ4 LIZIZ = PJ3.LIZIZ(EF7.LIZIZ());
        return String.valueOf(((float) LIZIZ.LIZJ) / ((float) LIZIZ.LIZ));
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final int isPowerSaveMode() {
        try {
            Object LLILL = C16880lQ.LLILL(EF7.LIZIZ(), "power");
            o.LJII(LLILL, "null cannot be cast to non-null type android.os.PowerManager");
            return ((PowerManager) LLILL).isPowerSaveMode() ? 1 : 0;
        } catch (Exception e) {
            H7B.LIZJ(e.getMessage());
            return 0;
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopBlockMonitor(String scene) {
        o.LJIIIZ(scene, "scene");
        C64351PNj orDefault = this.LIZ.getOrDefault(scene, null);
        if (orDefault != null) {
            orDefault.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void stopFpsMonitor(String scene) {
        o.LJIIIZ(scene, "scene");
        C64349PNh orDefault = this.LIZIZ.getOrDefault(scene, null);
        if (orDefault != null) {
            orDefault.LIZJ();
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String scene, LagDataCallback lagDataCallback) {
        o.LJIIIZ(scene, "scene");
        startFpsMonitor(scene, -1L, lagDataCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String scene, int i, LagDataCallback lagDataCallback) {
        o.LJIIIZ(scene, "scene");
        startBlockMonitor(scene, i, -1L, lagDataCallback);
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startFpsMonitor(String scene, long j, LagDataCallback lagDataCallback) {
        o.LJIIIZ(scene, "scene");
        C64349PNh orDefault = this.LIZIZ.getOrDefault(scene, null);
        if (orDefault != null) {
            orDefault.LIZ(lagDataCallback);
            if (j == -1) {
                orDefault.LIZIZ();
                return;
            } else {
                if (orDefault.LIZLLL) {
                    return;
                }
                orDefault.LJ = true;
                orDefault.LIZIZ();
                C1DH.LJIILIIL().postDelayed(orDefault.LJFF, j);
                return;
            }
        }
        C64349PNh c64349PNh = new C64349PNh(scene);
        this.LIZIZ.put(scene, c64349PNh);
        C64350PNi c64350PNi = c64349PNh.LIZIZ;
        synchronized (c64350PNi) {
            c64350PNi.LJLILLLLZI = lagDataCallback;
        }
        if (j == -1) {
            c64349PNh.LIZIZ();
        } else {
            if (c64349PNh.LIZLLL) {
                return;
            }
            c64349PNh.LJ = true;
            c64349PNh.LIZIZ();
            C1DH.LJIILIIL().postDelayed(c64349PNh.LJFF, j);
        }
    }

    @Override // com.ss.android.ugc.aweme.services.performance.ICreativePerformanceMonitorService
    public final void startBlockMonitor(String scene, int i, long j, LagDataCallback lagDataCallback) {
        o.LJIIIZ(scene, "scene");
        C64351PNj orDefault = this.LIZ.getOrDefault(scene, null);
        if (orDefault != null) {
            orDefault.LJIIIZ = i;
            orDefault.LIZ(lagDataCallback);
            if (j == -1) {
                orDefault.LIZIZ();
                return;
            } else {
                if (orDefault.LJFF) {
                    return;
                }
                orDefault.LIZIZ();
                orDefault.LJI = true;
                C1DH.LJIILIIL().postDelayed(orDefault.LJ, j);
                return;
            }
        }
        C64351PNj c64351PNj = new C64351PNj(scene);
        this.LIZ.put(scene, c64351PNj);
        synchronized (c64351PNj) {
            c64351PNj.LJIIIIZZ = lagDataCallback;
        }
        if (j == -1) {
            c64351PNj.LIZIZ();
        } else {
            if (c64351PNj.LJFF) {
                return;
            }
            c64351PNj.LIZIZ();
            c64351PNj.LJI = true;
            C1DH.LJIILIIL().postDelayed(c64351PNj.LJ, j);
        }
    }
}
