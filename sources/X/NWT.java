package X;

import com.bytedance.lynx.hybrid.webkit.WebKitView;
import com.ss.android.ugc.aweme.commercialize.hybrid.impl.AdSparkHybridContext;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NWT extends AbstractC60800Ntc {
    public final /* synthetic */ AdSparkHybridContext LJLIL;

    public NWT(AdSparkHybridContext adSparkHybridContext) {
        this.LJLIL = adSparkHybridContext;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        NMV nmv;
        C59572NZo c59572NZo;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        C59222NMc c59222NMc = (C59222NMc) this.LJLIL.LIZIZ(C59222NMc.class);
        InterfaceC59499NWt interfaceC59499NWt = (InterfaceC59499NWt) this.LJLIL.LIZIZ(InterfaceC59499NWt.class);
        WebKitView webKitView = null;
        if (interfaceC59499NWt != null) {
            nmv = interfaceC59499NWt.LIZIZ();
        } else {
            nmv = null;
        }
        InterfaceC59499NWt interfaceC59499NWt2 = (InterfaceC59499NWt) this.LJLIL.LIZIZ(InterfaceC59499NWt.class);
        if (interfaceC59499NWt2 != null) {
            c59572NZo = interfaceC59499NWt2.LIZ();
        } else {
            c59572NZo = null;
        }
        NWR nwr = new NWR(this.LJLIL);
        if (nmv != null) {
            if (view instanceof WebKitView) {
                webKitView = (WebKitView) view;
            }
            nmv.LIZJ(c59222NMc, nwr, webKitView, false);
        }
        NWQ nwq = new NWQ(view, c59572NZo, c59222NMc);
        if (c59572NZo != null) {
            c59572NZo.setListener(nwq);
        }
    }
}
