package X;

import android.widget.PopupWindow;

/* loaded from: classes5.dex */
public final class AKN implements PopupWindow.OnDismissListener {
    public final /* synthetic */ AKM LJLIL;

    public AKN(AKM akm) {
        this.LJLIL = akm;
    }

    @Override // android.widget.PopupWindow.OnDismissListener
    public final void onDismiss() {
        AKM akm = this.LJLIL;
        InterfaceC88472Yns<? super Integer, C76800UCe> interfaceC88472Yns = akm.LIZJ.LJIIL;
        if (interfaceC88472Yns != null) {
            interfaceC88472Yns.invoke(Integer.valueOf(akm.LJFF));
        }
    }
}
