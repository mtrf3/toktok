package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.other.LiveDispatchApplyInsetsOptSettings;

/* loaded from: classes6.dex */
public final class BZP extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final BZP LJLIL = new BZP();

    public BZP() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveDispatchApplyInsetsOptSettings.class));
    }
}
