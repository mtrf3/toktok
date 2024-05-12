package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.126, reason: invalid class name */
/* loaded from: classes.dex */
public final class AnonymousClass126 {
    public static final /* synthetic */ int LIZ = 0;

    public static void LIZ(boolean z, String triggerBusinessName, BFR singleTriggerConfig, long j, String error) {
        o.LJIIIZ(triggerBusinessName, "triggerBusinessName");
        o.LJIIIZ(singleTriggerConfig, "singleTriggerConfig");
        o.LJIIIZ(error, "error");
        JSONObject jSONObject = new JSONObject();
        if (error.length() > 0) {
            jSONObject.putOpt("error_msg", error);
        }
        jSONObject.putOpt("trigger_business_name", triggerBusinessName);
        jSONObject.putOpt("trigger_type", singleTriggerConfig.LJLIL);
        jSONObject.putOpt("rule_name", singleTriggerConfig.LJLILLLLZI);
        jSONObject.putOpt("rules_pkg_name", singleTriggerConfig.LJLJI);
        jSONObject.putOpt("algo_pkg_name", singleTriggerConfig.LJLJJI);
        jSONObject.putOpt("client_log_id", Long.valueOf(j));
        C0K2.LJ("ttlive_trigger_result_monitor", jSONObject, new JSONObject(), new JSONObject());
    }
}
