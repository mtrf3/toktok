package X;

import android.os.Build;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.bridge.channel.WebViewPort;
import com.ss.android.ugc.aweme.feed.model.Aweme;
import com.ss.android.ugc.aweme.profile.ProfilePageFragment;

/* renamed from: X.CSw, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final /* synthetic */ class RunnableC31370CSw implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        CRD crd = null;
        switch (this.LJLIL) {
            case 0:
                C31319CQx c31319CQx = (C31319CQx) this.LJLILLLLZI;
                CRD crd2 = (CRD) this.LJLJI;
                if (c31319CQx.mView == 0) {
                    return;
                }
                if (c31319CQx.LLJJI) {
                    C31319CQx.LJJJJLI(crd2);
                }
                c31319CQx.LLILLL = crd2;
                if (c31319CQx.LJJL()) {
                    CRD crd3 = c31319CQx.LLILLL;
                    if (crd3 != null) {
                        if (!c31319CQx.LJZI.LIZJ(crd3)) {
                            ((CRA) c31319CQx.mView).sT(c31319CQx.LLILLL);
                            ((CRA) c31319CQx.mView).r00();
                        } else {
                            ((CRA) c31319CQx.mView).Wn0();
                        }
                    }
                } else {
                    if (!c31319CQx.LJZI.LIZIZ.isEmpty()) {
                        crd = c31319CQx.LJZI.LJ(r1.LJII() - 1);
                    }
                    if (c31319CQx.LLILLL != crd) {
                        if (crd != null && crd.LJJJJ()) {
                            int LJIIIIZZ = c31319CQx.LJZI.LJIIIIZZ(crd);
                            c31319CQx.LJZI.LJIIJ(r2.LJII() - 1, c31319CQx.LLILLL);
                            if (LJIIIIZZ != -1) {
                                ((CRA) c31319CQx.mView).VM(LJIIIIZZ);
                            }
                        } else {
                            int LJI = c31319CQx.LJZI.LJI();
                            c31319CQx.LJZI.LIZ(c31319CQx.LLILLL);
                            if (c31319CQx.LJZI.LJI() - LJI > 0) {
                                ((CRA) c31319CQx.mView).aN(c31319CQx.LJZI.LJI() - 1);
                            }
                        }
                    } else {
                        c31319CQx.LJZI.LJIIJ(r2.LJII() - 1, c31319CQx.LLILLL);
                        int LJIIIIZZ2 = c31319CQx.LJZI.LJIIIIZZ(c31319CQx.LLILLL);
                        if (LJIIIIZZ2 != -1) {
                            ((CRA) c31319CQx.mView).VM(LJIIIIZZ2);
                        }
                    }
                }
                if (!(crd2 instanceof CQO)) {
                    return;
                }
                c31319CQx.LJJJLZIJ((CQO) crd2);
                return;
            case 1:
                WebViewPort webViewPort = (WebViewPort) this.LJLILLLLZI;
                android.net.Uri uri = (android.net.Uri) this.LJLJI;
                WebView webView = webViewPort.LIZLLL.get();
                if (webView == null || Build.VERSION.SDK_INT < 23 || C37618Epa.LIZJ(webView) < 66) {
                    return;
                }
                WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
                createWebMessageChannel[0].setWebMessageCallback(new C37608EpQ(webViewPort, createWebMessageChannel), C37613EpV.LIZ());
                C37618Epa.LIZIZ(webView, "(function(e){var i=function(a){if(\"__channel_init__\"===a.data&&a.ports&&a.ports[0]){var s=a.ports[0];s.postMessage(\"__channel_ack__\"),s.onmessage=function(i){i&&i.data&&\"string\"==typeof i.data&&e(i.data)};var n=function(e){s.postMessage(e)};window.pia_bridge&&window.pia_bridge.onmessage?window.pia_bridge.postMessage=n:window.pia_bridge={postMessage:n},window.removeEventListener(\"message\",i)}};window.addEventListener(\"message\",i)})(function(n){var i=window.pia_bridge,o=i&&i.onmessage;o&&\"function\"==typeof o&&o(n)})", null);
                webView.postWebMessage(new WebMessage("__channel_init__", new WebMessagePort[]{createWebMessageChannel[1]}), uri);
                return;
            default:
                ProfilePageFragment profilePageFragment = (ProfilePageFragment) this.LJLILLLLZI;
                profilePageFragment.LJLILLLLZI.ol((Aweme) this.LJLJI);
                profilePageFragment.LJLILLLLZI.setVisible(true);
                return;
        }
    }

    public /* synthetic */ RunnableC31370CSw(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
