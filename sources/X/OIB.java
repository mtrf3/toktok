package X;

import Y.ARunnableS29S0200000_10;
import android.content.Context;
import android.text.TextUtils;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.falconx.statistic.InterceptorModel;
import com.ss.android.common.applog.AppLog;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.regex.Pattern;

/* loaded from: classes11.dex */
public final class OIB {
    public OIH LIZ;
    public NJM LIZIZ;
    public final String LIZJ;
    public final OIK LIZLLL;

    public OIB(String str) {
        OIK oik = new OIK();
        this.LIZLLL = oik;
        Context LIZIZ = EF7.LIZIZ();
        String LIZLLL = EF7.LIZLLL();
        String serverDeviceId = AppLog.getServerDeviceId();
        if (!TextUtils.isEmpty(str)) {
            String LIZIZ2 = C85990Xow.LIZIZ();
            String substring = str.substring(str.lastIndexOf("/") + 1);
            this.LIZJ = substring;
            OIG oig = new OIG(LIZIZ);
            oig.LIZIZ = substring;
            oig.LJFF = new ArrayList();
            oig.LJII = serverDeviceId;
            oig.LIZJ = LIZLLL;
            oig.LJIIIZ = TextUtils.isEmpty(LIZIZ2) ? "unknow" : LIZIZ2;
            oig.LJIIIIZZ = C38943FQd.LIZIZ();
            oig.LIZLLL = oik;
            oig.LJ = false;
            oig.LJI = Arrays.asList(android.net.Uri.fromFile(new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX")));
            this.LIZ = new OIH(new OIC(oig));
        }
    }

    public final void LIZIZ(List list) {
        String LIZIZ = C85990Xow.LIZIZ();
        OIG oig = new OIG(EF7.LIZIZ());
        oig.LIZIZ = this.LIZJ;
        oig.LJFF = list;
        oig.LJIIIIZZ = C38943FQd.LIZIZ();
        oig.LIZLLL = this.LIZLLL;
        oig.LJ = false;
        oig.LJI = Arrays.asList(android.net.Uri.fromFile(new File(C16880lQ.LLIIJLIL(EF7.LIZIZ()), "offlineX")));
        oig.LJII = AppLog.getServerDeviceId();
        oig.LIZJ = EF7.LIZLLL();
        if (TextUtils.isEmpty(LIZIZ)) {
            LIZIZ = "unknow";
        }
        oig.LJIIIZ = LIZIZ;
        this.LIZ = new OIH(new OIC(oig));
    }

    public final WebResourceResponse LIZ(WebView webView, String str) {
        WebResourceResponse LIZ;
        NJM njm = this.LIZIZ;
        if (njm != null && (LIZ = njm.LIZ(str)) != null) {
            return LIZ;
        }
        try {
            OIH oih = this.LIZ;
            if (oih != null && oih.LIZIZ) {
                try {
                    oih.LIZ.getClass();
                    OID oid = oih.LIZJ;
                    oid.getClass();
                    try {
                        List<Pattern> list = oid.LIZ.LIZJ;
                        if (list != null && !list.isEmpty() && !TextUtils.isEmpty(str)) {
                            InterceptorModel interceptorModel = new InterceptorModel();
                            interceptorModel.url = str;
                            WebResourceResponse LIZ2 = oid.LIZ(webView, str, interceptorModel);
                            if (LIZ2 == null && interceptorModel.offlineRule != null) {
                                oid.LIZJ.post(new ARunnableS29S0200000_10(webView, interceptorModel, 69));
                            }
                            return LIZ2;
                        }
                        return null;
                    } catch (Exception e) {
                        OC6.LJ("WebOffline-falcon", "shouldInterceptRequest:", e);
                        return null;
                    }
                } catch (Throwable th) {
                    OC6.LJ("WebOffline-falcon", "shouldInterceptRequest:", th);
                    return null;
                }
            }
            return null;
        } catch (Exception e2) {
            C16880lQ.LLLLIIL(e2);
            return null;
        }
    }
}
