package X;

import Y.IDTListenerS119S0100000_10;
import android.view.View;
import com.bytedance.hybrid.spark.SparkContext;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXQ extends NM4 {
    public final /* synthetic */ NWF LJLIL;

    public NXQ(NWF nwf) {
        this.LJLIL = nwf;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        VUG vug;
        o.LJIIIZ(view, "view");
        if (!this.LJLIL.LLIIJI && view.LIZJ() != null && (view.LIZJ() instanceof VNS)) {
            View LIZJ = view.LIZJ();
            o.LJII(LIZJ, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
            View findViewByName = ((VNS) LIZJ).findViewByName("lynx-landing-page-scroll-view-container");
            if ((findViewByName instanceof VUG) && (vug = (VUG) findViewByName) != null) {
                vug.setOnScrollListener(new NXS(vug));
            }
            View LIZJ2 = view.LIZJ();
            if (LIZJ2 != null) {
                LIZJ2.setOnTouchListener(new IDTListenerS119S0100000_10(this.LJLIL, 12));
            }
            NWF nwf = this.LJLIL;
            View LIZJ3 = view.LIZJ();
            o.LJII(LIZJ3, "null cannot be cast to non-null type com.lynx.tasm.LynxView");
            nwf.LJLZ = (VNS) LIZJ3;
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        SparkContext sparkContext;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        NWF nwf = this.LJLIL;
        C60737Nsb hybridContext = view.getHybridContext();
        if (hybridContext instanceof SparkContext) {
            sparkContext = (SparkContext) hybridContext;
        } else {
            sparkContext = null;
        }
        nwf.LJZ = sparkContext;
        this.LJLIL.LLIIJI = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL.LLIIJI = true;
    }
}
