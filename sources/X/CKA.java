package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeSetting;

/* loaded from: classes6.dex */
public final class CKA extends AbstractC65781Prl implements InterfaceC65784Pro<ScalableDowngradeConfig> {
    public static final CKA LJLIL = new CKA();

    public CKA() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.degrade.hotroom.ScalableDowngradeConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final ScalableDowngradeConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(ScalableDowngradeSetting.class);
        if (valueSafely == 0) {
            return ScalableDowngradeSetting.DEFAULT;
        }
        return valueSafely;
    }
}
