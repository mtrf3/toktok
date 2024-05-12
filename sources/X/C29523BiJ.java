package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftGuideUserLevelSparkSetting;

/* renamed from: X.BiJ, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29523BiJ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29523BiJ LJLIL = new C29523BiJ();

    public C29523BiJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGiftGuideUserLevelSparkSetting.class));
    }
}
