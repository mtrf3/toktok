package X;

import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateConfig;
import com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateInfo;
import com.bytedance.android.live_settings.SettingsManager;

/* renamed from: X.1sw, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C47021sw extends AbstractC65781Prl implements InterfaceC65784Pro<MobileHighPingAdjustBitrateConfig> {
    public static final C47021sw LJLIL = new C47021sw();

    public C47021sw() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.live.broadcast.setting.MobileHighPingAdjustBitrateConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final MobileHighPingAdjustBitrateConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(MobileHighPingAdjustBitrateInfo.class);
        if (valueSafely == 0) {
            return MobileHighPingAdjustBitrateInfo.DEFAULT;
        }
        return valueSafely;
    }
}
