package X;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.o;

/* loaded from: classes12.dex */
public class PUA extends C64545PUv {
    public static final long LJII;
    public static final long LJIIIIZZ;
    public static PUA LJIIIZ;
    public boolean LJ;
    public PUA LJFF;
    public long LJI;

    public void LJIILIIL() {
    }

    static {
        long millis = TimeUnit.SECONDS.toMillis(60L);
        LJII = millis;
        LJIIIIZZ = TimeUnit.MILLISECONDS.toNanos(millis);
    }

    public final void LJIIIIZZ() {
        PUA pua;
        if (!this.LJ) {
            long j = this.LIZJ;
            boolean z = this.LIZ;
            if (j == 0 && !z) {
                return;
            }
            this.LJ = true;
            synchronized (PUA.class) {
                if (LJIIIZ == null) {
                    LJIIIZ = new PUA();
                    new PU8().start();
                }
                long nanoTime = System.nanoTime();
                if (j != 0) {
                    if (!z) {
                        this.LJI = j + nanoTime;
                    } else {
                        this.LJI = Math.min(j, LIZJ() - nanoTime) + nanoTime;
                    }
                } else if (z) {
                    this.LJI = LIZJ();
                } else {
                    throw new AssertionError();
                }
                long j2 = this.LJI - nanoTime;
                PUA pua2 = LJIIIZ;
                if (pua2 != null) {
                    while (true) {
                        pua = pua2.LJFF;
                        if (pua == null || j2 < pua.LJI - nanoTime) {
                            break;
                        } else {
                            pua2 = pua;
                        }
                    }
                    this.LJFF = pua;
                    pua2.LJFF = this;
                    if (pua2 == LJIIIZ) {
                        PUA.class.notify();
                    }
                } else {
                    o.LJIIZILJ();
                    throw null;
                }
            }
            return;
        }
        "Unbalanced enter/exit".toString();
        throw new IllegalStateException("Unbalanced enter/exit");
    }

    public final boolean LJIIIZ() {
        if (!this.LJ) {
            return false;
        }
        this.LJ = false;
        synchronized (PUA.class) {
            PUA pua = LJIIIZ;
            while (pua != null) {
                PUA pua2 = pua.LJFF;
                if (pua2 == this) {
                    pua.LJFF = this.LJFF;
                    this.LJFF = null;
                    return false;
                }
                pua = pua2;
            }
            return true;
        }
    }

    public final IOException LJIIJ(IOException iOException) {
        if (!LJIIIZ()) {
            return iOException;
        }
        return LJIIL(iOException);
    }

    public final void LJIIJJI(boolean z) {
        if (!LJIIIZ() || !z) {
        } else {
            throw LJIIL(null);
        }
    }

    public IOException LJIIL(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }
}
