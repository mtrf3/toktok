package X;

import Y.ARunnableS34S0200000_15;
import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.X9a, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class ViewTreeObserverOnDrawListenerC84362X9a implements ViewTreeObserver.OnDrawListener {
    public final /* synthetic */ C34K LJLIL;
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLILLLLZI;
    public final /* synthetic */ View LJLJI;

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.LJLIL.element) {
            return;
        }
        this.LJLILLLLZI.invoke();
        this.LJLIL.element = true;
        View view = this.LJLJI;
        view.post(new ARunnableS34S0200000_15(view, this, 56));
    }

    public ViewTreeObserverOnDrawListenerC84362X9a(C34K c34k, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro, View view) {
        this.LJLIL = c34k;
        this.LJLILLLLZI = interfaceC65784Pro;
        this.LJLJI = view;
    }
}
