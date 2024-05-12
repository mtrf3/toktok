package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveMultiHostGiftTrayOptSetting;

/* renamed from: X.Myp, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58575Myp extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58575Myp LJLIL = new C58575Myp();

    public C58575Myp() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveMultiHostGiftTrayOptSetting.class));
    }
}
