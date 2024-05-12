package X;

import android.app.Application;
import com.bytedance.hybrid.spark.SparkContext;
import com.bytedance.mt.protector.impl.UriProtector;
import com.ss.android.ugc.aweme.settings.SparkWebViewOptimizeExperiment;
import com.ss.android.ugc.aweme.web.business.preload.AdWebViewInterceptorService;
import com.ss.android.ugc.aweme.web.intercept.forest.AdWebViewForestServiceImpl;
import kotlin.jvm.internal.o;
import ql1.IDbS498S0100000_10;
import ujb.s;

/* renamed from: X.FlD, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C39895FlD extends AbstractC40122Fos {
    @Override // X.AbstractC40122Fos
    public final String LJI() {
        return "crossPlatform";
    }

    public static void LJII(SparkContext sparkContext, boolean z) {
        C59222NMc c59222NMc = (C59222NMc) sparkContext.LIZIZ(C59222NMc.class);
        if (c59222NMc != null) {
            C39836FkG.LJII.getClass();
            Application LIZIZ = C38262Ezy.LIZ().LIZIZ();
            NJH LIZIZ2 = AdWebViewForestServiceImpl.LIZJ().LIZIZ(z);
            LIZIZ2.LJI(c59222NMc);
            C39902FlK LIZ = AdWebViewInterceptorService.LIZJ().LIZ(LIZIZ, c59222NMc, LIZIZ2);
            sparkContext.LJJIIJZLJL("use_forest", true);
            sparkContext.LJII(C39902FlK.class, LIZ);
            sparkContext.LJII(InterfaceC39904FlM.class, LIZIZ2);
            InterfaceC40155FpP interfaceC40155FpP = (InterfaceC40155FpP) sparkContext.LIZIZ(InterfaceC40155FpP.class);
            if (interfaceC40155FpP != null) {
                interfaceC40155FpP.LIZLLL(new C39896FlE(LIZ));
            }
        }
    }

    @Override // X.AbstractC40122Fos
    public final void LJ(SparkContext sparkContext, String str) {
        String queryParameter;
        String queryParameter2;
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJ(sparkContext, str);
        sparkContext.bidFrom = "crossPlatform";
        if (SparkWebViewOptimizeExperiment.LIZ().enableLazyBridge && (((queryParameter = UriProtector.getQueryParameter(C17N.LJJJJIZL(sparkContext.url), "target_handler")) != null && s.LJJJLZIJ(queryParameter, "pa_incentive", false)) || ((queryParameter2 = UriProtector.getQueryParameter(C17N.LJJJJIZL(sparkContext.url), "business_from")) != null && s.LJJJLZIJ(queryParameter2, "pa_incentive", false)))) {
            sparkContext.jsbOptimize = true;
            F04 f04 = new F04(true, 1);
            sparkContext.LJII(C37944Euq.class, f04);
            C61483OBb.LIZJ.getClass();
            C61484OBc.LIZIZ().LIZ("crossPlatform", InterfaceC39933Flp.class, new C39891Fl9(new F08(f04)));
        } else {
            F04 f042 = new F04(false, 1);
            sparkContext.LJII(C37944Euq.class, f042);
            C61483OBb.LIZJ.getClass();
            C61484OBc.LIZIZ().LIZ("crossPlatform", InterfaceC39933Flp.class, new C39891Fl9(new F07(f042)));
        }
        sparkContext.LJII(AbstractC37353ElJ.class, new FBX(sparkContext));
        sparkContext.LJJI(new IDbS498S0100000_10(sparkContext, 3));
        sparkContext.LJJ(new C60644Nr6(sparkContext));
        LJII(sparkContext, false);
    }

    @Override // X.AbstractC40122Fos
    public final void LJFF(SparkContext sparkContext, String str) {
        o.LJIIIZ(sparkContext, "sparkContext");
        super.LJFF(sparkContext, str);
        sparkContext.LJII(AbstractC37353ElJ.class, new FBX(sparkContext));
        sparkContext.LJJI(new IDbS498S0100000_10(sparkContext, 3));
        sparkContext.LJJ(new C60644Nr6(sparkContext));
        LJII(sparkContext, true);
    }
}
