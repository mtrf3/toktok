package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt;

/* loaded from: classes6.dex */
public final class C6X extends AbstractC65781Prl implements InterfaceC65784Pro<WatchMemoryLeakOpt.WatchMemoryLeakOptConfig> {
    public static final C6X LJLIL = new C6X();

    public C6X() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.watchlive.WatchMemoryLeakOpt$WatchMemoryLeakOptConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final WatchMemoryLeakOpt.WatchMemoryLeakOptConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(WatchMemoryLeakOpt.class);
        if (valueSafely == 0) {
            return WatchMemoryLeakOpt.DEFAULT;
        }
        return valueSafely;
    }
}
