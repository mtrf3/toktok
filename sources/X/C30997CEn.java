package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt;

/* renamed from: X.CEn, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30997CEn extends AbstractC65781Prl implements InterfaceC65784Pro<LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig> {
    public static final C30997CEn LJLIL = new C30997CEn();

    public C30997CEn() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LiveWatchLayoutPreloadLogOpt$LayoutPreloadConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveWatchLayoutPreloadLogOpt.LayoutPreloadConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveWatchLayoutPreloadLogOpt.class);
        if (valueSafely == 0) {
            return LiveWatchLayoutPreloadLogOpt.DEFAULT;
        }
        return valueSafely;
    }
}
