package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.performance.config.RealtimePerfScoreConfig;
import com.bytedance.android.livesdk.performance.config.RealtimePerfScoreSettings;

/* loaded from: classes6.dex */
public final class CGJ extends AbstractC65781Prl implements InterfaceC65784Pro<RealtimePerfScoreConfig> {
    public static final CGJ LJLIL = new CGJ();

    public CGJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.performance.config.RealtimePerfScoreConfig] */
    @Override // X.InterfaceC65784Pro
    public final RealtimePerfScoreConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(RealtimePerfScoreSettings.class);
        if (valueSafely == 0) {
            return RealtimePerfScoreSettings.DEFAULT;
        }
        return valueSafely;
    }
}
