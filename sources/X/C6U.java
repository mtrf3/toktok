package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.CpuTemperaturePathListSetting;

/* loaded from: classes6.dex */
public final class C6U extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final C6U LJLIL = new C6U();

    public C6U() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        return SettingsManager.INSTANCE.getStringArrayValue(CpuTemperaturePathListSetting.class);
    }
}
