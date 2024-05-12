package com.bytedance.forest.chain.fetchers;

import X.C61287O3n;
import X.C61295O3v;
import X.C61305O4f;
import X.C76800UCe;
import X.InterfaceC88472Yns;
import X.O40;
import X.O47;
import X.O4O;
import X.X1D;
import android.webkit.WebResourceRequest;
import com.bytedance.forest.Forest;
import com.bytedance.forest.model.Request;
import java.io.File;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class MemoryFetcher extends ResourceFetcher {
    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void cancel() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MemoryFetcher(Forest forest) {
        super(forest);
        o.LJIIJ(forest, "forest");
    }

    private final void recordFinish(C61295O3v c61295O3v) {
        c61295O3v.W(null, "memory_finish");
    }

    private final void finishWithCallback(C61295O3v c61295O3v, InterfaceC88472Yns<? super C61295O3v, C76800UCe> interfaceC88472Yns) {
        recordFinish(c61295O3v);
        interfaceC88472Yns.invoke(c61295O3v);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchSync(Request request, C61295O3v response) {
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        fetchAsync(request, response, C61305O4f.LJLIL);
    }

    @Override // com.bytedance.forest.chain.fetchers.ResourceFetcher
    public void fetchAsync(Request request, C61295O3v response, InterfaceC88472Yns<? super C61295O3v, C76800UCe> callback) {
        File file;
        Object obj;
        o.LJIIJ(request, "request");
        o.LJIIJ(response, "response");
        o.LJIIJ(callback, "callback");
        Object obj2 = null;
        response.W(null, "memory_start");
        String LIZ = O40.LIZ(request);
        if (LIZ == null) {
            response.LL.LIZJ(1, "cannot get cache identifier");
            finishWithCallback(response, callback);
            return;
        }
        O47 LIZJ = O40.LIZJ();
        LIZJ.getClass();
        C61295O3v c61295O3v = LIZJ.LIZIZ.get(LIZ);
        if (c61295O3v == null) {
            response.LL.LIZJ(2, "could not found memory cache");
            finishWithCallback(response, callback);
            return;
        }
        O4O N = c61295O3v.N();
        if (N != null) {
            file = N.LJIJJ();
        } else {
            file = null;
        }
        if (o.LJ(c61295O3v.LLD, "cdn")) {
            String url = c61295O3v.LJZI.getUrl();
            Object webResourceRequest = response.LJZI.getWebResourceRequest();
            if (webResourceRequest instanceof WebResourceRequest) {
                obj2 = webResourceRequest;
            }
            WebResourceRequest webResourceRequest2 = (WebResourceRequest) obj2;
            if (webResourceRequest2 != null) {
                webResourceRequest2.getRequestHeaders();
            }
            if (file != null && (!o.LJ(c61295O3v.LJZI.getNetDepender().LIZJ(url, file), Boolean.FALSE))) {
                O40.LIZLLL(c61295O3v);
                response.LL.LIZJ(3, "cdn cache expired");
                finishWithCallback(response, callback);
                return;
            }
        } else if (file == null || !file.exists() || file.isDirectory()) {
            C61287O3n c61287O3n = response.LL;
            StringBuilder LIZ2 = X1D.LIZ();
            if (file == null || (obj = file.getAbsoluteFile()) == null) {
                obj = "non-file";
            }
            LIZ2.append(obj);
            LIZ2.append(" not exists or a directory");
            c61287O3n.LIZJ(4, X1D.LIZIZ(LIZ2));
            O40.LIZLLL(c61295O3v);
            finishWithCallback(response, callback);
            return;
        }
        O4O LIZIZ = O40.LIZIZ(response);
        if ((LIZIZ == null && (LIZIZ = c61295O3v.N()) == null) || (o.LJ(c61295O3v.LLD, "cdn") && !LIZIZ.LJIILL())) {
            response.LL.LIZJ(3, "forest buffer is null or contains no cache");
            O40.LIZLLL(c61295O3v);
            finishWithCallback(response, callback);
            return;
        }
        response.LJZL = true;
        response.LLD = c61295O3v.LLD;
        response.LJLL = c61295O3v.getDataType();
        response.LJLLJ = c61295O3v.L();
        response.LLFF = true;
        response.LJLLL = c61295O3v.LJLLL;
        response.LLFFF = c61295O3v.LLFFF;
        response.X(LIZIZ);
        response.LJLJJI = c61295O3v.LJLJJI;
        if (LIZIZ.LJIILL()) {
            response.LLD = "memory";
            response.LLF = c61295O3v.LLD;
        }
        finishWithCallback(response, callback);
    }
}
