package X;

import Y.IDTListenerS119S0100000_10;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NXP extends NM6 {
    public final /* synthetic */ NWF LJLIL;

    public NXP(NWF nwf) {
        this.LJLIL = nwf;
    }

    @Override // X.NM6, X.InterfaceC60172NjU
    public final void LLLII(View view, android.net.Uri uri, InterfaceC40516FvE instance) {
        VUG vug;
        o.LJIIIZ(view, "view");
        o.LJIIIZ(uri, "uri");
        o.LJIIIZ(instance, "instance");
        super.LLLII(view, uri, instance);
        if (view instanceof VNS) {
            VNS vns = (VNS) view;
            View findViewByName = vns.findViewByName("lynx-landing-page-scroll-view-container");
            if ((findViewByName instanceof VUG) && (vug = (VUG) findViewByName) != null) {
                vug.setOnScrollListener(new NXR(vug));
            }
            view.setOnTouchListener(new IDTListenerS119S0100000_10(this.LJLIL, 11));
            this.LJLIL.LJLZ = vns;
        }
    }
}
