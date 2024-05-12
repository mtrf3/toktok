package X;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.HashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public final class QIP implements InterfaceC66836QKy {
    public final QI3 LIZ;
    public volatile SharedPreferences LIZIZ;
    public volatile JSONObject LIZJ;

    public QIP(QI3 qi3) {
        this.LIZ = qi3;
    }

    public final JSONObject LIZ(Context context) {
        if (this.LIZJ == null && context != null) {
            try {
                if (this.LIZIZ == null) {
                    this.LIZIZ = F9J.LIZIZ(context, 0, C66745QHl.LIZIZ(this.LIZ, "header_custom"));
                }
                SharedPreferences sharedPreferences = this.LIZIZ;
                if (sharedPreferences != null) {
                    String string = sharedPreferences.getString("header_custom_info", null);
                    if (string != null) {
                        this.LIZJ = new JSONObject(string);
                    } else {
                        this.LIZJ = new JSONObject();
                    }
                }
            } catch (Exception unused) {
            }
        }
        return this.LIZJ;
    }

    public final void LIZIZ(JSONObject jSONObject, InterfaceC66835QKx interfaceC66835QKx) {
        String str;
        this.LIZJ = jSONObject;
        Application application = this.LIZ.LJIIJ;
        if (this.LIZIZ == null) {
            this.LIZIZ = F9J.LIZIZ(application, 0, C66745QHl.LIZIZ(this.LIZ, "header_custom"));
        }
        SharedPreferences sharedPreferences = this.LIZIZ;
        if (sharedPreferences != null) {
            SharedPreferences.Editor edit = sharedPreferences.edit();
            if (jSONObject != null) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            edit.putString("header_custom_info", str).apply();
        }
        Application application2 = this.LIZ.LJIIJ;
        C66765QIf c66765QIf = (C66765QIf) interfaceC66835QKx;
        c66765QIf.getClass();
        HashMap hashMap = new HashMap();
        hashMap.put("custom", jSONObject);
        c66765QIf.LIZLLL.LIZIZ(application2).LJII(hashMap);
    }
}
