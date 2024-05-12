package com.bytedance.android.livesdk.livesetting.watchlive;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("game_live_star_comment_enabled")
/* loaded from: classes6.dex */
public final class LiveGameStarCommentSetting {

    @Group(isDefault = true, value = "enable_group")
    public static final int DEFAULT = 1;
    public static final LiveGameStarCommentSetting INSTANCE = new LiveGameStarCommentSetting();

    @Group("unable_group")
    public static final int UNABLE = 0;

    private final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveGameStarCommentSetting.class);
    }

    public final boolean enable() {
        if (getValue() == 1) {
            return true;
        }
        return false;
    }
}
