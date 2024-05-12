package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DisableLivePlayMonitorOptSetting;

/* loaded from: classes6.dex */
public final class B65 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B65 LJLIL = new B65();

    public B65() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!SettingsManager.INSTANCE.getBooleanValue(DisableLivePlayMonitorOptSetting.class)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
