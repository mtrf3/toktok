package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.BX2;
import X.C221108m2;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("game_partnership_gpppa_help_center")
/* loaded from: classes6.dex */
public final class GameLivePartnershipGpppaHelpCenterSetting {
    public static final GameLivePartnershipGpppaHelpCenterSetting INSTANCE = new GameLivePartnershipGpppaHelpCenterSetting();

    @Group(isDefault = true, value = "default group")
    public static final String DEFAULT = "";
    public static final C5H3 helpCenterUrl$delegate = C221108m2.LIZIZ(BX2.LJLIL);

    public final String getHelpCenterUrl() {
        return (String) helpCenterUrl$delegate.getValue();
    }
}
