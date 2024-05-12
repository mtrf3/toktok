package X;

import com.bytedance.ies.abmock.SettingsManager;
import com.ss.android.ugc.aweme.ad.feed.ibe.setting.IBELoadRetryConfigSettings;

/* loaded from: classes9.dex */
public final class IOC extends AbstractC65781Prl implements InterfaceC65784Pro<Long> {
    public static final IOC LJLIL = new IOC();

    public IOC() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Long invoke() {
        SettingsManager LIZLLL = SettingsManager.LIZLLL();
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel = IBELoadRetryConfigSettings.LIZ;
        IBELoadRetryConfigSettings.IbeLoadRetryConfigModel ibeLoadRetryConfigModel2 = (IBELoadRetryConfigSettings.IbeLoadRetryConfigModel) LIZLLL.LJIIIIZZ("ibe_load_retry_config", IBELoadRetryConfigSettings.IbeLoadRetryConfigModel.class, ibeLoadRetryConfigModel);
        if (ibeLoadRetryConfigModel2 != null) {
            ibeLoadRetryConfigModel = ibeLoadRetryConfigModel2;
        }
        return Long.valueOf(ibeLoadRetryConfigModel.loadTimeoutMS);
    }
}
