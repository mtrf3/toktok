package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveGiftOptimizationOptionSetting;

/* renamed from: X.Mx0, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58462Mx0 extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C58462Mx0 LJLIL = new C58462Mx0();

    public C58462Mx0() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveGiftOptimizationOptionSetting.class));
    }
}
