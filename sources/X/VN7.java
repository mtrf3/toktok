package X;

import java.util.LinkedList;
import java.util.Queue;
import kotlin.jvm.internal.AqS161S0200000_14;
import kotlin.jvm.internal.AqS164S0100000_14;
import kotlin.jvm.internal.o;

/* loaded from: classes15.dex */
public final class VN7<T> {
    public final String LIZ;
    public boolean LIZIZ;
    public final Queue<T> LIZJ;
    public final VN6<T> LIZLLL;
    public final int LJ;

    public final void LIZIZ() {
        C38045EwT.LIZ(new AqS164S0100000_14(this, 530));
    }

    public VN7(VN6 handler) {
        o.LJIIJ(handler, "handler");
        this.LIZLLL = handler;
        this.LJ = 1000;
        this.LIZ = "SuspendableQueue";
        this.LIZIZ = true;
        this.LIZJ = new LinkedList();
    }

    public final void LIZ(T t) {
        if (t == null) {
            return;
        }
        C38045EwT.LIZ(new AqS161S0200000_14(this, t, 84));
    }
}
