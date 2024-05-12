package X;

import android.app.Activity;
import java.util.Iterator;
import kotlin.jvm.internal.o;

/* renamed from: X.NkC, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C60216NkC extends C59551NYt {
    public final /* synthetic */ C60238NkY LJLIL;
    public final /* synthetic */ F3T LJLILLLLZI;

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZIZ(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = this.LJLIL.LLFF.iterator();
        while (it.hasNext()) {
            ((C59614NaU) ((C60213Nk9) it.next()).LIZIZ).onPause();
        }
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZJ(Activity activity) {
        o.LJIIJ(activity, "activity");
        if (this.LJLIL.LJJI()) {
            C39973FmT.LIZIZ(this.LJLIL, "send pageClosed event for reused view", null, null, 6);
            this.LJLIL.LLILL.getAndSet(false);
            this.LJLIL.onEvent(new C60217NkD());
        }
        OFH ofh = OFH.LIZLLL;
        String str = this.LJLILLLLZI.LIZ;
        ofh.getClass();
        OFH.LJII(str);
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final void LIZLLL(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = this.LJLIL.LLFF.iterator();
        while (it.hasNext()) {
            ((C59614NaU) ((C60213Nk9) it.next()).LIZIZ).onResume();
        }
    }

    @Override // X.C59551NYt, X.InterfaceC60180Njc
    public final boolean LJIIL(Activity activity) {
        o.LJIIJ(activity, "activity");
        Iterator it = this.LJLIL.LLFF.iterator();
        while (it.hasNext()) {
            C59614NaU c59614NaU = (C59614NaU) ((C60213Nk9) it.next()).LIZIZ;
            if (c59614NaU.canGoBack()) {
                if (c59614NaU.canGoBack()) {
                    c59614NaU.goBack();
                    return true;
                }
                return false;
            }
        }
        return false;
    }

    public C60216NkC(C60238NkY c60238NkY, F3T f3t) {
        this.LJLIL = c60238NkY;
        this.LJLILLLLZI = f3t;
    }
}
