package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting;

/* renamed from: X.Mxd, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58501Mxd extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58501Mxd LJLIL = new C58501Mxd();

    public C58501Mxd() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivesdkLinkmicMultiGuestLayoutViewOptimizeSetting.class));
    }
}
