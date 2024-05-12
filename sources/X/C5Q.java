package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.RoomSlowFunctionOptSetting;

/* loaded from: classes6.dex */
public final class C5Q extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5Q LJLIL = new C5Q();

    public C5Q() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(RoomSlowFunctionOptSetting.class));
    }
}
