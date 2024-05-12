package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalBannerEnabledSetting;

/* renamed from: X.BpE, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29952BpE extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C29952BpE LJLIL = new C29952BpE();

    public C29952BpE() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGiftGoalBannerEnabledSetting.class));
    }
}
