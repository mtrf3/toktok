package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.message.LiveMessageTimeoutSettingAnchor;
import com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig;

/* renamed from: X.CiT, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32081CiT extends AbstractC65781Prl implements InterfaceC65784Pro<LiveMessageTimeoutConfig> {
    public static final C32081CiT LJLIL = new C32081CiT();

    public C32081CiT() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.model.LiveMessageTimeoutConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveMessageTimeoutConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveMessageTimeoutSettingAnchor.class);
        if (valueSafely == 0) {
            return LiveMessageTimeoutSettingAnchor.DEFAULT;
        }
        return valueSafely;
    }
}
