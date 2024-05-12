package X;

import com.bytedance.android.live_settings.SettingsManager;
import com.bytedance.android.livesdk.livesetting.watchlive.enterroom.LivePlayAbnormalReportSetting;

/* loaded from: classes6.dex */
public final class B6G extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final B6G LJLIL = new B6G();

    public B6G() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        return Boolean.valueOf(SettingsManager.INSTANCE.getBooleanValue(LivePlayAbnormalReportSetting.class));
    }
}
