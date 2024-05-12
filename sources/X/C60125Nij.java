package X;

import Y.ACListenerS30S0100000_10;
import android.content.Context;
import android.view.View;
import java.io.File;
import kotlin.jvm.internal.o;

/* renamed from: X.Nij, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60125Nij extends AbstractC60796NtY {
    public Context LJLILLLLZI;

    @Override // X.AbstractC60796NtY, X.M2J
    public final void release() {
        this.LJLILLLLZI = null;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJ() {
        Context context = this.LJLILLLLZI;
        if (context == null) {
            return null;
        }
        L92 l92 = new L92(context);
        C6XC c6xc = l92.LJLIL;
        if (c6xc != null) {
            c6xc.LIZ();
            c6xc.LJLLLL = true;
            c6xc.LJLLILLLL = true;
            c6xc.postInvalidate();
            return l92;
        }
        o.LJIJI("loadingBall");
        throw null;
    }

    @Override // X.InterfaceC60814Ntq
    public final void LIZ(Context context) {
        this.LJLILLLLZI = context;
    }

    @Override // X.InterfaceC60814Ntq
    public final View LJIJJLI(NV7 refresher) {
        o.LJIIJ(refresher, "refresher");
        Context context = this.LJLILLLLZI;
        if (context != null) {
            L91 l91 = new L91(context);
            l91.setRetryClickListener(new ACListenerS30S0100000_10(refresher, 194));
            return l91;
        }
        return null;
    }

    @Override // X.AbstractC60796NtY
    public final View LIZJ(File file, Boolean bool, Float f, Float f2, Long l) {
        Context context = this.LJLILLLLZI;
        if (context != null) {
            OJU oju = new OJU(context);
            oju.setHasAnimation(o.LJ(bool, Boolean.TRUE));
            oju.setFromAlpha(f);
            oju.setToAlpha(f2);
            oju.setDuration(l);
            oju.LIZ(file);
            oju.setVisibility(0);
            return oju;
        }
        return null;
    }
}
