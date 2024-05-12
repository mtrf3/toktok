package X;

import com.bytedance.mt.protector.impl.UriProtector;
import defpackage.i0;
import java.net.URLEncoder;
import kotlin.jvm.internal.o;

/* renamed from: X.AIn, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C26005AIn {
    public static final /* synthetic */ int LIZ = 0;

    public static String LIZ(String str, String str2, String appId, String str3) {
        o.LJIIIZ(appId, "appId");
        String builder = UriProtector.parse(str).buildUpon().appendQueryParameter("app_id", appId).appendQueryParameter("verify_ticket", str2).appendQueryParameter("passport_domain", str3).toString();
        o.LJIIIIZZ(builder, "urlWithAppId\n           …)\n            .toString()");
        return builder;
    }

    public static String LIZIZ(int i, String url, String passportDomain, String verifyTicket) {
        boolean z;
        String str;
        o.LJIIIZ(url, "url");
        o.LJIIIZ(passportDomain, "passportDomain");
        o.LJIIIZ(verifyTicket, "verifyTicket");
        String encode = URLEncoder.encode(url, "UTF-8");
        StringBuilder LIZ2 = X1D.LIZ();
        LIZ2.append("aweme://pns/open_url_with_token?url=");
        LIZ2.append(encode);
        LIZ2.append("&enter_from=underage&in_app=");
        LIZ2.append(i);
        if (verifyTicket.length() > 0) {
            z = true;
        } else {
            z = false;
        }
        String str2 = "";
        if (!z) {
            str = "";
        } else {
            str = i0.LJFF("&verify_ticket=", verifyTicket);
        }
        LIZ2.append(str);
        if (passportDomain.length() > 0) {
            str2 = i0.LJFF("&passport_domain=", passportDomain);
        }
        LIZ2.append(str2);
        return X1D.LIZIZ(LIZ2);
    }
}
