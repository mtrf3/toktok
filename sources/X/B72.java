package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LCCPerceptionExpSetting;

/* loaded from: classes6.dex */
public final class B72 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B72 LJLIL = new B72();

    public B72() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LCCPerceptionExpSetting.class));
    }
}
