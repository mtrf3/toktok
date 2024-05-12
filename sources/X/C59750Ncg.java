package X;

import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.Ncg, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59750Ncg implements InterfaceC58235MtL {
    @Override // X.InterfaceC58235MtL
    public final void LIZ(JSONObject jSONObject) {
        FUA.LIZIZ("service_monitor", "hybrid_ttwebview_monitor", jSONObject);
    }

    @Override // X.InterfaceC58235MtL
    public final void LIZIZ(Integer num, JSONObject jSONObject, boolean z) {
        JSONObject jSONObject2;
        int i;
        JSONObject optJSONObject;
        if (z) {
            jSONObject2 = jSONObject;
        } else {
            jSONObject2 = new JSONObject();
            try {
                jSONObject.put("tag", "ttlive_sdk");
            } catch (Exception unused) {
            }
            try {
                jSONObject2.put("aid", String.valueOf(EF7.LJIIIZ));
            } catch (Exception unused2) {
            }
            try {
                jSONObject2.put("extra", jSONObject);
            } catch (Exception unused3) {
            }
        }
        JSONObject optJSONObject2 = jSONObject.optJSONObject("extra");
        if (optJSONObject2 != null && (optJSONObject = optJSONObject2.optJSONObject("client_category")) != null && o.LJ(optJSONObject.optString("type"), "lynx")) {
            try {
                C32049Chx.LIZ(optJSONObject, optJSONObject2.optJSONObject("client_metric"), optJSONObject2.optJSONObject("client_extra"));
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        if (num != null) {
            i = num.intValue();
        } else {
            i = 1;
        }
        C09900aA.LJIIIZ("bd_hybrid_monitor_service_all_in_one", i, null, jSONObject2);
    }

    @Override // X.InterfaceC58235MtL
    public final void LIZLLL(Exception exc, String message, java.util.Map<String, String> map) {
        o.LJIIIZ(message, "message");
        PEH.LJ(exc, message, map);
    }
}
