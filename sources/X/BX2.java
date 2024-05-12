package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.partnership.GameLivePartnershipGpppaHelpCenterSetting;

/* loaded from: classes6.dex */
public final class BX2 extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final BX2 LJLIL = new BX2();

    public BX2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SettingsManager.INSTANCE.getStringValue(GameLivePartnershipGpppaHelpCenterSetting.class);
    }
}
