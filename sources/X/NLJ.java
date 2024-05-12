package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NLJ extends NM4 {
    public final /* synthetic */ NLH LJLIL;

    public NLJ(NLH nlh) {
        this.LJLIL = nlh;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        NLH nlh = this.LJLIL;
        if (nlh.LJLLJ) {
            nlh.LJLL = true;
            nlh.LJFF(NLL.LOAD_SUCCESS);
        }
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        NLH nlh = this.LJLIL;
        nlh.LJLLJ = true;
        nlh.LJLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        NLH nlh = this.LJLIL;
        nlh.LJLLJ = false;
        nlh.LJFF(NLL.LOAD_FAIL);
    }
}
