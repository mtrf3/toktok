package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.DynamicContainerOptSettingV1;

/* loaded from: classes6.dex */
public final class C5L extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5L LJLIL = new C5L();

    public C5L() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(DynamicContainerOptSettingV1.class));
    }
}
