package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LivePanelCostTimeModel;
import com.bytedance.android.livesdk.livesetting.performance.PanelOpenCostTimesSetting;

/* renamed from: X.Bo9, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C29885Bo9 extends AbstractC65781Prl implements InterfaceC65784Pro<LivePanelCostTimeModel> {
    public static final C29885Bo9 LJLIL = new C29885Bo9();

    public C29885Bo9() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.LivePanelCostTimeModel, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final LivePanelCostTimeModel invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(PanelOpenCostTimesSetting.class);
        if (valueSafely == 0) {
            return PanelOpenCostTimesSetting.DEFAULT;
        }
        return valueSafely;
    }
}
