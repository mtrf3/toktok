package com.bytedance.push.settings;

import X.InterfaceC66858QLu;
import X.PTB;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class LocalSettings$$SettingImpl implements LocalSettings {
    public final InterfaceC66858QLu LIZ;

    @Override // com.bytedance.push.settings.LocalSettings
    public final boolean LJIIIIZZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("push_notify_enable")) {
            return this.LIZ.getBoolean("push_notify_enable");
        }
        return true;
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String LJIILIIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("push_channels_json_array")) {
            return this.LIZ.getString("push_channels_json_array");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJIILJJIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("push_daemon_monitor_result", "");
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final String LJJIJIL() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("push_daemon_monitor_result")) {
            return this.LIZ.getString("push_daemon_monitor_result");
        }
        return "";
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJFF(boolean z) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putBoolean("allow_network", z);
            edit.apply();
        }
    }

    @Override // com.bytedance.push.settings.LocalSettings
    public final void LJJIIJ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("push_channels_json_array", str);
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

    public LocalSettings$$SettingImpl(Context context, InterfaceC66858QLu interfaceC66858QLu) {
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
