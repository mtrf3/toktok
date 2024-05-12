package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp;

/* loaded from: classes6.dex */
public final class CFO extends AbstractC65781Prl implements InterfaceC65784Pro<LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig> {
    public static final CFO LJLIL = new CFO();

    public CFO() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r3v0, types: [com.bytedance.android.livesdk.livesetting.watchlive.LivePlayerSettingCacheExp$LivePlayerSettingCacheConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LivePlayerSettingCacheExp.class);
        if (valueSafely == 0) {
            return new LivePlayerSettingCacheExp.LivePlayerSettingCacheConfig(0, 0, 3, null);
        }
        return valueSafely;
    }
}
