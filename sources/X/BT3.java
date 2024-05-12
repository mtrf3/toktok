package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.EnableReinitLifecycleRegistry;

/* loaded from: classes6.dex */
public final class BT3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BT3 LJLIL = new BT3();

    public BT3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(EnableReinitLifecycleRegistry.class));
    }
}
