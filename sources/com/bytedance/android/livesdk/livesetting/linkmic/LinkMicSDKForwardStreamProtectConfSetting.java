package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_sdk_forward_stream_protect_conf")
/* loaded from: classes6.dex */
public final class LinkMicSDKForwardStreamProtectConfSetting {
    public static final LinkMicSDKForwardStreamProtectConfSetting INSTANCE = new LinkMicSDKForwardStreamProtectConfSetting();

    @Group(isDefault = true, value = "default group")
    public static final LinkMicSDKForwardStreamProtectConf DEFAULT = new LinkMicSDKForwardStreamProtectConf(false, false, 0, 7, null);

    public final LinkMicSDKForwardStreamProtectConf getValue() {
        LinkMicSDKForwardStreamProtectConf linkMicSDKForwardStreamProtectConf = (LinkMicSDKForwardStreamProtectConf) SettingsManager.INSTANCE.getValueSafely(LinkMicSDKForwardStreamProtectConfSetting.class);
        if (linkMicSDKForwardStreamProtectConf == null) {
            return DEFAULT;
        }
        return linkMicSDKForwardStreamProtectConf;
    }
}
