package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DelayWidgetLoadConfig;
import com.bytedance.android.livesdk.livesetting.performance.degrade.DelayWidgetLoadOptSetting;

/* renamed from: X.BsV, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C30155BsV extends AbstractC65781Prl implements InterfaceC65784Pro<DelayWidgetLoadConfig> {
    public static final C30155BsV LJLIL = new C30155BsV();

    public C30155BsV() {
        super(0);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [com.bytedance.android.livesdk.livesetting.performance.degrade.DelayWidgetLoadConfig, java.lang.Object] */
    @Override // X.InterfaceC65784Pro
    public final DelayWidgetLoadConfig invoke() {
        ?? valueSafely = SettingsManager.INSTANCE.getValueSafely(DelayWidgetLoadOptSetting.class);
        if (valueSafely == 0) {
            return new DelayWidgetLoadConfig();
        }
        return valueSafely;
    }
}
