package X;

import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes15.dex */
public final class WE3 implements WE4 {
    public final List<WE4> LIZ = new CopyOnWriteArrayList();

    @Override // X.WE4
    public final void onCleared() {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).onCleared();
        }
    }

    @Override // X.WE4
    public final void LIZ(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LIZ(w6w);
        }
    }

    @Override // X.WE4
    public final void LIZIZ(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LIZIZ(w6w);
        }
    }

    @Override // X.WE4
    public final void LIZJ(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LIZJ(w6w);
        }
    }

    @Override // X.WE4
    public final void LIZLLL(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LIZLLL(w6w);
        }
    }

    @Override // X.WE4
    public final void LJ(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LJ(w6w);
        }
    }

    @Override // X.WE4
    public final void LJFF(W6W w6w) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LJFF(w6w);
        }
    }

    @Override // X.WE4
    public final void LJI(InterfaceC81735W5z interfaceC81735W5z) {
        Iterator it = ((CopyOnWriteArrayList) this.LIZ).iterator();
        while (it.hasNext()) {
            ((WE4) it.next()).LJI(interfaceC81735W5z);
        }
    }
}
