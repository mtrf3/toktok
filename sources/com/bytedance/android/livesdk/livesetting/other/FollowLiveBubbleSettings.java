package com.bytedance.android.livesdk.livesetting.other;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("follow_live_bubble")
/* loaded from: classes6.dex */
public final class FollowLiveBubbleSettings {

    @Group("show live bubble when cold startup/warm startup/switch account")
    public static final FollowLiveBubbleConfig V2;

    @Group("include v2 and show live bubble after inbox bubble show")
    public static final FollowLiveBubbleConfig V3;
    public static final FollowLiveBubbleSettings INSTANCE = new FollowLiveBubbleSettings();

    @Group(isDefault = true, value = "default")
    public static final FollowLiveBubbleConfig DEFAULT = FollowLiveBubbleConfig.LIZ;

    static {
        FollowLiveBubbleConfig followLiveBubbleConfig = new FollowLiveBubbleConfig();
        followLiveBubbleConfig.expGroup = 2;
        V2 = followLiveBubbleConfig;
        FollowLiveBubbleConfig followLiveBubbleConfig2 = new FollowLiveBubbleConfig();
        followLiveBubbleConfig2.expGroup = 3;
        V3 = followLiveBubbleConfig2;
    }

    public final int getDiffTime() {
        FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) SettingsManager.INSTANCE.getValueSafely(FollowLiveBubbleSettings.class);
        if (followLiveBubbleConfig != null) {
            return followLiveBubbleConfig.diffTime;
        }
        return 0;
    }

    public final int getExpGroup() {
        FollowLiveBubbleConfig followLiveBubbleConfig = (FollowLiveBubbleConfig) SettingsManager.INSTANCE.getValueSafely(FollowLiveBubbleSettings.class);
        if (followLiveBubbleConfig != null) {
            return followLiveBubbleConfig.expGroup;
        }
        return 0;
    }
}
