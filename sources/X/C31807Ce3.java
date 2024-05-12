package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveLogDeepCopySetting;

/* renamed from: X.Ce3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31807Ce3 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C31807Ce3 LJLIL = new C31807Ce3();

    public C31807Ce3() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean booleanValue;
        if (C30922CBq.LIZIZ) {
            booleanValue = true;
        } else {
            booleanValue = SettingsManager.INSTANCE.getBooleanValue(LiveLogDeepCopySetting.class);
        }
        return Boolean.valueOf(booleanValue);
    }
}
