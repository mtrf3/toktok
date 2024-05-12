package X;

import com.bytedance.router.monitor.Constants;
import com.bytedance.router.monitor.RouterMonitorListener;
import com.ss.android.common.lib.AppLogNewUtils;
import com.ss.android.ugc.aweme.legoImpl.task.InitRouter;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.O0b, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61197O0b implements RouterMonitorListener {
    @Override // com.bytedance.router.monitor.RouterMonitorListener
    public final void onReportPageJump(boolean z, String str, String str2) {
        if (C09900aA.LIZJ("app_page_jump_classify")) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("target_class", str);
                jSONObject.put("route_host_path", str2);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            C09900aA.LJIIJ("app_page_jump_classify", z ? 1 : 0, jSONObject, null, null);
        }
    }

    @Override // com.bytedance.router.monitor.RouterMonitorListener
    public final void onReport(int i, JSONObject jSONObject, JSONObject jSONObject2, JSONObject jSONObject3) {
        if (C09900aA.LIZJ("app_router_monitor")) {
            C09900aA.LJIIJ("app_router_monitor", i, jSONObject, jSONObject2, jSONObject3);
        }
        if (i == Constants.Companion.getSTATUS_FAIL() && C09900aA.LIZJ("app_router_error")) {
            C09900aA.LJI("app_router_error", jSONObject, jSONObject2, jSONObject3);
        }
        JSONObject jSONObject4 = new JSONObject();
        InitRouter.LIZLLL(jSONObject, jSONObject4);
        InitRouter.LIZLLL(jSONObject2, jSONObject4);
        try {
            jSONObject4.put("params", jSONObject3.optString("params"));
            jSONObject4.put("route_url", jSONObject3.optString("route_url"));
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        AppLogNewUtils.onEventV3("app_router_monitor", jSONObject4);
    }
}
