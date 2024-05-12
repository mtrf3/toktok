package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting;

/* renamed from: X.CEl, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30995CEl extends AbstractC65781Prl implements InterfaceC65784Pro<OnlineAudienceGeckoSetting.Config> {
    public static final C30995CEl LJLIL = new C30995CEl();

    public C30995CEl() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.rank.OnlineAudienceGeckoSetting$Config] */
    @Override // X.InterfaceC65784Pro
    public final OnlineAudienceGeckoSetting.Config invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(OnlineAudienceGeckoSetting.class);
        if (valueSafely == 0) {
            return OnlineAudienceGeckoSetting.DEFAULT;
        }
        return valueSafely;
    }
}
