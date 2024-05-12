package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.EnableRecycleSingleWidgetSetting;

/* loaded from: classes6.dex */
public final class B97 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B97 LJLIL = new B97();

    public B97() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(EnableRecycleSingleWidgetSetting.class));
    }
}
