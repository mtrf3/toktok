package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C31190CLy;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("ttlive_game_live_mute")
/* loaded from: classes6.dex */
public final class GameLivePlayerMuteSetting {
    public static final GameLivePlayerMuteSetting INSTANCE = new GameLivePlayerMuteSetting();

    @Group(isDefault = true, value = "default group")
    public static final boolean DEFAULT = true;
    public static final C5H3 enable$delegate = C221108m2.LIZIZ(C31190CLy.LJLIL);

    public final boolean getEnable() {
        return ((Boolean) enable$delegate.getValue()).booleanValue();
    }
}
