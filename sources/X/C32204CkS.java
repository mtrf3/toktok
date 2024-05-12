package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt;

/* renamed from: X.CkS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32204CkS extends AbstractC65781Prl implements InterfaceC65784Pro<LandscapeWatchLiveGestureOpt.LandscapeScrollConfig> {
    public static final C32204CkS LJLIL = new C32204CkS();

    public C32204CkS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.watchlive.LandscapeWatchLiveGestureOpt$LandscapeScrollConfig] */
    @Override // X.InterfaceC65784Pro
    public final LandscapeWatchLiveGestureOpt.LandscapeScrollConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LandscapeWatchLiveGestureOpt.class);
        if (valueSafely == 0) {
            return LandscapeWatchLiveGestureOpt.DEFAULT;
        }
        return valueSafely;
    }
}
