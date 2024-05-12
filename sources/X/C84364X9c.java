package X;

import Y.IDCListenerS117S0200000_15;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.X9c, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84364X9c {
    public static final void LIZ(View view, InterfaceC65784Pro<C76800UCe> callback) {
        o.LJIIIZ(callback, "callback");
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(new X9Z(view, callback));
        } else {
            view.addOnAttachStateChangeListener(new IDCListenerS117S0200000_15(view, callback, 0));
        }
    }
}
