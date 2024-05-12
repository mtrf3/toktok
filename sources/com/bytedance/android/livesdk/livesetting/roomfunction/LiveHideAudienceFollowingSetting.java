package com.bytedance.android.livesdk.livesetting.roomfunction;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_hide_audience_following")
/* loaded from: classes6.dex */
public final class LiveHideAudienceFollowingSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LiveHideAudienceFollowingSetting INSTANCE = new LiveHideAudienceFollowingSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LiveHideAudienceFollowingSetting.class);
    }
}
