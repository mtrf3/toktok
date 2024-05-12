package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting;

/* renamed from: X.BAu, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C28352BAu extends AbstractC65781Prl implements InterfaceC65784Pro<OnlineAudienceGiftGuideSetting.Config> {
    public static final C28352BAu LJLIL = new C28352BAu();

    public C28352BAu() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGiftGuideSetting$Config] */
    @Override // X.InterfaceC65784Pro
    public final OnlineAudienceGiftGuideSetting.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(OnlineAudienceGiftGuideSetting.class);
        if (valueSafely == 0) {
            return OnlineAudienceGiftGuideSetting.DEFAULT;
        }
        return valueSafely;
    }
}
