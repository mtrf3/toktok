package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import X.C0K2;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

@SettingsKey("live_ab_label")
/* loaded from: classes6.dex */
public final class LiveAbLabelSetting {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static m cache;
    public static final LiveAbLabelSetting INSTANCE = new LiveAbLabelSetting();
    public static String last = "";

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveAbLabelSetting.class);
    }

    public final boolean getBooleanValue(String str) {
        j LJJIJ;
        boolean z = false;
        try {
            String value = getValue();
            if (o.LJ(value, "")) {
                return false;
            }
            if (!o.LJ(value, last)) {
                last = value;
                new com.google.gson.o();
                cache = com.google.gson.o.LIZ(value).LJIIZILJ();
            }
            m mVar = cache;
            if (mVar == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return false;
            }
            z = LJJIJ.LJFF();
            return z;
        } catch (Throwable th) {
            C0K2.LIZ("getBooleanValue error", th);
            return z;
        }
    }

    public final int getIntValue(String str) {
        j LJJIJ;
        int i = 0;
        try {
            String value = getValue();
            if (o.LJ(value, "")) {
                return 0;
            }
            if (!o.LJ(value, last)) {
                last = value;
                new com.google.gson.o();
                cache = com.google.gson.o.LIZ(value).LJIIZILJ();
            }
            m mVar = cache;
            if (mVar == null || (LJJIJ = mVar.LJJIJ(str)) == null) {
                return 0;
            }
            i = LJJIJ.LJIILJJIL();
            return i;
        } catch (Throwable th) {
            C0K2.LIZ("getIntValue error", th);
            return i;
        }
    }
}
