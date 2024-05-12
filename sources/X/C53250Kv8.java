package X;

import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewJSBConfig;

/* renamed from: X.Kv8, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C53250Kv8 extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C53250Kv8 LJLIL = new C53250Kv8();

    public C53250Kv8() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            AdSparkWebViewJSBConfig.AdSparkWebViewJSBConfigModel adSparkWebViewJSBConfigModel = AdSparkWebViewJSBConfig.LIZ;
            LJIIIZ.getClass();
            z = true;
            AdSparkWebViewJSBConfig.AdSparkWebViewJSBConfigModel adSparkWebViewJSBConfigModel2 = (AdSparkWebViewJSBConfig.AdSparkWebViewJSBConfigModel) FFL.LJIJ(true, "ad_spark_webview_jsb_config", 31744, AdSparkWebViewJSBConfig.AdSparkWebViewJSBConfigModel.class, adSparkWebViewJSBConfigModel);
            if (adSparkWebViewJSBConfigModel2 != null) {
                z = adSparkWebViewJSBConfigModel2.jsbLazyRegister;
            }
        } catch (Exception unused) {
            z = AdSparkWebViewJSBConfig.LIZ.jsbLazyRegister;
        }
        return Boolean.valueOf(z);
    }
}
