package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.6bS, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C163586bS<T> extends AbstractC26082ALm<T> {
    public final Throwable LIZ;

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{C65352Pkq.LIZ(this.LIZ.getClass()), this.LIZ.getMessage(), this.LIZ.getStackTrace()[0]});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fail(error=");
        LIZ.append(this.LIZ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C163586bS(Throwable error) {
        o.LJIIJ(error, "error");
        this.LIZ = error;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C163586bS)) {
            return false;
        }
        Throwable th = ((C163586bS) obj).LIZ;
        if (!o.LJ(C65352Pkq.LIZ(this.LIZ.getClass()), C65352Pkq.LIZ(th.getClass())) || !o.LJ(this.LIZ.getMessage(), th.getMessage()) || !o.LJ(this.LIZ.getStackTrace()[0], th.getStackTrace()[0])) {
            return false;
        }
        return true;
    }
}
