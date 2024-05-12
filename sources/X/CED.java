package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameCardShownConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipGameCardShowConfig;

/* loaded from: classes6.dex */
public final class CED extends AbstractC65781Prl implements InterfaceC65784Pro<GameCardShownConfig> {
    public static final CED LJLIL = new CED();

    public CED() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.partnership.GameCardShownConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GameCardShownConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipGameCardShowConfig.class);
        if (valueSafely == 0) {
            return GameLivePartnershipGameCardShowConfig.DEFAULT;
        }
        return valueSafely;
    }
}
