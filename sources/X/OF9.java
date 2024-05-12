package X;

import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public abstract class OF9 {
    public abstract boolean LIZ(C40083FoF c40083FoF);

    public static JSONObject LIZIZ(C40083FoF c40083FoF) {
        Object obj;
        Object LIZIZ;
        JSONObject jSONObject = new JSONObject();
        C40082FoE.LJIIIIZZ(jSONObject, "common_protocol_version", 3);
        C40082FoE.LJIIIIZZ(jSONObject, "common_lux_sdk_version", c40083FoF.LIZIZ("nativeBase.sdk_version"));
        C40082FoE.LJIIIIZZ(jSONObject, "common_hybrid_sdk_version", c40083FoF.LIZIZ("nativeBase.sdk_version"));
        C40082FoE.LJIIIIZZ(jSONObject, "common_full_link_id", c40083FoF.LIZIZ("container_id"));
        Object LIZIZ2 = c40083FoF.LIZIZ("nativeBase.virtual_aid");
        if (LIZIZ2 != null) {
            C40082FoE.LJIIIIZZ(jSONObject, "common_original_aid", LIZIZ2);
        }
        if (o.LJ(c40083FoF.LIZIZ("ev_type"), "custom")) {
            C40082FoE.LJIIIIZZ(jSONObject, "common_bid", c40083FoF.LIZIZ("bid_info.bid"));
            C40082FoE.LJIIIIZZ(jSONObject, "common_bid_setting", c40083FoF.LIZIZ("bid_info.setting_bid"));
        } else {
            C40082FoE.LJIIIIZZ(jSONObject, "common_bid", c40083FoF.LIZIZ("nativeBase.bid_info.bid"));
            C40082FoE.LJIIIIZZ(jSONObject, "common_bid_setting", c40083FoF.LIZIZ("nativeBase.bid_info.setting_bid"));
        }
        C40082FoE.LJIIIIZZ(jSONObject, "common_navigation_id", c40083FoF.LIZIZ("nativeBase.navigation_id"));
        C40082FoE.LJIIIIZZ(jSONObject, "common_pid", c40083FoF.LIZIZ("jsBase.pid"));
        try {
            LIZIZ = c40083FoF.LIZIZ("containerBase.schema");
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
        if (LIZIZ != null) {
            String str = (String) LIZIZ;
            Object LIZIZ3 = c40083FoF.LIZIZ("nativeBase.url");
            if (LIZIZ3 != null) {
                String str2 = (String) LIZIZ3;
                String queryParameter = UriProtector.getQueryParameter(UriProtector.parse(str), "url");
                if (queryParameter != null) {
                    C40082FoE.LJIIIIZZ(jSONObject, "common_url", queryParameter);
                } else {
                    C40082FoE.LJIIIIZZ(jSONObject, "common_url", str2);
                }
                C40082FoE.LJIIIIZZ(jSONObject, "common_schema", str);
                C3C5.m7constructorimpl(jSONObject);
                Object LIZIZ4 = c40083FoF.LIZIZ("nativeBase.container_reuse");
                if (LIZIZ4 != null) {
                    C40082FoE.LJIIIIZZ(jSONObject, "common_container_reuse", LIZIZ4);
                }
                C40082FoE.LJIIIIZZ(jSONObject, "common_web_engine_version", c40083FoF.LIZIZ("nativeBase.web_version"));
                C40082FoE.LJIIIIZZ(jSONObject, "common_native_page", c40083FoF.LIZIZ("nativeBase.native_page"));
                C40082FoE.LJIIIIZZ(jSONObject, "common_container_name", c40083FoF.LIZIZ("containerBase.container_name"));
                Object LIZIZ5 = c40083FoF.LIZIZ("nativeBase.container_type");
                if (o.LJ(LIZIZ5, "lynx")) {
                    obj = c40083FoF.LIZIZ("nativeBase.lynx_version");
                } else if (o.LJ(LIZIZ5, "web")) {
                    obj = c40083FoF.LIZIZ("nativeBase.web_version");
                } else {
                    obj = null;
                }
                C40082FoE.LJIIIIZZ(jSONObject, "common_engine_type", LIZIZ5);
                C40082FoE.LJIIIIZZ(jSONObject, "common_engine_version", obj);
                return jSONObject;
            }
            throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
        }
        throw new C37692Eqm("null cannot be cast to non-null type kotlin.String");
    }

    public static JSONObject LIZJ(C40083FoF c40083FoF) {
        JSONObject jSONObject = new JSONObject();
        Object LIZIZ = c40083FoF.LIZIZ("container_id");
        if (LIZIZ != null && (LIZIZ instanceof String)) {
            java.util.Map LIZJ = OFI.LIZJ((String) LIZIZ);
            C40082FoE.LJIIIIZZ(jSONObject, "container_init", C40082FoE.LIZIZ(LIZJ, "container_init_end", "container_init_start"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_prepare_init_data", C40082FoE.LIZIZ(LIZJ, "prepare_init_data_end", "prepare_init_data_start"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_prepare_component", C40082FoE.LIZIZ(LIZJ, "prepare_component_end", "prepare_component_start"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_prepare_template", C40082FoE.LIZIZ(LIZJ, "prepare_template_end", "prepare_template_start"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_scene", C40082FoE.LIZLLL(LIZJ, WM7.SCENE_SERVICE));
            C40082FoE.LJIIIIZZ(jSONObject, "container_is_fallback", C40082FoE.LIZLLL(LIZJ, "is_fallback"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_invoke_fallback", C40082FoE.LIZLLL(LIZJ, "invoke_fallback"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_fallback_url", C40082FoE.LIZLLL(LIZJ, "fallback_url"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_fallback_error_code", C40082FoE.LIZLLL(LIZJ, "fallback_error_code"));
            C40082FoE.LJIIIIZZ(jSONObject, "container_fallback_error_msg", C40082FoE.LIZLLL(LIZJ, "fallback_error_msg"));
        }
        return jSONObject;
    }

    public static void LIZLLL(String eventName, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        try {
            VMU.LJ(eventName, jSONObject);
            C3C5.m7constructorimpl(C76800UCe.LIZ);
        } catch (Throwable th) {
            C3C5.m7constructorimpl(C141335gf.LIZ(th));
        }
    }
}
