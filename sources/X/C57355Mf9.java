package X;

import X.InterfaceC57357MfB;
import kotlin.jvm.internal.o;

/* renamed from: X.Mf9, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C57355Mf9<D extends InterfaceC57357MfB> {
    public final Object LIZ;
    public final C57332Mem LIZIZ;

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (C3C5.m11hashCodeimpl(this.LIZ) * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("NetFlowData(result=");
        LIZ.append((Object) C3C5.m14toStringimpl(this.LIZ));
        LIZ.append(", param=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C57355Mf9)) {
            return false;
        }
        C57355Mf9 c57355Mf9 = (C57355Mf9) obj;
        if (o.LJ(this.LIZ, c57355Mf9.LIZ) && o.LJ(this.LIZIZ, c57355Mf9.LIZIZ)) {
            return true;
        }
        return false;
    }

    public C57355Mf9(Object obj, C57332Mem param) {
        o.LJIIIZ(param, "param");
        this.LIZ = obj;
        this.LIZIZ = param;
    }
}
