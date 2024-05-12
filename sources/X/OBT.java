package X;

import kotlin.jvm.internal.o;

/* loaded from: classes11.dex */
public final class OBT {
    public final long LIZ;
    public volatile boolean LIZIZ;
    public volatile Long LIZJ;

    public final void LIZIZ() {
        this.LIZIZ = false;
        this.LIZJ = null;
    }

    public final boolean LIZ() {
        if (this.LIZJ == null) {
            this.LIZIZ = true;
            this.LIZJ = Long.valueOf(System.currentTimeMillis());
            return false;
        }
        long currentTimeMillis = System.currentTimeMillis();
        Long l = this.LIZJ;
        o.LJI(l);
        if (currentTimeMillis - l.longValue() >= this.LIZ) {
            this.LIZIZ = true;
            this.LIZJ = Long.valueOf(System.currentTimeMillis());
            return false;
        }
        if (this.LIZIZ) {
            return true;
        }
        this.LIZIZ = true;
        this.LIZJ = Long.valueOf(System.currentTimeMillis());
        return false;
    }

    public OBT(long j) {
        this.LIZ = j;
    }
}
