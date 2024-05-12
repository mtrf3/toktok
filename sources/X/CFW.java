package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.clientai.Config;
import com.bytedance.android.livesdk.livesetting.clientai.LiveClientTriggerConfig;

/* loaded from: classes6.dex */
public final class CFW extends AbstractC65781Prl implements InterfaceC65784Pro<Config> {
    public static final CFW LJLIL = new CFW();

    public CFW() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.clientai.Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveClientTriggerConfig.class);
        if (valueSafely == 0) {
            return LiveClientTriggerConfig.DEFAULT;
        }
        return valueSafely;
    }
}
