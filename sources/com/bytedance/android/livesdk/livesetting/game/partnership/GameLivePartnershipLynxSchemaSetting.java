package com.bytedance.android.livesdk.livesetting.game.partnership;

import X.C221108m2;
import X.C58577Myr;
import X.C5H3;
import com.bytedance.android.live.annotation.Group;
import com.bytedance.android.live.annotation.SettingsKey;

@SettingsKey("roma_schema_group_gamepad")
/* loaded from: classes11.dex */
public final class GameLivePartnershipLynxSchemaSetting {
    public static final GameLivePartnershipLynxSchemaSetting INSTANCE = new GameLivePartnershipLynxSchemaSetting();

    @Group(isDefault = true, value = "default group")
    public static final PartnershipSchemaConfig DEFAULT = new PartnershipSchemaConfig(null, null, null, null, null, null, null, null, null, 511, null);
    public static final C5H3 schemaConfig$delegate = C221108m2.LIZIZ(C58577Myr.LJLIL);

    public final PartnershipSchemaConfig getSchemaConfig() {
        return (PartnershipSchemaConfig) schemaConfig$delegate.getValue();
    }
}
