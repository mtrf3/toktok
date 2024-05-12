package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.SparkWebViewTouchDelegate;
import kotlin.jvm.internal.o;

/* renamed from: X.NMo, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C59234NMo extends AbstractC60800Ntc {
    public final /* synthetic */ C59232NMm LJLIL;

    public C59234NMo(C59232NMm c59232NMm) {
        this.LJLIL = c59232NMm;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        if (view instanceof WebKitView) {
            this.LJLIL.setWebView((WebKitView) view);
            WebKitView webView = this.LJLIL.getWebView();
            if (webView != null) {
                C59232NMm c59232NMm = this.LJLIL;
                webView.setWebScrollListener(new C59235NMp(c59232NMm));
                SparkWebViewTouchDelegate sparkWebViewTouchDelegate = new SparkWebViewTouchDelegate(webView, false, 30);
                c59232NMm.LJLILLLLZI = sparkWebViewTouchDelegate;
                webView.setWebViewEventDelegate(sparkWebViewTouchDelegate);
                C58909NAb.LIZ.getClass();
                InterfaceC59440NUm LIZ = NH3.LIZ();
                if (LIZ != null) {
                    ((NTF) LIZ).LIZJ(c59232NMm.getRootContainer(), webView);
                }
            }
        }
    }
}
