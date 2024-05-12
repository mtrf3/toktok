package com.bytedance.android.livesdk.livesetting.gift;

import X.C221108m2;
import X.C5H3;
import X.CH4;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_guide_after_recharge")
/* loaded from: classes6.dex */
public final class LiveGiftPostRechargeRetentionSetting {
    public static final LiveGiftPostRechargeRetentionSetting INSTANCE = new LiveGiftPostRechargeRetentionSetting();

    @Group(isDefault = true, value = "default group")
    public static final PostRechargeRetentionParams DEFAULT = new PostRechargeRetentionParams(false, 0, 0, 0, 15, null);
    public static final int TYPE_SHEET = 1;
    public static final int TYPE_POPUP = 2;
    public static final C5H3 settingParams$delegate = C221108m2.LIZIZ(CH4.LJLIL);

    private final PostRechargeRetentionParams getSettingParams() {
        return (PostRechargeRetentionParams) settingParams$delegate.getValue();
    }

    public final long getMaxSheetCloseCount() {
        return getSettingParams().maxSheetCloseCount;
    }

    public final long getPopupCooldown() {
        return getSettingParams().popupCooldown;
    }

    public final int getRetentionType() {
        return getSettingParams().retentionType;
    }

    public final boolean isEnabled() {
        return getSettingParams().enabled;
    }

    public final PostRechargeRetentionParams getDEFAULT() {
        return DEFAULT;
    }

    public final int getTYPE_POPUP() {
        return TYPE_POPUP;
    }

    public final int getTYPE_SHEET() {
        return TYPE_SHEET;
    }
}
