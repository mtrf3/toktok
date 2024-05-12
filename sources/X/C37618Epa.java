package X;

import android.os.Handler;
import android.os.Looper;
import android.webkit.WebSettings;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.string2number.CastIntegerProtector;
import java.util.Locale;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.Epa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37618Epa {
    public static final int LIZJ(WebView webView) {
        WebSettings settings;
        String userAgentString;
        Object LIZ;
        o.LJ(((Handler) C37613EpV.LIZJ.getValue()).getLooper(), Looper.myLooper());
        if (webView == null || (settings = webView.getSettings()) == null || (userAgentString = settings.getUserAgentString()) == null) {
            return -1;
        }
        try {
            Locale locale = Locale.getDefault();
            o.LJFF(locale, "Locale.getDefault()");
            String lowerCase = userAgentString.toLowerCase(locale);
            o.LJFF(lowerCase, "(this as java.lang.String).toLowerCase(locale)");
            String LJLLI = s.LJLLI(lowerCase, "chrome/", lowerCase);
            LIZ = Integer.valueOf(CastIntegerProtector.parseInt(s.LJLLL(LJLLI, ".", LJLLI)));
            C3C5.m7constructorimpl(LIZ);
        } catch (Throwable th) {
            LIZ = C141335gf.LIZ(th);
            C3C5.m7constructorimpl(LIZ);
        }
        if (C3C5.m12isFailureimpl(LIZ)) {
            LIZ = -1;
        }
        return ((Number) LIZ).intValue();
    }

    public static final void LIZ(String str, StringBuilder sb) {
        if (str == null) {
            return;
        }
        sb.append("(\"");
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '\r') {
                if (charAt != '\"') {
                    if (charAt != '\'') {
                        if (charAt != '\\') {
                            switch (charAt) {
                                case '\b':
                                    sb.append("\\b");
                                    break;
                                case '\t':
                                    sb.append("\\t");
                                    break;
                                case '\n':
                                    sb.append("\\n");
                                    break;
                                default:
                                    sb.append(charAt);
                                    break;
                            }
                        } else {
                            sb.append("\\\\");
                        }
                    } else {
                        sb.append("\\'");
                    }
                } else {
                    sb.append("\\\"");
                }
            } else {
                sb.append("\\r");
            }
        }
        sb.append("\")");
    }

    public static final void LIZIZ(WebView webView, String script, BQ6<String> bq6) {
        o.LJIIJ(script, "script");
        if (webView != null) {
            webView.evaluateJavascript(script, new C37617EpZ(bq6));
        }
    }
}
