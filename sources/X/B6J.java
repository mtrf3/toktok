package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveConstraintLayoutOptSetting;

/* loaded from: classes6.dex */
public final class B6J extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B6J LJLIL = new B6J();

    public B6J() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveConstraintLayoutOptSetting.class));
    }
}
