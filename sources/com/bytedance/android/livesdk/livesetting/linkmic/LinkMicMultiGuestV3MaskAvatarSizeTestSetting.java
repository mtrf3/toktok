package com.bytedance.android.livesdk.livesetting.linkmic;

import X.C29306Beo;
import X.CN1;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.host.IHostAppContext;

@SettingsKey("link_mic_multi_guest_v3_mask_avatar_size_test")
/* loaded from: classes6.dex */
public final class LinkMicMultiGuestV3MaskAvatarSizeTestSetting {

    @Group(isDefault = true, value = "use online logic")
    public static final int DEFAULT = 0;
    public static final LinkMicMultiGuestV3MaskAvatarSizeTestSetting INSTANCE = new LinkMicMultiGuestV3MaskAvatarSizeTestSetting();

    @Group("SIZE_30")
    public static final int SIZE_30 = 30;

    @Group("SIZE_40")
    public static final int SIZE_40 = 40;

    @Group("SIZE_48")
    public static final int SIZE_48 = 48;

    @Group("SIZE_60")
    public static final int SIZE_60 = 60;

    public final int getValue() {
        return SettingsManager.INSTANCE.getIntValue(LinkMicMultiGuestV3MaskAvatarSizeTestSetting.class);
    }

    public final boolean enableTest() {
        Boolean bool;
        if (getValue() != 0) {
            IHostAppContext iHostAppContext = (IHostAppContext) CN1.LIZ(IHostAppContext.class);
            if (iHostAppContext != null) {
                bool = Boolean.valueOf(iHostAppContext.isLocalTest());
            } else {
                bool = null;
            }
            if (C29306Beo.LJJIFFI(bool)) {
                return true;
            }
        }
        return false;
    }
}
