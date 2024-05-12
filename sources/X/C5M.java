package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveALogAndMonitorDegradeSetting;

/* loaded from: classes6.dex */
public final class C5M extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5M LJLIL = new C5M();

    public C5M() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveALogAndMonitorDegradeSetting.class));
    }
}
