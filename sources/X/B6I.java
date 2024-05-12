package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.LiveCardSmoothEnterOptSetting;
import com.bytedance.android.livesdk.livesetting.watchlive.previewlive.SmoothEnterConfig;

/* loaded from: classes6.dex */
public final class B6I extends AbstractC65781Prl implements InterfaceC65784Pro<SmoothEnterConfig> {
    public static final B6I LJLIL = new B6I();

    public B6I() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.watchlive.previewlive.SmoothEnterConfig] */
    @Override // X.InterfaceC65784Pro
    public final SmoothEnterConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveCardSmoothEnterOptSetting.class);
        if (valueSafely == 0) {
            return new SmoothEnterConfig(false, false, 0L, null, 15, null);
        }
        return valueSafely;
    }
}
