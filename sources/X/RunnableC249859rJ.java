package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9rJ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC249859rJ implements Runnable {
    public static final RunnableC249859rJ LJLIL = new RunnableC249859rJ();

    public static void LIZ() {
        C250209rs LIZ = C95J.LIZ(11);
        if (LIZ != null && LIZ.LIZ()) {
            Iterator it = ((ArrayList) C249849rI.LIZ).iterator();
            while (it.hasNext()) {
                ((InterfaceC250059rd) it.next()).LIZLLL();
            }
        }
        C249849rI.LIZIZ.postDelayed(C249849rI.LJ, 1000L);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZ();
        } finally {
            if (LIZ) {
            }
        }
    }
}
