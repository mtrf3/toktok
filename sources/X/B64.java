package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetManagerOptSetting;

/* loaded from: classes6.dex */
public final class B64 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B64 LJLIL = new B64();

    public B64() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetManagerOptSetting.class));
    }
}
