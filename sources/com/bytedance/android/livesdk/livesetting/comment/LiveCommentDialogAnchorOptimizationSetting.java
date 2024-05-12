package com.bytedance.android.livesdk.livesetting.comment;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey(preciseExperiment = false, value = "live_comment_dialog_anchor_optimization")
/* loaded from: classes6.dex */
public final class LiveCommentDialogAnchorOptimizationSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LiveCommentDialogAnchorOptimizationSetting INSTANCE = new LiveCommentDialogAnchorOptimizationSetting();
    public static final boolean value = SettingsManager.INSTANCE.getBooleanValue(LiveCommentDialogAnchorOptimizationSetting.class);

    public static final boolean anchorOptimize() {
        return value;
    }
}
