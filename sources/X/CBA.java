package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.publicscreen.LiveSubCapsuleGovernanceSetting;

/* loaded from: classes6.dex */
public final class CBA extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final CBA LJLIL = new CBA();

    public CBA() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        return Integer.valueOf(SettingsManager.INSTANCE.getIntValue(LiveSubCapsuleGovernanceSetting.class));
    }
}
