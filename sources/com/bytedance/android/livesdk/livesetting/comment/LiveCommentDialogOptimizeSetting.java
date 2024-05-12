package com.bytedance.android.livesdk.livesetting.comment;

import X.C29306Beo;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.ies.sdk.datachannel.DataChannel;

@SettingsKey("live_comment_input_panel_optimization_v0")
/* loaded from: classes6.dex */
public final class LiveCommentDialogOptimizeSetting {

    @Group(isDefault = false, value = "ALL")
    public static final int ALL = 7;

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 0;

    @Group(isDefault = false, value = "LAYOUT_OPTIMIZE")
    public static final int LAYOUT_OPTIMIZE = 4;

    @Group(isDefault = false, value = "REUSE_OPTIMIZE")
    public static final int REUSE_OPTIMIZE = 1;

    @Group(isDefault = false, value = "SHOW_OPTIMIZE")
    public static final int SHOW_OPTIMIZE = 2;
    public static final LiveCommentDialogOptimizeSetting INSTANCE = new LiveCommentDialogOptimizeSetting();
    public static final int value = SettingsManager.INSTANCE.getIntValue(LiveCommentDialogOptimizeSetting.class);

    public static final boolean layoutOptimize(DataChannel dataChannel) {
        if ((value & 4) == 4 && C29306Beo.LJIIL(dataChannel)) {
            return true;
        }
        return false;
    }

    public static final boolean reuseOptimize(DataChannel dataChannel) {
        if ((value & 1) == 1 && C29306Beo.LJIIL(dataChannel)) {
            return true;
        }
        return false;
    }

    public static final boolean showOptimize(DataChannel dataChannel) {
        if ((value & 2) == 2 && C29306Beo.LJIIL(dataChannel)) {
            return true;
        }
        return false;
    }
}
