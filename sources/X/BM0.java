package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DisableEnterRoomLinkOptSetting;

/* loaded from: classes6.dex */
public final class BM0 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BM0 LJLIL = new BM0();

    public BM0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (!SettingsManager.INSTANCE.getBooleanValue(DisableEnterRoomLinkOptSetting.class)) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
