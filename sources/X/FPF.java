package X;

import android.app.Activity;
import android.content.Context;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.CrossPlatformLegacyServiceImpl;
import defpackage.b1;
import defpackage.i0;
import java.util.Locale;
import kotlin.jvm.internal.o;

/* loaded from: classes7.dex */
public final class FPF {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(Context context) {
        o.LJIIIZ(context, "context");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("");
        LIZ2.append(" trill_");
        LIZ2.append(EF7.LIZJ());
        LIZ2.append(" JsSdk/1.0 NetType/");
        String LLJILLL = C16880lQ.LLJILLL(EF7.LIZIZ());
        o.LJIIIIZZ(LLJILLL, "getNetworkAccessType(App….getApplicationContext())");
        String upperCase = LLJILLL.toUpperCase();
        o.LJIIIIZZ(upperCase, "this as java.lang.String).toUpperCase()");
        LIZ2.append(upperCase);
        LIZ2.append(" Channel/");
        LIZ2.append(EF7.LJIILIIL);
        LIZ2.append(" AppName/");
        LIZ2.append(EF7.LIZ());
        LIZ2.append(" app_version/");
        LIZ2.append(EF7.LIZLLL());
        String LIZIZ = X1D.LIZIZ(LIZ2);
        Locale LJFF = CrossPlatformLegacyServiceImpl.LJIJ().LJFF();
        StringBuilder LIZJ = b1.LIZJ(LIZIZ, " ByteLocale/");
        LIZJ.append(LJFF.toLanguageTag());
        StringBuilder LIZJ2 = b1.LIZJ(X1D.LIZIZ(LIZJ), " ByteFullLocale/");
        LIZJ2.append(CrossPlatformLegacyServiceImpl.LJIJ().LIZ());
        StringBuilder LIZJ3 = b1.LIZJ(X1D.LIZIZ(LIZJ2), " Region/");
        LIZJ3.append(C85990Xow.LIZIZ());
        return X1D.LIZIZ(LIZJ3);
    }

    public static String LIZIZ(Context context, WebView webView) {
        String str;
        WebSettings settings;
        String str2 = null;
        if (webView != null && (settings = webView.getSettings()) != null) {
            str = settings.getUserAgentString();
        } else {
            str = null;
        }
        if (!C38354F3m.LJ(str)) {
            QCU.LJLJI = str;
        } else if (!C38354F3m.LJ(QCU.LJLJI)) {
            str = QCU.LJLJI;
        } else {
            try {
                str2 = WebSettings.getDefaultUserAgent(context);
            } catch (Throwable unused) {
            }
            QCU.LJLJI = str2;
            if (!C38354F3m.LJ(str2)) {
                str = QCU.LJLJI;
            } else {
                if (!QCU.LJLJJI && webView == null && (context instanceof Activity)) {
                    QCU.LJLJJI = true;
                    try {
                        WebView webView2 = new WebView(context);
                        QCU.LJLJI = webView2.getSettings().getUserAgentString();
                        webView2.destroy();
                    } catch (Throwable unused2) {
                    }
                }
                str = QCU.LJLJI;
            }
        }
        if (str == null) {
            str = "";
        }
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append(str);
        LIZ2.append(LIZ(context));
        String LIZIZ = X1D.LIZIZ(LIZ2);
        if (webView instanceof WebKitView) {
            String LJFF = i0.LJFF(LIZIZ, " Spark/1.4.2.6-bugfix");
            if (C19N.LJ("fix_spark_user_agent_error", true)) {
                return ujb.o.LJJJJZ(LJFF, " trill_", " musical_ly_", false);
            }
            return LJFF;
        }
        return LIZIZ;
    }
}
