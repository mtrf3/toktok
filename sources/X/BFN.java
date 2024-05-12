package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting;

/* loaded from: classes6.dex */
public final class BFN extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BFN LJLIL = new BFN();

    public BFN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LinkMicMultiGuestV3AndroidModeratorTechSwitchSetting.class));
    }
}
