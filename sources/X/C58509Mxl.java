package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveWalletGPPPAHelpCenterSetting;

/* renamed from: X.Mxl, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58509Mxl extends AbstractC65781Prl implements InterfaceC65784Pro<String> {
    public static final C58509Mxl LJLIL = new C58509Mxl();

    public C58509Mxl() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String invoke() {
        return SettingsManager.INSTANCE.getStringValue(LiveWalletGPPPAHelpCenterSetting.class);
    }
}
