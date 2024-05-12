package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("enhance_sharing_revenue_perception")
/* loaded from: classes6.dex */
public final class MultiGuestV3RemindStyle {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final MultiGuestV3RemindStyle INSTANCE = new MultiGuestV3RemindStyle();

    @Group("0 not shown")
    public static final int NOT_SHOW_WHEN_ZERO = 1;

    @Group("0 and desc shown")
    public static final int SHOW_ANY = 3;

    @Group("0 shown")
    public static final int SHOW_WHEN_ZERO = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(MultiGuestV3RemindStyle.class);
    }

    public final boolean enable() {
        if (getValue() > 0) {
            return true;
        }
        return false;
    }
}
