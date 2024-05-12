package com.bytedance.android.livesdk.livesetting.broadcast.preview;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("live_preview_broadcast_more")
/* loaded from: classes6.dex */
public final class LivePreviewMoreSetting {

    @Group(isDefault = true, value = "Default")
    public static final boolean DEFAULT = false;
    public static final LivePreviewMoreSetting INSTANCE = new LivePreviewMoreSetting();

    public final boolean useMoreBtn() {
        return SettingsManager.INSTANCE.getBooleanValue(LivePreviewMoreSetting.class);
    }

    public final boolean useCreateInfoCache() {
        return !useMoreBtn();
    }
}
