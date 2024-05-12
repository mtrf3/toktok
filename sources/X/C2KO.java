package X;

import java.util.concurrent.CopyOnWriteArrayList;

/* renamed from: X.2KO, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C2KO {
    public final CopyOnWriteArrayList<C56162Ii> LIZ = new CopyOnWriteArrayList<>();
    public final CopyOnWriteArrayList<C2KQ> LIZIZ = new CopyOnWriteArrayList<>();
    public boolean LIZJ;

    /* JADX WARN: Multi-variable type inference failed */
    public final void LIZ(C56162Ii c56162Ii) {
        Runnable runnable = c56162Ii.LIZJ;
        if (runnable != null) {
            int i = C2KP.LIZ[c56162Ii.LIZIZ.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    Runnable runnable2 = c56162Ii.LIZJ;
                    if (runnable2 != null) {
                        runnable2.run();
                        return;
                    }
                    return;
                }
                C2NH.LIZ.postDelayed(runnable, ((Number) C2LY.LIZ.getValue()).longValue());
                if (!(runnable instanceof C2KQ)) {
                    return;
                }
                this.LIZIZ.add(runnable);
                return;
            }
            C2NH.LIZ.postAtFrontOfQueue(runnable);
            if (!(runnable instanceof C2KQ)) {
                return;
            }
            this.LIZIZ.add(runnable);
        }
    }
}
