package X;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.o;

/* loaded from: classes13.dex */
public final class T4C implements F4V, TGM {
    public T4Q LJLIL;
    public final List<InterfaceC72860Sie> LJLILLLLZI = new ArrayList();

    @Override // X.TGM
    public final void LJI() {
    }

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    @Override // X.TGM
    public final void LIZ(View stickerView) {
        o.LJIIIZ(stickerView, "stickerView");
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((InterfaceC72860Sie) it.next()).LIZJ(stickerView);
        }
        T4Q t4q = this.LJLIL;
        if (t4q != null) {
            LIZIZ(t4q);
        }
    }

    public final void LIZIZ(T4Q t4q) {
        Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it.hasNext()) {
            ((InterfaceC72860Sie) it.next()).LIZ();
        }
        Iterator it2 = ((ArrayList) this.LJLILLLLZI).iterator();
        while (it2.hasNext() && !((InterfaceC72860Sie) it2.next()).LIZIZ(t4q, null)) {
        }
    }

    @Override // X.TGM
    public final void LIZJ(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.BEFORE_ANIMATE) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                InterfaceC72860Sie interfaceC72860Sie = (InterfaceC72860Sie) it.next();
                if (interfaceC72860Sie instanceof ViewOnClickListenerC74332TFg) {
                    ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = (ViewOnClickListenerC74332TFg) interfaceC72860Sie;
                    if (viewOnClickListenerC74332TFg.LLIFFJFJJ) {
                        viewOnClickListenerC74332TFg.LLIL.LJIIIIZZ();
                    }
                }
            }
        }
    }

    @Override // X.TGM
    public final void LJII(IDK state) {
        o.LJIIIZ(state, "state");
        if (state == IDK.AFTER_ANIMATE) {
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                InterfaceC72860Sie interfaceC72860Sie = (InterfaceC72860Sie) it.next();
                if (interfaceC72860Sie instanceof ViewOnClickListenerC74332TFg) {
                    ViewOnClickListenerC74332TFg viewOnClickListenerC74332TFg = (ViewOnClickListenerC74332TFg) interfaceC72860Sie;
                    if (viewOnClickListenerC74332TFg.LLIFFJFJJ) {
                        viewOnClickListenerC74332TFg.LLIL.LJIIIZ();
                    }
                }
            }
        }
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        ERS LIZ = ern.LIZ(session);
        if (session instanceof T4Q) {
            T4Q t4q = (T4Q) session;
            LIZIZ(t4q);
            this.LJLIL = t4q;
        } else {
            this.LJLIL = null;
            Iterator it = ((ArrayList) this.LJLILLLLZI).iterator();
            while (it.hasNext()) {
                ((InterfaceC72860Sie) it.next()).LIZ();
            }
        }
        return LIZ;
    }
}
