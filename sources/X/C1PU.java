package X;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.IDqS416S0100000;

/* renamed from: X.1PU, reason: invalid class name */
/* loaded from: classes.dex */
public abstract class C1PU implements InterfaceC31342CRu {
    public Boolean LIZ;
    public final Queue<Runnable> LIZIZ = new LinkedList();
    public final IDqS416S0100000 LIZJ = new IDqS416S0100000(this, 192);

    public abstract C09800a0 LIZLLL();

    @Override // X.InterfaceC31342CRu
    public final void stop() {
        ((LinkedList) this.LIZIZ).clear();
        LIZLLL().LJ();
    }

    @Override // X.InterfaceC31342CRu
    public final boolean LIZ() {
        return LIZLLL().LIZIZ();
    }

    public final void LJ() {
        LIZLLL().LIZLLL();
    }

    @Override // X.InterfaceC31342CRu
    public final void LIZJ(Runnable runnable) {
        if (LIZ()) {
            runnable.run();
        } else {
            ((LinkedList) this.LIZIZ).offer(runnable);
        }
    }
}
