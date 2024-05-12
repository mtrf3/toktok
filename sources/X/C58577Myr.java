package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipLynxSchemaSetting;
import com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipSchemaConfig;

/* renamed from: X.Myr, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58577Myr extends AbstractC65781Prl implements InterfaceC65784Pro<PartnershipSchemaConfig> {
    public static final C58577Myr LJLIL = new C58577Myr();

    public C58577Myr() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.game.partnership.PartnershipSchemaConfig] */
    @Override // X.InterfaceC65784Pro
    public final PartnershipSchemaConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipLynxSchemaSetting.class);
        if (valueSafely == 0) {
            return GameLivePartnershipLynxSchemaSetting.DEFAULT;
        }
        return valueSafely;
    }
}
