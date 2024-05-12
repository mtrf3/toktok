package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_anchor_mock_video_size")
/* loaded from: classes6.dex */
public final class LiveAnchorMockVideoSize {

    @Group(isDefault = true, value = "default group")
    public static final AnchorMockVideoSizeConfig DEFAULT;
    public static final LiveAnchorMockVideoSize INSTANCE = new LiveAnchorMockVideoSize();
    public static AnchorMockVideoSizeConfig videoSize;

    static {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        DEFAULT = anchorMockVideoSizeConfig;
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig2 = (AnchorMockVideoSizeConfig) SettingsManager.INSTANCE.getValueSafely(LiveAnchorMockVideoSize.class);
        if (anchorMockVideoSizeConfig2 != null) {
            anchorMockVideoSizeConfig = anchorMockVideoSizeConfig2;
        }
        videoSize = anchorMockVideoSizeConfig;
    }

    public final AnchorMockVideoSizeConfig getValue() {
        return videoSize;
    }

    public static final void setValue(int i, int i2) {
        AnchorMockVideoSizeConfig anchorMockVideoSizeConfig = new AnchorMockVideoSizeConfig();
        anchorMockVideoSizeConfig.width = i;
        anchorMockVideoSizeConfig.height = i2;
        videoSize = anchorMockVideoSizeConfig;
    }
}
