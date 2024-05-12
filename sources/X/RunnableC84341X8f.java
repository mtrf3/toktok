package X;

import java.util.Iterator;

/* renamed from: X.X8f, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public final class RunnableC84341X8f implements Runnable {
    public static final RunnableC84341X8f LJLIL = new RunnableC84341X8f();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Iterator<InterfaceC84349X8n> it = C84339X8d.LIZIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ(C74782wc.LIZ());
            }
            C84339X8d.LIZIZ.clear();
        } finally {
            if (LIZ) {
            }
        }
    }
}
