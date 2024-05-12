package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings;

/* loaded from: classes16.dex */
public final class YAA extends AbstractC65781Prl implements InterfaceC65784Pro<LiveWatchPreloadSettings.Item> {
    public static final YAA LJLIL = new YAA();

    public YAA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.degrade.LiveWatchPreloadSettings$Item, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveWatchPreloadSettings.Item invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveWatchPreloadSettings.class);
        if (valueSafely == 0) {
            return LiveWatchPreloadSettings.DEFAULT;
        }
        return valueSafely;
    }
}
