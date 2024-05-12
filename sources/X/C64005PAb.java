package X;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PAb, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64005PAb {
    public volatile C64006PAc LIZ;
    public C64012PAi LIZIZ;

    public final void LIZ(C64006PAc c64006PAc, boolean z) {
        C64012PAi c64012PAi;
        if (c64006PAc != null) {
            synchronized (this) {
                this.LIZ = c64006PAc;
            }
            if (z && (c64012PAi = this.LIZIZ) != null && c64012PAi.LIZ != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expire_time", c64006PAc.LIZ);
                    for (Map.Entry entry : ((HashMap) c64006PAc.LIZIZ).entrySet()) {
                        jSONObject.put(((EnumC64007PAd) entry.getKey()).logType, ((BNT) entry.getValue()).LIZIZ());
                    }
                    c64012PAi.LIZ.edit().putString("rule", jSONObject.toString()).apply();
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final boolean LIZIZ(int i, JSONObject jSONObject) {
        boolean z = true;
        if (this.LIZ == null || System.currentTimeMillis() > this.LIZ.LIZ) {
            return true;
        }
        String valueOf = String.valueOf(i);
        String optString = jSONObject.optString("log_type");
        EnumC64007PAd enumC64007PAd = EnumC64007PAd.SERVICE_MONITOR;
        if (enumC64007PAd.logType.equals(optString)) {
            String optString2 = jSONObject.optString("service");
            synchronized (this) {
                BNT bnt = (BNT) ((HashMap) this.LIZ.LIZIZ).get(enumC64007PAd);
                if (bnt != null) {
                    JSONObject jSONObject2 = (JSONObject) ((HashMap) bnt.LIZIZ).get(valueOf);
                    if (jSONObject2 != null && jSONObject2.optInt(optString2, -1) != -1) {
                        if (jSONObject2.optInt(optString2, -1) != 1) {
                            z = false;
                        }
                        return z;
                    }
                    return bnt.LIZ;
                }
            }
        } else {
            synchronized (this) {
                BNT bnt2 = (BNT) ((HashMap) this.LIZ.LIZIZ).get(EnumC64007PAd.OTHER_LOG_TYPE);
                if (bnt2 != null) {
                    JSONObject jSONObject3 = (JSONObject) ((HashMap) bnt2.LIZIZ).get(valueOf);
                    if (jSONObject3 != null && jSONObject3.optInt(optString, -1) != -1) {
                        if (jSONObject3.optInt(optString, -1) != 1) {
                            z = false;
                        }
                        return z;
                    }
                    return bnt2.LIZ;
                }
            }
        }
        return true;
    }
}
