package X;

import Y.ARunnableS29S0200000_10;
import android.os.Handler;
import android.text.TextUtils;
import com.bytedance.framwork.core.sdkmonitor.SDKMonitorUtils;
import org.json.JSONObject;

/* loaded from: classes11.dex */
public final class O8O {
    public static volatile O8O LIZLLL = null;
    public static volatile boolean LJ = true;
    public volatile boolean LIZ;
    public volatile boolean LIZIZ;
    public volatile int LIZJ;

    public static JSONObject LIZJ() {
        JSONObject jSONObject = new JSONObject();
        try {
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
        if (C61359O6h.LIZIZ() == null) {
            return jSONObject;
        }
        String LIZLLL2 = C61359O6h.LIZIZ().LIZLLL();
        jSONObject.put("device_id", C61359O6h.LIZJ());
        jSONObject.put("app_version", "2.1.10-tt");
        jSONObject.put("channel", LIZLLL2);
        jSONObject.put("update_version_code", C61359O6h.LIZ);
        jSONObject.put("package_name", C61359O6h.LJIILL.getPackageName());
        return jSONObject;
    }

    public static O8O LIZLLL() {
        if (LIZLLL == null) {
            synchronized (O8O.class) {
                if (LIZLLL == null) {
                    LIZLLL = new O8O();
                }
            }
        }
        return LIZLLL;
    }

    public final boolean LJFF() {
        if (this.LIZ && LJ) {
            return true;
        }
        return false;
    }

    public final synchronized void LJ(O8T o8t) {
        if (!LJFF()) {
            return;
        }
        if (C61359O6h.LIZIZ() == null || C61359O6h.LJFF == null) {
            LIZIZ(o8t, false);
            return;
        }
        O7O LIZIZ = C61359O6h.LIZIZ();
        if (LIZIZ != null) {
            String LIZLLL2 = LIZIZ.LIZLLL();
            String LIZJ = C61359O6h.LIZJ();
            String LIZIZ2 = LIZIZ.LIZIZ();
            if (!TextUtils.isEmpty(LIZLLL2) && !TextUtils.isEmpty(LIZJ) && !TextUtils.isEmpty(LIZIZ2)) {
                if (this.LIZIZ) {
                    LIZIZ(o8t, true);
                    return;
                }
                if (this.LIZJ <= 5) {
                    C61373O6v LIZ = C61373O6v.LIZ();
                    ARunnableS29S0200000_10 aRunnableS29S0200000_10 = new ARunnableS29S0200000_10(o8t, this, 58);
                    if (LIZ.LIZ == null) {
                        LIZ.LIZ = C16880lQ.LLLLZ(2);
                    }
                    LIZ.LIZ.submit(aRunnableS29S0200000_10);
                    return;
                }
                LIZIZ(o8t, false);
                return;
            }
        }
        this.LIZIZ = false;
        LIZIZ(o8t, false);
    }

    public static void LIZIZ(O8T o8t, boolean z) {
        if (o8t == null) {
            return;
        }
        if (z) {
            o8t.onSuccess();
        } else {
            o8t.onFail();
        }
    }

    public final void LIZ(Exception exc, String str) {
        if (!LJFF()) {
            return;
        }
        try {
            String message = exc.getMessage();
            if (!TextUtils.isEmpty(message)) {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(str, message);
                LJI("service_ad_exception", null, jSONObject);
            }
        } catch (Exception e) {
            C16880lQ.LLLLIIL(e);
        }
    }

    public final void LJI(String str, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new O8R(this, str, jSONObject, jSONObject2));
        } else {
            SDKMonitorUtils.LIZIZ("1385").LJIILIIL(str, 0, jSONObject, jSONObject2);
        }
    }

    public final void LJIIIZ(String str, int i, JSONObject jSONObject) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new O8Q(this, str, jSONObject));
        } else {
            SDKMonitorUtils.LIZIZ("1385").LJIILIIL(str, i, null, jSONObject);
        }
    }

    public final void LJII(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        if (!this.LIZIZ) {
            LJ(new O8P(this, str, jSONObject, jSONObject2));
        } else {
            SDKMonitorUtils.LIZIZ("1385").LJIILIIL(str, i, jSONObject, jSONObject2);
        }
    }

    public final void LJIIIIZZ(String str, int i, JSONObject jSONObject, JSONObject jSONObject2) {
        if (!LJFF()) {
            return;
        }
        new Handler(C16880lQ.LLJJJJ()).postDelayed(new O8S(this, str, i, jSONObject, jSONObject2), 5000L);
    }
}
