package X;

import Y.AObjectS89S0100000_14;
import androidx.lifecycle.LifecycleOwner;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class W12 implements F4V {
    public final LifecycleOwner LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4M.HIGH_INTERCEPT_STICKER_PRIORITY.getPriority();
    }

    public W12(C82306WRy lifecycleOwner, C82622Wbi objectContainer) {
        C40871j1 LIZIZ;
        o.LJIIIZ(lifecycleOwner, "lifecycleOwner");
        o.LJIIIZ(objectContainer, "objectContainer");
        this.LJLIL = lifecycleOwner;
        InterfaceC81640W2i interfaceC81640W2i = (InterfaceC81640W2i) objectContainer.LJIIIIZZ(null, InterfaceC81640W2i.class);
        if (interfaceC81640W2i != null && (LIZIZ = interfaceC81640W2i.LIZIZ()) != null) {
            LIZIZ.LIZIZ(lifecycleOwner, new AObjectS89S0100000_14(this, 89));
        }
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        o.LJIIIZ(session, "session");
        if (session instanceof T4Q) {
            return ern.LIZ(session);
        }
        return ern.LIZ(session);
    }
}
