package X;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes15.dex */
public final class VIA {
    public List<Runnable> LIZ;
    public boolean LIZIZ;

    public final void LIZIZ() {
        if (this.LIZIZ || LIZJ()) {
            return;
        }
        this.LIZIZ = true;
        Iterator it = new ArrayList(this.LIZ).iterator();
        while (it.hasNext()) {
            ((Runnable) it.next()).run();
        }
        ((ArrayList) this.LIZ).clear();
        this.LIZIZ = false;
    }

    public final boolean LIZJ() {
        List<Runnable> list = this.LIZ;
        if (list == null || ((ArrayList) list).isEmpty()) {
            return true;
        }
        return false;
    }

    public final void LIZ() {
        if (LIZJ()) {
            return;
        }
        ((ArrayList) this.LIZ).clear();
    }
}
