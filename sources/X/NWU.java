package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.spark.AdSparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWU extends AbstractC60800Ntc {
    public final /* synthetic */ NWI LJLIL;
    public final /* synthetic */ AdSparkContext LJLILLLLZI;

    public NWU(NWI nwi, AdSparkContext adSparkContext) {
        this.LJLIL = nwi;
        this.LJLILLLLZI = adSparkContext;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        WebKitView webKitView;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        NWI nwi = this.LJLIL;
        if (view instanceof WebKitView) {
            webKitView = (WebKitView) view;
        } else {
            webKitView = null;
        }
        nwi.setWebView(webKitView);
        C59222NMc c59222NMc = (C59222NMc) this.LJLILLLLZI.LIZIZ(C59222NMc.class);
        InterfaceC59494NWo interfaceC59494NWo = (InterfaceC59494NWo) this.LJLILLLLZI.LIZIZ(InterfaceC59494NWo.class);
        NUM num = (NUM) this.LJLILLLLZI.LIZIZ(NUM.class);
        if (interfaceC59494NWo != null) {
            interfaceC59494NWo.LIZJ(c59222NMc, null, this.LJLIL.getWebView(), true);
        }
        NWP nwp = new NWP(view, num, c59222NMc);
        if (num != null) {
            num.setListener(nwp);
        }
    }
}
