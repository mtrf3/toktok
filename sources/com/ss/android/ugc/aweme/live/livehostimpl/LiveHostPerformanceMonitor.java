package com.ss.android.ugc.aweme.live.livehostimpl;

import X.C0NB;
import X.C78845Uwz;
import X.CGB;
import X.EF7;
import X.PH4;
import X.PJ3;
import X.PJ4;
import X.PMC;
import X.PMR;
import android.content.Context;
import android.os.BatteryManager;
import com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor;
import com.bytedance.common.graphics.GraphicsMonitor;
import d5b.c;
import java.util.HashMap;
import java.util.Map;
import oy0.a;

/* loaded from: classes12.dex */
public class LiveHostPerformanceMonitor implements IHostPerformanceMonitor {
    @Override // X.InterfaceC06390Mx
    public final /* synthetic */ void onInit() {
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final CGB aD() {
        return new CGB();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final PMR dt0() {
        return new PMR(0);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Double> getCpuRate() {
        HashMap<String, Double> hashMap = new HashMap<>();
        a LIZ = PJ3.LIZ();
        hashMap.put("cpu_rate", Double.valueOf(LIZ.LIZ));
        hashMap.put("cpu_speed", Double.valueOf(LIZ.LIZIZ));
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final HashMap<String, Long> getMemory() {
        HashMap<String, Long> hashMap = new HashMap<>();
        PJ4 LIZIZ = PJ3.LIZIZ(EF7.LIZIZ());
        hashMap.put("mem_java_total", Long.valueOf(LIZIZ.LIZ));
        hashMap.put("mem_java_free", Long.valueOf(LIZIZ.LIZIZ));
        hashMap.put("mem_java_used", Long.valueOf(LIZIZ.LIZJ));
        hashMap.put("mem_pss_dalvik", Long.valueOf(LIZIZ.LIZLLL));
        hashMap.put("mem_pss_native", Long.valueOf(LIZIZ.LJ));
        hashMap.put("mem_pss_total", Long.valueOf(LIZIZ.LJFF));
        hashMap.put("mem_graphics", Long.valueOf(LIZIZ.LJI));
        hashMap.put("mem_vmsize", Long.valueOf(LIZIZ.LJII));
        hashMap.put("mem_app_allocate", Long.valueOf((LIZIZ.LJFF - LIZIZ.LIZLLL) + LIZIZ.LIZ));
        return hashMap;
    }

    public LiveHostPerformanceMonitor() {
        new PH4("live_frs_tracer", true);
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void Cj() {
        try {
            if (GraphicsMonitor.isStart()) {
                GraphicsMonitor.stop();
            }
        } catch (Throwable th) {
            C0NB.LJII(th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final double IZ() {
        return GraphicsMonitor.getByteGpu();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void Ve() {
        try {
            GraphicsMonitor.start();
        } catch (Throwable th) {
            C0NB.LJII(th);
        }
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final void ed0() {
        GraphicsMonitor.init();
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final Map<String, String> Fk(Context context) {
        double longProperty;
        HashMap hashMap = new HashMap(4);
        if (context == null) {
            return hashMap;
        }
        try {
            hashMap.put("thor_galvanic_now", String.valueOf(c.LIZJ(context)));
            BatteryManager LIZ = c.LIZ(context);
            float f = -1.0f;
            if (LIZ != null) {
                float longProperty2 = (float) LIZ.getLongProperty(3);
                if (!C78845Uwz.LJ() && !C78845Uwz.LIZLLL()) {
                    if (C78845Uwz.LIZJ()) {
                        if (longProperty2 > 10000.0f) {
                            longProperty2 /= 1000.0f;
                        }
                        f = longProperty2;
                    } else {
                        f = longProperty2 / 1000.0f;
                    }
                }
                if (longProperty2 >= -1.0E7f && longProperty2 <= 1.0E7f) {
                    if (longProperty2 < -10000.0f) {
                        longProperty2 /= 1000.0f;
                    }
                    f = -longProperty2;
                }
            }
            hashMap.put("thor_galvanic_avg", String.valueOf(f));
            hashMap.put("thor_use_battery", String.valueOf((c.LIZJ(context) * 0.5d) / 3600.0d));
            if (c.LIZ(context) == null) {
                longProperty = -1.0d;
            } else {
                longProperty = (r1.getLongProperty(5) / 1.0E9d) / 1000.0d;
            }
            hashMap.put("thor_energy", String.valueOf(longProperty));
        } catch (Throwable unused) {
        }
        return hashMap;
    }

    @Override // com.bytedance.android.livesdkapi.host.IHostPerformanceMonitor
    public final PMC IW(String str) {
        return new PMC(str);
    }
}
