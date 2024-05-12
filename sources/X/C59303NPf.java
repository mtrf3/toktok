package X;

import android.text.TextUtils;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.feed.model.AwemeRawAd;
import java.util.Locale;
import kotlin.jvm.internal.o;
import org.json.JSONObject;

/* renamed from: X.NPf, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59303NPf {
    public static boolean LIZ(C59222NMc c59222NMc) {
        AwemeRawAd awemeRawAd;
        Long creativeId;
        if (c59222NMc != null && (awemeRawAd = c59222NMc.LIZ) != null && (creativeId = awemeRawAd.getCreativeId()) != null && creativeId.longValue() > 0) {
            return true;
        }
        return false;
    }

    public static boolean LIZJ(String str) {
        if (str != null && str.length() != 0) {
            Locale locale = Locale.getDefault();
            o.LJIIIIZZ(locale, "getDefault()");
            String lowerCase = str.toLowerCase(locale);
            o.LJIIIIZZ(lowerCase, "this as java.lang.String).toLowerCase(locale)");
            if (ujb.o.LJJJLIIL(lowerCase, "http://", false)) {
                return true;
            }
            Locale locale2 = Locale.getDefault();
            o.LJIIIIZZ(locale2, "getDefault()");
            String lowerCase2 = str.toLowerCase(locale2);
            o.LJIIIIZZ(lowerCase2, "this as java.lang.String).toLowerCase(locale)");
            if (ujb.o.LJJJLIIL(lowerCase2, "https://", false)) {
                return true;
            }
        }
        return false;
    }

    public static boolean LIZIZ(C59222NMc c59222NMc, String str) {
        if (!LIZ(c59222NMc) || !C78685UuP.LJJJZ(str) || TextUtils.equals(str, "about:blank")) {
            return false;
        }
        return true;
    }

    public static void LIZLLL(int i, WebView webView, String str) {
        if (webView == null) {
            return;
        }
        VMI vmi = VMI.LJ;
        vmi.getClass();
        C60601NqP c60601NqP = new C60601NqP();
        c60601NqP.LJFF = "tt_hybrid_commerce";
        c60601NqP.LIZ(webView);
        C77123UOp.LJJJJZI("first_page", String.valueOf(i), c60601NqP.LJIIIZ);
        C77123UOp.LJJJJZI("bid", "tt_hybrid_commerce", c60601NqP.LJIIIZ);
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("iab_type", str);
        C77123UOp.LJJJJZI("ab_info", jSONObject.toString(), c60601NqP.LJIIIZ);
        vmi.LJIILJJIL(c60601NqP);
    }
}
