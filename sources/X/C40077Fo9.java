package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Fo9, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40077Fo9 extends OF9 {
    public static final C40077Fo9 LIZ = new C40077Fo9();

    @Override // X.OF9
    public final boolean LIZ(C40083FoF c40083FoF) {
        if (!o.LJ(c40083FoF.LIZIZ("event_type"), "jsbPerfV2")) {
            return false;
        }
        JSONObject jSONObject = new JSONObject();
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_module_name", c40083FoF.LIZIZ("nativeInfo.info.jsb_module_name"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_method_name", c40083FoF.LIZIZ("nativeInfo.info.jsb_method_name"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_name", c40083FoF.LIZIZ("nativeInfo.info.jsb_name"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_bridgesdk", c40083FoF.LIZIZ("nativeInfo.info.jsb_bridgesdk"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_protocol_verison", c40083FoF.LIZIZ("nativeInfo.info.jsb_protocol_verison"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_call", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_call"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_func_call", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_func_call"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_func_convert_params", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_func_convert_params"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_func_platform_method", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_func_platform_method"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_func_thread_switch", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_func_thread_switch"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_callback_thread_switch", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_callback_thread_switch"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_callback_call", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_callback_call"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_callback_convert_params", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_callback_convert_params"));
        C40082FoE.LJIIIIZZ(jSONObject, "jsb_callback_invoke", c40083FoF.LIZJ(0L, "nativeInfo.perf.jsb_callback_invoke"));
        JSONObject jSONObject2 = new JSONObject();
        C40082FoE.LJIIJJI(jSONObject, C40082FoE.LIZ);
        C40082FoE.LJII(jSONObject2, jSONObject, OF9.LIZIZ(c40083FoF));
        OF9.LIZLLL("bd_hybrid_monitor_jsb_perf", jSONObject2);
        return true;
    }
}
