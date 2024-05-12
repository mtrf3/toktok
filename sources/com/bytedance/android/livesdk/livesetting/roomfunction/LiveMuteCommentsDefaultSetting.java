package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_mute_comments_default")
/* loaded from: classes6.dex */
public final class LiveMuteCommentsDefaultSetting {

    @Group(isDefault = true, value = "default group")
    public static final long DEFAULT = -1;
    public static final LiveMuteCommentsDefaultSetting INSTANCE = new LiveMuteCommentsDefaultSetting();

    public final long getValue() {
        return SettingsManager.INSTANCE.getLongValue(LiveMuteCommentsDefaultSetting.class);
    }
}
