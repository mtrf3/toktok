package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveWidgetLifecycleDispatchOptSetting;

/* loaded from: classes6.dex */
public final class BLF extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BLF LJLIL = new BLF();

    public BLF() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveWidgetLifecycleDispatchOptSetting.class));
    }
}
