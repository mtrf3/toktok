package X;

import android.view.View;

/* renamed from: X.4nE, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ViewOnClickListenerC119924nE extends AbstractC73929Szt implements View.OnClickListener {
    public final View LJLILLLLZI;
    public final InterfaceC116954iR<? super Object> LJLJI;

    @Override // X.AbstractC73929Szt
    public final void LIZ() {
        C16880lQ.LJIIJ(null, this.LJLILLLLZI);
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        if (!isDisposed()) {
            this.LJLJI.onNext(C119934nF.LIZ);
        }
    }

    public ViewOnClickListenerC119924nE(View view, InterfaceC116954iR<? super Object> interfaceC116954iR) {
        this.LJLILLLLZI = view;
        this.LJLJI = interfaceC116954iR;
    }
}
