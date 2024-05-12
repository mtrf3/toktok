package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C221108m2;
import X.C31945CgH;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("link_mic_multi_guest_layout_first_frame_log")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestLayoutFirstFrameLogSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final LinkMicMultiGuestLayoutFirstFrameLogSetting INSTANCE = new LinkMicMultiGuestLayoutFirstFrameLogSetting();
    public static final C5H3 isEnable$delegate = C221108m2.LIZIZ(C31945CgH.LJLIL);

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestLayoutFirstFrameLogSetting.class);
    }

    public final boolean isEnable() {
        return ((Boolean) isEnable$delegate.getValue()).booleanValue();
    }
}
