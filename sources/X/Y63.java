package X;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: classes16.dex */
public class Y63 implements Y6E {
    public final /* synthetic */ Y61 LIZ;

    @Override // X.Y6E
    public final void LIZ() {
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((Y6E) it.next()).LIZ();
        }
    }

    @Override // X.Y6E
    public final void LIZIZ() {
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((Y6E) it.next()).LIZIZ();
        }
    }

    @Override // X.Y6E
    public final void LIZJ() {
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((Y6E) it.next()).LIZJ();
        }
    }

    @Override // X.Y6E
    public final void LIZLLL() {
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((Y6E) it.next()).LIZLLL();
        }
    }

    public Y63(Y61 y61) {
        this.LIZ = y61;
    }

    @Override // X.Y6E
    public final void LJ(Exception exc) {
        Iterator it = ((ArrayList) this.LIZ.LJLL).iterator();
        while (it.hasNext()) {
            ((Y6E) it.next()).LJ(exc);
        }
    }
}
