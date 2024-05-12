package X;

import android.graphics.Bitmap;
import android.webkit.WebView;
import com.bytedance.hybrid.spark.SparkContext;
import com.ss.android.ugc.aweme.share.ShareH5Service;

/* loaded from: classes11.dex */
public final class NXG extends AbstractC60423NnX {
    public final /* synthetic */ C60412NnM LJLIL;

    @Override // X.AbstractC60536NpM
    public final AbstractC60629Nqr<?> getExtension() {
        return this.LJLIL;
    }

    public NXG(C60412NnM c60412NnM) {
        this.LJLIL = c60412NnM;
    }

    @Override // X.AbstractC60423NnX
    public final void LJ(WebView webView, String str) {
        AbstractC37353ElJ abstractC37353ElJ;
        super.LJ(webView, str);
        SparkContext sparkContext = this.LJLIL.LJLJL;
        if (sparkContext != null && (abstractC37353ElJ = (AbstractC37353ElJ) sparkContext.LIZIZ(AbstractC37353ElJ.class)) != null) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJI(abstractC37353ElJ, true);
        }
    }

    @Override // X.AbstractC60423NnX
    public final void LJFF(WebView webView, String str, Bitmap bitmap) {
        AbstractC37353ElJ abstractC37353ElJ;
        AbstractC37353ElJ abstractC37353ElJ2;
        super.LJFF(webView, str, bitmap);
        SparkContext sparkContext = this.LJLIL.LJLJL;
        if (sparkContext != null && (abstractC37353ElJ2 = (AbstractC37353ElJ) sparkContext.LIZIZ(AbstractC37353ElJ.class)) != null) {
            ShareH5Service.LIZ.getClass();
            ShareH5Service LIZ = C58149Mrx.LIZ();
            if (str == null) {
                str = "";
            }
            LIZ.LJJIFFI(abstractC37353ElJ2, str);
        }
        SparkContext sparkContext2 = this.LJLIL.LJLJL;
        if (sparkContext2 != null && (abstractC37353ElJ = (AbstractC37353ElJ) sparkContext2.LIZIZ(AbstractC37353ElJ.class)) != null) {
            ShareH5Service.LIZ.getClass();
            C58149Mrx.LIZ().LJI(abstractC37353ElJ, false);
        }
    }
}
