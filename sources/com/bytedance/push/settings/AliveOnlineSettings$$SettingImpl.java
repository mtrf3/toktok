package com.bytedance.push.settings;

import X.C78841Uwv;
import X.InterfaceC66858QLu;
import X.PTB;
import android.content.Context;
import android.content.SharedPreferences;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* loaded from: classes12.dex */
public class AliveOnlineSettings$$SettingImpl implements AliveOnlineSettings {
    public final InterfaceC66858QLu LIZ;

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIIIZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("allow_push_job_service", false);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIILLIIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("allow_push_daemon_monitor", false);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("is_close_alarm_wakeup", true);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("is_notify_service_stick", false);
            edit.apply();
        }
    }

    public AliveOnlineSettings$$SettingImpl(InterfaceC66858QLu interfaceC66858QLu) {
        new ConcurrentHashMap();
        new ConcurrentHashMap();
        this.LIZ = interfaceC66858QLu;
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIIJ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("uninstall_question_url", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.AliveOnlineSettings
    public final void LJIILIIL(boolean z) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("allow_off_alive", z);
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
            if (jSONObject.has("ttpush_i18n_allow_off_alive")) {
                edit.putBoolean("allow_off_alive", C78841Uwv.LJJIJ("ttpush_i18n_allow_off_alive", jSONObject));
            }
            if (jSONObject.has("ttpush_uninstall_question_url")) {
                edit.putString("uninstall_question_url", jSONObject.optString("ttpush_uninstall_question_url"));
            }
            if (jSONObject.has("ttpush_allow_push_job_service")) {
                edit.putBoolean("allow_push_job_service", C78841Uwv.LJJIJ("ttpush_allow_push_job_service", jSONObject));
            }
            if (jSONObject.has("ttpush_i18n_allow_push_daemon_monitor")) {
                edit.putBoolean("allow_push_daemon_monitor", C78841Uwv.LJJIJ("ttpush_i18n_allow_push_daemon_monitor", jSONObject));
            }
            if (jSONObject.has("ttpush_allow_close_boot_receiver")) {
                edit.putBoolean("allow_close_boot_receiver", C78841Uwv.LJJIJ("ttpush_allow_close_boot_receiver", jSONObject));
            }
            if (jSONObject.has("ttpush_is_close_alarm_wakeup")) {
                edit.putBoolean("is_close_alarm_wakeup", C78841Uwv.LJJIJ("ttpush_is_close_alarm_wakeup", jSONObject));
            }
            if (jSONObject.has("ttpush_use_start_foreground_notification")) {
                edit.putBoolean("is_use_start_foreground_notification", C78841Uwv.LJJIJ("ttpush_use_start_foreground_notification", jSONObject));
            }
            if (jSONObject.has("ttpush_job_schedule_wake_up_interval_second")) {
                edit.putInt("job_schedule_wake_up_interval_second", jSONObject.optInt("ttpush_job_schedule_wake_up_interval_second"));
            }
            if (jSONObject.has("ttpush_is_use_c_native_process_keep_alive")) {
                edit.putBoolean("is_use_c_native_process_keep_alive", C78841Uwv.LJJIJ("ttpush_is_use_c_native_process_keep_alive", jSONObject));
            }
            if (jSONObject.has("ttpush_is_notify_service_stick")) {
                edit.putBoolean("is_notify_service_stick", C78841Uwv.LJJIJ("ttpush_is_notify_service_stick", jSONObject));
            }
            if (jSONObject.has("ttpush_key_is_miui_close_daemon")) {
                edit.putBoolean("key_is_miui_close_daemon", C78841Uwv.LJJIJ("ttpush_key_is_miui_close_daemon", jSONObject));
            }
            if (jSONObject.has("ttpush_alv_white_list")) {
                edit.putString("ttpush_alv_white_list", jSONObject.optString("ttpush_alv_white_list"));
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
