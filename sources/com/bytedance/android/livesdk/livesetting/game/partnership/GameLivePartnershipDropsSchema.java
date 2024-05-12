package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C30455BxL;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("live_drops_schema")
/* loaded from: classes6.dex */
public final class GameLivePartnershipDropsSchema {
    public static final GameLivePartnershipDropsSchema INSTANCE = new GameLivePartnershipDropsSchema();

    @Group(isDefault = true, value = "default group")
    public static final DropsPageSchemaData DEFAULT = new DropsPageSchemaData(null, null, null, null, null, 31, null);
    public static final C5H3 config$delegate = C221108m2.LIZIZ(C30455BxL.LJLIL);

    public final DropsPageSchemaData getConfig() {
        return (DropsPageSchemaData) config$delegate.getValue();
    }
}
