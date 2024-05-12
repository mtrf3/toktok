package X;

import android.webkit.WebResourceRequest;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.retrofit2.mime.TypedInput;
import com.ss.android.ugc.aweme.hybridkit.forest.TTNetRetrofitApi;
import java.util.HashMap;
import kotlin.jvm.internal.o;
import ujb.s;

/* renamed from: X.FyM, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40710FyM extends AbstractC40715FyR {
    public static final /* synthetic */ int LIZ = 0;

    @Override // X.AbstractC40715FyR
    public final O44 LIZJ(AbstractC40713FyP abstractC40713FyP) {
        boolean z;
        C40714FyQ c40714FyQ;
        C40714FyQ c40714FyQ2;
        C61296O3w c61296O3w;
        int i = 404;
        try {
            C65087PgZ LIZ2 = RetrofitFactory.LIZLLL().LIZ(abstractC40713FyP.LIZIZ);
            LIZ2.LIZJ = true;
            TTNetRetrofitApi tTNetRetrofitApi = (TTNetRetrofitApi) LIZ2.LJFF().LIZ.LIZ(TTNetRetrofitApi.class);
            java.util.Map<String, String> map = abstractC40713FyP.LIZJ;
            if (map == null) {
                map = new HashMap<>();
            }
            map.put("x-tt-web-proxy", "TTNet");
            abstractC40713FyP.LIZJ = map;
            C48153Iv7 c48153Iv7 = new C48153Iv7();
            c48153Iv7.LJIIIZ = true;
            c48153Iv7.LJIILJJIL = false;
            c48153Iv7.LIZLLL = C61022NxC.LJ;
            c48153Iv7.LJIIJ = true;
            if ((abstractC40713FyP instanceof C40714FyQ) && (c40714FyQ2 = (C40714FyQ) abstractC40713FyP) != null && (c61296O3w = c40714FyQ2.LJ) != null) {
                z = c61296O3w.LJIIJ;
            } else {
                z = false;
            }
            c48153Iv7.LJIILIIL = z;
            if (abstractC40713FyP.LIZLLL != null) {
                c48153Iv7.LJIIJJI = 1;
            }
            InterfaceC37276Ek4<TypedInput> streamRequest = tTNetRetrofitApi.getStreamRequest(abstractC40713FyP.LIZIZ, abstractC40713FyP.LIZJ, c48153Iv7);
            if ((abstractC40713FyP instanceof C40714FyQ) && (c40714FyQ = (C40714FyQ) abstractC40713FyP) != null) {
                c40714FyQ.LJFF = streamRequest;
            }
            C64797Pbt<TypedInput> execute = streamRequest.execute();
            o.LJIIIIZZ(execute, "call.execute()");
            return new C40709FyL(execute, abstractC40713FyP);
        } catch (C64799Pbv e) {
            Integer valueOf = Integer.valueOf(e.getStatusCode());
            if (valueOf.intValue() != 0) {
                i = valueOf.intValue();
            }
            return new C40709FyL(i, new HashMap(), abstractC40713FyP);
        } catch (C64802Pby e2) {
            Integer valueOf2 = Integer.valueOf(e2.getStatusCode());
            if (valueOf2.intValue() != 0) {
                i = valueOf2.intValue();
            }
            return new C40709FyL(i, new HashMap(), abstractC40713FyP);
        }
    }

    @Override // X.AbstractC40715FyR
    public final AbstractC40713FyP LIZ(WebResourceRequest webResourceRequest, C61296O3w c61296O3w) {
        String uri;
        java.util.Set<String> keySet;
        o.LJIIIZ(webResourceRequest, "webResourceRequest");
        if (!ujb.o.LJJJJIZL(webResourceRequest.getMethod(), "get", true)) {
            return null;
        }
        java.util.Map<String, String> requestHeaders = webResourceRequest.getRequestHeaders();
        if (requestHeaders != null && (keySet = requestHeaders.keySet()) != null && (keySet.contains("If-None-Match") || keySet.contains("If-Modified-Since"))) {
            return null;
        }
        if (c61296O3w == null || (uri = c61296O3w.LIZLLL.LIZLLL) == null) {
            uri = webResourceRequest.getUrl().toString();
            o.LJIIIIZZ(uri, "webResourceRequest.url.toString()");
        }
        String LJLLLL = s.LJLLLL(uri, '#');
        java.util.Map<String, String> requestHeaders2 = webResourceRequest.getRequestHeaders();
        if (requestHeaders2 == null) {
            requestHeaders2 = new HashMap<>();
        }
        return new C40714FyQ(LJLLLL, requestHeaders2, webResourceRequest, c61296O3w);
    }

    @Override // X.AbstractC40715FyR
    public final AbstractC40713FyP LIZIZ(C61296O3w fetchTask, java.util.Map<String, String> map) {
        o.LJIIIZ(fetchTask, "fetchTask");
        return new C40714FyQ(s.LJLLLL(fetchTask.LIZLLL.LIZLLL, '#'), map, null, fetchTask);
    }
}
