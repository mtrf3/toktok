package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.player.BlackScreenMonitorSetting;

/* loaded from: classes6.dex */
public final class B69 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B69 LJLIL = new B69();

    public B69() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(BlackScreenMonitorSetting.class));
    }
}
