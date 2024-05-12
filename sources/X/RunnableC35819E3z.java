package X;

import Y.AObjectS51S0101000_6;
import kotlin.jvm.internal.AqS156S0100000_6;

/* renamed from: X.E3z, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class RunnableC35819E3z implements Runnable, Comparable {
    public final Runnable LJLIL;
    public final C38018Ew2 LJLILLLLZI;

    public final void LIZJ() {
        if (this.LJLILLLLZI.equals(C38019Ew3.LIZ)) {
            if (FCD.LJI(EF7.LIZIZ()) && EEZ.LIZJ) {
                try {
                    Thread.sleep(((Number) C2305392z.LIZ.getValue()).intValue());
                } catch (InterruptedException e) {
                    C16880lQ.LLLLIIL(e);
                }
            }
            C38805FKv.LIZIZ(C38805FKv.LIZ, new C35666DzC("gecko_thread_downgrade", ((Boolean) C34639Did.LJIIJ.getValue()).booleanValue(), E3H.PRIORITY, 10), null, new AqS156S0100000_6(new AObjectS51S0101000_6(1, this, 1), 141), 2);
            return;
        }
        this.LJLIL.run();
    }

    public final int hashCode() {
        return this.LJLIL.hashCode();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LIZJ();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        Runnable runnable = this.LJLIL;
        if ((runnable instanceof Comparable) && (obj instanceof RunnableC35819E3z)) {
            return ((Comparable) runnable).compareTo(((RunnableC35819E3z) obj).LJLIL);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof RunnableC35819E3z) && this.LJLIL.equals(((RunnableC35819E3z) obj).LJLIL)) {
            return true;
        }
        return false;
    }

    public RunnableC35819E3z(Runnable runnable, C38018Ew2 c38018Ew2) {
        this.LJLIL = runnable;
        this.LJLILLLLZI = c38018Ew2;
        c38018Ew2.LJLIL = hashCode();
    }
}
