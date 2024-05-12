package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveUplinkStrategySetting;
import com.bytedance.android.livesdk.model.LiveUplinkConfig;

/* loaded from: classes14.dex */
public final class UYD extends AbstractC65781Prl implements InterfaceC65784Pro<LiveUplinkConfig> {
    public static final UYD LJLIL = new UYD();

    public UYD() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.model.LiveUplinkConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveUplinkConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveUplinkStrategySetting.class);
        if (valueSafely == 0) {
            return LiveUplinkStrategySetting.DEFAULT;
        }
        return valueSafely;
    }
}
