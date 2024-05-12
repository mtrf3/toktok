package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LivePublicScreenRequestLayoutOptSetting;

/* loaded from: classes6.dex */
public final class C5P extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C5P LJLIL = new C5P();

    public C5P() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenRequestLayoutOptSetting.class));
    }
}
