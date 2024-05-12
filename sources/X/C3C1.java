package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.3C1, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3C1<T> extends AbstractC72932td<T> {
    public final Throwable LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C65352Pkq.LIZ(this.LIZ.getClass()), this.LIZ.getMessage(), this.LIZ.getStackTrace()[0]});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fail(error=");
        return C169696lJ.LIZLLL(LIZ, this.LIZ, ')', LIZ);
    }

    public C3C1(Throwable error) {
        o.LJIIIZ(error, "error");
        this.LIZ = error;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C3C1)) {
            return false;
        }
        Throwable th = ((C3C1) obj).LIZ;
        if (!o.LJ(C65352Pkq.LIZ(this.LIZ.getClass()), C65352Pkq.LIZ(th.getClass())) || !o.LJ(this.LIZ.getMessage(), th.getMessage()) || !o.LJ(this.LIZ.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
