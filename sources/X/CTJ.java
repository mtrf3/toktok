package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveGameBottomGradientAlphaSettingSetting;

/* loaded from: classes6.dex */
public final class CTJ extends AbstractC65781Prl implements InterfaceC65784Pro<Float> {
    public static final CTJ LJLIL = new CTJ();

    public CTJ() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Float invoke() {
        return Float.valueOf((float) SettingsManager.INSTANCE.getDoubleValue(LiveGameBottomGradientAlphaSettingSetting.class));
    }
}
