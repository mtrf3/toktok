package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C5H3;
import X.CED;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("partnership_game_card_config")
/* loaded from: classes6.dex */
public final class GameLivePartnershipGameCardShowConfig {
    public static final GameLivePartnershipGameCardShowConfig INSTANCE = new GameLivePartnershipGameCardShowConfig();

    @Group(isDefault = true, value = "default group")
    public static final GameCardShownConfig DEFAULT = new GameCardShownConfig(false, 0, 3, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(CED.LJLIL);

    public final GameCardShownConfig getConfig() {
        return (GameCardShownConfig) config$delegate.getValue();
    }
}
