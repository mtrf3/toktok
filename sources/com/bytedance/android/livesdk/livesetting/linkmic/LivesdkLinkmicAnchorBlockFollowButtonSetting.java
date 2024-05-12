package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "livesdk_linkmic_anchor_block_follow_button")
/* loaded from: classes6.dex */
public final class LivesdkLinkmicAnchorBlockFollowButtonSetting {

    @Group("anchor not show follow button")
    public static final int ANCHOR_NOT_SHOW_FOLLOW_BUTTON = 1;

    @Group(isDefault = true, value = "anchor show follow button")
    public static final int DEFAULT = 0;
    public static final LivesdkLinkmicAnchorBlockFollowButtonSetting INSTANCE = new LivesdkLinkmicAnchorBlockFollowButtonSetting();

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LivesdkLinkmicAnchorBlockFollowButtonSetting.class);
    }

    public final boolean isAnchorShowFollowButton() {
        if (getValue() == 0) {
            return true;
        }
        return false;
    }
}
