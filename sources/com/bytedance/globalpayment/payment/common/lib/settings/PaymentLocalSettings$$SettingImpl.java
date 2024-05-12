package com.bytedance.globalpayment.payment.common.lib.settings;

import X.InterfaceC66858QLu;
import X.PTB;
import android.content.Context;
import android.content.SharedPreferences;

/* loaded from: classes12.dex */
public class PaymentLocalSettings$$SettingImpl implements PaymentLocalSettings {
    public final InterfaceC66858QLu LIZ;

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final String LJIJI() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("need_restore_orders")) {
            return this.LIZ.getString("need_restore_orders");
        }
        return "";
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final String LJJII() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("amazon_orders")) {
            return this.LIZ.getString("amazon_orders");
        }
        return "";
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final long LJJIIZ() {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null && interfaceC66858QLu.contains("last_settings_request_time")) {
            return this.LIZ.getLong("last_settings_request_time");
        }
        return 0L;
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void LJIIZILJ(long j) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putLong("last_settings_request_time", j);
            edit.apply();
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void LJIJJ(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("amazon_orders", str);
            edit.apply();
        }
    }

    @Override // com.bytedance.globalpayment.payment.common.lib.settings.PaymentLocalSettings
    public final void LJIJJLI(String str) {
        InterfaceC66858QLu interfaceC66858QLu = this.LIZ;
        if (interfaceC66858QLu != null) {
            SharedPreferences.Editor edit = interfaceC66858QLu.edit();
            edit.putString("need_restore_orders", str);
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

    public PaymentLocalSettings$$SettingImpl(Context context, InterfaceC66858QLu interfaceC66858QLu) {
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
