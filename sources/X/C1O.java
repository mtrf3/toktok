package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.PerfMetricSwitchSetting;

/* loaded from: classes6.dex */
public final class C1O extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C1O LJLIL = new C1O();

    public C1O() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(PerfMetricSwitchSetting.class));
    }
}
