package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.roomfunction.ToolBarButtonWithTextExperiment;

/* loaded from: classes6.dex */
public final class BN2 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BN2 LJLIL = new BN2();

    public BN2() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(ToolBarButtonWithTextExperiment.class));
    }
}
