package com.bytedance.push.settings;

import X.C16880lQ;
import X.C58248MtY;
import X.C66977QQj;
import X.C66979QQl;
import X.C66982QQo;
import X.InterfaceC66858QLu;
import X.PTB;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class LocalFrequencySettings$$SettingImpl implements LocalFrequencySettings {
    public final InterfaceC66858QLu LIZ;
    public final C66979QQl LIZIZ = new C66979QQl();

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LIZJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_vc")) {
            return this.LIZ.getString("last_update_sender_vc");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final boolean LJII() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_send_switcher_stat")) {
            return this.LIZ.getBoolean("last_send_switcher_stat");
        }
        return false;
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long LJIIJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_upload_switch_ts")) {
            return this.LIZ.getLong("last_upload_switch_ts");
        }
        return 0L;
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJIJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_supported")) {
            return this.LIZ.getString("last_update_sender_supported");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final long LJIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_time_mil")) {
            return this.LIZ.getLong("last_update_sender_time_mil");
        }
        return 0L;
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_did")) {
            return this.LIZ.getString("last_update_sender_did");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("notify_channel_stat")) {
            return this.LIZ.getString("notify_channel_stat");
        }
        return "";
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0060 A[Catch: JSONException -> 0x0066, TryCatch #0 {JSONException -> 0x0066, blocks: (B:7:0x0022, B:8:0x0028, B:10:0x002e, B:15:0x0060, B:17:0x0063, B:19:0x0035, B:22:0x0057), top: B:6:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0063 A[SYNTHETIC] */
    @Override // com.bytedance.push.settings.LocalFrequencySettings
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.List<X.C66977QQj> LJJIFFI() {
        /*
            r11 = this;
            X.QLu r0 = r11.LIZ
            if (r0 == 0) goto L6b
            java.lang.String r1 = "token_cache"
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L6b
            X.QLu r0 = r11.LIZ
            java.lang.String r4 = r0.getString(r1)
            java.lang.Class<X.QQo> r1 = X.C66982QQo.class
            X.QQl r0 = r11.LIZIZ
            java.lang.Object r0 = X.C58248MtY.LIZ(r1, r0)
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            org.json.JSONArray r3 = new org.json.JSONArray     // Catch: org.json.JSONException -> L66
            r3.<init>(r4)     // Catch: org.json.JSONException -> L66
            r1 = 0
        L28:
            int r0 = r3.length()     // Catch: org.json.JSONException -> L66
            if (r1 >= r0) goto L7b
            org.json.JSONObject r4 = r3.optJSONObject(r1)     // Catch: org.json.JSONException -> L66
            if (r4 != 0) goto L35
            goto L5d
        L35:
            java.lang.String r0 = "type"
            int r5 = r4.optInt(r0)     // Catch: org.json.JSONException -> L66
            java.lang.String r0 = "token"
            java.lang.String r6 = r4.optString(r0)     // Catch: org.json.JSONException -> L66
            java.lang.String r0 = "did"
            java.lang.String r7 = r4.optString(r0)     // Catch: org.json.JSONException -> L66
            java.lang.String r0 = "vc"
            java.lang.String r10 = r4.optString(r0)     // Catch: org.json.JSONException -> L66
            java.lang.String r0 = "t"
            long r8 = r4.optLong(r0)     // Catch: org.json.JSONException -> L66
            if (r5 > 0) goto L57
            goto L5d
        L57:
            X.QQj r4 = new X.QQj     // Catch: org.json.JSONException -> L66
            r4.<init>(r5, r6, r7, r8, r10)     // Catch: org.json.JSONException -> L66
            goto L5e
        L5d:
            r4 = 0
        L5e:
            if (r4 == 0) goto L63
            r2.add(r4)     // Catch: org.json.JSONException -> L66
        L63:
            int r1 = r1 + 1
            goto L28
        L66:
            r0 = move-exception
            X.C16880lQ.LLLLIIL(r0)
            goto L7b
        L6b:
            java.lang.Class<X.QQo> r1 = X.C66982QQo.class
            X.QQl r0 = r11.LIZIZ
            java.lang.Object r0 = X.C58248MtY.LIZ(r1, r0)
            r0.getClass()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
        L7b:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.push.settings.LocalFrequencySettings$$SettingImpl.LJJIFFI():java.util.List");
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJIIJZLJL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_gray_vc")) {
            return this.LIZ.getString("last_update_sender_gray_vc");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final int LJJIIZI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("sys_switcher_stat")) {
            return this.LIZ.getInt("sys_switcher_stat");
        }
        return -2;
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final String LJJIJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_update_sender_channel")) {
            return this.LIZ.getString("last_update_sender_channel");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LIZ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("last_update_sender_vc", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJ(long j) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putLong("last_upload_switch_ts", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJI(long j) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putLong("last_update_sender_time_mil", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIIIZ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("notify_channel_stat", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIIJJI(List<C66977QQj> list) {
        JSONObject jSONObject;
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            C58248MtY.LIZ(C66982QQo.class, this.LIZIZ).getClass();
            JSONArray jSONArray = new JSONArray();
            Iterator it = ((ArrayList) list).iterator();
            while (it.hasNext()) {
                C66977QQj c66977QQj = (C66977QQj) it.next();
                if (c66977QQj != null) {
                    if (c66977QQj.LJ <= 0) {
                        jSONObject = null;
                    } else {
                        jSONObject = new JSONObject();
                        try {
                            jSONObject.put("type", c66977QQj.LJ);
                            jSONObject.put("token", c66977QQj.LIZLLL);
                            jSONObject.put("did", c66977QQj.LIZIZ);
                            jSONObject.put("vc", c66977QQj.LIZJ);
                            jSONObject.put("t", c66977QQj.LIZ);
                        } catch (JSONException e) {
                            C16880lQ.LLLLIIL(e);
                        }
                    }
                    jSONArray.put(jSONObject);
                }
            }
            edit.putString("token_cache", jSONArray.toString());
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIIL(boolean z) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("last_send_switcher_stat", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJIILLIIL(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("last_update_sender_channel", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIII(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("last_update_sender_supported", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIJIIJI(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("last_update_sender_did", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIJL(int i) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putInt("sys_switcher_stat", i);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalFrequencySettings
    public final void LJJIJLIJ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("last_update_sender_gray_vc", str);
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

    public LocalFrequencySettings$$SettingImpl(Context context, InterfaceC66858QLu interfaceC66858QLu) {
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
