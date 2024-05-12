package X;

import android.net.Uri;
import android.webkit.WebResourceResponse;
import com.bytedance.ies.abmock.SettingsManager;
import com.bytedance.mt.protector.impl.UriProtector;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class E34 {
    public static WebResourceResponse LIZ(String str) {
        boolean z;
        if (str == null || str.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        SettingsManager.LIZLLL().getClass();
        C56582Jy[] c56582JyArr = (C56582Jy[]) SettingsManager.LJII("ecommerce_buynow_config", C56582Jy[].class);
        if (c56582JyArr != null && c56582JyArr.length != 0) {
            android.net.Uri parse = UriProtector.parse(str);
            if (parse.getScheme() != null && (o.LJ(parse.getScheme(), "http") || o.LJ(parse.getScheme(), "https"))) {
                try {
                    LIZIZ(parse, c56582JyArr);
                } catch (Exception unused) {
                }
            }
        }
        return null;
    }

    public static WebResourceResponse LIZIZ(android.net.Uri uri, C56582Jy[] c56582JyArr) {
        String uri2 = new Uri.Builder().scheme(uri.getScheme()).authority(uri.getAuthority()).path(uri.getPath()).build().toString();
        o.LJIIIIZZ(uri2, "Builder()\n            .s…      .build().toString()");
        if (c56582JyArr.length <= 0) {
            return null;
        }
        c56582JyArr[0].getClass();
        s.LJJJLZIJ(uri2, null, false);
        throw null;
    }
}
