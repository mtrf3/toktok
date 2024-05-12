package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.Config;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveMessageHistoryRefreshFooterConfigSetting;

/* loaded from: classes6.dex */
public final class CH9 extends AbstractC65781Prl implements InterfaceC65784Pro<Config> {
    public static final CH9 LJLIL = new CH9();

    public CH9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.publicscreen.Config, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageHistoryRefreshFooterConfigSetting.class);
        if (valueSafely == 0) {
            return LiveMessageHistoryRefreshFooterConfigSetting.DEFAULT;
        }
        return valueSafely;
    }
}
