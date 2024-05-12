package X;

import android.view.View;

/* renamed from: X.Szs, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class ViewOnAttachStateChangeListenerC73928Szs extends AbstractC73929Szt implements View.OnAttachStateChangeListener {
    public final View LJLILLLLZI;
    public final InterfaceC73442Ss2 LJLJI;

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
    }

    @Override // X.AbstractC73929Szt
    public final void LIZ() {
        this.LJLILLLLZI.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        if (!isDisposed()) {
            this.LJLJI.onComplete();
        }
    }

    public ViewOnAttachStateChangeListenerC73928Szs(View view, InterfaceC73442Ss2 interfaceC73442Ss2) {
        this.LJLILLLLZI = view;
        this.LJLJI = interfaceC73442Ss2;
    }
}
