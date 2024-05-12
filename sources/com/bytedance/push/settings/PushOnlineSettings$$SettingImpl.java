package com.bytedance.push.settings;

import X.C58248MtY;
import X.C66991QQx;
import X.C78841Uwv;
import X.InterfaceC66858QLu;
import X.PTB;
import X.QR1;
import X.QR2;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class PushOnlineSettings$$SettingImpl implements PushOnlineSettings {
    public final InterfaceC66858QLu LIZ;
    public final C66991QQx LIZIZ;

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("need_control_miui_flares_v2")) {
            return this.LIZ.getBoolean("need_control_miui_flares_v2");
        }
        return true;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJFF() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("frontier_strategy")) {
            return this.LIZ.getInt("frontier_strategy");
        }
        return 0;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_enable_restrict_update_token")) {
            return this.LIZ.getBoolean("ttpush_enable_restrict_update_token");
        }
        return false;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJII() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("allow_settings_notify_enable")) {
            return this.LIZ.getBoolean("allow_settings_notify_enable");
        }
        return true;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIIJJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_update_sender_interval")) {
            return this.LIZ.getLong("ttpush_update_sender_interval");
        }
        return 10800000L;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJIIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("is_receiver_message_wakeup_screen")) {
            return this.LIZ.getBoolean("is_receiver_message_wakeup_screen");
        }
        return false;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIILJJIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_upload_switch_interval")) {
            return this.LIZ.getLong("ttpush_upload_switch_interval");
        }
        return 86400000L;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIILL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("remove_appcloud_update_action")) {
            return this.LIZ.getInt("remove_appcloud_update_action");
        }
        return 1;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIIZILJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("frontier_update_setting_interval")) {
            return this.LIZ.getLong("frontier_update_setting_interval");
        }
        return 10080L;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_forbid_alias")) {
            return this.LIZ.getInt("ttpush_forbid_alias");
        }
        return 0;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final int LJIJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("receiver_message_wakeup_screen_time")) {
            return this.LIZ.getInt("receiver_message_wakeup_screen_time");
        }
        return 5000;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final long LJIJJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_update_token_interval")) {
            return this.LIZ.getLong("ttpush_update_token_interval");
        }
        return 86400000L;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJJ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("ttpush_shut_push_on_stop_service")) {
            return this.LIZ.getBoolean("ttpush_shut_push_on_stop_service");
        }
        return false;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final boolean LJJII() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("remove_auto_boot_v2")) {
            return this.LIZ.getBoolean("remove_auto_boot_v2");
        }
        return false;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final QR1 LJJIII() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("un_duplicate_message_settings")) {
            String string = this.LIZ.getString("un_duplicate_message_settings");
            C58248MtY.LIZ(QR2.class, this.LIZIZ).getClass();
            QR1 qr1 = new QR1();
            try {
                JSONObject jSONObject = new JSONObject(string);
                qr1.LIZ = jSONObject.optBoolean("enable_un_duplicate_message");
                qr1.LIZIZ = jSONObject.optInt("max_cache_message", 200);
                qr1.LIZJ = jSONObject.optLong("max_cache_time_in_hour", 24L);
                return qr1;
            } catch (Throwable unused) {
                return qr1;
            }
        }
        C58248MtY.LIZ(QR2.class, this.LIZIZ).getClass();
        return new QR1();
    }

    public PushOnlineSettings$$SettingImpl(InterfaceC66858QLu interfaceC66858QLu) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZIZ = new C66991QQx();
        this.LIZ = interfaceC66858QLu;
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void LJIIIIZZ(boolean z) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("ttpush_shut_push_on_stop_service", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.PushOnlineSettings
    public final void LJIJJLI(boolean z) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("allow_settings_notify_enable", z);
            edit.apply();
        }
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
            if (jSONObject.has("ttpush_allow_settings_notify_enable")) {
                edit.putBoolean("allow_settings_notify_enable", C78841Uwv.LJJIJ("ttpush_allow_settings_notify_enable", jSONObject));
            }
            if (jSONObject.has("ttpush_update_sender_interval")) {
                edit.putLong("ttpush_update_sender_interval", jSONObject.optLong("ttpush_update_sender_interval"));
            }
            if (jSONObject.has("ttpush_update_token_interval")) {
                edit.putLong("ttpush_update_token_interval", jSONObject.optLong("ttpush_update_token_interval"));
            }
            if (jSONObject.has("ttpush_enable_restrict_update_token")) {
                edit.putBoolean("ttpush_enable_restrict_update_token", C78841Uwv.LJJIJ("ttpush_enable_restrict_update_token", jSONObject));
            }
            if (jSONObject.has("ttpush_shut_push_on_stop_service")) {
                edit.putBoolean("ttpush_shut_push_on_stop_service", C78841Uwv.LJJIJ("ttpush_shut_push_on_stop_service", jSONObject));
            }
            if (jSONObject.has("ttpush_is_receiver_message_wakeup_screen")) {
                edit.putBoolean("is_receiver_message_wakeup_screen", C78841Uwv.LJJIJ("ttpush_is_receiver_message_wakeup_screen", jSONObject));
            }
            if (jSONObject.has("ttpush_receiver_message_wakeup_screen_time")) {
                edit.putInt("receiver_message_wakeup_screen_time", jSONObject.optInt("ttpush_receiver_message_wakeup_screen_time"));
            }
            if (jSONObject.has("ttpush_upload_switch_interval")) {
                edit.putLong("ttpush_upload_switch_interval", jSONObject.optLong("ttpush_upload_switch_interval"));
            }
            if (jSONObject.has("ttpush_forbid_alias")) {
                edit.putInt("ttpush_forbid_alias", jSONObject.optInt("ttpush_forbid_alias"));
            }
            if (jSONObject.has("need_control_miui_flares_v2")) {
                edit.putBoolean("need_control_miui_flares_v2", C78841Uwv.LJJIJ("need_control_miui_flares_v2", jSONObject));
            }
            if (jSONObject.has("remove_auto_boot_v2")) {
                edit.putBoolean("remove_auto_boot_v2", C78841Uwv.LJJIJ("remove_auto_boot_v2", jSONObject));
            }
            if (jSONObject.has("remove_umeng_autoboot")) {
                edit.putBoolean("remove_umeng_autoboot", C78841Uwv.LJJIJ("remove_umeng_autoboot", jSONObject));
            }
            if (jSONObject.has("frontier_update_setting_interval")) {
                edit.putLong("frontier_update_setting_interval", jSONObject.optLong("frontier_update_setting_interval"));
            }
            if (jSONObject.has("frontier_strategy")) {
                edit.putInt("frontier_strategy", jSONObject.optInt("frontier_strategy"));
            }
            if (jSONObject.has("remove_appcloud_update_action")) {
                edit.putInt("remove_appcloud_update_action", jSONObject.optInt("remove_appcloud_update_action"));
            }
            if (jSONObject.has("un_duplicate_message_settings")) {
                edit.putString("un_duplicate_message_settings", jSONObject.optString("un_duplicate_message_settings"));
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
