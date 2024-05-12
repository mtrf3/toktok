package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C0K2;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

@SettingsKey("multi_guest_v3_guest_setting")
/* loaded from: classes6.dex */
public final class MultiGuestV3GuestSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static m cache;
    public static final MultiGuestV3GuestSetting INSTANCE = new MultiGuestV3GuestSetting();
    public static String last = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(MultiGuestV3GuestSetting.class);
    }

    public final Boolean getBoolValue(String str) {
        j LJJIJ;
        Boolean bool = null;
        try {
            String value = getValue();
            if (o.LJ(value, "")) {
                return null;
            }
            if (!o.LJ(value, last)) {
                last = value;
                new com.google.gson.o();
                cache = com.google.gson.o.LIZ(value).LJIIZILJ();
            }
            m mVar = cache;
            if (mVar == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return null;
            }
            bool = Boolean.valueOf(LJJIJ.LJFF());
            return bool;
        } catch (Throwable th) {
            C0K2.LIZ("getBoolValue error", th);
            return bool;
        }
    }
}
