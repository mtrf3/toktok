package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NKT extends NM4 {
    public final /* synthetic */ NKR LJLIL;
    public final /* synthetic */ AbstractC59184NKq LJLILLLLZI;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        NKR nkr = this.LJLIL;
        if (!nkr.LIZLLL) {
            nkr.LJ = true;
            nkr.LIZJ = view.LIZJ();
            View LIZJ = view.LIZJ();
            if (LIZJ != null) {
                C278517l.LIZIZ(-1, -2, LIZJ);
            }
        }
        this.LJLILLLLZI.LJI = this.LJLIL.LJ;
    }

    public NKT(NKR nkr, NKN nkn) {
        this.LJLIL = nkr;
        this.LJLILLLLZI = nkn;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJL(InterfaceC60761Nsz view, String url) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJJL(view, url);
        this.LJLIL.LIZLLL = false;
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLILLLLZI.LIZLLL(2);
        this.LJLIL.LIZLLL = true;
    }
}
