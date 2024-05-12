package X;

import android.text.TextUtils;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.QJd, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C66789QJd {
    public static volatile C66789QJd LIZIZ;
    public final java.util.Map<String, java.util.Map<String, QXX>> LIZ = new ConcurrentHashMap();

    public static C66789QJd LIZIZ() {
        if (LIZIZ == null) {
            synchronized (C66789QJd.class) {
                if (LIZIZ == null) {
                    LIZIZ = new C66789QJd();
                }
            }
        }
        return LIZIZ;
    }

    public final C66809QJx LIZ(int i) {
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        if (map.get("activate") == null) {
            map.put("activate", new C66809QJx());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), map);
        }
        return (C66809QJx) map.get("activate");
    }

    public final QK1 LIZJ(int i) {
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        if (map.get("params") == null) {
            map.put("params", new QK1());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), map);
        }
        return (QK1) map.get("params");
    }

    public final C66808QJw LIZLLL(int i) {
        java.util.Map map = (java.util.Map) ((ConcurrentHashMap) this.LIZ).get(String.valueOf(i));
        if (map == null) {
            map = new ConcurrentHashMap();
        }
        if (map.get("register") == null) {
            map.put("register", new C66808QJw());
            ((ConcurrentHashMap) this.LIZ).put(String.valueOf(i), map);
        }
        return (C66808QJw) map.get("register");
    }

    public static void LJ(QIF qif, JSONObject jSONObject, JSONObject jSONObject2) {
        boolean z;
        JSONObject jSONObject3 = new JSONObject();
        if (jSONObject2 != null && !TextUtils.isEmpty(jSONObject2.optString("device_id_str"))) {
            z = true;
        } else {
            z = false;
        }
        boolean isEmpty = TextUtils.isEmpty(jSONObject.optString("install_id"));
        boolean isEmpty2 = TextUtils.isEmpty(jSONObject.optString("device_id"));
        try {
            jSONObject3.put("reqeust_did_success", z);
            jSONObject3.put("empty_iid", isEmpty);
            jSONObject3.put("empty_did", isEmpty2);
            QKJ qkj = C66794QJi.LIZIZ;
            if (qkj != null && !qkj.LJII) {
                jSONObject3.put("gaid_sys_call_ts", qkj.LIZIZ - qkj.LIZ);
                jSONObject3.put("gaid_file_load_ts", qkj.LIZLLL - qkj.LIZJ);
                jSONObject3.put("gaid_save_ts", qkj.LJFF - qkj.LJ);
                jSONObject3.put("dr_gaid", (Object) null);
                jSONObject3.put("support_gaid", !qkj.LJI);
                qkj.LJII = true;
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        ((QJD) qif.LJJIII).LIZ.getClass();
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("did_fetch_result, ");
        LIZ.append(jSONObject3);
        X1D.LIZIZ(LIZ);
    }
}
