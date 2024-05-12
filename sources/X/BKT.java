package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.LiveJitBlockSetting;

/* loaded from: classes6.dex */
public final class BKT extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BKT LJLIL = new BKT();

    public BKT() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        Boolean bool = (Boolean) SettingsManager.INSTANCE.getValueSafely(LiveJitBlockSetting.class);
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = LiveJitBlockSetting.DEFAULT;
        }
        return Boolean.valueOf(z);
    }
}
