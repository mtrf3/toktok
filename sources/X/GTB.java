package X;

import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class GTB implements GT8 {
    public final /* synthetic */ C42797Gqv LJLIL;

    public GTB(C42797Gqv c42797Gqv) {
        this.LJLIL = c42797Gqv;
    }

    @Override // X.GT8
    public final void LIZ(int i, View view) {
        o.LJIIIZ(view, "view");
        GT7 gt7 = this.LJLIL.LJLJI;
        if (gt7 != null) {
            C42802Gr0 c42802Gr0 = (C42802Gr0) ORZ.LJLLLLLL(i, gt7.LJLIL);
            InterfaceC156456Cb<? super C42802Gr0> interfaceC156456Cb = this.LJLIL.LJLJLJ;
            if (interfaceC156456Cb != null) {
                interfaceC156456Cb.LIZ(c42802Gr0);
                return;
            }
            return;
        }
        o.LJIJI("mHashTagAdapter");
        throw null;
    }
}
