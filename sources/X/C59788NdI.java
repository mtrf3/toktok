package X;

import android.app.Application;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import com.ss.android.ugc.aweme.web.experiment.AdSparkWebViewNewConfig;
import com.zhiliaoapp.musically.R;
import kotlin.jvm.internal.o;

/* renamed from: X.NdI, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59788NdI extends AbstractC59790NdK {
    public final SparkContext LIZ;
    public final InterfaceC59494NWo LIZIZ;
    public final NUM LIZJ;

    @Override // X.AbstractC59790NdK
    public final View LIZ() {
        Object obj = this.LIZJ;
        if (obj instanceof View) {
            return (View) obj;
        }
        return null;
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
        return new C61419O8p(sparkContext, new C59789NdJ(this), new C60774NtC(this), Boolean.valueOf(((Boolean) AdSparkWebViewNewConfig.LJFF.getValue()).booleanValue()), str, ((Number) AdSparkWebViewNewConfig.LJ.getValue()).intValue(), LIZIZ);
    }

    public C59788NdI(AdSparkContext adSparkContext, InterfaceC59494NWo interfaceC59494NWo, NUM num) {
        this.LIZ = adSparkContext;
        this.LIZIZ = interfaceC59494NWo;
        this.LIZJ = num;
    }
}
