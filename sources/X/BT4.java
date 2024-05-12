package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableRecycleP0Widget;

/* loaded from: classes6.dex */
public final class BT4 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BT4 LJLIL = new BT4();

    public BT4() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnableRecycleP0Widget.class));
    }
}
