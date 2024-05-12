package com.ss.android.ugc.aweme.net.interceptor;

import X.C38281F0r;
import X.C38333F2r;
import X.C48153Iv7;
import X.C64697PaH;
import X.C64797Pbt;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.FFL;
import X.InterfaceC37216Ej6;
import android.text.TextUtils;
import com.bytedance.mt.protector.impl.PatternProtector;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.common.util.NetworkUtils;
import java.security.GeneralSecurityException;
import java.util.regex.Pattern;
import javax.net.ssl.SSLException;

/* loaded from: classes12.dex */
public class FeedRetryInterceptorTTNet implements InterfaceC37216Ej6 {
    public static final Pattern LJLIL = PatternProtector.compile(".*/aweme/v\\d/feed.*");

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        boolean z;
        String str;
        C64697PaH c64697PaH;
        try {
            return ((F7S) fbz).LIZ(((F7S) fbz).LIZJ);
        } catch (Exception e) {
            if (!(e instanceof C38333F2r)) {
                F7S f7s = (F7S) fbz;
                Request request = f7s.LIZJ;
                C48153Iv7 c48153Iv7 = new C48153Iv7();
                C64908Pdg newBuilder = request.newBuilder();
                newBuilder.LJIIJ = c48153Iv7;
                if ((request.getExtraInfo() instanceof C48153Iv7) && (c64697PaH = (C64697PaH) request.getExtraInfo()) != null) {
                    c48153Iv7.LJIIIIZZ = c64697PaH.LJIIIIZZ;
                    c48153Iv7.LJFF = c64697PaH.LJFF;
                    c48153Iv7.LJII = c64697PaH.LJII;
                    c48153Iv7.LJI = c64697PaH.LJI;
                    c48153Iv7.LIZJ = c64697PaH.LIZJ;
                    c48153Iv7.LIZLLL = c64697PaH.LIZLLL;
                    c48153Iv7.LJ = c64697PaH.LJ;
                }
                String url = request.getUrl();
                if (LJLIL.matcher(url).matches()) {
                    if (!TextUtils.isEmpty(url)) {
                        boolean z2 = !url.startsWith("https");
                        int i = 0;
                        if (!(e instanceof SSLException) && !(e instanceof GeneralSecurityException)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(url);
                        if (z2) {
                            if (z) {
                                str = "both";
                            }
                            str = "ssl";
                        } else {
                            if (z) {
                                str = "protocol";
                            }
                            str = "ssl";
                        }
                        String LIZ = LIZ(url, "retry_reason", str);
                        NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(LIZ);
                        String LIZ2 = LIZ(LIZ, "retry_type", "first_retry");
                        try {
                            FFL.LJIIIZ().getClass();
                            i = FFL.LJIIJ(31744, 0, "feed_biz_add_retry_param", true);
                        } catch (Exception unused) {
                        }
                        if (i != 0) {
                            NetworkUtils.com_ss_android_common_util_NetworkUtils_com_ss_android_ugc_aweme_feed_lancet_NetworkUtilsLancet_filterUrl(LIZ2);
                            LIZ2 = LIZ(LIZ2, "retry", "1");
                        }
                        newBuilder.LIZJ(LIZ2);
                        return f7s.LIZ(newBuilder.LIZ());
                    }
                    throw new IllegalArgumentException("url is empty!");
                }
                throw e;
            }
            throw e;
        }
    }

    public static String LIZ(String str, String str2, String str3) {
        if (!TextUtils.isEmpty(str)) {
            C38281F0r c38281F0r = new C38281F0r(str);
            c38281F0r.LIZLLL(str2, str3);
            return c38281F0r.LJ();
        }
        return str;
    }
}
