package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NKS extends NM4 {
    public final /* synthetic */ NKQ LJLIL;

    public NKS(NKQ nkq) {
        this.LJLIL = nkq;
    }

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        o.LJIIIZ(view, "view");
        NKQ nkq = this.LJLIL;
        if (!nkq.LIZLLL) {
            nkq.LJ = true;
            nkq.LIZJ = view.LIZJ();
            View LIZJ = view.LIZJ();
            if (LIZJ == null) {
                return;
            }
            C278517l.LIZIZ(-1, -2, LIZJ);
        }
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
        this.LJLIL.LIZLLL = true;
    }
}
