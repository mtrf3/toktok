package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveSlideUpGuideStrategySetting;

/* loaded from: classes6.dex */
public final class BKO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final BKO LJLIL = new BKO();

    public BKO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveSlideUpGuideStrategySetting.class));
    }
}
