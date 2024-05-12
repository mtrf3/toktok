package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageMonitorSamplingConfig;
import com.bytedance.android.livesdk.livesetting.message.MessageMonitorSamplingConfig;

/* loaded from: classes6.dex */
public final class CH5 extends AbstractC65781Prl implements InterfaceC65784Pro<MessageMonitorSamplingConfig> {
    public static final CH5 LJLIL = new CH5();

    public CH5() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.message.MessageMonitorSamplingConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MessageMonitorSamplingConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageMonitorSamplingConfig.class);
        if (valueSafely == 0) {
            return LiveMessageMonitorSamplingConfig.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
