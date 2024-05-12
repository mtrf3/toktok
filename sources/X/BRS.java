package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleRevenueWidgetSetting;

/* loaded from: classes6.dex */
public final class BRS extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BRS LJLIL = new BRS();

    public BRS() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(EnableRecycleSingleRevenueWidgetSetting.class));
    }
}
