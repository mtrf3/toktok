package v5;

import X.C10K;

/* loaded from: classes.dex */
public final class n<TResult> {
    public final C10K<TResult> LIZ = new C10K<>();

    public final void LIZ() {
        C10K<TResult> c10k = this.LIZ;
        synchronized (c10k.LIZ) {
            if (c10k.LIZIZ) {
                throw new IllegalStateException("Cannot cancel a completed task.");
            }
            c10k.LIZIZ = true;
            c10k.LIZJ = true;
            c10k.LIZ.notifyAll();
            c10k.LJIIZILJ();
        }
    }

    public final void LIZIZ(Exception exc) {
        if (LIZLLL(exc)) {
        } else {
            throw new IllegalStateException("Cannot set the error on a completed task.");
        }
    }

    public final void LIZJ(TResult tresult) {
        if (LJ(tresult)) {
        } else {
            throw new IllegalStateException("Cannot set the result of a completed task.");
        }
    }

    public final boolean LIZLLL(Exception exc) {
        C10K<TResult> c10k = this.LIZ;
        synchronized (c10k.LIZ) {
            if (c10k.LIZIZ) {
                return false;
            }
            c10k.LIZIZ = true;
            c10k.LJ = exc;
            c10k.LIZ.notifyAll();
            c10k.LJIIZILJ();
            return true;
        }
    }

    public final boolean LJ(TResult tresult) {
        return this.LIZ.LJIJ(tresult);
    }
}
