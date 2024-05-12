package X;

import android.os.Bundle;
import kotlin.jvm.internal.o;

/* loaded from: classes8.dex */
public final class IDD implements F4V {
    public final InterfaceC81604W0y LJLIL;

    @Override // X.F4V
    public final int getPriority() {
        return T4L.LIZ();
    }

    public IDD(InterfaceC81604W0y interfaceC81604W0y) {
        this.LJLIL = interfaceC81604W0y;
    }

    @Override // X.F4V
    public final ERS LIZLLL(ERN ern, T4S session) {
        T4Q t4q;
        Bundle bundle;
        o.LJIIIZ(session, "session");
        ERS LIZ = ern.LIZ(session);
        if ((session instanceof T4Q) && ((bundle = (t4q = (T4Q) session).LJ) == null || !bundle.getBoolean("share_from_green_screen_kit"))) {
            this.LJLIL.i1(t4q.LIZ);
        }
        return LIZ;
    }
}
