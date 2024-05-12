package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsConfig;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsSetting;

/* renamed from: X.BxM, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30456BxM extends AbstractC65781Prl implements InterfaceC65784Pro<GameLivePartnershipDropsConfig> {
    public static final C30456BxM LJLIL = new C30456BxM();

    public C30456BxM() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipDropsConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GameLivePartnershipDropsConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLivePartnershipDropsSetting.class);
        if (valueSafely == 0) {
            return GameLivePartnershipDropsSetting.DEFAULT;
        }
        return valueSafely;
    }
}
