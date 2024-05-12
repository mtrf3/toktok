package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftComboInterruptStrategySettings;

/* renamed from: X.My7, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58531My7 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58531My7 LJLIL = new C58531My7();

    public C58531My7() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftComboInterruptStrategySettings.class));
    }
}
