package X;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: X.9hN, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes5.dex */
public final class RunnableC243699hN implements Runnable {
    public final /* synthetic */ boolean LJLIL;

    public RunnableC243699hN(boolean z) {
        this.LJLIL = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            Iterator it = ((ArrayList) C243709hO.LIZ).iterator();
            while (it.hasNext()) {
                InterfaceC243719hP interfaceC243719hP = (InterfaceC243719hP) it.next();
                if (this.LJLIL) {
                    interfaceC243719hP.LIZIZ();
                } else {
                    interfaceC243719hP.LIZ();
                }
            }
        } finally {
            if (LIZ) {
            }
        }
    }
}
