package X;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.o;
import kotlinx.coroutines.JobSupport;

/* renamed from: X.XKe, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public abstract class AbstractC84652XKe extends XL0 implements T2N, XL7 {
    public JobSupport LJLJJI;

    @Override // X.XL7
    public final XL4 getList() {
        return null;
    }

    @Override // X.XL7
    public final boolean isActive() {
        return true;
    }

    public final JobSupport LJJIII() {
        JobSupport jobSupport = this.LJLJJI;
        if (jobSupport != null) {
            return jobSupport;
        }
        o.LJIJI("job");
        throw null;
    }

    @Override // X.T2N
    public final void dispose() {
        JobSupport LJJIII = LJJIII();
        while (true) {
            Object LJJJLIIL = LJJIII.LJJJLIIL();
            if (LJJJLIIL instanceof AbstractC84652XKe) {
                if (LJJJLIIL != this) {
                    return;
                }
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = JobSupport.LJLIL;
                C84668XKu c84668XKu = C84667XKt.LJI;
                while (!atomicReferenceFieldUpdater.compareAndSet(LJJIII, LJJJLIIL, c84668XKu)) {
                    if (atomicReferenceFieldUpdater.get(LJJIII) != LJJJLIIL) {
                        break;
                    }
                }
                return;
            }
            if (!(LJJJLIIL instanceof XL7) || ((XL7) LJJJLIIL).getList() == null) {
                return;
            }
            LJIL();
            return;
        }
    }

    @Override // X.C84629XJh
    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append(C16880lQ.LJLLJ(getClass()));
        LIZ.append('@');
        LIZ.append(C65314PkE.LJI(this));
        LIZ.append("[job@");
        LIZ.append(C65314PkE.LJI(LJJIII()));
        LIZ.append(']');
        return X1D.LIZIZ(LIZ);
    }
}
