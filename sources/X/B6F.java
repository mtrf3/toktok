package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.LiveDrawerDrawOptSetting;

/* loaded from: classes6.dex */
public final class B6F extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6F LJLIL = new B6F();

    public B6F() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LiveDrawerDrawOptSetting.class));
    }
}
