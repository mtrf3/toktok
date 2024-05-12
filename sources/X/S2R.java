package X;

import android.content.Context;
import android.view.View;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public abstract class S2R<T extends View, Z> {
    public final T LIZ;
    public InterfaceC71464S2y LIZIZ;
    public final Context LIZJ;

    public final boolean LIZ() {
        if (this.LIZ.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    public S2R(T innerContainerView) {
        o.LJIIIZ(innerContainerView, "innerContainerView");
        this.LIZ = innerContainerView;
        Context context = innerContainerView.getContext();
        o.LJIIIIZZ(context, "innerContainerView.context");
        this.LIZJ = context;
    }

    public final void LIZJ(boolean z) {
        if (z) {
            if (this.LIZ.getVisibility() != 0) {
                this.LIZ.setVisibility(0);
                InterfaceC71464S2y interfaceC71464S2y = this.LIZIZ;
                if (interfaceC71464S2y != null) {
                    interfaceC71464S2y.LIZ(z);
                    return;
                }
                return;
            }
            return;
        }
        if (this.LIZ.getVisibility() == 8) {
            return;
        }
        this.LIZ.setVisibility(8);
        InterfaceC71464S2y interfaceC71464S2y2 = this.LIZIZ;
        if (interfaceC71464S2y2 == null) {
            return;
        }
        interfaceC71464S2y2.LIZ(z);
    }

    public static void LIZIZ(View view, boolean z) {
        int i;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        view.setVisibility(i);
    }
}
