package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig;
import com.bytedance.android.livesdk.livesetting.linkmic.multilive.LiveMicVoiceSetting;

/* renamed from: X.TiE, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C75382TiE extends AbstractC65781Prl implements InterfaceC65784Pro<SpeakingVoiceConfig> {
    public static final C75382TiE LJLIL = new C75382TiE();

    public C75382TiE() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.live.model.SpeakingVoiceConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final SpeakingVoiceConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMicVoiceSetting.class);
        if (valueSafely == 0) {
            return LiveMicVoiceSetting.DEFAULT;
        }
        return valueSafely;
    }
}
