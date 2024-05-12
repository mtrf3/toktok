package X;

import java.io.Serializable;
import kotlin.jvm.internal.o;

/* renamed from: X.3C4, reason: invalid class name */
/* loaded from: classes2.dex */
public final class C3C4 implements Serializable {
    public final Throwable exception;

    public int hashCode() {
        return this.exception.hashCode();
    }

    public String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Failure(");
        return C169696lJ.LIZLLL(LIZ, this.exception, ')', LIZ);
    }

    public C3C4(Throwable exception) {
        o.LJIIIZ(exception, "exception");
        this.exception = exception;
    }

    public boolean equals(Object obj) {
        if ((obj instanceof C3C4) && o.LJ(this.exception, ((C3C4) obj).exception)) {
            return true;
        }
        return false;
    }
}
