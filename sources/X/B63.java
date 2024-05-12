package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveAdminStatusDialogChangeSetting;

/* loaded from: classes6.dex */
public final class B63 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B63 LJLIL = new B63();

    public B63() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveAdminStatusDialogChangeSetting.class));
    }
}
