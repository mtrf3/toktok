package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveTryModeCountDownDurationSetting;

/* loaded from: classes6.dex */
public final class BX9 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BX9 LJLIL = new BX9();

    public BX9() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveTryModeCountDownDurationSetting.class));
    }
}
