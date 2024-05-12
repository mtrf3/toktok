package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_inbox_skylight_avatar_live_tag_style")
/* loaded from: classes6.dex */
public final class InboxSkylightLiveStyleSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final InboxSkylightLiveStyleSetting INSTANCE = new InboxSkylightLiveStyleSetting();

    @Group("new tag style")
    public static final int V2 = 1;

    @Group("new anim style")
    public static final int V3 = 2;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(InboxSkylightLiveStyleSetting.class);
    }
}
