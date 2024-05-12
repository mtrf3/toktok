package X;

import android.net.Uri;
import android.webkit.WebView;
import com.bytedance.mt.protector.impl.UriProtector;
import com.zhiliaoapp.musically.R;
import java.util.LinkedHashMap;
import kotlin.jvm.internal.o;

/* renamed from: X.EsW, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C37800EsW {
    public static C37801EsX LIZ(WebView webView, String str, boolean z) {
        java.util.Map linkedHashMap;
        if (webView != null && str != null) {
            FC2.LIZ.getClass();
            if (((Boolean) FC2.LJII.getValue()).booleanValue() && z) {
                Object tag = webView.getTag(R.id.lsw);
                if (!C65777Prh.LJII(tag) || (linkedHashMap = (java.util.Map) tag) == null) {
                    linkedHashMap = new LinkedHashMap();
                    webView.setTag(R.id.lsw, linkedHashMap);
                }
                C37801EsX c37801EsX = (C37801EsX) linkedHashMap.get(str);
                if (c37801EsX == null) {
                    C37800EsW c37800EsW = C37801EsX.LJIIIIZZ;
                    android.net.Uri parse = UriProtector.parse(str);
                    o.LJIIIIZZ(parse, "parse(url)");
                    c37800EsW.getClass();
                    String path = parse.getPath();
                    if (path != null && ujb.o.LJJJJ(path, "/", false)) {
                        Uri.Builder buildUpon = parse.buildUpon();
                        String substring = path.substring(0, path.length() - 1);
                        o.LJIIIIZZ(substring, "this as java.lang.String…ing(startIndex, endIndex)");
                        parse = buildUpon.path(substring).build();
                        o.LJIIIIZZ(parse, "uri.buildUpon().path(it.…(it.length - 1))).build()");
                    }
                    C37801EsX c37801EsX2 = (C37801EsX) linkedHashMap.get(parse.toString());
                    if (c37801EsX2 == null) {
                        C37801EsX c37801EsX3 = new C37801EsX();
                        c37801EsX3.LIZJ = str;
                        linkedHashMap.put(str, c37801EsX3);
                        return c37801EsX3;
                    }
                    return c37801EsX2;
                }
                return c37801EsX;
            }
        }
        return null;
    }
}
