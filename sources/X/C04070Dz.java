package X;

import android.text.TextUtils;
import java.util.Collection;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0Dz, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C04070Dz {
    public static void onEventExpired(C38531fF c38531fF) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("track_url_list", new JSONArray((Collection) c38531fF.LJFF)).put("is_retry", c38531fF.LJIIIZ);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        LIZ("track_url_expired", c38531fF, jSONObject);
    }

    public static void LIZ(String str, C38531fF c38531fF, JSONObject jSONObject) {
        JSONObject jSONObject2;
        Object opt;
        LIZIZ(jSONObject, "track_url_list", "");
        LIZIZ(jSONObject, "track_status", -1);
        LIZIZ(jSONObject, "ts", Long.valueOf(c38531fF.LJIIIIZZ));
        LIZIZ(jSONObject, "local_time_ms", String.valueOf(System.currentTimeMillis()));
        boolean z = false;
        LIZIZ(jSONObject, "is_retry", 0);
        JSONObject optJSONObject = jSONObject.optJSONObject("ad_extra_data");
        if (optJSONObject == null) {
            optJSONObject = new JSONObject();
        }
        try {
            optJSONObject.put("expire_seconds", c38531fF.LJIILIIL).put("is_c2s_sdk", 1);
            jSONObject.put("ad_extra_data", optJSONObject);
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        InterfaceC23970wr interfaceC23970wr = C35191Zr.LIZIZ().LJI;
        if (interfaceC23970wr == null) {
            return;
        }
        System.currentTimeMillis();
        Object obj = c38531fF.LJIIJ;
        long j = c38531fF.LIZJ;
        Object obj2 = c38531fF.LJI;
        try {
            LIZIZ(jSONObject, "ts", Long.valueOf(c38531fF.LJIIIIZZ));
            jSONObject.put("tag", "track_ad").put("value", j).put("track_label", obj).put("log_extra", obj2).put("category", "event_v3").put("is_ad_event", "1").put("ad_event_type", "monitor");
            AbstractC38911fr abstractC38911fr = C35191Zr.LIZIZ().LJII;
            if (abstractC38911fr != null) {
                jSONObject.put("user_agent", C78555UsJ.LJJIFFI(abstractC38911fr.LJIJJLI()));
            }
            if (!jSONObject.has("ad_extra_data") || (jSONObject2 = jSONObject.optJSONObject("ad_extra_data")) == null) {
                jSONObject2 = new JSONObject();
            }
            JSONObject jSONObject3 = c38531fF.LJII;
            if (jSONObject3 != null) {
                Iterator<String> keys = jSONObject3.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    if (!TextUtils.isEmpty(next) && (opt = jSONObject3.opt(next)) != null && LIZIZ(jSONObject2, next, opt)) {
                        z = true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        if (!c38531fF.LIZLLL) {
            long j2 = c38531fF.LJ;
            if (j2 > 0) {
                jSONObject2.put("non_std_ad_id", j2);
                jSONObject.put("ad_extra_data", jSONObject2);
                interfaceC23970wr.onEventV3(str, jSONObject);
            }
        }
        if (z) {
            jSONObject.put("ad_extra_data", jSONObject2);
        }
        interfaceC23970wr.onEventV3(str, jSONObject);
    }

    public static boolean LIZIZ(JSONObject jSONObject, String str, Object obj) {
        if (jSONObject.has(str)) {
            return false;
        }
        try {
            jSONObject.putOpt(str, obj);
            return true;
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
            return false;
        }
    }
}
