package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetSetting;

/* loaded from: classes6.dex */
public final class BT5 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BT5 LJLIL = new BT5();

    public BT5() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetSetting.class));
    }
}
