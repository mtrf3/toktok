package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import kotlin.jvm.internal.o;

/* renamed from: X.Nqa, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class RunnableC60612Nqa implements Runnable {
    public final /* synthetic */ WebKitView LJLIL;
    public final /* synthetic */ boolean LJLILLLLZI;

    public RunnableC60612Nqa(WebKitView webKitView, boolean z) {
        this.LJLIL = webKitView;
        this.LJLILLLLZI = z;
    }

    public final void LIZ() {
        InterfaceC60614Nqc bridgeService$hybrid_web_release = this.LJLIL.getBridgeService$hybrid_web_release();
        if (bridgeService$hybrid_web_release != null) {
            bridgeService$hybrid_web_release.onDestroy();
        }
        if (this.LJLILLLLZI) {
            AbstractC60673NrZ webKitLifeCycle$hybrid_web_release = this.LJLIL.getWebKitLifeCycle$hybrid_web_release();
            if (webKitLifeCycle$hybrid_web_release != null) {
                webKitLifeCycle$hybrid_web_release.LJJJIL();
            }
        } else {
            AbstractC60673NrZ webKitLifeCycle$hybrid_web_release2 = this.LJLIL.getWebKitLifeCycle$hybrid_web_release();
            if (webKitLifeCycle$hybrid_web_release2 != null) {
                webKitLifeCycle$hybrid_web_release2.onDestroy();
            }
        }
        C31999Ch9 c31999Ch9 = C31999Ch9.LIZJ;
        String containerID = this.LJLIL.getHybridContext().containerId;
        c31999Ch9.getClass();
        o.LJIIJ(containerID, "containerID");
        C31999Ch9.LIZ.remove(containerID);
        C31999Ch9.LIZIZ.remove(containerID);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
