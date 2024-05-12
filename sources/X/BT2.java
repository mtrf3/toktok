package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.EnableLiveRecycleWidgetView;

/* loaded from: classes6.dex */
public final class BT2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BT2 LJLIL = new BT2();

    public BT2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(EnableLiveRecycleWidgetView.class));
    }
}
