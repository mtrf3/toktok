package X;

import defpackage.i0;
import java.lang.reflect.UndeclaredThrowableException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

/* renamed from: X.XOx, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractRunnableC84775XOx<I, O, F, T> extends XP4<O> implements Runnable {
    public static final /* synthetic */ int LJLL = 0;
    public C76L<? extends I> LJLJLJ;
    public F LJLJLLL;

    @Override // X.AbstractC84773XOv
    public final void LIZIZ() {
        boolean z;
        C76L<? extends I> c76l = this.LJLJLJ;
        boolean z2 = false;
        if (c76l != null) {
            z = true;
        } else {
            z = false;
        }
        if (z & (this.LJLIL instanceof XPA)) {
            Object obj = this.LJLIL;
            if ((obj instanceof XPA) && ((XPA) obj).LIZ) {
                z2 = true;
            }
            c76l.cancel(z2);
        }
        this.LJLJLJ = null;
        this.LJLJLLL = null;
    }

    @Override // X.AbstractC84773XOv
    public final String LJIIIIZZ() {
        String str;
        C76L<? extends I> c76l = this.LJLJLJ;
        F f = this.LJLJLLL;
        String LJIIIIZZ = super.LJIIIIZZ();
        if (c76l != null) {
            StringBuilder LIZ = X1D.LIZ();
            LIZ.append("inputFuture=[");
            LIZ.append(c76l);
            LIZ.append("], ");
            str = X1D.LIZIZ(LIZ);
        } else {
            str = "";
        }
        if (f != null) {
            StringBuilder LIZ2 = X1D.LIZ();
            LIZ2.append(str);
            LIZ2.append("function=[");
            LIZ2.append(f);
            LIZ2.append("]");
            return X1D.LIZIZ(LIZ2);
        }
        if (LJIIIIZZ != null) {
            return i0.LJFF(str, LJIIIIZZ);
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void LJIIL() {
        boolean z;
        C76L<? extends I> c76l = this.LJLJLJ;
        F f = this.LJLJLLL;
        boolean z2 = this.LJLIL instanceof XPA;
        boolean z3 = true;
        if (c76l == null) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = z2 | z;
        if (f != null) {
            z3 = false;
        }
        if (z4 | z3) {
            return;
        }
        this.LJLJLJ = null;
        try {
            try {
                try {
                    Object apply = ((InterfaceC65644PpY) f).apply(C65734Pr0.LLLLZIL(c76l));
                    this.LJLJLLL = null;
                    LJIIJ(apply);
                } catch (UndeclaredThrowableException e) {
                    LJIIJJI(e.getCause());
                } catch (Throwable th) {
                    LJIIJJI(th);
                }
            } finally {
                this.LJLJLLL = null;
            }
        } catch (Error e2) {
            LJIIJJI(e2);
        } catch (CancellationException unused) {
            cancel(false);
        } catch (RuntimeException e3) {
            LJIIJJI(e3);
        } catch (ExecutionException e4) {
            LJIIJJI(e4.getCause());
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean LIZ;
        try {
            LJIIL();
        } finally {
            if (LIZ) {
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractRunnableC84775XOx(C43956HMy c43956HMy, XPD xpd) {
        this.LJLJLJ = c43956HMy;
        this.LJLJLLL = xpd;
    }
}
