package com.ss.android.ugc.aweme.net.interceptor;

import X.C47261Igj;
import X.C64626PXy;
import X.C64627PXz;
import X.C64797Pbt;
import X.C64829PcP;
import X.C64908Pdg;
import X.F7S;
import X.FBZ;
import X.InterfaceC37216Ej6;
import X.ORZ;
import com.bytedance.retrofit2.client.Request;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public final class ApiAlisgInterceptorTTNet implements InterfaceC37216Ej6 {
    public static final ArrayList<String> LJLIL = C47261Igj.LJII("/service/2/app_log/", "/api/ad/v1/setting/", "/api/ad/splash/", "/aweme/v1/ttregion/test/", "/aweme/v1/feed/", "/aweme/v2/feed/", "/aweme/v2/category/list/", "/aweme/v1/find/", "/aweme/v1/challenge/history/intervene/");
    public static final ArrayList<String> LJLILLLLZI = C47261Igj.LJII("IN", "NP", "PK", "LK");
    public static final ArrayList<String> LJLJI = C47261Igj.LJII("US", "GB", "DE", "IT", "FR", "TR", "ES", "JP", "KR", "BR", "IQ");

    @Override // X.InterfaceC37216Ej6
    public final C64797Pbt<?> intercept(FBZ fbz) {
        C64627PXz LJIIJ;
        C64627PXz LJIIJ2;
        C64626PXy LJIIJJI;
        C64627PXz LJIIJ3;
        F7S f7s = (F7S) fbz;
        Request request = f7s.LIZJ;
        if (ORZ.LJLJJI(C64829PcP.LIZ().LJIIIIZZ.LIZ.LJII.invoke(), LJLILLLLZI)) {
            String path = request.getPath();
            Iterator<String> it = LJLIL.iterator();
            while (it.hasNext()) {
                String next = it.next();
                o.LJIIIIZZ(path, "path");
                if (ujb.o.LJJJLIIL(path, next, false) && (LJIIJJI = C64626PXy.LJIIJJI(request.getUrl())) != null && (LJIIJ3 = LJIIJJI.LJIIJ()) != null) {
                    String str = LJIIJJI.LIZLLL;
                    if (!ujb.o.LJJJLIIL(path, "/service/2/app_log/", false)) {
                        LJIIJ3.LIZLLL("api-h2.tiktokv.com");
                    } else if ("log-va.tiktokv.com".equals(str)) {
                        LJIIJ3.LIZLLL("log.tiktokv.com");
                    } else if ("rtlog-va.tiktokv.com".equals(str)) {
                        LJIIJ3.LIZLLL("rtlog.tiktokv.com");
                    }
                    C64908Pdg newBuilder = request.newBuilder();
                    newBuilder.LIZJ(LJIIJ3.LIZJ().LJIIIIZZ);
                    request = newBuilder.LIZ();
                }
            }
        } else if (ORZ.LJLJJI(C64829PcP.LIZ().LJIIIIZZ.LIZ.LJII.invoke(), LJLJI)) {
            C64626PXy LJIIJJI2 = C64626PXy.LJIIJJI(request.getUrl());
            if (LJIIJJI2 != null && (LJIIJ2 = LJIIJJI2.LJIIJ()) != null && o.LJ(LJIIJJI2.LIZLLL, "api-va.tiktokv.com")) {
                LJIIJ2.LIZLLL("api19-va.tiktokv.com");
                C64908Pdg newBuilder2 = request.newBuilder();
                newBuilder2.LIZJ(LJIIJ2.LIZJ().LJIIIIZZ);
                request = newBuilder2.LIZ();
            }
        } else {
            C64626PXy LJIIJJI3 = C64626PXy.LJIIJJI(request.getUrl());
            if (LJIIJJI3 != null && (LJIIJ = LJIIJJI3.LJIIJ()) != null && o.LJ(LJIIJJI3.LIZLLL, "api-va.tiktokv.com")) {
                LJIIJ.LIZLLL("api16-va.tiktokv.com");
                C64908Pdg newBuilder3 = request.newBuilder();
                newBuilder3.LIZJ(LJIIJ.LIZJ().LJIIIIZZ);
                request = newBuilder3.LIZ();
            }
        }
        return f7s.LIZ(request);
    }
}
