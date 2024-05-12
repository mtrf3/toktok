package X;

import java.util.ArrayDeque;
import java.util.Queue;

/* renamed from: X.Fw2, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C40566Fw2<ResultT> {
    public final Object LIZ = new Object();
    public Queue<InterfaceC40569Fw5<ResultT>> LIZIZ;
    public boolean LIZJ;

    public final void LIZ(C40561Fvx c40561Fvx) {
        InterfaceC40569Fw5 interfaceC40569Fw5;
        synchronized (this.LIZ) {
            if (this.LIZIZ == null || this.LIZJ) {
                return;
            }
            this.LIZJ = true;
            while (true) {
                synchronized (this.LIZ) {
                    interfaceC40569Fw5 = (InterfaceC40569Fw5) ((ArrayDeque) this.LIZIZ).poll();
                    if (interfaceC40569Fw5 == null) {
                        this.LIZJ = false;
                        return;
                    }
                }
                interfaceC40569Fw5.LIZ(c40561Fvx);
            }
        }
    }
}
