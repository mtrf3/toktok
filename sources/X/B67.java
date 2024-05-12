package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveEnterRoomRateTrackerSetting;

/* loaded from: classes6.dex */
public final class B67 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B67 LJLIL = new B67();

    public B67() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnterRoomRateTrackerSetting.class));
    }
}
