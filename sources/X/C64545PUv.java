package X;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* renamed from: X.PUv, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public class C64545PUv {
    public static final C64547PUx LIZLLL = new C64547PUx();
    public boolean LIZ;
    public long LIZIZ;
    public long LIZJ;

    public C64545PUv LIZ() {
        this.LIZ = false;
        return this;
    }

    public C64545PUv LIZIZ() {
        this.LIZJ = 0L;
        return this;
    }

    public long LIZJ() {
        if (this.LIZ) {
            return this.LIZIZ;
        }
        "No deadline".toString();
        throw new IllegalStateException("No deadline");
    }

    public void LJFF() {
        if (!Thread.interrupted()) {
            if (!this.LIZ || this.LIZIZ - System.nanoTime() > 0) {
                return;
            } else {
                throw new InterruptedIOException("deadline reached");
            }
        }
        C16880lQ.LLLLIIIILLL().interrupt();
        throw new InterruptedIOException("interrupted");
    }

    public boolean LJ() {
        return this.LIZ;
    }

    public long LJII() {
        return this.LIZJ;
    }

    public C64545PUv LIZLLL(long j) {
        this.LIZ = true;
        this.LIZIZ = j;
        return this;
    }

    public C64545PUv LJI(long j, TimeUnit unit) {
        o.LJIIJ(unit, "unit");
        if (j >= 0) {
            this.LIZJ = unit.toNanos(j);
            return this;
        }
        String LIZ = C61845OOz.LIZ("timeout < 0: ", j);
        LIZ.toString();
        throw new IllegalArgumentException(LIZ);
    }
}
