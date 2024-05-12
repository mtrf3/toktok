package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.model.LiveFixRoomGlobalDataSetting;

/* loaded from: classes6.dex */
public final class BM2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BM2 LJLIL = new BM2();

    public BM2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveFixRoomGlobalDataSetting.class));
    }
}
