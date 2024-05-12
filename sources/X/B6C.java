package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.InboxSameFlowSetting;

/* loaded from: classes6.dex */
public final class B6C extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6C LJLIL = new B6C();

    public B6C() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        if (SettingsManager.INSTANCE.getBooleanValue(InboxSameFlowSetting.class) == InboxSameFlowSetting.ENABLE) {
            z = true;
        } else {
            z = false;
        }
        return Boolean.valueOf(z);
    }
}
