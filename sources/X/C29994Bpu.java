package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLikeDifferentialHeatSetting;

/* renamed from: X.Bpu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29994Bpu extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C29994Bpu LJLIL = new C29994Bpu();

    public C29994Bpu() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveLikeDifferentialHeatSetting.class));
    }
}
