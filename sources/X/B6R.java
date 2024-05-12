package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LivePublicScreenShortenThresholdSetting;

/* loaded from: classes6.dex */
public final class B6R extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final B6R LJLIL = new B6R();

    public B6R() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenShortenThresholdSetting.class));
    }
}
