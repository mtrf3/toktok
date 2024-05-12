package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiGuestGiftTrayOptSetting;

/* renamed from: X.Mxm, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58510Mxm extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58510Mxm LJLIL = new C58510Mxm();

    public C58510Mxm() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveMultiGuestGiftTrayOptSetting.class));
    }
}
