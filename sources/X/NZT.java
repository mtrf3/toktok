package X;

import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes11.dex */
public final class NZT {
    public final List<WeakReference<NZR>> LIZ = new ArrayList();
    public InterfaceC59566NZi LIZIZ;

    public final boolean LIZ() {
        NZR nzr;
        if (((ArrayList) this.LIZ).size() > 1) {
            return true;
        }
        if (((ArrayList) this.LIZ).size() == 1 && (nzr = (NZR) ((Reference) ORZ.LLFF(this.LIZ)).get()) != null && nzr.canGoBack()) {
            return true;
        }
        return false;
    }

    public final void LIZJ() {
        synchronized (this.LIZ) {
            Iterator<WeakReference<NZR>> it = this.LIZ.iterator();
            while (it.hasNext()) {
                NZR nzr = it.next().get();
                if (nzr != null) {
                    nzr.destroy();
                }
            }
        }
        ((ArrayList) this.LIZ).clear();
    }

    public final void LIZIZ(NZR nzr) {
        ((ArrayList) this.LIZ).add(new WeakReference(nzr));
        InterfaceC59566NZi interfaceC59566NZi = this.LIZIZ;
        if (interfaceC59566NZi != null) {
            interfaceC59566NZi.LIZ(nzr);
        }
    }
}
