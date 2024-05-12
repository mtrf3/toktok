package X;

import android.text.TextUtils;
import com.lynx.react.bridge.JavaOnlyArray;
import com.lynx.tasm.base.TraceEvent;
import defpackage.i0;
import java.util.HashMap;

/* renamed from: X.VLv, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class RunnableC79599VLv implements Runnable {
    public final /* synthetic */ String LJLIL;
    public final /* synthetic */ long LJLILLLLZI;
    public final /* synthetic */ String LJLJI;
    public final /* synthetic */ C79600VLw LJLJJI;

    public final void LIZ() {
        boolean z;
        long j;
        String str = this.LJLIL;
        if (str == null || this.LJLILLLLZI == 0) {
            return;
        }
        this.LJLJJI.getClass();
        boolean z2 = false;
        if (str.startsWith("setup_")) {
            C79600VLw c79600VLw = this.LJLJJI;
            String replace = this.LJLIL.replace("setup_", "");
            long j2 = this.LJLILLLLZI;
            if (c79600VLw.LJIIJ != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                if (replace.endsWith("_ssr")) {
                    java.util.Map<String, Object> map = c79600VLw.LJIIJ;
                    if (map != null) {
                        Object obj = ((HashMap) map).get("ssr_render_page_timing");
                        if (obj instanceof java.util.Map) {
                            ((java.util.Map) obj).put(replace, Long.valueOf(j2));
                        }
                    }
                } else if (replace.equals("layout_start") || replace.equals("layout_end") || replace.equals("ui_operation_flush_start") || replace.equals("ui_operation_flush_end") || replace.equals("draw_end")) {
                    String LJFF = i0.LJFF(replace, "_ssr");
                    java.util.Map<String, Object> map2 = c79600VLw.LJIIJ;
                    if (map2 != null && LJFF != null) {
                        Object obj2 = ((HashMap) map2).get("ssr_render_page_timing");
                        if (obj2 instanceof java.util.Map) {
                            ((java.util.Map) obj2).put(LJFF, Long.valueOf(j2));
                        }
                    }
                }
            }
            if (!replace.endsWith("_ssr")) {
                ((HashMap) c79600VLw.LJ).put(replace, Long.valueOf(j2));
            }
            if (c79600VLw.LJI()) {
                VNU vnu = c79600VLw.LJIIJJI.get();
                if (vnu != null) {
                    if (c79600VLw.LJIIJ != null) {
                        z2 = true;
                    }
                    if (z2) {
                        HashMap hashMap = new HashMap();
                        Object obj3 = ((HashMap) c79600VLw.LJIIJ).get("ssr_render_page_timing");
                        if (obj3 instanceof java.util.Map) {
                            java.util.Map map3 = (java.util.Map) obj3;
                            long LJFF2 = C79600VLw.LJFF("render_page_start_ssr", map3);
                            long LJFF3 = C79600VLw.LJFF("draw_end_ssr", map3);
                            hashMap.put("lynx_tti_ssr", Long.valueOf(Math.max(C79600VLw.LJFF("draw_end", c79600VLw.LJ), C79600VLw.LJFF("load_app_end", c79600VLw.LJ)) - LJFF2));
                            hashMap.put("lynx_fcp_ssr", Long.valueOf(LJFF3 - LJFF2));
                            ((HashMap) c79600VLw.LJIIJ).put("ssr_metrics", hashMap);
                        }
                    }
                    long longValue = ((Long) ((HashMap) c79600VLw.LJ).get("draw_end")).longValue();
                    if (c79600VLw.LIZIZ.booleanValue()) {
                        j = ((Long) ((HashMap) c79600VLw.LJ).get("load_app_end")).longValue();
                    } else {
                        j = 0;
                    }
                    long j3 = c79600VLw.LIZLLL.LIZLLL;
                    if (j3 > 0) {
                        long max = Math.max(longValue, j) - c79600VLw.LIZLLL.LIZLLL;
                        HashMap hashMap2 = (HashMap) c79600VLw.LJII;
                        hashMap2.put("fcp", Long.valueOf(longValue - j3));
                        ((HashMap) c79600VLw.LJII).put("tti", Long.valueOf(max));
                    }
                    if (((HashMap) c79600VLw.LJ).containsKey("load_template_start")) {
                        long longValue2 = ((Long) ((HashMap) c79600VLw.LJ).get("load_template_start")).longValue();
                        long j4 = longValue - longValue2;
                        long max2 = Math.max(longValue, j) - longValue2;
                        ((HashMap) c79600VLw.LJII).put("lynx_fcp", Long.valueOf(j4));
                        ((HashMap) c79600VLw.LJII).put("lynx_tti", Long.valueOf(max2));
                    }
                    VNV vnv = vnu.LJLLL;
                    if (vnv != null) {
                        HashMap<String, Object> LIZLLL = c79600VLw.LIZLLL();
                        TraceEvent.LIZIZ("LynxViewLifecycle.onTimingSetup");
                        vnv.onTimingSetup(LIZLLL);
                        TraceEvent.LJ("LynxViewLifecycle.onTimingSetup");
                    }
                    JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
                    javaOnlyArray.pushMap(c79600VLw.LJ());
                    vnu.LJIIJJI("lynx.performance.timing.onSetup", javaOnlyArray);
                    vnu.LJI().triggerTrailReport();
                }
                c79600VLw.LIZIZ(C79600VLw.LJFF("draw_end", c79600VLw.LJ));
            }
        } else {
            C79600VLw c79600VLw2 = this.LJLJJI;
            String str2 = this.LJLIL;
            c79600VLw2.getClass();
            if (str2.startsWith("update_")) {
                C79600VLw c79600VLw3 = this.LJLJJI;
                String replace2 = this.LJLIL.replace("update_", "");
                long j5 = this.LJLILLLLZI;
                String str3 = this.LJLJI;
                c79600VLw3.getClass();
                if (!TextUtils.isEmpty(str3)) {
                    if (!((HashMap) c79600VLw3.LJFF).containsKey(str3)) {
                        ((HashMap) c79600VLw3.LJFF).put(str3, new HashMap());
                    }
                    java.util.Map map4 = (java.util.Map) ((HashMap) c79600VLw3.LJFF).get(str3);
                    if (!map4.containsKey(replace2)) {
                        map4.put(replace2, Long.valueOf(j5));
                        if ((!c79600VLw3.LIZIZ.booleanValue() && replace2.equals("draw_end")) || map4.size() == 10) {
                            c79600VLw3.LIZJ(str3, map4);
                            ((HashMap) c79600VLw3.LJFF).remove(str3);
                        }
                    }
                }
            } else {
                if (this.LJLIL.equals("prepare_template_start")) {
                    C79598VLu c79598VLu = this.LJLJJI.LIZLLL;
                    if (c79598VLu.LIZLLL == 0) {
                        c79598VLu.LIZLLL = this.LJLILLLLZI;
                    }
                }
                if (this.LJLIL.equals("prepare_template_end")) {
                    C79598VLu c79598VLu2 = this.LJLJJI.LIZLLL;
                    if (c79598VLu2.LJ == 0) {
                        c79598VLu2.LJ = this.LJLILLLLZI;
                    }
                }
            }
        }
        if (!TextUtils.equals("attribute_flag_draw_end", this.LJLJI)) {
            return;
        }
        this.LJLJJI.LIZIZ(this.LJLILLLLZI);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC79599VLv(C79600VLw c79600VLw, String str, long j, String str2) {
        this.LJLJJI = c79600VLw;
        this.LJLIL = str;
        this.LJLILLLLZI = j;
        this.LJLJI = str2;
    }
}
