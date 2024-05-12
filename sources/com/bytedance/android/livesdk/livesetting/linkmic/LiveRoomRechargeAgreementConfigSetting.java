package com.bytedance.android.livesdk.livesetting.linkmic;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdkapi.model.LiveRechargeAgreementConfig;

@SettingsKey("live_room_recharge_agreement_config")
/* loaded from: classes6.dex */
public final class LiveRoomRechargeAgreementConfigSetting {
    public static final LiveRoomRechargeAgreementConfigSetting INSTANCE = new LiveRoomRechargeAgreementConfigSetting();

    @Group(isDefault = true, value = "default group")
    public static final LiveRechargeAgreementConfig DEFAULT = new LiveRechargeAgreementConfig();

    public final LiveRechargeAgreementConfig getValue() {
        return (LiveRechargeAgreementConfig) SettingsManager.INSTANCE.getValueSafely(LiveRoomRechargeAgreementConfigSetting.class);
    }

    public final LiveRechargeAgreementConfig getDEFAULT() {
        return DEFAULT;
    }
}
