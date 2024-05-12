package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_starComment_Level")
/* loaded from: classes6.dex */
public final class LiveStarCommentLayerSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStarCommentLayerSetting INSTANCE = new LiveStarCommentLayerSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStarCommentLayerSetting.class);
    }
}
