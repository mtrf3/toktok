package com.bytedance.globalpayment.payment.common.lib.settings;

import X.C16880lQ;
import X.C58248MtY;
import X.C66978QQk;
import X.C66981QQn;
import X.C78841Uwv;
import X.InterfaceC66858QLu;
import X.PTB;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PaymentOnlineSettings$$SettingImpl implements PaymentOnlineSettings {
    public final InterfaceC66858QLu LIZ;
    public final C66978QQk LIZIZ;

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final JSONObject LIZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("restore_settings")) {
            String string = this.LIZ.getString("restore_settings");
            C58248MtY.LIZ(C66981QQn.class, this.LIZIZ).getClass();
            try {
                return new JSONObject(string);
            } catch (Exception e) {
                C16880lQ.LLLLIIL(e);
            }
        }
        return null;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean LIZIZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("pipo_process_settings")) {
            return this.LIZ.getBoolean("pipo_process_settings");
        }
        return true;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final long LIZJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("auto_ack_after_upload_token_in_ms")) {
            return this.LIZ.getLong("auto_ack_after_upload_token_in_ms");
        }
        return 120000L;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final long LIZLLL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("payment_settings_request_interval")) {
            return this.LIZ.getLong("payment_settings_request_interval");
        }
        return 10800000L;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentOnlineSettings
    public final boolean LJJIFFI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("need_ack_after_success_query")) {
            return this.LIZ.getBoolean("need_ack_after_success_query");
        }
        return false;
    }

    public PaymentOnlineSettings$$SettingImpl(InterfaceC66858QLu interfaceC66858QLu) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZIZ = new C66978QQk();
        this.LIZ = interfaceC66858QLu;
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void unregisterValChanged(PTB ptb) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            interfaceC66858QLu.LIZIZ();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void updateSettings(Context context, JSONObject jSONObject) {
        InterfaceC66858QLu interfaceC66858QLu;
        if (jSONObject != null && (interfaceC66858QLu = this.LIZ) != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            if (jSONObject.has("restore_settings")) {
                edit.putString("restore_settings", jSONObject.optString("restore_settings"));
            }
            if (jSONObject.has("pipo_process_settings")) {
                edit.putBoolean("pipo_process_settings", C78841Uwv.LJJIJ("pipo_process_settings", jSONObject));
            }
            if (jSONObject.has("payment_settings_request_interval")) {
                edit.putLong("payment_settings_request_interval", jSONObject.optLong("payment_settings_request_interval"));
            }
            if (jSONObject.has("gecko_config")) {
                edit.putString("gecko_config", jSONObject.optString("gecko_config"));
            }
            if (jSONObject.has("webview_config")) {
                edit.putString("webview_config", jSONObject.optString("webview_config"));
            }
            if (jSONObject.has("auto_ack_after_upload_token_in_ms")) {
                edit.putLong("auto_ack_after_upload_token_in_ms", jSONObject.optLong("auto_ack_after_upload_token_in_ms"));
            }
            if (jSONObject.has("need_ack_after_success_query")) {
                edit.putBoolean("need_ack_after_success_query", C78841Uwv.LJJIJ("need_ack_after_success_query", jSONObject));
            }
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.ISettings
    public final void registerValChanged(Context context, String str, String str2, PTB ptb) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            interfaceC66858QLu.LIZ(context, str, str2);
        }
    }
}
