package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_background_use_media_fix")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestV3BackgroundUseMediaFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiGuestV3BackgroundUseMediaFixSetting INSTANCE = new LinkMicMultiGuestV3BackgroundUseMediaFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3BackgroundUseMediaFixSetting.class);
    }
}
