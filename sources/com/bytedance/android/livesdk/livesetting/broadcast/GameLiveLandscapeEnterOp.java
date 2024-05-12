package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.feed.LiveLandscapeInnerFeedSetting;

@SettingsKey("landscape_audience_enter_room_optimze")
/* loaded from: classes6.dex */
public final class GameLiveLandscapeEnterOp {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;

    @Group("experiment_group")
    public static final boolean ENABLE = true;
    public static final GameLiveLandscapeEnterOp INSTANCE = new GameLiveLandscapeEnterOp();

    public final boolean getValue() {
        if (SettingsManager.INSTANCE.getBooleanValue(GameLiveLandscapeEnterOp.class) || LiveLandscapeInnerFeedSetting.INSTANCE.isEnable()) {
            return true;
        }
        return false;
    }
}
