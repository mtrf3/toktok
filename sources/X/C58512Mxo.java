package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.linkmic.LiveSdkMultiGuestIconOptSetting;

/* renamed from: X.Mxo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58512Mxo extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C58512Mxo LJLIL = new C58512Mxo();

    public C58512Mxo() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveSdkMultiGuestIconOptSetting.class));
    }
}
