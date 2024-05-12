package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_multiguestv3_add_not_receive_first_frame_exp")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting {
    public static final LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting INSTANCE = new LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting();

    @Group(isDefault = true, value = "default group")
    public static final AddNotReceiveFirstFrameExpConf DEFAULT = new AddNotReceiveFirstFrameExpConf(false, 0, false, 7, null);

    public final AddNotReceiveFirstFrameExpConf getValue() {
        AddNotReceiveFirstFrameExpConf addNotReceiveFirstFrameExpConf = (AddNotReceiveFirstFrameExpConf) SettingsManager.INSTANCE.getValueSafely(LinkMicMultiGuestV3AddNotReceiveFirstFrameExpSetting.class);
        if (addNotReceiveFirstFrameExpConf == null) {
            return DEFAULT;
        }
        return addNotReceiveFirstFrameExpConf;
    }
}
