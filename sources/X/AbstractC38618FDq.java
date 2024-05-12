package X;

import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: X.FDq, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public abstract class AbstractC38618FDq implements InterfaceC38616FDo {
    public volatile boolean LIZ;
    public final LinkedList<InterfaceC38617FDp> LIZIZ = new LinkedList<>();

    @Override // X.InterfaceC38616FDo
    public final void invalidate() {
        this.LIZ = true;
        synchronized (this.LIZIZ) {
            Iterator<InterfaceC38617FDp> it = this.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            this.LIZIZ.clear();
        }
    }

    @Override // X.InterfaceC38616FDo
    public final void LJ(RunnableC38602FDa runnableC38602FDa) {
        if (this.LIZ) {
            runnableC38602FDa.LJLIL = null;
            return;
        }
        synchronized (this.LIZIZ) {
            this.LIZIZ.add(runnableC38602FDa);
            if (this.LIZ) {
                Iterator<InterfaceC38617FDp> it = this.LIZIZ.iterator();
                while (it.hasNext()) {
                    it.next().LIZ();
                }
                this.LIZIZ.clear();
            }
        }
    }
}
