package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class NL0 extends NM4 {
    public boolean LJLIL;

    @Override // X.AbstractC60673NrZ
    public final void LJJJJJ(InterfaceC60761Nsz view) {
        View LIZJ;
        o.LJIIIZ(view, "view");
        if (this.LJLIL || (LIZJ = view.LIZJ()) == null) {
            return;
        }
        C278517l.LIZIZ(-1, -2, LIZJ);
    }

    @Override // X.NM4, X.AbstractC60673NrZ
    public final void LJJJJI(InterfaceC60761Nsz view, String url, String str) {
        o.LJIIIZ(view, "view");
        o.LJIIIZ(url, "url");
        super.LJJJJI(view, url, str);
        this.LJLIL = true;
    }
}
