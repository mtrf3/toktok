package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.game.GameLiveBroadcastSpeedDetectionUploadMappingSetting;
import com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping;

/* renamed from: X.My9, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58533My9 extends AbstractC65781Prl implements InterfaceC65784Pro<UploadSpeedDetectionMapping> {
    public static final C58533My9 LJLIL = new C58533My9();

    public C58533My9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.game.UploadSpeedDetectionMapping, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final UploadSpeedDetectionMapping invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(GameLiveBroadcastSpeedDetectionUploadMappingSetting.class);
        if (valueSafely == 0) {
            return GameLiveBroadcastSpeedDetectionUploadMappingSetting.DEFAULT;
        }
        return valueSafely;
    }
}
