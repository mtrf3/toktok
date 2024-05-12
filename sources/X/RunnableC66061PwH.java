package X;

import java.util.List;

/* renamed from: X.PwH, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class RunnableC66061PwH implements Runnable {
    public final C66120PxE LJLIL;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            AbstractC66064PwK abstractC66064PwK = C66059PwF.LIZLLL;
            if (abstractC66064PwK != null) {
                List<IIO> jsbEvents = abstractC66064PwK.getJsbEvents();
                if (jsbEvents.size() > 0) {
                    C66120PxE c66120PxE = this.LJLIL;
                    c66120PxE.LLIIIILZ = "jsb";
                    c66120PxE.LLIIIJ = jsbEvents;
                } else {
                    this.LJLIL.LLIIIILZ = "";
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }

    public RunnableC66061PwH(C66120PxE c66120PxE) {
        this.LJLIL = c66120PxE;
    }
}
