package com.bytedance.android.livesdk.livesetting.linkmic.match;

import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;
import com.bytedance.android.live_settings.SettingsManager;

@SettingsKey("linkmic_armies_p2p")
/* loaded from: classes6.dex */
public final class MatchArmiesMsgp2pSetting {

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = false;
    public static final MatchArmiesMsgp2pSetting INSTANCE = new MatchArmiesMsgp2pSetting();

    public final boolean getValue() {
        return SettingsManager.INSTANCE.getBooleanValue(MatchArmiesMsgp2pSetting.class);
    }
}
