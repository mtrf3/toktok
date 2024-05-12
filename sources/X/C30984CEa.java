package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionParams;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionSettings;

/* renamed from: X.CEa, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30984CEa extends AbstractC65781Prl implements InterfaceC65784Pro<LiveGiftPanelOpenIntentionParams> {
    public static final C30984CEa LJLIL = new C30984CEa();

    public C30984CEa() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelOpenIntentionParams, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LiveGiftPanelOpenIntentionParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveGiftPanelOpenIntentionSettings.class);
        if (valueSafely == 0) {
            return LiveGiftPanelOpenIntentionSettings.INSTANCE.getDEFAULT$livesetting_release();
        }
        return valueSafely;
    }
}
