package X;

import kotlin.jvm.internal.o;

/* renamed from: X.NBv, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final class C58955NBv extends NC2 {
    public final int LIZ = 1;
    public final java.util.Map<String, Object> LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C58955NBv)) {
            return false;
        }
        C58955NBv c58955NBv = (C58955NBv) obj;
        return this.LIZ == c58955NBv.LIZ && o.LJ(this.LIZIZ, c58955NBv.LIZIZ);
    }

    public final int hashCode() {
        return this.LIZIZ.hashCode() + (this.LIZ * 31);
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("Tap(touchNumber=");
        LIZ.append(this.LIZ);
        LIZ.append(", tapParams=");
        return C15890jp.LIZ(LIZ, this.LIZIZ, ')', LIZ);
    }

    public C58955NBv(java.util.Map map) {
        this.LIZIZ = map;
    }
}
