package X;

import Y.ARunnableS11S0101000_7;
import android.view.ViewTreeObserver;

/* renamed from: X.Wrn, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class ViewTreeObserverOnDrawListenerC83619Wrn implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ C83621Wrp LJLIL;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        C83621Wrp c83621Wrp = this.LJLIL;
        if (c83621Wrp.LLJJIJIIJIL <= 0) {
            c83621Wrp.LLJJIJIIJIL = System.currentTimeMillis();
        }
        C83621Wrp c83621Wrp2 = this.LJLIL;
        c83621Wrp2.LJLLILLLL.LJI(Long.valueOf(c83621Wrp2.LLJJIJIIJIL));
        InterfaceC83624Wrs interfaceC83624Wrs = this.LJLIL.LLILLIZIL;
        if (interfaceC83624Wrs != null) {
            interfaceC83624Wrs.getViewFunction().getView().post(new ARunnableS11S0101000_7(11, this, 11));
        }
    }

    public ViewTreeObserverOnDrawListenerC83619Wrn(C83621Wrp c83621Wrp) {
        this.LJLIL = c83621Wrp;
    }
}
