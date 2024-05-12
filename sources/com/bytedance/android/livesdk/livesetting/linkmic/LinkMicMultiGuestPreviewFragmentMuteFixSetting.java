package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multi_guest_preview_fragment_mute_fix")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestPreviewFragmentMuteFixSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final LinkMicMultiGuestPreviewFragmentMuteFixSetting INSTANCE = new LinkMicMultiGuestPreviewFragmentMuteFixSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestPreviewFragmentMuteFixSetting.class);
    }
}
