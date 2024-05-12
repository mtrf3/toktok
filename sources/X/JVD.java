package X;

import Y.IDCListenerS148S0200000_8;
import Y.IDLListenerS59S0200000_7;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes9.dex */
public final class JVD {
    public static final void LIZ(View view, InterfaceC65784Pro<C76800UCe> onGlobalLayout) {
        o.LJIIIZ(onGlobalLayout, "onGlobalLayout");
        if (view == null) {
            return;
        }
        view.getViewTreeObserver().addOnGlobalLayoutListener(new IDLListenerS59S0200000_7(view, onGlobalLayout, 3));
    }

    public static final void LIZIZ(View view, InterfaceC65784Pro<C76800UCe> interfaceC65784Pro) {
        if (view == null) {
            return;
        }
        view.addOnLayoutChangeListener(new IDCListenerS148S0200000_8(view, interfaceC65784Pro, 0));
    }

    public static final void LIZJ(JVU jvu, View.OnClickListener listener) {
        o.LJIIIZ(listener, "listener");
        int[] referencedIds = jvu.getReferencedIds();
        if (referencedIds != null) {
            if (referencedIds.length == 0) {
                return;
            }
            for (int i : referencedIds) {
                View LJ = jvu.LJ(i);
                if (LJ != null) {
                    C16880lQ.LJIIJ(listener, LJ);
                }
            }
        }
    }

    public static final void LIZLLL(JVU jvu, int i) {
        int[] referencedIds = jvu.getReferencedIds();
        if (referencedIds != null) {
            if (referencedIds.length == 0) {
                return;
            }
            for (int i2 : referencedIds) {
                View LJ = jvu.LJ(i2);
                if (LJ != null) {
                    LJ.setVisibility(i);
                }
            }
        }
    }
}
