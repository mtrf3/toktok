package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.CollectPerformanceAfterEnterRoomSetting;

/* loaded from: classes6.dex */
public final class BM6 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BM6 LJLIL = new BM6();

    public BM6() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(CollectPerformanceAfterEnterRoomSetting.class));
    }
}
