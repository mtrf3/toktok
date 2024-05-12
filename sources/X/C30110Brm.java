package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveBroadcastPoorDeviceRemoveSetting;

/* renamed from: X.Brm, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30110Brm extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30110Brm LJLIL = new C30110Brm();

    public C30110Brm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveBroadcastPoorDeviceRemoveSetting.class));
    }
}
