package X;

import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.W8t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class CallableC81807W8t implements Callable<W8X> {
    public final /* synthetic */ AtomicBoolean LJLIL;
    public final /* synthetic */ W6U LJLILLLLZI;
    public final /* synthetic */ C81808W8u LJLJI;

    @Override // java.util.concurrent.Callable
    public final W8X call() {
        java.util.Map<String, String> LIZJ;
        InterfaceC81378Vwk LIZ;
        try {
            C81939WDv.LIZIZ();
            if (!this.LJLIL.get()) {
                W8X LIZ2 = this.LJLJI.LJFF.LIZ(this.LJLILLLLZI);
                if (LIZ2 != null) {
                    W58.LJIIJJI(C81808W8u.LJII, "Found image for %s in staging area", this.LJLILLLLZI.LIZ());
                    this.LJLJI.LJI.LIZLLL();
                } else {
                    W58.LJIIJJI(C81808W8u.LJII, "Did not find image for %s in staging area", this.LJLILLLLZI.LIZ());
                    this.LJLJI.LJI.LJIIIIZZ();
                    try {
                        LIZJ = this.LJLJI.LIZ.LIZJ(this.LJLILLLLZI);
                        this.LJLJI.getClass();
                        LIZ = C81808W8u.LIZ(this.LJLJI, this.LJLILLLLZI);
                    } catch (Exception unused) {
                    }
                    if (LIZ != null) {
                        C81392Vwy LJIIL = C81392Vwy.LJIIL(LIZ);
                        try {
                            LIZ2 = new W8X(LJIIL);
                            LIZ2.LJLLL = LIZJ;
                            C81392Vwy<InterfaceC81378Vwk> c81392Vwy = LIZ2.LJLIL;
                            if (c81392Vwy != null && (c81392Vwy.LJI() instanceof C81379Vwl)) {
                                ((C81379Vwl) LIZ2.LJLIL.LJI()).LJLILLLLZI = LIZJ;
                            }
                            C81392Vwy.LJ(LJIIL);
                        } catch (Throwable th) {
                            C81392Vwy.LJ(LJIIL);
                            throw th;
                        }
                    } else {
                        LIZ2 = null;
                        return LIZ2;
                    }
                }
                if (Thread.interrupted()) {
                    Class<?> cls = C81808W8u.LJII;
                    if (W58.LIZ.LJIIIIZZ(2)) {
                        W58.LIZ.v(C16880lQ.LJLLJ(cls), "Host thread was interrupted, decreasing reference count");
                    }
                    LIZ2.close();
                    throw new InterruptedException();
                }
                return LIZ2;
            }
            throw new CancellationException();
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public CallableC81807W8t(C81808W8u c81808W8u, AtomicBoolean atomicBoolean, W6U w6u) {
        this.LJLJI = c81808W8u;
        this.LJLIL = atomicBoolean;
        this.LJLILLLLZI = w6u;
    }
}
