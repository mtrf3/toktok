package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideClientAISettings;

/* renamed from: X.Cjf, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32155Cjf extends AbstractC65781Prl implements InterfaceC65784Pro<GiftGuideClientAI> {
    public static final C32155Cjf LJLIL = new C32155Cjf();

    public C32155Cjf() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.gift.GiftGuideClientAI] */
    @Override // X.InterfaceC65784Pro
    public final GiftGuideClientAI invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveGiftGuideClientAISettings.class);
        if (valueSafely == 0) {
            return LiveGiftGuideClientAISettings.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
