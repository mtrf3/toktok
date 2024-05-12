package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideExpSetting;

/* renamed from: X.C5m, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30762C5m extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30762C5m LJLIL = new C30762C5m();

    public C30762C5m() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftGuideExpSetting.class));
    }
}
