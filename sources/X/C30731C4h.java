package X;

import Y.AObjectS28S0000000_5;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.android.livesdk.performance.LivePerformanceManager;
import java.util.HashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.internal.o;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.C4h, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30731C4h {
    public static double LIZIZ;
    public static double LIZJ;
    public static double LIZLLL;
    public static double LJ;
    public static double LJFF;
    public static int LJI;
    public static int LJII;
    public static int LJIIIIZZ;
    public static int LJIIIZ;
    public static int LJIIJ;
    public static int LJIIJJI;
    public static int LJIIL;
    public static int LJIILIIL;
    public static int LJIILJJIL;
    public static int LJIILL;
    public static int LJIILLIIL;
    public static volatile String LJIIZILJ;
    public static volatile String LJIJ;
    public static volatile String LJIJI;
    public static volatile String LJIJJ;
    public static volatile String LJIJJLI;
    public static volatile String LJIL;
    public static volatile String LJJ;
    public static volatile String LJJI;
    public static volatile boolean LJJIFFI;
    public static final CHK LIZ = new CHK("live_fluency_broadcast_enter_new", 1, null, 12);
    public static final AObjectS28S0000000_5 LJJII = new AObjectS28S0000000_5(0);

    public static void LIZJ() {
        LJJIFFI = true;
        LIZ.start();
        LivePerformanceManager LIZ2 = B4U.LIZ();
        AObjectS28S0000000_5 onReportListener = LJJII;
        LIZ2.getClass();
        o.LJIIIZ(onReportListener, "onReportListener");
        ((CopyOnWriteArrayList) LIZ2.LLIIZ).add(onReportListener);
        C15610jN.LIZ().postDelayed(C2P.LJLIL, 20000L);
    }

    public static void LIZLLL() {
        LJJIFFI = false;
        LivePerformanceManager LIZ2 = B4U.LIZ();
        AObjectS28S0000000_5 onReportListener = LJJII;
        LIZ2.getClass();
        o.LJIIIZ(onReportListener, "onReportListener");
        ((CopyOnWriteArrayList) LIZ2.LLIIZ).remove(onReportListener);
        CHK chk = LIZ;
        HashMap hashMap = new HashMap();
        hashMap.put("push_fps", String.valueOf(LIZIZ));
        hashMap.put("preview_fps", String.valueOf(LIZJ));
        hashMap.put("in_cap_fps", String.valueOf(LIZLLL));
        hashMap.put("out_cap_fps", String.valueOf(LJ));
        hashMap.put("encode_fps", String.valueOf(LJFF));
        hashMap.put("camera_capture_time", String.valueOf(LJI));
        hashMap.put("camera_to_processor_latency", String.valueOf(LJII));
        hashMap.put("update_tex_image_time", String.valueOf(LJIIIIZZ));
        hashMap.put("oes_to_2d_time", String.valueOf(LJIIIZ));
        hashMap.put("effect_process_time", String.valueOf(LJIIJ));
        hashMap.put("after_effect_gl_finish_time", String.valueOf(LJIIJJI));
        hashMap.put("post_process_algorithm_time", String.valueOf(LJIIL));
        hashMap.put("process_to_render_latency", String.valueOf(LJIILIIL));
        hashMap.put("render_time", String.valueOf(LJIILJJIL));
        hashMap.put("process_to_encoder_latency", String.valueOf(LJIILL));
        hashMap.put("encoder_draw_surface_time", String.valueOf(LJIILLIIL));
        String str = LJIIZILJ;
        String str2 = "-999";
        if (str == null) {
            str = "-999";
        }
        hashMap.put("cpu_cores", str);
        String str3 = LJIJ;
        if (str3 == null) {
            str3 = "-999";
        }
        hashMap.put("cpu_rate", str3);
        String str4 = LJIJI;
        if (str4 == null) {
            str4 = "-999";
        }
        hashMap.put("cpu_speed", str4);
        String str5 = LJIJJ;
        if (str5 == null) {
            str5 = "-999";
        }
        hashMap.put("single_cores_cpu_speed", str5);
        String str6 = LJIJJLI;
        if (str6 == null) {
            str6 = "-999";
        }
        hashMap.put("app_max_memory", str6);
        String str7 = LJIL;
        if (str7 == null) {
            str7 = "-999";
        }
        hashMap.put("memory_app_allocate", str7);
        String str8 = LJJ;
        if (str8 == null) {
            str8 = "-999";
        }
        hashMap.put("memory_usage_rate_android", str8);
        String str9 = LJJI;
        if (str9 != null) {
            str2 = str9;
        }
        hashMap.put("pss_app_usage", str2);
        chk.LJIILLIIL = hashMap;
        chk.stop();
        LIZIZ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LIZJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LIZLLL = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LJ = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LJFF = LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX;
        LJI = 0;
        LJII = 0;
        LJIIIIZZ = 0;
        LJIIIZ = 0;
        LJIIJ = 0;
        LJIIJJI = 0;
        LJIIL = 0;
        LJIILIIL = 0;
        LJIILJJIL = 0;
        LJIILL = 0;
        LJIILLIIL = 0;
        LJIIZILJ = null;
        LJIJ = null;
        LJIJI = null;
        LJIJJ = null;
        LJIJJLI = null;
        LJIL = null;
        LJJ = null;
        LJJI = null;
    }

    public static Double LIZ(JSONObject jSONObject, String str, double d) {
        Double valueOf = Double.valueOf(jSONObject.optDouble(str, -1.0d));
        if (valueOf.doubleValue() == -1.0d && !(!true)) {
            return null;
        }
        double doubleValue = valueOf.doubleValue();
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(" = ");
        LIZ2.append(doubleValue);
        LIZ2.append(", value = ");
        LIZ2.append(d);
        C0NB.LJ("push_params", X1D.LIZIZ(LIZ2));
        if (d != LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX) {
            doubleValue = (d + doubleValue) / 2;
        }
        return Double.valueOf(doubleValue);
    }

    public static Integer LIZIZ(int i, int i2, JSONArray jSONArray) {
        Integer valueOf = Integer.valueOf(jSONArray.optInt(i, -1));
        if (valueOf.intValue() != -1 || 0 != 0) {
            int intValue = valueOf.intValue();
            if (i2 != 0) {
                intValue = (i2 + intValue) / 2;
            }
            return Integer.valueOf(intValue);
        }
        return null;
    }
}
