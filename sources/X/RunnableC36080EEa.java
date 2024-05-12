package X;

import java.util.Iterator;

/* renamed from: X.EEa, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC36080EEa implements Runnable {
    public static final RunnableC36080EEa LJLIL = new RunnableC36080EEa();

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Iterator<InterfaceC36081EEb> it = EEZ.LIZ.iterator();
            while (it.hasNext()) {
                it.next().LIZ();
            }
            EEZ.LIZ.clear();
        } finally {
            if (LIZ) {
            }
        }
    }
}
