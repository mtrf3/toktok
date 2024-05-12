package com.bytedance.android.livesdk.livesetting.publicscreen;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_comment_tray_group")
/* loaded from: classes6.dex */
public final class LiveCommentComboTraySetting {
    public static final LiveCommentComboTraySetting INSTANCE = new LiveCommentComboTraySetting();

    @Group(isDefault = true, value = "default")
    public static final CommentComboTrayConfig DEFAULT = new CommentComboTrayConfig(0, 0, 3, null);

    private final CommentComboTrayConfig config() {
        CommentComboTrayConfig commentComboTrayConfig = (CommentComboTrayConfig) SettingsManager.INSTANCE.getValueSafely(LiveCommentComboTraySetting.class);
        if (commentComboTrayConfig == null) {
            return DEFAULT;
        }
        return commentComboTrayConfig;
    }

    public final boolean enableCommentComboTray() {
        if (config().commentComboTrayGroup == 3) {
            return true;
        }
        return false;
    }

    public final long getCommentComboTrayDuration() {
        return config().commentComboTrayDuration;
    }
}
