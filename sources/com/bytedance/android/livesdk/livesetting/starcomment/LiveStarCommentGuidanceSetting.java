package com.bytedance.android.livesdk.livesetting.starcomment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_starComment_enterGuideStyle")
/* loaded from: classes6.dex */
public final class LiveStarCommentGuidanceSetting {

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;
    public static final LiveStarCommentGuidanceSetting INSTANCE = new LiveStarCommentGuidanceSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LiveStarCommentGuidanceSetting.class);
    }
}
