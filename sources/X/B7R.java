package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.LiveEnableSlardarSetting;

/* loaded from: classes6.dex */
public final class B7R extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B7R LJLIL = new B7R();

    public B7R() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveEnableSlardarSetting.class));
    }
}
