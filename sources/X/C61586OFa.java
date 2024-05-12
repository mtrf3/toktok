package X;

import android.app.Application;
import android.content.SharedPreferences;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: X.OFa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C61586OFa {
    public SharedPreferences LIZ;
    public JSONArray LIZIZ = new JSONArray();
    public volatile boolean LIZJ;
    public String LIZLLL;
    public long LJ;

    public final synchronized void LIZ() {
        if (this.LIZJ) {
            return;
        }
        this.LIZJ = true;
        Application application = C78248UnM.LJLJJI;
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(PC5.LJIJJ());
        LIZ.append("_");
        LIZ.append("drop_message");
        SharedPreferences LIZIZ = F9J.LIZIZ(application, 0, X1D.LIZIZ(LIZ));
        this.LIZ = LIZIZ;
        String string = LIZIZ.getString("drop_data_items", "");
        if (!TextUtils.isEmpty(string)) {
            try {
                this.LIZIZ = new JSONArray(string);
            } catch (Exception unused) {
            }
        }
    }

    public final JSONArray LIZIZ() {
        LIZ();
        JSONArray jSONArray = new JSONArray();
        JSONArray jSONArray2 = new JSONArray();
        for (int i = 0; i < this.LIZIZ.length(); i++) {
            try {
                if (i < 10) {
                    jSONArray.put(this.LIZIZ.get(i));
                } else {
                    jSONArray2.put(this.LIZIZ.get(i));
                }
            } catch (Exception unused) {
            }
        }
        this.LIZIZ = jSONArray2;
        this.LIZ.edit().putString("drop_data_items", this.LIZIZ.toString()).commit();
        return jSONArray;
    }

    public final void LIZJ(long j, long j2, long j3) {
        EnumC2323599z enumC2323599z = EnumC2323599z.SERVER_DROP;
        LIZ();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("log_type", "server_drop_data");
            jSONObject.put("timestamp", j3);
            jSONObject.put("drop_data_count", j);
            jSONObject.put("drop_data_bytes", j2);
            jSONObject.put("x-tt-logid", this.LIZLLL);
            jSONObject.put("drop_timestamp", this.LJ);
            jSONObject.put("drop_reason", enumC2323599z);
            this.LIZIZ.put(jSONObject);
            if (C78248UnM.LJIIJ()) {
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append("monitorDropLog:");
                LIZ.append(this.LIZIZ.toString());
                C64028PAy.LIZ("APM-Slardar", X1D.LIZIZ(LIZ));
            }
            this.LIZ.edit().putString("drop_data_items", this.LIZIZ.toString()).commit();
        } catch (Exception e) {
            C64028PAy.LIZJ("APM-Slardar", "monitorDropLog:", e);
        }
    }
}
