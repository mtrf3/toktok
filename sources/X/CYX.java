package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.RankOptimizeSetting;

/* loaded from: classes6.dex */
public final class CYX extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final CYX LJLIL = new CYX();

    public CYX() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Boolean bool = (Boolean) SettingsManager.INSTANCE.getValueSafely(RankOptimizeSetting.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = RankOptimizeSetting.DEFAULT;
        }
        return Boolean.valueOf(z);
    }
}
