package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelCacheOptSettings;
import com.bytedance.android.livesdk.livesetting.gift.SettingParams;

/* renamed from: X.Cls, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C32292Cls extends AbstractC65781Prl implements InterfaceC65784Pro<SettingParams> {
    public static final C32292Cls LJLIL = new C32292Cls();

    public C32292Cls() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.gift.SettingParams] */
    @Override // X.InterfaceC65784Pro
    public final SettingParams invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(LiveGiftPanelCacheOptSettings.class);
        if (valueSafely == 0) {
            return LiveGiftPanelCacheOptSettings.INSTANCE.getDEFAULT();
        }
        return valueSafely;
    }
}
