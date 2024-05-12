package X;

import Y.ARunnableS44S0100000_8;
import android.view.View;
import kotlin.jvm.internal.o;

/* renamed from: X.KIv, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C51493KIv {
    public static final void LIZ(View view) {
        o.LJIIIZ(view, "<this>");
        view.requestFocus();
        if (view.hasWindowFocus()) {
            if (view.isFocused()) {
                view.post(new ARunnableS44S0100000_8(view, 114));
                return;
            }
            return;
        }
        view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC51494KIw(view));
    }

    public static final void LIZIZ(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        o.LJIIIZ(view, "<this>");
        view.requestFocus();
        if (view.hasWindowFocus()) {
            interfaceC65784Pro.invoke();
        } else {
            view.getViewTreeObserver().addOnWindowFocusChangeListener(new ViewTreeObserverOnWindowFocusChangeListenerC51492KIu(view, interfaceC65784Pro));
        }
    }
}
