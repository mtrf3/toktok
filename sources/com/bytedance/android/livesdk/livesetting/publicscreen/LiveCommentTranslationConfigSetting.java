package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.chatroom.model.LiveCommentTranslationConfig;

@SettingsKey("live_comment_translation_config")
/* loaded from: classes6.dex */
public final class LiveCommentTranslationConfigSetting {

    @Group(isDefault = true, value = "default group")
    public static final LiveCommentTranslationConfig DEFAULT;
    public static final LiveCommentTranslationConfigSetting INSTANCE = new LiveCommentTranslationConfigSetting();

    static {
        LiveCommentTranslationConfig liveCommentTranslationConfig = new LiveCommentTranslationConfig();
        liveCommentTranslationConfig.enabled = true;
        liveCommentTranslationConfig.guidanceDailyDisplayCount = 1;
        liveCommentTranslationConfig.guidanceTotalDisplayCount = 3;
        liveCommentTranslationConfig.hotLiveMessageCount = 5;
        DEFAULT = liveCommentTranslationConfig;
    }

    public final LiveCommentTranslationConfig getValue() {
        LiveCommentTranslationConfig liveCommentTranslationConfig = (LiveCommentTranslationConfig) SettingsManager.INSTANCE.getValueSafely(LiveCommentTranslationConfigSetting.class);
        if (liveCommentTranslationConfig == null) {
            return DEFAULT;
        }
        return liveCommentTranslationConfig;
    }
}
