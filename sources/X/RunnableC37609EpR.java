package X;

import Y.ARunnableS9S0201000_6;
import android.os.Build;
import android.view.View;
import android.webkit.WebMessage;
import android.webkit.WebMessagePort;
import android.webkit.WebView;
import com.bytedance.pia.core.plugins.StreamingPlugin;
import com.ss.android.ugc.aweme.profile.ui.AwemeListFragmentImpl;

/* renamed from: X.EpR, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class RunnableC37609EpR implements Runnable {
    public final /* synthetic */ int LJLIL;
    public final /* synthetic */ Object LJLILLLLZI;
    public final /* synthetic */ Object LJLJI;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.LJLIL) {
            case 0:
                final StreamingPlugin streamingPlugin = (StreamingPlugin) this.LJLILLLLZI;
                View view = (View) this.LJLJI;
                streamingPlugin.getClass();
                WebView webView = (WebView) view;
                C37238EjS.LJI(6, "[Streaming] Evaluate render polyfill.", null);
                C37618Epa.LIZIZ(webView, "(function(a){var t=function(e){if(e&&e.data&&\"streaming\"===e.data&&e.ports&&e.ports[0]){window.removeEventListener(\"message\",t);var n=e.ports[0];n.onmessage=function(t){t.data&&\"string\"==typeof t.data&&a(t.data)},n.postMessage(\"streaming_ack\")}};window.addEventListener(\"message\",t)})(function(_){function n(_){if(!window.__PAGE_FINISH__){window.__PIA_DEV__&&console.log(_);var n=document.createRange();n.selectNode(document.body);var e=n.createContextualFragment(_);document.body.appendChild(e)}}window.__pia_chunks__||(window.__pia_chunks__=[]),window.__pia_chunks__.push(_),function _(){if(\"undefined\"!=typeof document&&\"complete\"===document.readyState){if(window.__pia_chunks__)for(var e=0;e<window.__pia_chunks__.length;e++)n(window.__pia_chunks__[e]);window.__pia_chunks__=[]}else setTimeout(_,50)}()});", new BQ6() { // from class: X.EpO
                    @Override // X.BQ6
                    public final void accept(Object obj) {
                        final StreamingPlugin streamingPlugin2 = StreamingPlugin.this;
                        streamingPlugin2.LJII.LIZJ(new BQ6() { // from class: X.EpN
                            @Override // X.BQ6
                            public final void accept(Object obj2) {
                                StreamingPlugin streamingPlugin3 = StreamingPlugin.this;
                                String str = (String) obj2;
                                WebMessagePort webMessagePort = streamingPlugin3.LJI.get();
                                if (webMessagePort != null && Build.VERSION.SDK_INT >= 23) {
                                    C37238EjS.LJI(6, "[Streaming] appendChunkByBridge by port.", null);
                                    webMessagePort.postMessage(new WebMessage(str));
                                } else {
                                    C37613EpV.LIZIZ(new ARunnableS9S0201000_6(0, streamingPlugin3, str, 0));
                                }
                            }
                        });
                    }
                });
                android.net.Uri uri = streamingPlugin.LIZ.LJ;
                if (C37618Epa.LIZJ(webView) >= 66 && Build.VERSION.SDK_INT >= 23) {
                    WebMessagePort[] createWebMessageChannel = webView.createWebMessageChannel();
                    createWebMessageChannel[0].setWebMessageCallback(new C37610EpS(streamingPlugin, createWebMessageChannel), C37613EpV.LIZ());
                    webView.postWebMessage(new WebMessage("streaming", new WebMessagePort[]{createWebMessageChannel[1]}), uri);
                    return;
                }
                return;
            default:
                AwemeListFragmentImpl awemeListFragmentImpl = (AwemeListFragmentImpl) this.LJLILLLLZI;
                C26336AVg c26336AVg = (C26336AVg) this.LJLJI;
                awemeListFragmentImpl.getClass();
                StringBuilder LIZ = X1D.LIZ();
                LIZ.append(" -> finish query draft info, draft count = ");
                LIZ.append(c26336AVg.LIZ);
                LIZ.append(", update draft box");
                C221018lt.LJFF("profile.AwemeListFragmentImpl.draftBox", X1D.LIZIZ(LIZ));
                if (c26336AVg.LIZ <= 0) {
                    C221018lt.LJFF("profile.AwemeListFragmentImpl.draftBox", " -> finish query draft info, hide draft box");
                    C56473MEj c56473MEj = awemeListFragmentImpl.LJZ;
                    if (c56473MEj != null) {
                        c56473MEj.LJLJI = false;
                        c56473MEj.LJLJLLL = null;
                        c56473MEj.notifyDataSetChanged();
                        return;
                    }
                    return;
                }
                C221018lt.LJFF("profile.AwemeListFragmentImpl.draftBox", " -> finish query draft info, show draft box");
                awemeListFragmentImpl.Jm(c26336AVg);
                return;
        }
    }

    public /* synthetic */ RunnableC37609EpR(int i, Object obj, Object obj2) {
        this.LJLIL = i;
        this.LJLILLLLZI = obj;
        this.LJLJI = obj2;
    }
}
