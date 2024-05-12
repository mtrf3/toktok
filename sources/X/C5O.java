package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLayoutPreloadOptimizationV1Setting;

/* loaded from: classes6.dex */
public final class C5O extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5O LJLIL = new C5O();

    public C5O() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveLayoutPreloadOptimizationV1Setting.class));
    }
}
