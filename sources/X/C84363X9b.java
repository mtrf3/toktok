package X;

import Y.IDCListenerS117S0200000_15;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.X9b, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class C84363X9b {
    public static final void LIZ(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(view, "<this>");
        ViewTreeObserverOnDrawListenerC84362X9a viewTreeObserverOnDrawListenerC84362X9a = new ViewTreeObserverOnDrawListenerC84362X9a(new C34K(), interfaceC65784Pro, view);
        if (view.getViewTreeObserver().isAlive() && view.isAttachedToWindow()) {
            view.getViewTreeObserver().addOnDrawListener(viewTreeObserverOnDrawListenerC84362X9a);
        } else {
            view.addOnAttachStateChangeListener(new IDCListenerS117S0200000_15(view, viewTreeObserverOnDrawListenerC84362X9a, 2));
        }
    }
}
