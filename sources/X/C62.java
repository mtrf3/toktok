package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.BannerPriorityConfig;
import com.bytedance.android.livesdk.livesetting.game.BannerPriorityJsonSetting;

/* loaded from: classes6.dex */
public final class C62 extends AbstractC65781Prl implements InterfaceC65784Pro<BannerPriorityConfig> {
    public static final C62 LJLIL = new C62();

    public C62() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.BannerPriorityConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final BannerPriorityConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(BannerPriorityJsonSetting.class);
        if (valueSafely == 0) {
            return BannerPriorityJsonSetting.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
