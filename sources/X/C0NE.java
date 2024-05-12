package X;

import Y.IDRunnableS0S0201000;
import Y.IDRunnableS0S1200000;
import Y.IDRunnableS0S1201000;
import android.text.TextUtils;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCThreadOptSetting;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.0NE, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C0NE {
    public abstract JSONObject LJI();

    public static void LJIIJ(Runnable runnable) {
        if (ScalableDowngradeSetting.disableAlog()) {
            return;
        }
        C38995FSd.LIZIZ().submit(runnable);
    }

    public static JSONObject LJIIJJI(java.util.Map map) {
        if (map == null) {
            return null;
        }
        JSONObject jSONObject = new JSONObject();
        for (Map.Entry entry : map.entrySet()) {
            try {
                jSONObject.put((String) entry.getKey(), entry.getValue());
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return jSONObject;
    }

    public static void LIZ(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        LJIIJ(new IDRunnableS0S0201000(0, str, str2, 8));
    }

    public static void LIZLLL(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        LJIIJ(new IDRunnableS0S0201000(0, str, str2, 6));
    }

    public static void LJII(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return;
        }
        LJIIJ(new IDRunnableS0S0201000(0, str, str2, 7));
    }

    public static void LJIIL(int i, StackTraceElement[] stackTraceElementArr) {
        C0NB.LJIIJ(i, "ttlive_exception", stackTraceElementArr);
    }

    public final void LIZIZ(String str, java.util.Map<String, ?> map) {
        if (TextUtils.isEmpty(str) || map == null) {
            return;
        }
        LJIIJ(new IDRunnableS0S1201000((C28733BPl) this, str, map, 0));
    }

    public final void LIZJ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        LJIIJ(new C0ND(0, this, str, jSONObject));
    }

    public final void LJ(String str, java.util.Map<String, ?> map) {
        if (TextUtils.isEmpty(str) || map == null) {
            return;
        }
        LJIIJ(new IDRunnableS0S1201000(str, 0, this, map, 2));
    }

    public final String LJFF(String str, JSONObject jSONObject) {
        String str2;
        JSONObject jSONObject2 = new JSONObject();
        JSONObject LJI = LJI();
        try {
            jSONObject2.put("tag", str);
            if (LJI != null) {
                if (LiveGCThreadOptSetting.enableAppLogOpt()) {
                    jSONObject2.put("params", LJI);
                } else {
                    jSONObject2.put("params", LJI());
                }
            }
            if (LiveGCThreadOptSetting.enableAppLogOpt()) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                jSONObject2.put("data", jSONObject);
            } else {
                if (jSONObject != null) {
                    str2 = jSONObject.toString();
                } else {
                    str2 = "";
                }
                jSONObject2.put("data", str2);
            }
        } catch (JSONException e) {
            C16880lQ.LLLLIIL(e);
        }
        return jSONObject2.toString();
    }

    public final void LJIIIIZZ(String str, java.util.Map<String, ?> map) {
        if (TextUtils.isEmpty(str) || map == null) {
            return;
        }
        if (LiveGCThreadOptSetting.disableAlogInBgThread()) {
            LJIIJ(new IDRunnableS0S1200000(map, str, (C28733BPl) this, 6));
        } else {
            LJIIJ(new IDRunnableS0S1201000((C28733BPl) this, str, map, 1));
        }
    }

    public final void LJIIIZ(String str, JSONObject jSONObject) {
        if (TextUtils.isEmpty(str) || jSONObject == null) {
            return;
        }
        LJIIJ(new IDRunnableS0S1200000(jSONObject, str, this, 7));
    }
}
