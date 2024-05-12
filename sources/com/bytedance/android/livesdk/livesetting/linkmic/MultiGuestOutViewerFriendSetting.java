package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("multiguest_out_viewer_friend")
/* loaded from: classes6.dex */
public final class MultiGuestOutViewerFriendSetting {
    public static final MultiGuestOutViewerFriendSetting INSTANCE = new MultiGuestOutViewerFriendSetting();

    @Group(isDefault = true, value = "default group")
    public static final MultiGuestOutViewerFriendConfig DEFAULT = new MultiGuestOutViewerFriendConfig(0, 0, 3, null);

    public final MultiGuestOutViewerFriendConfig getValue() {
        MultiGuestOutViewerFriendConfig multiGuestOutViewerFriendConfig = (MultiGuestOutViewerFriendConfig) SettingsManager.INSTANCE.getValueSafely(MultiGuestOutViewerFriendSetting.class);
        if (multiGuestOutViewerFriendConfig == null) {
            return DEFAULT;
        }
        return multiGuestOutViewerFriendConfig;
    }
}
