package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2RevenueSetting;

/* loaded from: classes6.dex */
public final class BRT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BRT LJLIL = new BRT();

    public BRT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetV2RevenueSetting.class));
    }
}
