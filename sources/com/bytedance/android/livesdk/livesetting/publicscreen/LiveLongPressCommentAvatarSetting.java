package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_long_press_comment_avatar_setting")
/* loaded from: classes6.dex */
public final class LiveLongPressCommentAvatarSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveLongPressCommentAvatarSetting INSTANCE = new LiveLongPressCommentAvatarSetting();
    public static final boolean enableLongPress = SettingsManager.INSTANCE.getBooleanValue(LiveLongPressCommentAvatarSetting.class);

    public final boolean getEnableLongPress() {
        return enableLongPress;
    }
}
