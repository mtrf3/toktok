package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.PullStreamDownOptSetting;

/* loaded from: classes6.dex */
public final class C5S extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5S LJLIL = new C5S();

    public C5S() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(PullStreamDownOptSetting.class));
    }
}
