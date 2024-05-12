package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_emoji_space_setting")
/* loaded from: classes6.dex */
public final class LiveEomjiSpaceSetting {
    public static final LiveEomjiSpaceSetting INSTANCE = new LiveEomjiSpaceSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 22;

    public final int getSpaceValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveEomjiSpaceSetting.class);
    }
}
