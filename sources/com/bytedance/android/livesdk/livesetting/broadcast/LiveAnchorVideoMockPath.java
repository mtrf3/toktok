package com.bytedance.android.livesdk.livesetting.broadcast;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import kotlin.jvm.internal.o;

@SettingsKey("live_anchor_mock_video_path")
/* loaded from: classes6.dex */
public final class LiveAnchorVideoMockPath {

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final LiveAnchorVideoMockPath INSTANCE = new LiveAnchorVideoMockPath();
    public static String path = SettingsManager.INSTANCE.getStringValue(LiveAnchorVideoMockPath.class);

    public final String getValue() {
        return path;
    }

    public static final void setValue(String path2) {
        o.LJIIIZ(path2, "path");
        path = path2;
    }
}
