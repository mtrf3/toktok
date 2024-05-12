package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_emoji_setting")
/* loaded from: classes6.dex */
public final class LiveEomjiConvenientSetting {
    public static final LiveEomjiConvenientSetting INSTANCE = new LiveEomjiConvenientSetting();

    @Group(isDefault = true, value = "default group")
    public static final EomjiConfig DEFAULT = new EomjiConfig(false, false, 3, null);

    private final EomjiConfig getConfig() {
        EomjiConfig eomjiConfig = (EomjiConfig) SettingsManager.INSTANCE.getValueSafely(LiveEomjiConvenientSetting.class);
        if (eomjiConfig == null) {
            return DEFAULT;
        }
        return eomjiConfig;
    }

    public final boolean isForbidQuickComment() {
        return getConfig().isForbidQuickComment;
    }

    public final boolean isShowEmojiConvenient() {
        return getConfig().isShowEmojiConvenient;
    }
}
