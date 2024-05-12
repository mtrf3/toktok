package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.google.gson.j;
import com.google.gson.m;
import kotlin.jvm.internal.o;

@SettingsKey("anchor_panel_revenue_tip_auto_refresh")
/* loaded from: classes11.dex */
public final class MultiGuestV3RemindTime {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static volatile m cache;
    public static final MultiGuestV3RemindTime INSTANCE = new MultiGuestV3RemindTime();
    public static volatile String last = "";

    private final m getObject() {
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
            return cache;
        } catch (Throwable unused) {
            return null;
        }
    }

    public final boolean enable() {
        j LJJIJ;
        try {
            m object = getObject();
            if (object == null || (LJJIJ = object.LJJIJ("isEnable")) == null) {
                return false;
            }
            return LJJIJ.LJIILJJIL() == 1;
        } catch (Throwable unused) {
            return false;
        }
    }

    public final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(MultiGuestV3RemindTime.class);
    }

    public final long interval() {
        j LJJIJ;
        try {
            m object = getObject();
            if (object == null || (LJJIJ = object.LJJIJ("interval")) == null) {
                return 0L;
            }
            return LJJIJ.LJIJJLI();
        } catch (Throwable unused) {
            return 0L;
        }
    }
}
