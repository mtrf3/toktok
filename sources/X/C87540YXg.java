package X;

import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;

/* renamed from: X.YXg, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87540YXg extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87540YXg LJLIL = new C87540YXg();

    public C87540YXg() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel adSparkWebViewNewConfigModel = AdSparkWebViewNewConfig.LIZ;
            LJIIIZ.getClass();
            AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel adSparkWebViewNewConfigModel2 = (AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel) FFL.LJIJ(true, "ad_spark_webview_new_config", 31744, AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel.class, adSparkWebViewNewConfigModel);
            if (adSparkWebViewNewConfigModel2 != null) {
                z = adSparkWebViewNewConfigModel2.hideLoadingJs;
            } else {
                z = false;
            }
        } catch (Exception unused) {
            z = AdSparkWebViewNewConfig.LIZ.hideLoadingJs;
        }
        return Boolean.valueOf(z);
    }
}
