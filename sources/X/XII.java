package X;

import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XII extends XJB {
    public final Runnable LJLJJI;

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            this.LJLJJI.run();
        } finally {
            if (LIZ) {
            }
        }
    }

    @Override // X.XJB
    public final String toString() {
        return o.LJIILLIIL(this.LJLJJI, super.toString());
    }

    public XII(long j, Runnable runnable) {
        super(j);
        this.LJLJJI = runnable;
    }
}
