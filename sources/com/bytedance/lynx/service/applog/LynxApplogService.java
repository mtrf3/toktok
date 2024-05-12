package com.bytedance.lynx.service.applog;

import X.C40033FnR;
import X.C79593VLp;
import X.InterfaceC79400VEe;
import com.ss.android.common.applog.AppLog;
import com.ss.android.common.lib.AppLogNewUtils;
import java.util.Iterator;
import java.util.Map;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes15.dex */
public final class LynxApplogService implements InterfaceC79400VEe {
    public static final LynxApplogService INSTANCE = new LynxApplogService();
    public static C40033FnR lynxServiceConfig;

    @Override // X.InterfaceC79400VEe
    public String getDeviceID() {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (serverDeviceId != null) {
            return serverDeviceId;
        }
        return "";
    }

    public final void initialize(C40033FnR lynxConfig) {
        o.LJIIJ(lynxConfig, "lynxConfig");
        lynxServiceConfig = lynxConfig;
    }

    @Override // X.InterfaceC79400VEe
    public void onTimingSetup(Map<String, Object> timingInfo, JSONObject jSONObject) {
        long j;
        Long l;
        Long l2;
        long j2;
        Long l3;
        Long l4;
        Long l5;
        Long l6;
        Long l7;
        Long l8;
        Long l9;
        Long l10;
        Long l11;
        Long l12;
        Long l13;
        Long l14;
        Long l15;
        Long l16;
        Long l17;
        Long l18;
        Long l19;
        Long l20;
        Long l21;
        Long l22;
        Long l23;
        Long l24;
        Long l25;
        Long l26;
        Long l27;
        Long l28;
        o.LJIIJ(timingInfo, "timingInfo");
        JSONObject jSONObject2 = new JSONObject();
        Map map = (Map) timingInfo.get("setup_timing");
        Map map2 = (Map) timingInfo.get("extra_timing");
        Map map3 = (Map) timingInfo.get("metrics");
        long j3 = -1;
        if (map3 != null && (l28 = (Long) map3.get("lynx_tti")) != null) {
            j = l28.longValue();
        } else {
            j = -1;
        }
        jSONObject2.put("lynx_tti", j);
        if (map3 != null && (l27 = (Long) map3.get("lynx_fcp")) != null) {
            j3 = l27.longValue();
        }
        jSONObject2.put("lynx_fcp", j3);
        Long l29 = null;
        if (map != null) {
            l = (Long) map.get("lepus_excute_start");
            l2 = (Long) map.get("lepus_excute_end");
        } else {
            l = null;
            l2 = null;
        }
        jSONObject2.put("setup_lepus_execute", C79593VLp.LIZ(l, l2));
        long j4 = 0;
        if (map != null && (l26 = (Long) map.get("ui_operation_flush_end")) != null) {
            j2 = l26.longValue();
        } else {
            j2 = 0;
        }
        if (map != null && (l25 = (Long) map.get("load_template_start")) != null) {
            j4 = l25.longValue();
        }
        if (j2 < j4) {
            j2 = j4;
        }
        Long valueOf = Long.valueOf(j2);
        if (map != null) {
            l3 = (Long) map.get("draw_end");
        } else {
            l3 = null;
        }
        jSONObject2.put("setup_draw_waiting", C79593VLp.LIZ(valueOf, l3));
        if (map != null) {
            l4 = (Long) map.get("dispatch_start");
            l5 = (Long) map.get("dispatch_end");
        } else {
            l4 = null;
            l5 = null;
        }
        jSONObject2.put("setup_dispatch", C79593VLp.LIZ(l4, l5));
        if (map != null) {
            l6 = (Long) map.get("create_lynx_start");
        } else {
            l6 = null;
        }
        if (map != null) {
            l7 = (Long) map.get("create_lynx_end");
        } else {
            l7 = null;
        }
        jSONObject2.put("create_lynx_view", C79593VLp.LIZ(l6, l7));
        if (map != null) {
            l8 = (Long) map.get("load_core_start");
            l9 = (Long) map.get("load_core_end");
        } else {
            l8 = null;
            l9 = null;
        }
        jSONObject2.put("load_core", C79593VLp.LIZ(l8, l9));
        if (map != null) {
            l10 = (Long) map.get("layout_start");
            l11 = (Long) map.get("layout_end");
        } else {
            l10 = null;
            l11 = null;
        }
        jSONObject2.put("setup_layout", C79593VLp.LIZ(l10, l11));
        if (map != null) {
            l12 = (Long) map.get("decode_start");
            l13 = (Long) map.get("decode_end");
        } else {
            l12 = null;
            l13 = null;
        }
        jSONObject2.put("decode", C79593VLp.LIZ(l12, l13));
        if (map != null) {
            l14 = (Long) map.get("load_app_start");
            l15 = (Long) map.get("load_app_end");
        } else {
            l14 = null;
            l15 = null;
        }
        jSONObject2.put("load_app", C79593VLp.LIZ(l14, l15));
        if (map != null) {
            l16 = (Long) map.get("ui_operation_flush_start");
            l17 = (Long) map.get("ui_operation_flush_end");
        } else {
            l16 = null;
            l17 = null;
        }
        jSONObject2.put("setup_ui_operation_flush", C79593VLp.LIZ(l16, l17));
        if (map != null) {
            l18 = (Long) map.get("load_template_start");
            l19 = (Long) map.get("load_template_end");
        } else {
            l18 = null;
            l19 = null;
        }
        jSONObject2.put("load_template", C79593VLp.LIZ(l18, l19));
        if (map != null) {
            l20 = (Long) map.get("create_vdom_start");
            l21 = (Long) map.get("create_vdom_end");
        } else {
            l20 = null;
            l21 = null;
        }
        jSONObject2.put("setup_create_vdom", C79593VLp.LIZ(l20, l21));
        if (map2 != null) {
            l22 = (Long) map2.get("prepare_template_start");
            l23 = (Long) map2.get("prepare_template_end");
        } else {
            l22 = null;
            l23 = null;
        }
        jSONObject2.put("prepare_template", C79593VLp.LIZ(l22, l23));
        if (map != null) {
            l24 = (Long) map.get("create_lynx_end");
            l29 = (Long) map.get("load_template_start");
        } else {
            l24 = null;
        }
        jSONObject2.put("setup_load_template_waiting", C79593VLp.LIZ(l24, l29));
        onReportEvent("lynxsdk_setup_timing", jSONObject2, jSONObject);
    }

    @Override // X.InterfaceC79400VEe
    public void onReportEvent(String eventName, JSONObject data, JSONObject jSONObject) {
        o.LJIIJ(eventName, "eventName");
        o.LJIIJ(data, "data");
        if (jSONObject != null) {
            Iterator<String> keys = jSONObject.keys();
            o.LJFF(keys, "extraData.keys()");
            while (keys.hasNext()) {
                String next = keys.next();
                if (!data.has(next)) {
                    data.put(next, jSONObject.get(next));
                }
            }
        }
        AppLogNewUtils.onEventV3(eventName, data);
    }

    @Override // X.InterfaceC79400VEe
    public void onTimingUpdate(Map<String, Object> timingInfo, Map<String, Long> updateTiming, JSONObject jSONObject) {
        long j;
        Long l;
        Long l2;
        o.LJIIJ(timingInfo, "timingInfo");
        o.LJIIJ(updateTiming, "updateTiming");
        JSONObject jSONObject2 = new JSONObject();
        Map map = (Map) timingInfo.get("metrics");
        Map map2 = (Map) timingInfo.get("setup_timing");
        if (map != null && (l2 = (Long) map.get("lynx_actual_fmp")) != null) {
            j = l2.longValue();
        } else {
            j = -1;
        }
        jSONObject2.put("lynx_actualfmp", j);
        jSONObject2.put("update_create_vdom", C79593VLp.LIZ(updateTiming.get("create_vdom_start"), updateTiming.get("create_vdom_end")));
        jSONObject2.put("update_dispatch", C79593VLp.LIZ(updateTiming.get("dispatch_start"), updateTiming.get("dispatch_end")));
        jSONObject2.put("update_layout", C79593VLp.LIZ(updateTiming.get("layout_start"), updateTiming.get("layout_end")));
        jSONObject2.put("update_ui_operation_flush", C79593VLp.LIZ(updateTiming.get("ui_operation_flush_start"), updateTiming.get("ui_operation_flush_end")));
        jSONObject2.put("update_draw_waiting", C79593VLp.LIZ(updateTiming.get("ui_operation_flush_end"), updateTiming.get("draw_end")));
        jSONObject2.put("update_trigger_waiting", C79593VLp.LIZ(updateTiming.get("set_state_trigger"), updateTiming.get("create_vdom_start")));
        if (map2 != null) {
            l = (Long) map2.get("draw_end");
        } else {
            l = null;
        }
        jSONObject2.put("update_waiting", C79593VLp.LIZ(l, updateTiming.get("set_state_trigger")));
        jSONObject2.put("update_timing", C79593VLp.LIZ(updateTiming.get("set_state_trigger"), updateTiming.get("draw_end")));
        onReportEvent("lynxsdk_update_timing", jSONObject2, jSONObject);
    }
}
