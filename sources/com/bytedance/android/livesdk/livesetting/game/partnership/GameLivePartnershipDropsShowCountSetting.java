package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C30570BzC;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_partnership_drops_count")
/* loaded from: classes6.dex */
public final class GameLivePartnershipDropsShowCountSetting {
    public static final GameLivePartnershipDropsShowCountSetting INSTANCE = new GameLivePartnershipDropsShowCountSetting();

    @Group(isDefault = true, value = "default group")
    public static final int DEFAULT = 3;
    public static final C5H3 count$delegate = C221108m2.LIZIZ(C30570BzC.LJLIL);

    public final int getCount() {
        return ((Number) count$delegate.getValue()).intValue();
    }
}
