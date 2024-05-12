package X;

import android.view.View;
import android.view.ViewTreeObserver;

/* renamed from: X.Nwx, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class ViewTreeObserverOnWindowFocusChangeListenerC61007Nwx implements ViewTreeObserver.OnWindowFocusChangeListener {
    public final /* synthetic */ InterfaceC65784Pro<C76800UCe> LJLIL;
    public final /* synthetic */ View LJLILLLLZI;

    @Override // android.view.ViewTreeObserver.OnWindowFocusChangeListener
    public final void onWindowFocusChanged(boolean z) {
        if (z) {
            this.LJLIL.invoke();
            this.LJLILLLLZI.getViewTreeObserver().removeOnWindowFocusChangeListener(this);
        }
    }

    public ViewTreeObserverOnWindowFocusChangeListenerC61007Nwx(T5T t5t, InterfaceC65784Pro interfaceC65784Pro) {
        this.LJLIL = interfaceC65784Pro;
        this.LJLILLLLZI = t5t;
    }
}
