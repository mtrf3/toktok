package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_message_comment_quality_score_version")
/* loaded from: classes6.dex */
public final class LiveMessageCommentQualityScoreVersionSetting {
    public static final LiveMessageCommentQualityScoreVersionSetting INSTANCE = new LiveMessageCommentQualityScoreVersionSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";

    public static final String getValue() {
        return SettingsManager.INSTANCE.getStringValue(LiveMessageCommentQualityScoreVersionSetting.class);
    }
}
