package X;

import android.view.KeyEvent;
import android.view.Window;
import kotlin.jvm.internal.o;

/* renamed from: X.Slz, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final class C73067Slz extends WindowCallbackC25670zb {
    public C73067Slz(C68322mC<Window.Callback> c68322mC) {
        super(c68322mC.element);
    }

    @Override // X.WindowCallbackC25670zb, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent event) {
        o.LJIIIZ(event, "event");
        KeyEventCallbackC73065Slx keyEventCallbackC73065Slx = KeyEventCallbackC73065Slx.LJLIL;
        if ((KeyEventCallbackC73065Slx.LJLZ == EnumC73069Sm1.PORTRAIT || KeyEventCallbackC73065Slx.LJLZ == EnumC73069Sm1.HORIZONTAL) && event.getKeyCode() == 4 && event.dispatch(keyEventCallbackC73065Slx, new KeyEvent.DispatcherState(), keyEventCallbackC73065Slx)) {
            return true;
        }
        return super.dispatchKeyEvent(event);
    }
}
