package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting;

/* loaded from: classes6.dex */
public final class CGX extends AbstractC65781Prl implements InterfaceC65784Pro<LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig> {
    public static final CGX LJLIL = new CGX();

    public CGX() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, com.bytedance.android.livesdk.livesetting.gift.LiveGiftPanelLoadingOptimizationSetting$GiftPanelOptimizationConfig] */
    @Override // X.InterfaceC65784Pro
    public final LiveGiftPanelLoadingOptimizationSetting.GiftPanelOptimizationConfig invoke() {
        return SettingsManager.INSTANCE.getValueSafely(LiveGiftPanelLoadingOptimizationSetting.class);
    }
}
