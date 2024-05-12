package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C30456BxM;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_partnership_drops_config")
/* loaded from: classes6.dex */
public final class GameLivePartnershipDropsSetting {
    public static final GameLivePartnershipDropsSetting INSTANCE = new GameLivePartnershipDropsSetting();

    @Group(isDefault = true, value = "default group")
    public static final GameLivePartnershipDropsConfig DEFAULT = new GameLivePartnershipDropsConfig(false, null, null, 0, false, 31, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(C30456BxM.LJLIL);

    public final GameLivePartnershipDropsConfig getConfig() {
        return (GameLivePartnershipDropsConfig) config$delegate.getValue();
    }
}
