package X;

import android.os.Looper;
import android.view.View;

/* renamed from: X.4iT, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C116974iT extends AbstractC73672Svk<Object> {
    public final View LJLIL;

    public C116974iT(View view) {
        this.LJLIL = view;
    }

    @Override // X.AbstractC73672Svk
    public final void LJJJZ(InterfaceC116954iR<? super Object> interfaceC116954iR) {
        if (Looper.myLooper() != C16880lQ.LLJJJJ()) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("Expected to be called on the main thread but was ");
            LIZ.append(C16880lQ.LLLLIIIILLL().getName());
            interfaceC116954iR.onError(new IllegalStateException(X1D.LIZIZ(LIZ)));
            return;
        }
        ViewOnClickListenerC119924nE viewOnClickListenerC119924nE = new ViewOnClickListenerC119924nE(this.LJLIL, interfaceC116954iR);
        interfaceC116954iR.onSubscribe(viewOnClickListenerC119924nE);
        C16880lQ.LJIIJ(viewOnClickListenerC119924nE, this.LJLIL);
    }
}
