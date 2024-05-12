package X;

import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.apm6.cpu.ApmCpuManager;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import org.json.JSONObject;

/* renamed from: X.PHj, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64195PHj implements PCW {
    public final /* synthetic */ PG2 LIZ;

    public C64195PHj(PG2 pg2) {
        this.LIZ = pg2;
    }

    @Override // X.PCW
    public final void LIZ(JSONObject jSONObject) {
        JSONObject jSONObject2;
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        PG2 pg2 = this.LIZ;
        pg2.getClass();
        if (jSONObject == null) {
            return;
        }
        try {
            jSONObject2 = jSONObject.optJSONObject("performance_modules").optJSONObject("cpu");
        } catch (Throwable unused) {
            jSONObject2 = null;
        }
        if (jSONObject2 != null) {
            pg2.LIZ = new C64200PHo();
            boolean z5 = false;
            if (jSONObject2.optInt("enable_upload", 0) == 1) {
                z = true;
            } else {
                z = false;
            }
            pg2.LIZ.LIZ = z;
            if (jSONObject2.optInt("enable_collect_all_process", 0) == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            pg2.LIZ.LIZIZ = z2;
            long optLong = jSONObject2.optLong("front_collect_interval", 0L);
            if (optLong > 0) {
                pg2.LIZ.LIZJ = optLong;
            }
            long optLong2 = jSONObject2.optLong("back_collect_interval", 0L);
            if (optLong2 > 0) {
                pg2.LIZ.LIZLLL = optLong2;
            }
            long optLong3 = jSONObject2.optLong("monitor_interval", 0L);
            if (optLong3 > 0) {
                pg2.LIZ.LJ = optLong3;
            }
            long optLong4 = jSONObject2.optLong("front_thread_collect_interval", 0L);
            if (optLong4 > 0) {
                pg2.LIZ.LJFF = optLong4;
            }
            long optLong5 = jSONObject2.optLong("back_thread_collect_interval", 0L);
            if (optLong5 > 0) {
                pg2.LIZ.LJI = optLong5;
            }
            pg2.LIZIZ = new C64198PHm();
            if (jSONObject2.optInt("exception_switch", 0) == 1) {
                z3 = true;
            } else {
                z3 = false;
            }
            pg2.LIZIZ.LIZ = z3;
            double optDouble = jSONObject2.optDouble("exception_process_back_max_speed", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (optDouble > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                pg2.LIZIZ.LIZJ = optDouble;
            }
            double optDouble2 = jSONObject2.optDouble("exception_process_fore_max_speed", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (optDouble2 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                pg2.LIZIZ.LIZLLL = optDouble2;
            }
            if (jSONObject2.optInt("main_thread_collect_enabled", 0) == 1) {
                z4 = true;
            } else {
                z4 = false;
            }
            pg2.LIZIZ.LIZIZ = z4;
            if (jSONObject2.optInt("exception_collect_all_process", 0) == 1) {
                z5 = true;
            }
            pg2.LIZIZ.LJFF = z5;
            double optDouble3 = jSONObject2.optDouble("exception_thread_max_usage", LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
            if (optDouble3 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                pg2.LIZIZ.LJ = optDouble3;
            }
            JSONObject optJSONObject = jSONObject2.optJSONObject("exception_fore_max_speed_scene");
            HashMap hashMap = new HashMap();
            if (optJSONObject != null) {
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    double optDouble4 = optJSONObject.optDouble(next, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    if (optDouble4 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        hashMap.put(next, Double.valueOf(optDouble4));
                    }
                }
            }
            pg2.LIZIZ.LJII = hashMap;
            JSONObject optJSONObject2 = jSONObject2.optJSONObject("exception_back_max_speed_scene");
            HashMap hashMap2 = new HashMap();
            if (optJSONObject2 != null) {
                Iterator<String> keys2 = optJSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    double optDouble5 = optJSONObject2.optDouble(next2, LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
                    if (optDouble5 > LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
                        hashMap2.put(next2, Double.valueOf(optDouble5));
                    }
                }
            }
            pg2.LIZIZ.LJI = hashMap2;
        }
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(pg2.LIZ);
        LIZ.append(" ");
        LIZ.append(pg2.LIZIZ);
        C64028PAy.LIZ("APM-CPU", X1D.LIZIZ(LIZ));
        C64171PGl c64171PGl = C64156PFw.LIZ;
        C64200PHo c64200PHo = pg2.LIZ;
        c64171PGl.getClass();
        if (!((Boolean) C34231Dc3.LIZ.getValue()).booleanValue() && c64200PHo != null) {
            synchronized (C64202PHq.class) {
                C64202PHq.LIZJ = true;
                List<C64189PHd> list = C64202PHq.LIZIZ;
                if (!list.isEmpty()) {
                    Iterator<C64189PHd> it = list.iterator();
                    while (it.hasNext()) {
                        PC2.LIZ(it.next());
                    }
                    ((LinkedList) C64202PHq.LIZIZ).clear();
                }
            }
            if (!ApmCpuManager.isPowerOpt()) {
                c64171PGl.LIZIZ.LJI(c64200PHo);
                if (c64200PHo.LIZ) {
                    c64171PGl.LIZJ.LJIIIZ(c64200PHo);
                }
            } else if ((C09970aH.LJIIIIZZ() || c64200PHo.LIZIZ) && c64200PHo.LIZ) {
                c64171PGl.LIZIZ.LJI(c64200PHo);
                c64171PGl.LIZJ.LJIIIZ(c64200PHo);
            }
        }
        C64207PHv.LIZ.LIZIZ(pg2.LIZIZ);
    }
}
