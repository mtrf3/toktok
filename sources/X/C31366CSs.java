package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LivePublicScreenSpaceIntervalSetting;

/* renamed from: X.CSs, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C31366CSs extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C31366CSs LJLIL = new C31366CSs();

    public C31366CSs() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LivePublicScreenSpaceIntervalSetting.class));
    }
}
