package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.performance.degrade.ViewAutoPreloadOptSetting;

/* loaded from: classes6.dex */
public final class B6E extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6E LJLIL = new B6E();

    public B6E() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(ViewAutoPreloadOptSetting.class));
    }
}
