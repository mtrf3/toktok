package X;

import java.lang.ref.WeakReference;

/* loaded from: classes12.dex */
public final class R6G extends R6Q {
    public final WeakReference<R6J> LIZ;

    public R6G(R6J r6j) {
        this.LIZ = new WeakReference<>(r6j);
    }

    @Override // X.R6Q
    public final void LIZ(R6R r6r) {
        if (this.LIZ.get() != null) {
            this.LIZ.get().LJJLIIIJ(r6r.LIZLLL, r6r.LJFF, r6r.LJIILIIL, r6r);
        }
    }

    @Override // X.R6Q
    public final void LIZJ(R6R r6r) {
        if (this.LIZ.get() != null) {
            this.LIZ.get().LJJIIZI(r6r.LJIIIZ);
        }
    }

    @Override // X.R6Q
    public final void LIZIZ(R6R r6r, String str, String str2) {
        if (this.LIZ.get() != null) {
            this.LIZ.get().LJJLIIIJ(r6r.LIZLLL, r6r.LJFF, r6r.LJIILIIL, r6r);
        }
    }
}
