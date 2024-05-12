package X;

import X.InterfaceC57357MfB;
import java.util.Objects;
import kotlin.jvm.internal.o;

/* loaded from: classes16.dex */
public final class XGW<D extends InterfaceC57357MfB> extends XGX<D> {
    public final XGS LIZLLL;
    public final D LJ;

    public final Object[] LIZ() {
        return new Object[]{this.LIZLLL, this.LJ};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof XGW) {
            return C78966Uyw.LJIIIZ(((XGW) obj).LIZ(), LIZ());
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(LIZ());
    }

    public final String toString() {
        return C78966Uyw.LJJJLL("MotaSuccess:%s,%s", LIZ());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public XGW(XGS req, InterfaceC57357MfB interfaceC57357MfB) {
        o.LJIIIZ(req, "req");
        this.LIZLLL = req;
        this.LJ = interfaceC57357MfB;
    }
}
