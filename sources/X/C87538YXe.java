package X;

import com.ss.android.ugc.aweme.web.experiment.CommerceWebCrossToSparkExt;

/* renamed from: X.YXe, reason: case insensitive filesystem */
/* loaded from: classes17.dex */
public final class C87538YXe extends AbstractC65781Prl implements InterfaceC65784Pro<Boolean> {
    public static final C87538YXe LJLIL = new C87538YXe();

    public C87538YXe() {
        super(0);
    }

    @Override // X.InterfaceC65784Pro
    public final Boolean invoke() {
        boolean z;
        CommerceWebCrossToSparkExt.CommerceWebCrossToSparkModel commerceWebCrossToSparkModel;
        try {
            FFL LJIIIZ = FFL.LJIIIZ();
            CommerceWebCrossToSparkExt.CommerceWebCrossToSparkModel commerceWebCrossToSparkModel2 = CommerceWebCrossToSparkExt.LIZ;
            LJIIIZ.getClass();
            z = true;
            commerceWebCrossToSparkModel = (CommerceWebCrossToSparkExt.CommerceWebCrossToSparkModel) FFL.LJIJ(true, "commerce_web_cross_to_spark", 31744, CommerceWebCrossToSparkExt.CommerceWebCrossToSparkModel.class, commerceWebCrossToSparkModel2);
        } catch (Exception unused) {
            z = CommerceWebCrossToSparkExt.LIZ.niniScreen;
        }
        if (commerceWebCrossToSparkModel != null) {
            if (commerceWebCrossToSparkModel.niniScreen) {
                return Boolean.valueOf(z);
            }
        }
        z = false;
        return Boolean.valueOf(z);
    }
}
