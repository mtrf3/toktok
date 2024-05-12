package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfig;
import com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfigSetting;

/* loaded from: classes6.dex */
public final class C3X extends AbstractC65781Prl implements InterfaceC65784Pro<GameBroadcastExceptionConfig> {
    public static final C3X LJLIL = new C3X();

    public C3X() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.GameBroadcastExceptionConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final GameBroadcastExceptionConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameBroadcastExceptionConfigSetting.class);
        if (valueSafely == 0) {
            return GameBroadcastExceptionConfigSetting.DEFAULT;
        }
        return valueSafely;
    }
}
