package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveRecycleWidgetV2Setting;

/* loaded from: classes6.dex */
public final class B74 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B74 LJLIL = new B74();

    public B74() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveRecycleWidgetV2Setting.class));
    }
}
