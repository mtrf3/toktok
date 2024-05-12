package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.FluencyMetricSwitchSetting;

/* loaded from: classes6.dex */
public final class CGI extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CGI LJLIL = new CGI();

    public CGI() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(FluencyMetricSwitchSetting.class));
    }
}
