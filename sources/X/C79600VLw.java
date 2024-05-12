package X;

import Y.ARunnableS7S1100000_6;
import android.text.TextUtils;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.react.bridge.JavaOnlyMap;
import com.lynx.tasm.base.TraceEvent;
import defpackage.a1;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

/* renamed from: X.VLw, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C79600VLw {
    public EnumC59959Ng3 LIZ;
    public String LIZJ;
    public java.util.Map<String, Object> LJIIJ;
    public final WeakReference<VNU> LJIIJJI;
    public Boolean LIZIZ = Boolean.TRUE;
    public final C79598VLu LIZLLL = new C79598VLu();
    public final java.util.Map<String, Long> LJ = new HashMap();
    public final java.util.Map<String, java.util.Map<String, Long>> LJFF = new HashMap();
    public final java.util.Map<String, java.util.Map<String, Long>> LJI = new HashMap();
    public final java.util.Map<String, Long> LJII = new HashMap();
    public final ArrayList<String> LJIIIIZZ = new ArrayList<>();
    public final java.util.Set<String> LJIIIZ = new HashSet();

    public final HashMap<String, Object> LIZLLL() {
        String str;
        HashMap<String, Object> hashMap = new HashMap<>();
        if (TextUtils.isEmpty(this.LIZJ)) {
            str = "";
        } else {
            str = this.LIZJ;
        }
        hashMap.put("url", str);
        hashMap.put("thread_strategy", Integer.valueOf(this.LIZ.id()));
        hashMap.put("metrics", this.LJII);
        hashMap.put("setup_timing", this.LJ);
        hashMap.put("update_timings", this.LJI);
        hashMap.put("extra_timing", this.LIZLLL.LIZ());
        java.util.Map<String, Object> map = this.LJIIJ;
        if (map != null) {
            hashMap.putAll(map);
            hashMap.remove("metrics");
        }
        return hashMap;
    }

    public final JavaOnlyMap LJ() {
        String str;
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        if (TextUtils.isEmpty(this.LIZJ)) {
            str = "";
        } else {
            str = this.LIZJ;
        }
        javaOnlyMap.put("url", str);
        javaOnlyMap.put("thread_strategy", Integer.valueOf(this.LIZ.id()));
        javaOnlyMap.put("metrics", JavaOnlyMap.from(this.LJII));
        javaOnlyMap.put("setup_timing", JavaOnlyMap.from(this.LJ));
        JavaOnlyMap javaOnlyMap2 = new JavaOnlyMap();
        for (Map.Entry entry : ((HashMap) this.LJI).entrySet()) {
            javaOnlyMap2.putMap((String) entry.getKey(), JavaOnlyMap.from((java.util.Map) entry.getValue()));
        }
        javaOnlyMap.put("update_timings", javaOnlyMap2);
        javaOnlyMap.put("extra_timing", JavaOnlyMap.from(this.LIZLLL.LIZ()));
        return javaOnlyMap;
    }

    public final boolean LJI() {
        if ((!this.LIZIZ.booleanValue() && ((HashMap) this.LJ).containsKey("draw_end")) || ((HashMap) this.LJ).size() == 21) {
            return true;
        }
        return false;
    }

    public C79600VLw(VNU vnu) {
        this.LJIIJJI = new WeakReference<>(vnu);
    }

    public final void LIZ(String str) {
        if (((HashMap) this.LJI).containsKey(str)) {
            return;
        }
        TraceEvent.LJFF(1L, System.nanoTime() / 1000, a1.LJ("Attribute timingFlag: ", str, " is added"));
        C79411VEp.LJ(new ARunnableS7S1100000_6(this, str, 3));
    }

    public final void LIZIZ(long j) {
        if (((HashSet) this.LJIIIZ).isEmpty() || !LJI()) {
            return;
        }
        HashSet hashSet = new HashSet(this.LJIIIZ);
        ((HashSet) this.LJIIIZ).clear();
        HashMap hashMap = new HashMap();
        hashMap.put("draw_end", Long.valueOf(j));
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            LIZJ((String) it.next(), hashMap);
        }
    }

    public final void LJII(String str) {
        if (TextUtils.isEmpty(str)) {
            TraceEvent.LJII("setup_draw_end", "#0CCE6A");
            LJIIIIZZ("setup_draw_end", System.currentTimeMillis(), null);
        } else {
            if (TextUtils.equals(str, "attribute_flag_draw_end")) {
                TraceEvent.LJII("attribute_flag_draw_end", "#0CCE6A");
                LJIIIIZZ("draw_end", System.currentTimeMillis(), str);
                return;
            }
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("update_draw_end.");
            LIZ.append(str);
            TraceEvent.LJII(X1D.LIZIZ(LIZ), "#0CCE6A");
            LJIIIIZZ("update_draw_end", System.currentTimeMillis(), str);
        }
    }

    public static long LJFF(String str, java.util.Map map) {
        if (map == null || !map.containsKey(str)) {
            return 0L;
        }
        return ((Long) map.get(str)).longValue();
    }

    public final void LIZJ(String str, java.util.Map map) {
        if (((HashMap) this.LJI).containsKey(str)) {
            return;
        }
        ((HashMap) this.LJI).put(str, map);
        if (str.equals("__lynx_timing_actual_fmp")) {
            long LJFF = LJFF("draw_end", (java.util.Map) ((HashMap) this.LJI).get("__lynx_timing_actual_fmp"));
            long j = this.LIZLLL.LIZLLL;
            if (j > 0) {
                long j2 = LJFF - j;
                ((HashMap) this.LJII).put("actual_fmp", Long.valueOf(j2));
            }
            if (((HashMap) this.LJ).containsKey("load_template_start")) {
                long longValue = LJFF - ((Long) ((HashMap) this.LJ).get("load_template_start")).longValue();
                ((HashMap) this.LJII).put("lynx_actual_fmp", Long.valueOf(longValue));
            }
        }
        VNU vnu = this.LJIIJJI.get();
        if (vnu == null) {
            return;
        }
        VNV vnv = vnu.LJLLL;
        if (vnv != null) {
            HashMap<String, Object> LIZLLL = LIZLLL();
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("LynxViewLifecycle.onTimingUpdate.");
            LIZ.append(str);
            String LIZIZ = X1D.LIZIZ(LIZ);
            TraceEvent.LIZIZ(LIZIZ);
            vnv.LJJIIJ(str, LIZLLL, map);
            TraceEvent.LJ(LIZIZ);
        }
        JavaOnlyMap LJ = LJ();
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        javaOnlyMap.putMap(str, JavaOnlyMap.from(map));
        LJ.put("update_timings", javaOnlyMap);
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        javaOnlyArray.pushMap(LJ);
        vnu.LJIIJJI("lynx.performance.timing.onUpdate", javaOnlyArray);
        vnu.LJI().triggerTrailReport();
    }

    public final void LJIIIIZZ(String str, long j, String str2) {
        C79411VEp.LJ(new RunnableC79599VLv(this, str, j, str2));
    }
}
