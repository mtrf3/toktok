package X;

import com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeConfig;
import com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeInfo;
import com.bytedance.android.live_settings.SettingsManager;

/* renamed from: X.1sx, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47031sx extends AbstractC65781Prl implements InterfaceC65784Pro<MobileHighPingOptimizeConfig> {
    public static final C47031sx LJLIL = new C47031sx();

    public C47031sx() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.live.broadcast.setting.MobileHighPingOptimizeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MobileHighPingOptimizeConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(MobileHighPingOptimizeInfo.class);
        if (valueSafely == 0) {
            return MobileHighPingOptimizeInfo.DEFAULT;
        }
        return valueSafely;
    }
}
