package com.bytedance.android.livesdk.livesetting.gift;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import java.util.ArrayList;
import java.util.List;

@SettingsKey("live_stream_goal_streamer_access_control")
/* loaded from: classes6.dex */
public final class LiveGoalAnchorAccessControlSetting {
    public static final LiveGoalAnchorAccessControlSetting INSTANCE = new LiveGoalAnchorAccessControlSetting();

    @Group(isDefault = true, value = "default group")
    public static final ArrayList<String> DEFAULT = new ArrayList<>();

    public final List<String> getValue() {
        List<String> list = (List) SettingsManager.INSTANCE.getValueSafely(LiveGoalAnchorAccessControlSetting.class);
        if (list == null) {
            return DEFAULT;
        }
        return list;
    }

    public final boolean showPreviewWidget() {
        return getValue().contains("live_goal_indicator_stream_goal");
    }
}
