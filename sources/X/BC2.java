package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.DataChannelGlobalOptSetting;

/* loaded from: classes6.dex */
public final class BC2 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BC2 LJLIL = new BC2();

    public BC2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(DataChannelGlobalOptSetting.class));
    }
}
