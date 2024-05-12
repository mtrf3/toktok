package X;

import kotlin.jvm.internal.o;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.9nu, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C247749nu {
    public static final /* synthetic */ int LIZ = 0;

    public static void LJ(C95U c95u) {
        String str;
        Integer num;
        Integer num2;
        JSONObject jSONObject = new JSONObject();
        try {
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str = abstractC247499nV.LJIIJ();
            } else {
                str = null;
            }
            jSONObject.put("region", str);
            jSONObject.put("material_id", "");
            if (c95u != null) {
                num = Integer.valueOf(c95u.LIZ);
            } else {
                num = null;
            }
            jSONObject.put("touch_point_id", num);
            if (c95u != null) {
                num2 = c95u.LIZJ;
            } else {
                num2 = null;
            }
            jSONObject.put("launch_plan_id", num2);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("touchpoint_valid_failed_monitor", jSONObject, null, null);
    }

    public static void LIZJ(int i, String taskId) {
        String str;
        o.LJIIIZ(taskId, "taskId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", i);
            jSONObject.put("taskId", taskId);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str = abstractC247499nV.LJIIJ();
            } else {
                str = null;
            }
            jSONObject.put("region", str);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        C09900aA.LJI("campaign_task_finish_monitor", jSONObject, null, null);
    }

    public static /* synthetic */ void LIZIZ(int i, int i2, int i3) {
        LIZ(i, i2, i3, "");
    }

    public static void LIZ(int i, int i2, int i3, String errorMsg) {
        String str;
        o.LJIIIZ(errorMsg, "errorMsg");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("touch_point_id", i2);
            jSONObject.put("launch_plan_id", i3);
            jSONObject.put("material_id", "");
            jSONObject.put("error_msg", errorMsg);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str = abstractC247499nV.LJIIJ();
            } else {
                str = null;
            }
            jSONObject.put("region", str);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("touchpoint_load_resource_monitor", jSONObject, null, null);
    }

    public static void LIZLLL(int i, int i2, int i3, String taskKey) {
        String str;
        o.LJIIIZ(taskKey, "taskKey");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("status", i);
            jSONObject.put("task_id", taskKey);
            jSONObject.put("task_type", i2);
            jSONObject.put("task_time", i3);
            AbstractC247499nV abstractC247499nV = (AbstractC247499nV) C95J.LIZ(0);
            if (abstractC247499nV != null) {
                str = abstractC247499nV.LJIIJ();
            } else {
                str = null;
            }
            jSONObject.put("region", str);
        } catch (JSONException unused) {
        }
        C09900aA.LJI("campaign_task_start_monitor", jSONObject, null, null);
    }
}
