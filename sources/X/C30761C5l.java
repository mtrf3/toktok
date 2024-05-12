package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideTriggerSetting;

/* renamed from: X.C5l, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30761C5l extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C30761C5l LJLIL = new C30761C5l();

    public C30761C5l() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftGuideTriggerSetting.class));
    }
}
