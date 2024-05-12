package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.subscription.LiveSubCapsuleNotFilterSceneSetting;

/* loaded from: classes6.dex */
public final class CBK extends AbstractC65781Prl implements InterfaceC65784Pro<String[]> {
    public static final CBK LJLIL = new CBK();

    public CBK() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final String[] invoke() {
        String[] stringArrayValue = SettingsManager.INSTANCE.getStringArrayValue(LiveSubCapsuleNotFilterSceneSetting.class);
        if (stringArrayValue.length == 0) {
            return LiveSubCapsuleNotFilterSceneSetting.INSTANCE.getDEFAULT();
        }
        return stringArrayValue;
    }
}
