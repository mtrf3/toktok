package X;

import java.util.Collections;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: X.1Xr, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC34671Xr<T> extends AbstractC19010or<Integer, T> {
    @Override // X.AbstractC19010or
    public final boolean LIZLLL() {
        return false;
    }

    public abstract void LJII();

    public abstract void LJIIIIZZ();

    public final void LJI(int i, int i2, int i3, Executor executor, AbstractC19100p0<T> abstractC19100p0) {
        C34661Xq c34661Xq = new C34661Xq(this, i, i2, executor, abstractC19100p0);
        if (i3 == 0) {
            List emptyList = Collections.emptyList();
            if (!c34661Xq.LIZ.LIZ()) {
                c34661Xq.LIZ.LIZIZ(new C19110p1<>(emptyList, 0, c34661Xq.LIZIZ));
                return;
            }
            return;
        }
        LJIIIIZZ();
    }
}
