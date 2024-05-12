package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.Qgr, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C67653Qgr<TResult> {
    public final Object LIZ = new Object();
    public Queue<InterfaceC67662Qh0<TResult>> LIZIZ;
    public boolean LIZJ;

    public final void LIZ(AbstractC67638Qgc<TResult> abstractC67638Qgc) {
        InterfaceC67662Qh0 interfaceC67662Qh0;
        synchronized (this.LIZ) {
            if (this.LIZIZ == null || this.LIZJ) {
                return;
            }
            this.LIZJ = true;
            while (true) {
                synchronized (this.LIZ) {
                    interfaceC67662Qh0 = (InterfaceC67662Qh0) ((ArrayDeque) this.LIZIZ).poll();
                    if (interfaceC67662Qh0 == null) {
                        this.LIZJ = false;
                        return;
                    }
                }
                interfaceC67662Qh0.onComplete(abstractC67638Qgc);
            }
        }
    }

    public final void LIZIZ(InterfaceC67662Qh0<TResult> interfaceC67662Qh0) {
        synchronized (this.LIZ) {
            if (this.LIZIZ == null) {
                this.LIZIZ = new ArrayDeque();
            }
            ((ArrayDeque) this.LIZIZ).add(interfaceC67662Qh0);
        }
    }
}
