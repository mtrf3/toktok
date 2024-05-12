package com.bytedance.forest.pollyfill;

import X.AbstractC40713FyP;
import X.AbstractC40715FyR;
import X.C113554cx;
import X.C36910EeA;
import X.C40711FyN;
import X.C40712FyO;
import X.C40716FyS;
import X.C48153Iv7;
import X.C61022NxC;
import X.C61296O3w;
import X.C64799Pbv;
import X.C64802Pby;
import X.C65083PgV;
import X.E8L;
import X.ENX;
import X.InterfaceC195737mD;
import X.InterfaceC195747mE;
import X.InterfaceC30952CCu;
import X.InterfaceC36325ENl;
import X.InterfaceC37276Ek4;
import X.O44;
import android.net.Uri;
import android.webkit.WebResourceRequest;
import com.bytedance.retrofit2.mime.TypedInput;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.internal.o;
import ujb.s;

/* loaded from: classes7.dex */
public final class DefaultForestNetAPI extends AbstractC40715FyR {
    public static final /* synthetic */ int LIZ = 0;

    /* loaded from: classes7.dex */
    public interface NetApi {
        @ENX
        @E8L
        InterfaceC37276Ek4<TypedInput> doGet(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195737mD Object obj);

        @ENX
        @InterfaceC36325ENl
        InterfaceC37276Ek4<Void> doHead(@InterfaceC195747mE String str, @InterfaceC30952CCu Map<String, String> map, @InterfaceC195737mD Object obj);
    }

    @Override // X.AbstractC40715FyR
    public final O44 LIZJ(AbstractC40713FyP abstractC40713FyP) {
        int i = 404;
        AbstractC40713FyP abstractC40713FyP2 = null;
        try {
            NetApi netApi = (NetApi) C65083PgV.LJIIIIZZ(NetApi.class, abstractC40713FyP.LIZIZ);
            String str = abstractC40713FyP.LIZIZ;
            Map<String, String> map = abstractC40713FyP.LIZJ;
            if (map == null) {
                map = C113554cx.LJJJLIIL();
            }
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LIZLLL = C61022NxC.LJ;
            InterfaceC37276Ek4<TypedInput> doGet = netApi.doGet(str, map, c48153Iv7);
            if (doGet != null) {
                if (abstractC40713FyP instanceof C40712FyO) {
                    abstractC40713FyP2 = abstractC40713FyP;
                }
                C40712FyO c40712FyO = (C40712FyO) abstractC40713FyP2;
                if (c40712FyO != null) {
                    c40712FyO.LJ = doGet;
                }
                C36910EeA c36910EeA = doGet.execute().LIZ;
                o.LJFF(c36910EeA, "call.execute().raw()");
                return new C40711FyN(c36910EeA, abstractC40713FyP);
            }
            throw new C40716FyS("create response failed");
        } catch (C64799Pbv e) {
            Integer valueOf = Integer.valueOf(e.getStatusCode());
            if (valueOf.intValue() != 0) {
                i = valueOf.intValue();
            }
            return new C40711FyN(i, new HashMap(), abstractC40713FyP);
        } catch (C64802Pby e2) {
            Integer valueOf2 = Integer.valueOf(e2.getStatusCode());
            if (valueOf2.intValue() != 0) {
                i = valueOf2.intValue();
            }
            return new C40711FyN(i, new HashMap(), abstractC40713FyP);
        }
    }

    @Override // X.AbstractC40715FyR
    public final AbstractC40713FyP LIZ(WebResourceRequest webResourceRequest, C61296O3w c61296O3w) {
        Uri url;
        String str;
        Set<String> keySet;
        o.LJIIJ(webResourceRequest, "webResourceRequest");
        Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders != null && (keySet = requestHeaders.keySet()) != null && (keySet.contains("If-None-Match") || keySet.contains("If-Modified-Since"))) {
            return null;
        }
        if ((c61296O3w == null || (str = c61296O3w.LIZLLL.LIZLLL) == null || !(!ujb.o.LJJJJJL(str))) && ((url = webResourceRequest.getUrl()) == null || (str = url.toString()) == null)) {
            str = "";
        }
        String LJLLLL = s.LJLLLL(str, '#');
        Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
        if (requestHeaders2 == null) {
            requestHeaders2 = new HashMap<>();
        }
        return new C40712FyO(LJLLLL, requestHeaders2, webResourceRequest);
    }

    @Override // X.AbstractC40715FyR
    public final AbstractC40713FyP LIZIZ(C61296O3w fetchTask, Map<String, String> map) {
        o.LJIIJ(fetchTask, "fetchTask");
        return new C40712FyO(s.LJLLLL(fetchTask.LIZLLL.LIZLLL, '#'), map);
    }
}
