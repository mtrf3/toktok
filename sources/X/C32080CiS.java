package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSetting;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;

/* renamed from: X.CiS, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32080CiS extends AbstractC65781Prl implements InterfaceC65784Pro<LiveMessageTimeoutConfig> {
    public static final C32080CiS LJLIL = new C32080CiS();

    public C32080CiS() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveMessageTimeoutConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageTimeoutSetting.class);
        if (valueSafely == 0) {
            return LiveMessageTimeoutSetting.DEFAULT;
        }
        return valueSafely;
    }
}
