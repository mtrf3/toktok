package com.bytedance.push.frontier.setting;

import X.C16880lQ;
import X.C58248MtY;
import X.C66985QQr;
import X.C66990QQw;
import X.InterfaceC66858QLu;
import X.PTB;
import X.QR3;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class FrontierLocalSetting$$SettingImpl implements FrontierLocalSetting {
    public final InterfaceC66858QLu LIZ;
    public final C66990QQw LIZIZ = new C66990QQw();

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final long LIZIZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_request_setting_time_mil")) {
            return this.LIZ.getLong("last_request_setting_time_mil");
        }
        return 0L;
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final C66985QQr LJIILL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("frontier_setting")) {
            String string = this.LIZ.getString("frontier_setting");
            C58248MtY.LIZ(QR3.class, this.LIZIZ).getClass();
            C66985QQr c66985QQr = new C66985QQr();
            try {
                c66985QQr = C66985QQr.LIZIZ(new JSONObject(string));
                return c66985QQr;
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
                return c66985QQr;
            }
        }
        C58248MtY.LIZ(QR3.class, this.LIZIZ).getClass();
        return new C66985QQr();
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void LIZLLL(C66985QQr c66985QQr) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            C58248MtY.LIZ(QR3.class, this.LIZIZ).getClass();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("aid", c66985QQr.LIZ);
                jSONObject.put("pid", c66985QQr.LIZIZ);
                jSONObject.put("app_key", c66985QQr.LIZJ);
                JSONArray jSONArray = new JSONArray();
                List<String> list = c66985QQr.LIZLLL;
                if (list != null) {
                    Iterator it = ((ArrayList) list).iterator();
                    while (it.hasNext()) {
                        jSONArray.put(it.next());
                    }
                }
                jSONObject.put("urls", jSONArray);
            } catch (JSONException e) {
                C16880lQ.LLLLIIL(e);
            }
            edit.putString("frontier_setting", jSONObject.toString());
            edit.apply();
        }
    }

    @Override // com.bytedance.push.frontier.setting.FrontierLocalSetting
    public final void LJJIJIIJIL(long j) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putLong("last_request_setting_time_mil", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void unregisterValChanged(PTB ptb) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            interfaceC66858QLu.LIZIZ();
        }
    }

    public FrontierLocalSetting$$SettingImpl(Context context, InterfaceC66858QLu interfaceC66858QLu) {
        this.LIZ = interfaceC66858QLu;
    }

    @Override // com.bytedance.push.settings.ILocalSettings
    public final void registerValChanged(Context context, String str, String str2, PTB ptb) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            interfaceC66858QLu.LIZ(context, str, str2);
        }
    }
}
