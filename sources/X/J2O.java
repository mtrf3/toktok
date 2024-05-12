package X;

import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes9.dex */
public final class J2O implements VGA {
    public final CopyOnWriteArrayList<J2Q> LJLIL = new CopyOnWriteArrayList<>();
    public boolean LJLILLLLZI = true;

    @Override // X.VGA
    public final void LIZ() {
        if (this.LJLILLLLZI) {
            Iterator<J2Q> it = this.LJLIL.iterator();
            while (it.hasNext()) {
                it.next().notifyVsync();
            }
        }
    }

    @Override // X.VGA
    public final boolean LIZLLL() {
        if (this.LJLIL.size() > 0 && this.LJLILLLLZI) {
            return true;
        }
        return false;
    }

    @Override // X.VGA
    public final void LIZIZ(J2Q j2q) {
        this.LJLIL.remove(j2q);
    }

    @Override // X.VGA
    public final void LIZJ(J2Q j2q) {
        if (!this.LJLIL.contains(j2q)) {
            this.LJLIL.add(j2q);
        }
    }

    @Override // X.VGA
    public final void setEnable(boolean z) {
        this.LJLILLLLZI = z;
    }
}
