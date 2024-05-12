package com.bytedance.android.livesdk.livesetting.linkmic.multilive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multi_guest_need_change_layout_after_create_channel")
/* loaded from: classes6.dex */
public final class MultiGuestNeedChangeLayoutSwitch {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final MultiGuestNeedChangeLayoutSwitch INSTANCE = new MultiGuestNeedChangeLayoutSwitch();

    public static final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MultiGuestNeedChangeLayoutSwitch.class);
    }
}
