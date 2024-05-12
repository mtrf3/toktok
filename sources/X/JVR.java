package X;

import Y.ARunnableS5S1200000_6;
import Y.ARunnableS9S1100000_8;
import android.text.TextUtils;
import java.util.concurrent.ExecutorService;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class JVR {
    public static ExecutorService LIZIZ() {
        Object value = JNN.LJIILL.getValue();
        o.LJIIIIZZ(value, "<get-executorService>(...)");
        return (ExecutorService) value;
    }

    public static void LIZJ(String str) {
        C50160JmO c50160JmO;
        String str2;
        String str3;
        String str4;
        String str5;
        String str6;
        String str7;
        String str8;
        java.util.Map<String, String> searchTrackMap;
        java.util.Map<String, String> searchTrackMap2;
        if (!C40505Fv3.LIZ) {
            return;
        }
        InterfaceC50157JmL LIZ = K0M.LIZ();
        String str9 = null;
        if (LIZ != null) {
            c50160JmO = LIZ.LIZJ();
        } else {
            c50160JmO = null;
        }
        C50652JuK.Companion.getClass();
        C50321Joz LIZIZ = C50651JuJ.LIZIZ();
        JSONObject jSONObject = new JSONObject();
        if (c50160JmO != null) {
            str2 = c50160JmO.LIZ;
        } else {
            str2 = null;
        }
        jSONObject.put("search_id", str2);
        if (c50160JmO != null) {
            str3 = c50160JmO.LIZIZ;
        } else {
            str3 = null;
        }
        jSONObject.put("search_keyword", str3);
        if (LIZIZ != null) {
            str4 = LIZIZ.getSearchId();
        } else {
            str4 = null;
        }
        jSONObject.put("search_id_x", str4);
        if (LIZIZ != null) {
            str5 = LIZIZ.getSearchKeyword();
        } else {
            str5 = null;
        }
        jSONObject.put("search_keyword_x", str5);
        if (c50160JmO != null) {
            str6 = c50160JmO.LIZJ;
        } else {
            str6 = null;
        }
        jSONObject.put("tns_ban_type", str6);
        if (c50160JmO != null) {
            str7 = c50160JmO.LIZLLL;
        } else {
            str7 = null;
        }
        jSONObject.put("use_scenario", str7);
        if (LIZIZ != null && (searchTrackMap2 = LIZIZ.getSearchTrackMap()) != null) {
            str8 = searchTrackMap2.get("tns_ban_type");
        } else {
            str8 = null;
        }
        jSONObject.put("tns_ban_type_x", str8);
        if (LIZIZ != null && (searchTrackMap = LIZIZ.getSearchTrackMap()) != null) {
            str9 = searchTrackMap.get("use_scenario");
        }
        jSONObject.put("use_scenario_x", str9);
        LIZIZ().execute(new ARunnableS9S1100000_8(jSONObject, str, 18));
    }

    public static boolean LIZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        String optString = jSONObject.optString(str);
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(str);
        LIZ.append("_x");
        if (o.LJ(optString, jSONObject.optString(X1D.LIZIZ(LIZ)))) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(String event, java.util.Set set, JSONObject jSONObject) {
        o.LJIIIZ(event, "event");
        if (!C40505Fv3.LIZ) {
            return;
        }
        LIZIZ().execute(new ARunnableS5S1200000_6(jSONObject, event, set, 14));
    }
}
