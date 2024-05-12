package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveConfig;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveBroadcastSmoothGoLiveConfigSetting;

/* renamed from: X.Bd3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29197Bd3 extends AbstractC65781Prl implements InterfaceC65784Pro<BroadcastSmoothGoLiveConfig> {
    public static final C29197Bd3 LJLIL = new C29197Bd3();

    public C29197Bd3() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.broadcast.BroadcastSmoothGoLiveConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final BroadcastSmoothGoLiveConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveBroadcastSmoothGoLiveConfigSetting.class);
        if (valueSafely == 0) {
            return LiveBroadcastSmoothGoLiveConfigSetting.DEFAULT;
        }
        return valueSafely;
    }
}
