package X;

import android.content.SharedPreferences;
import android.text.TextUtils;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QI6 {
    public static final List<String> LJI = Collections.singletonList("DeviceManager");
    public final InterfaceC66837QKz LIZ;
    public volatile boolean LIZIZ;
    public final QH9 LIZJ;
    public volatile JSONObject LIZLLL = new JSONObject();
    public final SharedPreferences LJ;
    public final QI3 LJFF;

    public final JSONObject LIZ() {
        return C66735QHb.LIZLLL(this.LIZLLL);
    }

    public static java.util.Set LIZIZ(String str) {
        String[] split;
        HashSet hashSet = new HashSet();
        if (!TextUtils.isEmpty(str) && (split = str.split(",")) != null && split.length > 0) {
            for (String str2 : split) {
                if (!TextUtils.isEmpty(str2)) {
                    hashSet.add(str2);
                }
            }
        }
        return hashSet;
    }

    public static boolean LIZJ(JSONObject jSONObject) {
        if (jSONObject != null) {
            String optString = jSONObject.optString("device_id", "");
            String optString2 = jSONObject.optString("install_id", "");
            if (C66735QHb.LIZ(optString) && C66735QHb.LIZ(optString2)) {
                return true;
            }
        }
        return false;
    }

    public final void LIZLLL(JSONObject jSONObject) {
        String str;
        boolean booleanValue = PCO.LIZ.LIZIZ(new Object[0]).booleanValue();
        if (booleanValue) {
            str = "Harmony";
        } else {
            str = "Android";
        }
        try {
            jSONObject.put("platform", str);
        } catch (JSONException e) {
            this.LJFF.LJJIZ.LJIJI(0, LJI, "loadHarmonyInfo failed", e);
        }
        if (!booleanValue) {
            return;
        }
        try {
            jSONObject.put("harmony_os_api", C58323Mul.LIZ("hw_sc.build.os.apiversion"));
            jSONObject.put("harmony_os_version", C58323Mul.LIZ("hw_sc.build.platform.version"));
            jSONObject.put("harmony_release_type", C58323Mul.LIZ("hw_sc.build.os.releasetype"));
        } catch (Throwable th) {
            this.LJFF.LJJIZ.LJIJI(0, LJI, "loadHarmonyInfo failed", th);
        }
    }

    public final void LJ(String str) {
        boolean z;
        Object opt = this.LIZLLL.opt("ab_sdk_version");
        if (str == null ? opt == null : str.equals(opt)) {
            z = false;
        } else {
            synchronized (this) {
                try {
                    JSONObject jSONObject = this.LIZLLL;
                    JSONObject jSONObject2 = new JSONObject();
                    C66735QHb.LIZJ(jSONObject2, jSONObject);
                    jSONObject2.put("ab_sdk_version", str);
                    this.LIZLLL = jSONObject2;
                } catch (JSONException e) {
                    this.LJFF.LJJIZ.LJIILL(LJI, "update header failed", e, new Object[0]);
                }
            }
            z = true;
        }
        QIX qix = this.LJFF.LJJIZ;
        List<String> list = LJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("updateHeader, ");
        LIZ.append("ab_sdk_version");
        LIZ.append(", ");
        LIZ.append(opt);
        LIZ.append(", ");
        LIZ.append((Object) str);
        qix.LJIJI(0, list, X1D.LIZIZ(LIZ), new Object[0]);
        if (z) {
            this.LIZJ.LIZJ.edit().putString("ab_sdk_version", str).apply();
        }
    }

    public final void LJFF(JSONObject jSONObject) {
        this.LJFF.LJJIZ.LJIJI(0, LJI, "updateHeader: {}", jSONObject);
        JSONObject jSONObject2 = new JSONObject();
        String LIZIZ = this.LJFF.LIZIZ();
        synchronized (this) {
            C66735QHb.LIZJ(jSONObject2, this.LIZLLL);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                if (!TextUtils.isEmpty(next)) {
                    try {
                        jSONObject2.put(next, jSONObject.opt(next));
                    } catch (JSONException e) {
                        C16880lQ.LLLLIIL(e);
                    }
                }
            }
            try {
                jSONObject2.put("sdk_version", 506081190);
                jSONObject2.put("sdk_version_code", QJE.LIZ);
                jSONObject2.put("sdk_version_name", "5.6.8-bugfix.11");
                if (!TextUtils.isEmpty(LIZIZ)) {
                    jSONObject2.put("ab_sdk_version", LIZIZ);
                }
                LIZLLL(jSONObject2);
            } catch (Throwable unused) {
            }
            this.LIZLLL = jSONObject2;
            this.LIZIZ = true;
        }
        SharedPreferences.Editor edit = this.LJ.edit();
        edit.putLong("version_code", this.LIZLLL.optLong("version_code", 0L));
        edit.putString("channel", this.LIZLLL.optString("channel", ""));
        edit.apply();
        QI0.LIZIZ("set_header", new C66768QIi(this));
    }

    public QI6(QI3 qi3, QH9 qh9, C66760QIa c66760QIa) {
        this.LJFF = qi3;
        this.LIZJ = qh9;
        this.LIZ = c66760QIa;
        this.LJ = qh9.LJ;
    }
}
