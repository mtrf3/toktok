package X;

import android.os.Looper;
import android.view.View;

/* renamed from: X.Szr, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73927Szr implements InterfaceC73445Ss5 {
    public final View LJLIL;

    public C73927Szr(View view) {
        this.LJLIL = view;
    }

    @Override // X.InterfaceC73445Ss5
    public final void LIZ(InterfaceC73442Ss2 interfaceC73442Ss2) {
        ViewOnAttachStateChangeListenerC73928Szs viewOnAttachStateChangeListenerC73928Szs = new ViewOnAttachStateChangeListenerC73928Szs(this.LJLIL, interfaceC73442Ss2);
        interfaceC73442Ss2.onSubscribe(viewOnAttachStateChangeListenerC73928Szs);
        try {
            if (Looper.myLooper() == C16880lQ.LLJJJJ()) {
                if (this.LJLIL.isAttachedToWindow() || this.LJLIL.getWindowToken() != null) {
                    this.LJLIL.addOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73928Szs);
                    if (viewOnAttachStateChangeListenerC73928Szs.isDisposed()) {
                        this.LJLIL.removeOnAttachStateChangeListener(viewOnAttachStateChangeListenerC73928Szs);
                        return;
                    }
                    return;
                }
                interfaceC73442Ss2.onError(new C42195GhD("View is not attached!"));
                return;
            }
            interfaceC73442Ss2.onError(new IllegalStateException("Views can only be bound to on the main thread!"));
        } catch (Exception e) {
            throw C73864Syq.LIZIZ(e);
        }
    }
}
