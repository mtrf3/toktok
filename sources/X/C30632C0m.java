package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveHeatLevelSetting;

/* renamed from: X.C0m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30632C0m extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C30632C0m LJLIL = new C30632C0m();

    public C30632C0m() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveHeatLevelSetting.class));
    }
}
