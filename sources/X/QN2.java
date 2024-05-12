package X;

import android.app.Activity;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicFloatWindowOptimizeSetting;
import com.bytedance.mt.protector.impl.JSONObjectProtectorUtils;
import java.util.HashMap;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QN2 {
    public static long LIZ;
    public static final java.util.Map<String, Double> LIZIZ;

    static {
        HashMap hashMap = new HashMap();
        LIZIZ = hashMap;
        Double valueOf = Double.valueOf(LivesdkLinkmicFloatWindowOptimizeSetting.CORNER_RADIUS_PX);
        hashMap.put("init", valueOf);
        hashMap.put("setting", valueOf);
    }

    public static double LIZIZ(JSONObject jSONObject) {
        String str;
        double doubleValue;
        try {
            str = JSONObjectProtectorUtils.getString(jSONObject, "key");
        } catch (JSONException unused) {
            str = null;
        }
        java.util.Map<String, Double> map = LIZIZ;
        synchronized (map) {
            Double d = (Double) ((HashMap) map).get(str);
            if (d == null) {
                doubleValue = 1.0d;
            } else {
                doubleValue = d.doubleValue();
            }
        }
        return doubleValue;
    }

    public static void LIZJ(String str, JSONObject jSONObject) {
        QN3 qn3;
        Activity activity;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        double LIZIZ2 = LIZIZ(jSONObject);
        if (LIZIZ2 < 1.0d && Math.random() >= LIZIZ2) {
            return;
        }
        try {
            jSONObject.put("sampling_rate", LIZIZ2);
        } catch (Exception unused) {
        }
        QN4 qn4 = OIP.LIZ.LIZ;
        if (qn4 == null || (qn3 = qn4.LJIILLIIL) == null) {
            return;
        }
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!jSONObject.has("time")) {
                jSONObject.put("time", currentTimeMillis);
            }
            LIZ(jSONObject, "params_for_special", "turing");
            LIZ(jSONObject, "sdk_version", "2.3.3.i18n");
            LIZ(jSONObject, "did", qn4.LJIIIIZZ);
            LIZ(jSONObject, "device_brand", qn4.LJIIIZ);
            LIZ(jSONObject, "device_model", qn4.LJIIJ);
            if (!jSONObject.has("os_type")) {
                jSONObject.put("os_type", 0);
            }
            LIZ(jSONObject, "os_name", "Android");
            LIZ(jSONObject, "os_version", QN4.LJJ);
            LIZ(jSONObject, "host_app_id", qn4.LIZIZ);
            LIZ(jSONObject, "aid", qn4.LIZIZ);
            LIZ(jSONObject, "app_name", qn4.LIZLLL);
            LIZ(jSONObject, "app_version", qn4.LJII);
            LIZ(jSONObject, "appkey", qn4.LJFF);
            LIZ(jSONObject, "iid", qn4.LJI);
            LIZ(jSONObject, "session_id", qn4.LJIJJLI);
            String str2 = null;
            LIZ(jSONObject, "uid", null);
            LIZ(jSONObject, "region", qn4.LIZ);
            LIZ(jSONObject, "lang", qn4.LIZJ);
            LIZ(jSONObject, "locale", qn4.LIZ());
            LIZ(jSONObject, "mode", qn4.LJIILJJIL);
            LIZ(jSONObject, "channel", qn4.LJ);
            InterfaceC64782Pbe interfaceC64782Pbe = qn4.LJIL;
            if (interfaceC64782Pbe != null && (activity = interfaceC64782Pbe.getActivity()) != null) {
                str2 = C78840Uwu.LJIIZILJ(activity);
            }
            LIZ(jSONObject, "resolution", str2);
            double LIZIZ3 = LIZIZ(jSONObject);
            if (!jSONObject.has("sampling_rate")) {
                jSONObject.put("sampling_rate", LIZIZ3);
            }
            qn3.onEvent(str, jSONObject);
            if (C61349O5x.LIZ()) {
                jSONObject.toString();
            }
        } catch (Exception e) {
            if (C61349O5x.LIZ < 3) {
                C16880lQ.LLLLIIL(e);
            }
        }
    }

    public static void LIZLLL(int i, String str) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("duration", System.currentTimeMillis() - LIZ);
            jSONObject.put("result", i);
            if (str == null) {
                str = "";
            }
            jSONObject.put("custom", str);
            jSONObject.put("key", "load_webview");
            LIZJ("turing_verify_sdk", jSONObject);
        } catch (JSONException e) {
            C61349O5x.LIZIZ(e);
        }
    }

    public static <T> void LIZ(JSONObject jSONObject, String str, T t) {
        if (!jSONObject.has(str) && t != null) {
            jSONObject.put(str, t);
        }
    }
}
