package X;

import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.ss.android.ugc.aweme.ad.experiment.AdLandPageResourceOptimizeExperiment;
import java.util.Iterator;
import kotlin.jvm.internal.AqS153S0200000_6;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NJC extends NJH {
    public final NJE LJII = new NJE();
    public NJ1 LJIIIIZZ;

    @Override // X.NJH, X.InterfaceC39904FlM
    public final void LIZ(Object response) {
        NJ1 nj1;
        o.LJIIIZ(response, "response");
        if ((response instanceof C61295O3v) && (nj1 = this.LJIIIIZZ) != null) {
            C61295O3v c61295O3v = (C61295O3v) response;
            String url = c61295O3v.LJZI.getUrl();
            String str = (String) nj1.LJI.getValue();
            if (str == null || ujb.o.LJJJJJL(url)) {
                return;
            }
            nj1.LIZLLL.getClass();
            nj1.LJI(url, str, nj1.LIZJ(C35998EAw.LIZ(url)), new AqS153S0200000_6(nj1, c61295O3v, 0));
        }
    }

    @Override // X.NJH
    public final void LJIIIZ(NJ2 nj2) {
        NJE nje = this.LJII;
        nje.getClass();
        synchronized (nje) {
            nje.LIZ.add(nj2);
        }
    }

    @Override // X.InterfaceC39904FlM
    public final WebResourceResponse LIZIZ(WebView webView, WebResourceRequest webResourceRequest) {
        WebResourceResponse LIZ;
        WebResourceResponse webResourceResponse = null;
        if (webResourceRequest == null) {
            return null;
        }
        String uri = webResourceRequest.getUrl().toString();
        o.LJIIIIZZ(uri, "webRequest.url.toString()");
        if (NJA.LIZ().enableRemoveSyncBlock && NJA.LIZ().enableRemoveUselessInterceptor) {
            Iterator<NJM> it = this.LJII.LIZ.iterator();
            while (it.hasNext()) {
                webResourceResponse = it.next().LIZ(uri);
                if (webResourceResponse != null) {
                    return webResourceResponse;
                }
            }
            return webResourceResponse;
        }
        if (NJA.LIZ().enableRemoveSyncBlock) {
            OIB oib = this.LIZIZ;
            if (oib == null) {
                return null;
            }
            return oib.LIZ(webView, uri);
        }
        OIB oib2 = this.LIZIZ;
        if (oib2 == null) {
            return null;
        }
        synchronized (oib2) {
            LIZ = oib2.LIZ(webView, uri);
        }
        return LIZ;
    }

    @Override // X.NJH
    public final WebResourceResponse LJII(WebView webView, WebResourceRequest webResourceRequest) {
        NJ1 nj1;
        String str;
        if (webResourceRequest == null || (nj1 = this.LJIIIIZZ) == null) {
            return null;
        }
        android.net.Uri url = webResourceRequest.getUrl();
        if (url == null || (str = url.toString()) == null) {
            str = "";
        }
        nj1.LIZLLL.getClass();
        return nj1.LJFF(webView, webResourceRequest, str, nj1.LIZJ(C35998EAw.LIZ(str)));
    }

    @Override // X.NJH
    public final void LJIIIIZZ(NJJ njj, InterfaceC59138NIw interfaceC59138NIw) {
        AdLandPageResourceOptimizeExperiment.LIZ.getClass();
        AdLandPageResourceOptimizeExperiment.ResourceOptimizeModel resourceOptimizeModel = AdLandPageResourceOptimizeExperiment.LIZIZ;
        if ((!resourceOptimizeModel.enableTTNetAgency && !resourceOptimizeModel.enablePrefetch && !resourceOptimizeModel.enablePreConnect) || interfaceC59138NIw.LJII() == null) {
            return;
        }
        this.LJIIIIZZ = new NJ1(interfaceC59138NIw.LIZJ(), this.LJ, interfaceC59138NIw);
    }
}
