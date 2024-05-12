package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftGoalAnchorV2Setting;

/* loaded from: classes6.dex */
public final class BHB extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BHB LJLIL = new BHB();

    public BHB() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveGiftGoalAnchorV2Setting.class));
    }
}
