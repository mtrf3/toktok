package X;

import Y.ACallableS91S0200000_14;
import Y.ARunnableS25S0300000_14;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: X.W8u, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C81808W8u {
    public static final Class<?> LJII = C81808W8u.class;
    public final InterfaceC81714W5e LIZ;
    public final W84 LIZIZ;
    public final W82 LIZJ;
    public final Executor LIZLLL;
    public final Executor LJ;
    public final C81809W8v LJFF = new C81809W8v();
    public final InterfaceC81819W9f LJI;

    public final C10K<Boolean> LIZIZ(W6U w6u) {
        boolean z;
        boolean z2;
        C81809W8v c81809W8v = this.LJFF;
        synchronized (c81809W8v) {
            w6u.getClass();
            if (((HashMap) c81809W8v.LIZ).containsKey(w6u)) {
                W8X w8x = (W8X) ((HashMap) c81809W8v.LIZ).get(w6u);
                synchronized (w8x) {
                    if (!W8X.LJIIJJI(w8x)) {
                        ((HashMap) c81809W8v.LIZ).remove(w6u);
                        W58.LJIIZILJ(C81809W8v.LIZIZ, "Found closed reference %d for key %s (%d)", Integer.valueOf(System.identityHashCode(w8x)), w6u.LIZ(), Integer.valueOf(System.identityHashCode(w6u)));
                    } else {
                        z = true;
                    }
                }
            }
            z = false;
        }
        if (z || this.LIZ.LIZLLL(w6u)) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            return C10K.LJIIIZ(Boolean.TRUE);
        }
        try {
            return C10K.LIZIZ(new ACallableS91S0200000_14(this, w6u, 5), this.LIZLLL, null);
        } catch (Exception e) {
            W58.LJIJ(LJII, e, "Failed to schedule disk-cache read for %s", w6u.LIZ());
            return C10K.LJIIIIZZ(e);
        }
    }

    public final void LJ(W6U w6u) {
        w6u.getClass();
        this.LJFF.LIZJ(w6u);
        try {
            C10K.LIZIZ(new ACallableS91S0200000_14(this, w6u, 6), this.LJ, null);
        } catch (Exception e) {
            W58.LJIJ(LJII, e, "Failed to schedule disk-cache remove for %s", w6u.LIZ());
            C10K.LJIIIIZZ(e);
        }
    }

    public static InterfaceC81378Vwk LIZ(C81808W8u c81808W8u, W6U w6u) {
        c81808W8u.getClass();
        Class<?> cls = LJII;
        try {
            String LIZ = w6u.LIZ();
            Boolean bool = Boolean.FALSE;
            W58.LJIIL(cls, "Disk cache read for %s needEncrypt = %s", LIZ, bool);
            WEK LJ = c81808W8u.LIZ.LJ(w6u);
            if (LJ == null) {
                W58.LJIIJJI(cls, "Disk cache miss for %s", w6u.LIZ());
                c81808W8u.LJI.LJII();
                return null;
            }
            W58.LJIIJJI(cls, "Found entry in disk cache for %s", w6u.LIZ());
            c81808W8u.LJI.LIZIZ();
            FileInputStream fileInputStream = new FileInputStream(LJ.LIZ);
            try {
                C80632Vki LIZIZ = c81808W8u.LIZIZ.LIZIZ(fileInputStream, (int) LJ.LIZ.length());
                fileInputStream.close();
                W58.LJIIL(cls, "Successful read from disk cache for %s needEncrypt = %s", w6u.LIZ(), bool);
                return LIZIZ;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (Exception e) {
            W58.LJIJ(cls, e, "Exception reading from cache for %s needEncrypt = %s", w6u.LIZ(), Boolean.FALSE);
            c81808W8u.LJI.LJIIJ();
            throw e;
        }
    }

    public final C10K<W8X> LIZJ(W6U w6u, AtomicBoolean atomicBoolean) {
        C10K<W8X> LJIIIIZZ;
        try {
            C81939WDv.LIZIZ();
            W8X LIZ = this.LJFF.LIZ(w6u);
            Class<?> cls = LJII;
            if (LIZ != null) {
                W58.LJIIJJI(cls, "Found image for %s in staging area", w6u.LIZ());
                this.LJI.LIZLLL();
                return C10K.LJIIIZ(LIZ);
            }
            try {
                LJIIIIZZ = C10K.LIZIZ(new CallableC81807W8t(this, atomicBoolean, w6u), this.LIZLLL, null);
            } catch (Exception e) {
                W58.LJIJ(cls, e, "Failed to schedule disk-cache read for %s", w6u.LIZ());
                LJIIIIZZ = C10K.LJIIIIZZ(e);
            }
            return LJIIIIZZ;
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public final void LIZLLL(W6U w6u, W8X w8x) {
        try {
            C81939WDv.LIZIZ();
            w6u.getClass();
            C32151Nz.LJI(W8X.LJIIJJI(w8x));
            C81809W8v c81809W8v = this.LJFF;
            synchronized (c81809W8v) {
                C32151Nz.LJI(W8X.LJIIJJI(w8x));
                W8X.LIZIZ((W8X) ((HashMap) c81809W8v.LIZ).put(w6u, W8X.LIZ(w8x)));
                c81809W8v.LIZIZ();
            }
            W8X LIZ = W8X.LIZ(w8x);
            try {
                this.LJ.execute(new ARunnableS25S0300000_14(this, w6u, LIZ, 20));
            } catch (Exception e) {
                W58.LJIJ(LJII, e, "Failed to schedule disk-cache write for %s", w6u.LIZ());
                this.LJFF.LIZLLL(w6u, w8x);
                W8X.LIZIZ(LIZ);
            }
        } finally {
            C81939WDv.LIZIZ();
        }
    }

    public final void LJFF(W6U w6u, W8X w8x) {
        Class<?> cls = LJII;
        W58.LJIIJJI(cls, "About to write to disk-cache for key %s", w6u.LIZ());
        try {
            this.LIZ.LJI(new W6V(w6u, w8x.LJLLL), new W96(this, w8x));
            W58.LJIIJJI(cls, "Successful disk-cache write for key %s", w6u.LIZ());
        } catch (IOException e) {
            W58.LJIJ(cls, e, "Failed to write to disk-cache for key %s", w6u.LIZ());
        }
    }

    public C81808W8u(InterfaceC81714W5e interfaceC81714W5e, W84 w84, W82 w82, Executor executor, Executor executor2, InterfaceC81819W9f interfaceC81819W9f) {
        this.LIZ = interfaceC81714W5e;
        this.LIZIZ = w84;
        this.LIZJ = w82;
        this.LIZLLL = executor;
        this.LJ = executor2;
        this.LJI = interfaceC81819W9f;
    }
}
