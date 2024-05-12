package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGCOptimizeSettingV2;

/* loaded from: classes6.dex */
public final class C5N extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5N LJLIL = new C5N();

    public C5N() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGCOptimizeSettingV2.class));
    }
}
