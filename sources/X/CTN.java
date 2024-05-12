package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenUpdateAnchorOptSetting;

/* loaded from: classes6.dex */
public final class CTN extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CTN LJLIL = new CTN();

    public CTN() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenUpdateAnchorOptSetting.class));
    }
}
