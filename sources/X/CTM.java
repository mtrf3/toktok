package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenHeightMaskAdaptivelySetting;

/* loaded from: classes6.dex */
public final class CTM extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CTM LJLIL = new CTM();

    public CTM() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenHeightMaskAdaptivelySetting.class));
    }
}
