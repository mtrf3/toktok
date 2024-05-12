package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.FoB, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40079FoB extends OF9 {
    public static final C40079FoB LIZJ = new C40079FoB();
    public static final java.util.Map<String, String> LIZ = E2C.LIZJ("hybrid_monitor_resource_load", "custom_resource_load");
    public static final String[] LIZIZ = {"res_loader_perf", "res_loader_perf_template", "res_loader_error", "res_loader_error_template"};

    @Override // X.OF9
    public final boolean LIZ(C40083FoF c40083FoF) {
        if (o.LJ(c40083FoF.LIZIZ("ev_type"), "custom")) {
            String LIZLLL = c40083FoF.LIZLLL("client_extra.event_name", "");
            java.util.Map<String, String> map = LIZ;
            if (map != null) {
                if (!map.containsKey(LIZLLL)) {
                    return false;
                }
                JSONObject jSONObject = new JSONObject();
                C40082FoE.LJII(jSONObject, c40083FoF.LIZIZ("client_category"), c40083FoF.LIZIZ("client_metric"), OF9.LIZIZ(c40083FoF));
                C40082FoE.LJIIJJI(jSONObject, new InterfaceC88471Ynr[0]);
                StringBuilder LIZ2 = X1D.LIZ();
                LIZ2.append("bd_hybrid_monitor_");
                LIZ2.append(LIZLLL);
                LIZ2.append('}');
                OF9.LIZLLL(X1D.LIZIZ(LIZ2), jSONObject);
            } else {
                throw new C37692Eqm("null cannot be cast to non-null type kotlin.collections.Map<K, *>");
            }
        } else {
            String LIZLLL2 = c40083FoF.LIZLLL("event_type", "");
            if (!ORY.LJJIJIIJIL(LIZLLL2, LIZIZ)) {
                return false;
            }
            JSONObject jSONObject2 = new JSONObject();
            Object LIZIZ2 = c40083FoF.LIZIZ("nativeInfo.res_load_perf");
            JSONObject jSONObject3 = new JSONObject();
            if (LIZIZ2 != null && (LIZIZ2 instanceof JSONObject)) {
                JSONObject jSONObject4 = (JSONObject) LIZIZ2;
                if (jSONObject4.length() > 0) {
                    C40082FoE.LJIIIIZZ(jSONObject3, "res_load_duration", C40082FoE.LIZJ(jSONObject4, "res_load_finish", "res_load_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "init_duration", C40082FoE.LIZJ(jSONObject4, "init_finish", "init_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "memory_duration", C40082FoE.LIZJ(jSONObject4, "memory_finish", "memory_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "gecko_total_duration", C40082FoE.LIZJ(jSONObject4, "gecko_total_finish", "gecko_total_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "gecko_duration", C40082FoE.LIZJ(jSONObject4, "gecko_finish", "gecko_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "gecko_update_duration", C40082FoE.LIZJ(jSONObject4, "gecko_update_finish", "gecko_update_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "cdn_total_duration", C40082FoE.LIZJ(jSONObject4, "cdn_total_finish", "cdn_total_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "cdn_cache_duration", C40082FoE.LIZJ(jSONObject4, "cdn_cache_finish", "cdn_cache_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "cdn_duration", C40082FoE.LIZJ(jSONObject4, "cdn_finish", "cdn_start"));
                    C40082FoE.LJIIIIZZ(jSONObject3, "builtin_duration", C40082FoE.LIZJ(jSONObject4, "builtin_finish", "builtin_start"));
                    Object LJ = C40082FoE.LJ(jSONObject4, "cdn_post_request_body_content_type");
                    if (LJ != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_post_request_body_content_type", LJ);
                    }
                    Object LJ2 = C40082FoE.LJ(jSONObject4, "cdn_response_content_type");
                    if (LJ2 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_response_content_type", LJ2);
                    }
                    Object LJ3 = C40082FoE.LJ(jSONObject4, "cdn_prefetch_start");
                    if (LJ3 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_prefetch_start", LJ3);
                    }
                    Object LJ4 = C40082FoE.LJ(jSONObject4, "cdn_detail_rtt_time");
                    if (LJ4 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_rtt_time", LJ4);
                    }
                    Object LJ5 = C40082FoE.LJ(jSONObject4, "cdn_detail_inner_time");
                    if (LJ5 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_inner_time", LJ5);
                    }
                    Object LJ6 = C40082FoE.LJ(jSONObject4, "cdn_detail_request_filter_time");
                    if (LJ6 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_request_filter_time", LJ6);
                    }
                    Object LJ7 = C40082FoE.LJ(jSONObject4, "cdn_detail_request_serializer_time");
                    if (LJ7 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_request_serializer_time", LJ7);
                    }
                    Object LJ8 = C40082FoE.LJ(jSONObject4, "cdn_detail_response_filter_time");
                    if (LJ8 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_response_filter_time", LJ8);
                    }
                    Object LJ9 = C40082FoE.LJ(jSONObject4, "cdn_detail_response_serializer_time");
                    if (LJ9 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_detail_response_serializer_time", LJ9);
                    }
                    Object LJ10 = C40082FoE.LJ(jSONObject4, "cdn_is_socket_reused");
                    if (LJ10 != null) {
                        C40082FoE.LJIIIIZZ(jSONObject3, "cdn_is_socket_reused", LJ10);
                    }
                }
            }
            C40082FoE.LJII(jSONObject2, c40083FoF.LIZIZ("nativeInfo.res_loader_info"), c40083FoF.LIZIZ("nativeInfo.res_info"), jSONObject3, c40083FoF.LIZIZ("nativeInfo.res_load_error"), OF9.LIZIZ(c40083FoF));
            StringBuilder LIZ3 = X1D.LIZ();
            LIZ3.append("bd_hybrid_monitor_");
            LIZ3.append(LIZLLL2);
            OF9.LIZLLL(X1D.LIZIZ(LIZ3), jSONObject2);
        }
        return true;
    }
}
