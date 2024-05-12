package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.broadcast.LiveCenterNativeSetting;

/* loaded from: classes6.dex */
public final class C55 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C55 LJLIL = new C55();

    public C55() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        int intValue = SettingsManager.INSTANCE.getIntValue(LiveCenterNativeSetting.class);
        boolean z = true;
        if (1 > intValue || intValue >= 3) {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
