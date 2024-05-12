package X;

import java.util.Arrays;
import kotlin.jvm.internal.o;

/* renamed from: X.aas, reason: case insensitive filesystem */
/* loaded from: classes34.dex */
public final class C94058aas<T> extends AbstractC93428aQi<T> {
    public final Throwable LIZIZ;
    public final T LIZJ;

    public final int hashCode() {
        StackTraceElement[] stackTrace = this.LIZIZ.getStackTrace();
        o.LJIIIIZZ(stackTrace, "error.stackTrace");
        return Arrays.hashCode(new Object[]{C65352Pkq.LIZ(this.LIZIZ.getClass()), this.LIZIZ.getMessage(), ORY.LJJJ(stackTrace)});
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Fail(error=");
        LIZ.append(this.LIZIZ);
        LIZ.append(", value=");
        LIZ.append(this.LIZJ);
        LIZ.append(")");
        return X1D.LIZIZ(LIZ);
    }

    public C94058aas(Throwable th) {
        super(null);
        this.LIZIZ = th;
        this.LIZJ = null;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C94058aas)) {
            return false;
        }
        Throwable th = ((C94058aas) obj).LIZIZ;
        if (!o.LJ(C65352Pkq.LIZ(this.LIZIZ.getClass()), C65352Pkq.LIZ(th.getClass())) || !o.LJ(this.LIZIZ.getMessage(), th.getMessage())) {
            return false;
        }
        StackTraceElement[] stackTrace = this.LIZIZ.getStackTrace();
        o.LJIIIIZZ(stackTrace, "error.stackTrace");
        Object LJJJ = ORY.LJJJ(stackTrace);
        StackTraceElement[] stackTrace2 = th.getStackTrace();
        o.LJIIIIZZ(stackTrace2, "otherError.stackTrace");
        if (!o.LJ(LJJJ, ORY.LJJJ(stackTrace2))) {
            return false;
        }
        return true;
    }
}
