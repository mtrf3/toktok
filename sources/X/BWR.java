package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.LiveToolbarMoreConfig;

/* loaded from: classes6.dex */
public final class BWR extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BWR LJLIL = new BWR();

    public BWR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveToolbarMoreConfig.class));
    }
}
