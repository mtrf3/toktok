package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.LiveScrollConfig;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveAdjustScrollConfigSetting;

/* loaded from: classes14.dex */
public final class UYJ extends AbstractC65781Prl implements InterfaceC65784Pro<LiveScrollConfig> {
    public static final UYJ LJLIL = new UYJ();

    public UYJ() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.live.model.LiveScrollConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveScrollConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveAdjustScrollConfigSetting.class);
        if (valueSafely == 0) {
            return LiveAdjustScrollConfigSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
