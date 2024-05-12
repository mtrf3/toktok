package X;

import android.content.Context;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: X.PAt, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C64023PAt {
    public volatile C64024PAu LIZ;
    public C64022PAs LIZIZ;

    public final void LIZ(Context context) {
        C64022PAs c64022PAs = new C64022PAs(context);
        this.LIZIZ = c64022PAs;
        C64024PAu c64024PAu = null;
        String string = c64022PAs.LIZ.getString("rule", null);
        if (string != null) {
            try {
                if (C78248UnM.LJIIJ()) {
                    StringBuilder LIZ = X1D.LIZ();
                    LIZ.append("DowngradeData-load-");
                    LIZ.append(string);
                    C64028PAy.LIZLLL("APM-Downgrade", X1D.LIZIZ(LIZ));
                }
                C64024PAu LIZ2 = C64024PAu.LIZ(new JSONObject(string));
                if (System.currentTimeMillis() < LIZ2.LIZ) {
                    c64024PAu = LIZ2;
                }
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        LIZIZ(c64024PAu, false);
    }

    public final void LIZIZ(C64024PAu c64024PAu, boolean z) {
        C64022PAs c64022PAs;
        if (c64024PAu != null) {
            synchronized (this) {
                this.LIZ = c64024PAu;
            }
            if (z && (c64022PAs = this.LIZIZ) != null && c64022PAs.LIZ != null) {
                try {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("expire_time", c64024PAu.LIZ);
                    for (Map.Entry entry : ((HashMap) c64024PAu.LIZIZ).entrySet()) {
                        jSONObject.put(((EnumC64008PAe) entry.getKey()).logType, ((BNQ) entry.getValue()).LIZIZ());
                    }
                    String jSONObject2 = jSONObject.toString();
                    if (C78248UnM.LJIIJ()) {
                        StringBuilder LIZ = X1D.LIZ();
                        LIZ.append("DowngradeData-save-");
                        LIZ.append(jSONObject2);
                        C64028PAy.LIZLLL("APM-Downgrade", X1D.LIZIZ(LIZ));
                    }
                    c64022PAs.LIZ.edit().putString("rule", jSONObject.toString()).apply();
                } catch (JSONException unused) {
                }
            }
        }
    }

    public final boolean LIZJ(int i, JSONObject jSONObject) {
        boolean z = true;
        if (this.LIZ == null || System.currentTimeMillis() > this.LIZ.LIZ) {
            return true;
        }
        String valueOf = String.valueOf(i);
        String optString = jSONObject.optString("log_type");
        synchronized (this) {
            EnumC64008PAe enumC64008PAe = EnumC64008PAe.SERVICE_MONITOR;
            if (enumC64008PAe.logType.equals(optString)) {
                String optString2 = jSONObject.optString("service");
                BNQ bnq = (BNQ) ((HashMap) this.LIZ.LIZIZ).get(enumC64008PAe);
                if (bnq != null) {
                    JSONObject jSONObject2 = (JSONObject) ((HashMap) bnq.LIZIZ).get(valueOf);
                    if (jSONObject2 != null && jSONObject2.optInt(optString2, -1) != -1) {
                        if (jSONObject2.optInt(optString2, -1) != 1) {
                            z = false;
                        }
                        return z;
                    }
                    return bnq.LIZ;
                }
            } else {
                BNQ bnq2 = (BNQ) ((HashMap) this.LIZ.LIZIZ).get(EnumC64008PAe.OTHER_LOG_TYPE);
                if (bnq2 != null) {
                    JSONObject jSONObject3 = (JSONObject) ((HashMap) bnq2.LIZIZ).get(valueOf);
                    if (jSONObject3 != null && jSONObject3.optInt(optString, -1) != -1) {
                        if (jSONObject3.optInt(optString, -1) != 1) {
                            z = false;
                        }
                        return z;
                    }
                    return bnq2.LIZ;
                }
            }
            return true;
        }
    }
}
