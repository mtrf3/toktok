package X;

import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;

/* renamed from: X.YXk, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87544YXk extends AbstractC65781Prl implements InterfaceC65784Pro<Integer> {
    public static final C87544YXk LJLIL = new C87544YXk();

    public C87544YXk() {
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
                i = adSparkWebViewNewConfigModel2.useWebViewTitle;
            } else {
                i = 2;
            }
        } catch (Exception unused) {
            i = AdSparkWebViewNewConfig.LIZ.useWebViewTitle;
        }
        return Integer.valueOf(i);
    }
}
