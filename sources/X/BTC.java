package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnablePublicScreenP0;

/* loaded from: classes6.dex */
public final class BTC extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BTC LJLIL = new BTC();

    public BTC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnablePublicScreenP0.class));
    }
}
