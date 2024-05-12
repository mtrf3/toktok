package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.FixEnterRoomParamsSetting;

/* loaded from: classes6.dex */
public final class BKR extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BKR LJLIL = new BKR();

    public BKR() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(FixEnterRoomParamsSetting.class));
    }
}
