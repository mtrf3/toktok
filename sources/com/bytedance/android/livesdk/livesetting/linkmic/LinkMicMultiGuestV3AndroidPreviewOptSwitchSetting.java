package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_android_preview_opt_switch")
/* loaded from: classes11.dex */
public final class LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting INSTANCE = new LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3AndroidPreviewOptSwitchSetting.class);
    }
}
