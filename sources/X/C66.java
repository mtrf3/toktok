package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveParseSeiAsyncSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.SeiParseConfig;

/* loaded from: classes6.dex */
public final class C66 extends AbstractC65781Prl implements InterfaceC65784Pro<SeiParseConfig> {
    public static final C66 LJLIL = new C66();

    public C66() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.watchlive.SeiParseConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SeiParseConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveParseSeiAsyncSetting.class);
        if (valueSafely == 0) {
            return LiveParseSeiAsyncSetting.DEFAULT;
        }
        return valueSafely;
    }
}
