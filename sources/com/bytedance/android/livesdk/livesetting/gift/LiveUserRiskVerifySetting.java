package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.CLJ;
import X.EnumC221088m0;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_user_risk_verify_setting")
/* loaded from: classes6.dex */
public final class LiveUserRiskVerifySetting {
    public static final LiveUserRiskVerifySetting INSTANCE = new LiveUserRiskVerifySetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveUserRiskVerify DEFAULT = new LiveUserRiskVerify("sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fcode_verification.js&loading_bg_color=ffffff&gravity=bottom&height=40%25&radius=4&show_mask=1&mask_bg_color=00000055&disable_mask_click_close=1&transition_animation=bottom&source=0&verification_type=0", "sslocal://webcast_lynxview_popup?url=https%3A%2F%2Flf16-gecko-source.tiktokcdn.com%2Fobj%2Fbyte-gurd-source-sg%2Ftiktok%2Ffe%2Flive%2Ftiktok_live_revenue%2Frevenue%2Fpages%2Fcode_verification.js&loading_bg_color=ffffff&gravity=bottom&height=40%25&radius=4&show_mask=1&mask_bg_color=00000055&disable_mask_click_close=1&transition_animation=bottom&source=0&verification_type=1");
    public static final C5H3 SETTING_VALUE$delegate = C221108m2.LIZ(EnumC221088m0.NONE, CLJ.LJLIL);

    private final LiveUserRiskVerify getSETTING_VALUE() {
        return (LiveUserRiskVerify) SETTING_VALUE$delegate.getValue();
    }

    public final LiveUserRiskVerify getConfig() {
        return getSETTING_VALUE();
    }
}
