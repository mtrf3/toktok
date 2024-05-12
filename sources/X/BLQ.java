package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.TopLiveDelayCreateFragmentSetting;

/* loaded from: classes6.dex */
public final class BLQ extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BLQ LJLIL = new BLQ();

    public BLQ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z = true;
        if (SettingsManager.INSTANCE.getIntValue(TopLiveDelayCreateFragmentSetting.class) != 1) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
