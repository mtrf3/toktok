package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.6Pm, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C159946Pm {
    public final /* synthetic */ C6QI LIZ;

    public C159946Pm(C6QI c6qi) {
        this.LIZ = c6qi;
    }

    public final void LIZ(int i) {
        C159846Pc c159846Pc = this.LIZ.LJIIIIZZ;
        if (c159846Pc != null) {
            C6PV c6pv = c159846Pc.LIZ;
            Iterator it = ((ArrayList) c6pv.LJIIL).iterator();
            while (it.hasNext()) {
                InterfaceC160026Pu interfaceC160026Pu = (InterfaceC160026Pu) it.next();
                C6QO LJJJ = C30581Hy.LJJJ(i, c6pv.LJIIJJI);
                if (LJJJ != null) {
                    interfaceC160026Pu.LJIIIZ(LJJJ.LIZ());
                }
            }
        }
        this.LIZ.LIZLLL().LJJII();
    }

    public final void LIZJ(int i) {
        C159846Pc c159846Pc = this.LIZ.LJIIIIZZ;
        if (c159846Pc != null) {
            C6PV c6pv = c159846Pc.LIZ;
            Iterator it = ((ArrayList) c6pv.LJIIL).iterator();
            while (it.hasNext()) {
                InterfaceC160026Pu interfaceC160026Pu = (InterfaceC160026Pu) it.next();
                C6QO LJJJ = C30581Hy.LJJJ(i, c6pv.LJIIJJI);
                if (LJJJ != null) {
                    interfaceC160026Pu.LJIJI(LJJJ.LIZ());
                }
            }
        }
    }

    public final void LIZIZ(int i, int i2) {
        this.LIZ.LIZLLL().LJJII();
        C159846Pc c159846Pc = this.LIZ.LJIIIIZZ;
        if (c159846Pc != null) {
            c159846Pc.LIZ(i, i2);
        }
    }
}
