package X;

import android.app.Application;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NdH, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59787NdH extends AbstractC59790NdK {
    public final SparkContext LIZ;
    public final InterfaceC59499NWt LIZIZ;

    @Override // X.AbstractC59790NdK
    public final View LIZ() {
        C59572NZo c59572NZo;
        InterfaceC59499NWt interfaceC59499NWt = this.LIZIZ;
        if (interfaceC59499NWt != null) {
            c59572NZo = interfaceC59499NWt.LIZ();
        } else {
            c59572NZo = null;
        }
        if (!(c59572NZo instanceof View)) {
            return null;
        }
        return c59572NZo;
    }

    @Override // X.AbstractC59790NdK
    public final View LIZIZ() {
        C39836FkG.LJII.getClass();
        Application LIZIZ = C38262Ezy.LIZ().LIZIZ();
        SparkContext sparkContext = this.LIZ;
        C59222NMc c59222NMc = (C59222NMc) sparkContext.LIZIZ(C59222NMc.class);
        String str = null;
        if (c59222NMc != null) {
            str = c59222NMc.LIZIZ;
        }
        if (!C78685UuP.LJJJZ(str) || str == null) {
            str = C38262Ezy.LIZ().LIZIZ().getString(R.string.rkd);
            o.LJIIIIZZ(str, "HybridEnvironment.instan….string.ss_title_browser)");
        }
        return new C61419O8p(sparkContext, new C59786NdG(this), new C60773NtB(this), Boolean.valueOf(((Boolean) AdSparkWebViewNewConfig.LJFF.getValue()).booleanValue()), str, ((Number) AdSparkWebViewNewConfig.LJ.getValue()).intValue(), LIZIZ);
    }

    public C59787NdH(AdSparkHybridContext adSparkHybridContext, InterfaceC59499NWt interfaceC59499NWt) {
        this.LIZ = adSparkHybridContext;
        this.LIZIZ = interfaceC59499NWt;
    }
}
