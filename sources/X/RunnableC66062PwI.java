package X;

import java.util.List;
import kotlin.jvm.internal.o;

/* renamed from: X.PwI, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class RunnableC66062PwI implements Runnable {
    public final C66120PxE LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        List<IIO> jsbEvents;
        try {
            AbstractC66064PwK abstractC66064PwK = C66059PwF.LIZLLL;
            if (abstractC66064PwK != null && (jsbEvents = abstractC66064PwK.getJsbEvents()) != null && (!jsbEvents.isEmpty())) {
                C66120PxE c66120PxE = this.LJLIL;
                c66120PxE.LLIIIILZ = "jsb";
                c66120PxE.LLIIIJ = jsbEvents;
            } else {
                this.LJLIL.LLIIIILZ = "";
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66062PwI(C66120PxE event) {
        o.LJIIIZ(event, "event");
        this.LJLIL = event;
    }
}
