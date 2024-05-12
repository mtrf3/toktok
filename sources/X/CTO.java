package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUpdateOptSetting;

/* loaded from: classes6.dex */
public final class CTO extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CTO LJLIL = new CTO();

    public CTO() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenUpdateOptSetting.class));
    }
}
