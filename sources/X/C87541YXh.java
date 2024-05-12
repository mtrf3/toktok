package X;

import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;

/* renamed from: X.YXh, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87541YXh extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C87541YXh LJLIL = new C87541YXh();

    public C87541YXh() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Integer invoke() {
        int i;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel adSparkWebViewNewConfigModel = AdSparkWebViewNewConfig.LIZ;
            LJIIIZ.getClass();
            AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel adSparkWebViewNewConfigModel2 = (AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel) FFL.LJIJ(true, "ad_spark_webview_new_config", 31744, AdSparkWebViewNewConfig.AdSparkWebViewNewConfigModel.class, adSparkWebViewNewConfigModel);
            if (adSparkWebViewNewConfigModel2 != null) {
                i = adSparkWebViewNewConfigModel2.loadingJsFmp;
            } else {
                i = 0;
            }
        } catch (Exception unused) {
            i = AdSparkWebViewNewConfig.LIZ.loadingJsFmp;
        }
        return Integer.valueOf(i);
    }
}
