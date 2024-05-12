package X;

import kotlin.jvm.internal.o;

/* renamed from: X.UEq, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final class C76864UEq {
    public final int LIZ;
    public final InterfaceC78716Uuu LIZIZ;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C76864UEq)) {
            return false;
        }
        C76864UEq c76864UEq = (C76864UEq) obj;
        return this.LIZ == c76864UEq.LIZ && o.LJ(this.LIZIZ, c76864UEq.LIZIZ);
    }

    public final int hashCode() {
        int i = this.LIZ * 31;
        InterfaceC78716Uuu interfaceC78716Uuu = this.LIZIZ;
        return i + (interfaceC78716Uuu == null ? 0 : interfaceC78716Uuu.hashCode());
    }

    public final String toString() {
        StringBuilder LIZ = X1D.LIZ();
        LIZ.append("PlaceHolderImage(resourceId=");
        LIZ.append(this.LIZ);
        LIZ.append(", scaleType=");
        LIZ.append(this.LIZIZ);
        LIZ.append(')');
        return X1D.LIZIZ(LIZ);
    }

    public C76864UEq(int i, InterfaceC78716Uuu interfaceC78716Uuu) {
        this.LIZ = i;
        this.LIZIZ = interfaceC78716Uuu;
    }
}
