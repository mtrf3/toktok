package com.ss.android.ugc.aweme.net.interceptor;

import X.C19N;
import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64908Pdg;
import X.EF7;
import X.F7S;
import X.FBZ;
import X.FGH;
import X.InterfaceC37216Ej6;
import android.text.TextUtils;
import com.bytedance.retrofit2.client.Request;
import com.ss.android.ugc.aweme.app.SharePrefCache;
import com.ss.android.ugc.aweme.feed.model.CardStruct;
import defpackage.i0;
import java.net.URI;

/* loaded from: classes12.dex */
public class UrlTransformInterceptorTTNet implements InterfaceC37216Ej6 {
    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt intercept(FBZ fbz) {
        String str;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        String url = request.getUrl();
        String serviceType = request.getServiceType();
        if (C19N.LJ("debug_replace_http_to_https", true) && !TextUtils.isEmpty(url) && !url.contains("api.oston.io") && !url.contains("api.keepon.media") && !url.contains(".bemobi.com")) {
            if (SharePrefCache.inst().getUseHttps().LIZ().booleanValue() && !"vas_ad_track".equals(serviceType)) {
                if (!url.contains("https://") && !url.contains("http://")) {
                    url = i0.LJFF("https://", url);
                } else if (url.contains("http://")) {
                    url = url.replace("http://", "https://");
                }
            }
            C64627PXz LJIIJ = C64626PXy.LJIIJJI(url).LJIIJ();
            C64626PXy LIZJ = LJIIJ.LIZJ();
            if (url.contains("/passport/auth/login/") || url.contains("/passport/auth/login_only/")) {
                if (!TextUtils.isEmpty(LIZJ.LJIILL("access_token"))) {
                    String replaceAll = LIZJ.LJIILL("access_token").replaceAll(" ", "+");
                    C64627PXz LJIIJ2 = LIZJ.LJIIJ();
                    LJIIJ2.LJFF("access_token");
                    LJIIJ2.LIZIZ("access_token", replaceAll);
                    url = LJIIJ2.LIZJ().LJIJJLI().toString();
                }
            } else if (url.contains("/service/settings/v2/")) {
                url = LIZ(EF7.LJI.LIZ, url);
            } else if (url.contains("/service/settings/v3/")) {
                url = LIZ(EF7.LJI.LIZ, url);
            } else {
                if (url.contains("push/get_service_addrs")) {
                    C64627PXz LJIIJ3 = LIZJ.LJIIJ();
                    LJIIJ3.LIZLLL(EF7.LJI.LIZ);
                    url = LJIIJ3.LIZJ().LJIJJLI().toString();
                }
                if (url.contains("/service/settings/v2")) {
                    if (FGH.LIZ()) {
                        str = "1";
                    } else {
                        str = CardStruct.IStatusCode.DEFAULT;
                    }
                    LJIIJ.LIZIZ("googleServiceEnable", str);
                    url = LJIIJ.LIZJ().LJIJJLI().toString();
                }
            }
        }
        C64908Pdg newBuilder = request.newBuilder();
        newBuilder.LIZJ(url);
        return f7s.LIZ(newBuilder.LIZ());
    }

    public static String LIZ(String str, String str2) {
        if (str2.length() <= 0 || str == null || str.length() <= 0) {
            return str2;
        }
        try {
            String host = URI.create(str2).getHost();
            if (host == null) {
                return str2;
            }
            str2 = str2.replace(host, str);
            return str2;
        } catch (Exception unused) {
            return str2;
        }
    }
}
