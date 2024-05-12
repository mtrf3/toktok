package com.bytedance.android.livesdk.livesetting.watchlive;

import X.C221108m2;
import X.C30165Bsf;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_transparent_banner")
/* loaded from: classes6.dex */
public final class LiveBannerDegradePhoneTransparent {

    @Group(isDefault = true, value = "default")
    public static final boolean DEFAULT = false;
    public static final LiveBannerDegradePhoneTransparent INSTANCE = new LiveBannerDegradePhoneTransparent();
    public static final C5H3 liveBannerExpValue$delegate = C221108m2.LIZIZ(C30165Bsf.LJLIL);

    private final boolean getLiveBannerExpValue() {
        return ((Boolean) liveBannerExpValue$delegate.getValue()).booleanValue();
    }

    public final boolean getValue() {
        return getLiveBannerExpValue();
    }
}
