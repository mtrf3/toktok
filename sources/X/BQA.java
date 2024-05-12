package X;

import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: classes6.dex */
public final class BQA {
    public final LinkedList<InterfaceC28738BPq> LIZ = new LinkedList<>();

    public final int LIZIZ() {
        Iterator<InterfaceC28738BPq> it = this.LIZ.iterator();
        int i = 0;
        while (it.hasNext()) {
            InterfaceC28738BPq next = it.next();
            StringBuilder LJ = C7MY.LJ("cache player index= ", i, ", item = ");
            LJ.append(next.hashCode());
            B4I.LIZ("LivePlayControllerManager_RecyclerPlayerPool", X1D.LIZIZ(LJ));
            i++;
        }
        return this.LIZ.size();
    }

    public final void LIZ() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("clear -> clear pool player, count=");
        LIZ.append(LIZIZ());
        B4I.LIZ("LivePlayControllerManager_RecyclerPlayerPool", X1D.LIZIZ(LIZ));
        Iterator<InterfaceC28738BPq> it = this.LIZ.iterator();
        while (it.hasNext()) {
            InterfaceC28738BPq next = it.next();
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append("clear -> clear player ");
            LIZ2.append(next.hashCode());
            B4I.LIZ("LivePlayControllerManager_RecyclerPlayerPool", X1D.LIZIZ(LIZ2));
            next.LJJIII();
        }
        this.LIZ.clear();
    }
}
