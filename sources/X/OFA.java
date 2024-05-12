package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class OFA extends OF9 {
    public static final OFA LIZIZ = new OFA();
    public static final OFJ<String, JSONObject> LIZ = new OFJ<>(64, C40085FoH.LJLIL);

    public static JSONObject LJ(String str) {
        return (JSONObject) OFJ.LIZ(LIZ, str);
    }

    @Override // X.OF9
    public final boolean LIZ(C40083FoF c40083FoF) {
        String LIZLLL = c40083FoF.LIZLLL("nativeBase.container_type", "");
        String LIZLLL2 = c40083FoF.LIZLLL("nativeBase.navigation_id", "");
        String LIZLLL3 = c40083FoF.LIZLLL("container_id", "");
        String LIZLLL4 = c40083FoF.LIZLLL("nativeBase.url", "");
        boolean LJ = o.LJ(LIZLLL, "lynx");
        boolean LJ2 = o.LJ(LIZLLL, "web");
        Object LIZIZ2 = c40083FoF.LIZIZ("event_type");
        if (o.LJ(LIZIZ2, "newcustom")) {
            return false;
        }
        if (o.LJ(LIZIZ2, "containerError")) {
            C40082FoE.LJFF("container_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "nativeError")) {
            C40082FoE.LJFF("native_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "js_exception")) {
            C40082FoE.LJFF("js_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "static")) {
            C40082FoE.LJFF("static_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "jsbError")) {
            C40082FoE.LJFF("jsb_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "fetchError")) {
            C40082FoE.LJFF("fetch_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "res_loader_error_template")) {
            C40082FoE.LJFF("rl_temp_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "res_loader_error")) {
            C40082FoE.LJFF("rl_error_count", LJ(LIZLLL2));
            return false;
        }
        if (o.LJ(LIZIZ2, "blank")) {
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeInfo.max_blank_rect_radio", C40084FoG.LIZJ(c40083FoF, "nativeInfo.cost_time", C40084FoG.LIZJ(c40083FoF, "nativeInfo.detect_start_time", C40084FoG.LIZJ(c40083FoF, "nativeInfo.view_height", C40084FoG.LIZJ(c40083FoF, "nativeInfo.view_width", C40084FoG.LIZJ(c40083FoF, "nativeInfo.view_alpha", C40084FoG.LIZJ(c40083FoF, "nativeInfo.element_count", C40084FoG.LIZJ(c40083FoF, "nativeInfo.transport_rtt_ms", C40084FoG.LIZJ(c40083FoF, "nativeInfo.http_rtt_ms", C40084FoG.LIZJ(c40083FoF, "nativeInfo.bitmap_height", C40084FoG.LIZJ(c40083FoF, "nativeInfo.bitmap_width", C40084FoG.LIZJ(c40083FoF, "nativeInfo.bitmap", LJ(LIZLLL2), "bitmap", LIZLLL2), "bitmap_width", LIZLLL2), "bitmap_height", LIZLLL2), "ttnet_http_rtt", LIZLLL2), "ttnet_trans_rtt", LIZLLL2), "view_element_count", LIZLLL2), "view_alpha", LIZLLL2), "view_width", LIZLLL2), "view_height", LIZLLL2), "blank_detect_ts", LIZLLL2), "blank_cost_time", LIZLLL2), "max_blank_proportion", LIZLLL2), "effective_proportion", c40083FoF.LIZIZ("nativeInfo.effective_percentage"));
            Long LIZJ = c40083FoF.LIZJ(0L, "nativeInfo.detect_start_time");
            if (LIZJ != null) {
                long longValue = LIZJ.longValue();
                Long LIZJ2 = c40083FoF.LIZJ(0L, "nativeBase.click_start");
                if (LIZJ2 != null) {
                    C40082FoE.LJIIIIZZ(LJ(LIZLLL2), "load_to_blank_time", Long.valueOf(longValue - LIZJ2.longValue()));
                    if (LJ2) {
                        C40082FoE.LJIIJ(LJ(LIZLLL2), "is_web_blank", Boolean.valueOf(o.LJ(c40083FoF.LIZIZ("nativeInfo.is_blank"), 1)));
                    }
                    if (!LJ) {
                        return false;
                    }
                    JSONObject LJ3 = LJ(LIZLLL2);
                    C40082FoE.LJIIJJI(LJ3, C40082FoE.LIZ);
                    VMU.LJ("bd_hybrid_monitor_all_in_one", LJ3);
                    LIZ.remove(LIZLLL2);
                    return false;
                }
                o.LJIIZILJ();
                throw null;
            }
            o.LJIIZILJ();
            throw null;
        }
        if (o.LJ(LIZIZ2, "performance") || o.LJ(LIZIZ2, "perf")) {
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "extra.first_load", C40084FoG.LIZJ(c40083FoF, "nativeInfo.fmp", C40084FoG.LIZJ(c40083FoF, "nativeInfo.storage_ts", C40084FoG.LIZJ(c40083FoF, "nativeInfo.show_end", C40084FoG.LIZJ(c40083FoF, "nativeInfo.show_end", C40084FoG.LIZJ(c40083FoF, "nativeInfo.load_start", C40084FoG.LIZJ(c40083FoF, "nativeInfo.load_start", C40084FoG.LIZJ(c40083FoF, "nativeInfo.state", LJ(LIZLLL2), "load_state", LIZLLL2), "session_start", LIZLLL2), "page_start", LIZLLL2), "session_end", LIZLLL2), "page_finish", LIZLLL2), "storage_ts", LIZLLL2), "fmp", LIZLLL2), "common_first_load", LIZLLL2), "actual_fmp", c40083FoF.LIZ(0L, "nativeInfo.update_timings.__lynx_timing_actual_fmp.draw_end", "nativeInfo.setup_timings.preprare_template_start"));
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeInfo.attach_ts", LJ(LIZLLL2), "attach_ts", LIZLLL2), "detach_ts", c40083FoF.LIZIZ("nativeInfo.detach_ts"));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_protocol_version", "4");
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_hybrid_sdk_version", "1.5.14-rc.16-oversea");
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_lux_sdk_version", "1.5.14-rc.16-oversea");
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_original_aid", c40083FoF.LIZIZ("nativeBase.virtual_aid"));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_navigation_id", LIZLLL2);
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_url", LIZLLL4);
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_format_path", C62612cz.LIZ(LIZLLL4));
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeBase.container_reuse", C40084FoG.LIZJ(c40083FoF, "jsBase.release", LJ(LIZLLL2), "common_scm", LIZLLL2), "common_container_reuse", LIZLLL2), "common_new_install", Boolean.valueOf(!OFT.LIZ()));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_native_page", c40083FoF.LIZIZ("nativeBase.native_page"));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_engine_type", LIZLLL);
            JSONObject putIfNotNull = C40084FoG.LIZJ(c40083FoF, "nativeBase.is_first_load", LJ(LIZLLL2), "common_first_load", LIZLLL2);
            Boolean valueOf = Boolean.valueOf(LJ);
            Object LIZIZ3 = c40083FoF.LIZIZ("nativeBase.lynx_version");
            o.LJIIJ(putIfNotNull, "$this$putIfNotNull");
            if (valueOf != null && valueOf.booleanValue()) {
                C40082FoE.LJIIJ(putIfNotNull, "common_engine_version", LIZIZ3);
            }
            JSONObject putIfNotNull2 = LJ(LIZLLL2);
            Boolean valueOf2 = Boolean.valueOf(LJ2);
            Object LIZIZ4 = c40083FoF.LIZIZ("nativeBase.web_version");
            o.LJIIJ(putIfNotNull2, "$this$putIfNotNull");
            if (valueOf2 != null && valueOf2.booleanValue()) {
                C40082FoE.LJIIJ(putIfNotNull2, "common_engine_version", LIZIZ4);
            }
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_bid", VMV.LIZJ(c40083FoF));
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeBase.bid_info.bid", C40084FoG.LIZJ(c40083FoF, "jsBase.pid", LJ(LIZLLL2), "common_pid", LIZLLL2), "common_bid", LIZLLL2), "open_time", c40083FoF.LIZJ(0L, "containerInfo.open_time"));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_scene", String.valueOf(c40083FoF.LIZJ(0L, "containerBase.scene")));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_schema", c40083FoF.LIZLLL("containerBase.schema", ""));
            C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "extra.context_for_tea", C40084FoG.LIZJ(c40083FoF, "extra.navigation_type", C40084FoG.LIZJ(c40083FoF, "containerBase.container_version", C40084FoG.LIZJ(c40083FoF, "containerBase.container_name", LJ(LIZLLL2), "common_container_name", LIZLLL2), "common_container_ver", LIZLLL2), "navigation_type", LIZLLL2), "context", LIZLLL2), "common_parent_url", c40083FoF.LIZIZ("extra.parent_url"));
            C40082FoE.LJIIJ(LJ(LIZLLL2), "common_container_id", LIZLLL3);
            if (!LJ2) {
                return false;
            }
            JSONObject LJ4 = LJ(LIZLLL2);
            C40082FoE.LJIIJJI(LJ4, C40082FoE.LIZ);
            VMU.LJ("bd_hybrid_monitor_all_in_one", LJ4);
            LIZ.remove(LIZLLL2);
            return false;
        }
        if (!o.LJ(LIZIZ2, "res_loader_perf_template")) {
            return false;
        }
        C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_loader_info.res_loader_version", C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_loader_info.res_loader_name", LJ(LIZLLL2), "res_loader_name", LIZLLL2), "res_loader_version", LIZLLL2), "template_res_version", String.valueOf(c40083FoF.LIZLLL("nativeInfo.res_info.res_version", "")));
        C40082FoE.LJIIJ(C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_info.gecko_bundle", C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_info.gecko_channel", C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_info.gecko_access_key", C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_info.res_from", C40084FoG.LIZJ(c40083FoF, "nativeInfo.res_info.res_state", LJ(LIZLLL2), "template_res_state", LIZLLL2), "template_res_from", LIZLLL2), "template_gecko_ak", LIZLLL2), "template_gecko_channel", LIZLLL2), "template_gecko_bundle", LIZLLL2), "template_fetcher_list", c40083FoF.LIZIZ("nativeInfo.res_info.fetcher_list"));
        return false;
    }
}
